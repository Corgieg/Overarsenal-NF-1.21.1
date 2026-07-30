package net.corgieg.forgeheraldry.custom;

import net.corgieg.forgeheraldry.entity.ModEntities;
import net.corgieg.forgeheraldry.item.ModItems;
import net.corgieg.forgeheraldry.item.custom.PommelItem;
import net.corgieg.forgeheraldry.particle.ModParticles;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class PommelProjectileEntity extends ThrowableItemProjectile {
    public PommelProjectileEntity(EntityType<? extends ThrowableItemProjectile> entityType, Level level) {
        super(entityType, level);
    }

    public PommelProjectileEntity(Level level, LivingEntity shooter) {
        super(EntityType.SNOWBALL, shooter, level);
    }

    public PommelProjectileEntity(Level level, double x, double y, double z) {
        super(EntityType.SNOWBALL, x, y, z, level);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.POMMEL.asItem();
    }

    private ParticleOptions getParticle() {
        ItemStack itemstack = this.getItem();
        return (ParticleOptions)(!itemstack.isEmpty() && !itemstack.is(this.getDefaultItem()) ? new ItemParticleOption(ParticleTypes.ITEM, itemstack) : ModParticles.POMMEL.get());
    }

    public void handleEntityEvent(byte id) {
        if (id == 3) {
            ParticleOptions particleoptions = this.getParticle();

            for(int i = 0; i < 8; ++i) {
                this.level().addParticle(particleoptions, this.getX(), this.getY(), this.getZ(), (double)0.0F, (double)0.0F, (double)0.0F);
            }
        }

    }

    @Override
    protected void onHitEntity(EntityHitResult result) {
        super.onHitEntity(result);
        Entity entity = result.getEntity();
        entity.hurt(this.damageSources().thrown(this, this.getOwner()), (float)4);
    }

    @Override
    protected void onHit(HitResult result) {
        super.onHit(result);
        if (!this.level().isClientSide) {
            this.level().broadcastEntityEvent(this, (byte)3);
            ((ServerLevel) this.level()).sendParticles(ModParticles.POMMEL.get(), this.getX(), this.getY(), this.getZ(),
                    3, 0, 0, 0, 1);
            this.level().addFreshEntity(new ItemEntity( level(), getX(), getY(), getZ(), ModItems.POMMEL.toStack()));
            this.discard();
        }
    }
}


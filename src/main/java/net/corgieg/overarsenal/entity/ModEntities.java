package net.corgieg.overarsenal.entity;

import net.corgieg.overarsenal.OverarsenalMod;
import net.corgieg.overarsenal.custom.PommelProjectileEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;

import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, OverarsenalMod.MODID);

    public static final Supplier<EntityType<PommelProjectileEntity>> POMMEL =
            ENTITY_TYPES.register("pommel", () -> EntityType.Builder.<PommelProjectileEntity>of(PommelProjectileEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).build("pommel"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}

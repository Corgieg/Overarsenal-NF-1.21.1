package net.corgieg.overarsenal.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.corgieg.overarsenal.OverarsenalMod;
import net.corgieg.overarsenal.entity.custom.PommelProjectileEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemDisplayContext;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PommelProjectileRenderer extends EntityRenderer<PommelProjectileEntity> {
    private final ItemRenderer itemRenderer;

    public PommelProjectileRenderer(EntityRendererProvider.Context context) {
        super(context);
        this.itemRenderer = context.getItemRenderer();
    }

    @Override
    public void render(PommelProjectileEntity entity, float entityYaw, float partialTicks, PoseStack poseStack,
                       MultiBufferSource buffer, int packedLight) {
        if (entity.tickCount >= 2 || !(this.entityRenderDispatcher.camera.getEntity().distanceToSqr(entity) < (double) 12.25F)) {
            poseStack.pushPose();
            poseStack.mulPose(this.entityRenderDispatcher.cameraOrientation());
            this.itemRenderer.renderStatic(entity.getItem(), ItemDisplayContext.GROUND, packedLight, OverlayTexture.NO_OVERLAY, poseStack, buffer, entity.level(), entity.getId());
            poseStack.popPose();
            super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
        }
    }

    @Override
    public ResourceLocation getTextureLocation(PommelProjectileEntity pommelProjectileEntity) {
        return ResourceLocation.fromNamespaceAndPath(OverarsenalMod.MODID, "textures/item/pommel_item.png");
    }
}

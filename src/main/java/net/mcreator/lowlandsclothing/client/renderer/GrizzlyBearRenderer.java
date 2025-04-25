
package net.mcreator.lowlandsclothing.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.lowlandsclothing.entity.GrizzlyBearEntity;
import net.mcreator.lowlandsclothing.client.model.Modelgrizzlybeartb;

import com.mojang.blaze3d.vertex.PoseStack;

public class GrizzlyBearRenderer extends MobRenderer<GrizzlyBearEntity, Modelgrizzlybeartb<GrizzlyBearEntity>> {
	public GrizzlyBearRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgrizzlybeartb(context.bakeLayer(Modelgrizzlybeartb.LAYER_LOCATION)), 1.5f);
	}

	@Override
	protected void scale(GrizzlyBearEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.2f, 1.2f, 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(GrizzlyBearEntity entity) {
		return new ResourceLocation("lowlands_clothing:textures/entities/grizzlybear.png");
	}
}

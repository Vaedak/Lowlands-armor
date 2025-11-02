
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lowlandsclothing.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.lowlandsclothing.client.renderer.GrizzlyBearRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LowlandsClothingModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(LowlandsClothingModEntities.GRIZZLY_BEAR.get(), GrizzlyBearRenderer::new);
	}
}

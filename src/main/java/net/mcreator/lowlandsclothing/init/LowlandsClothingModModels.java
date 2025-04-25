
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lowlandsclothing.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.lowlandsclothing.client.model.Modelsnowtigerarmor;
import net.mcreator.lowlandsclothing.client.model.Modelratcatcher_armor;
import net.mcreator.lowlandsclothing.client.model.Modelmountainmenclothes;
import net.mcreator.lowlandsclothing.client.model.Modelmercenaryswordsman;
import net.mcreator.lowlandsclothing.client.model.Modelgrizzlybeartb;
import net.mcreator.lowlandsclothing.client.model.Modelfurnace_master_armor;
import net.mcreator.lowlandsclothing.client.model.Modelexecutionerclothes;
import net.mcreator.lowlandsclothing.client.model.ModelPlaguedoctor;
import net.mcreator.lowlandsclothing.client.model.ModelPenitant_Outfit;
import net.mcreator.lowlandsclothing.client.model.ModelHighlands_longkilt;
import net.mcreator.lowlandsclothing.client.model.ModelGuardCaptainUniform;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class LowlandsClothingModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelPlaguedoctor.LAYER_LOCATION, ModelPlaguedoctor::createBodyLayer);
		event.registerLayerDefinition(ModelGuardCaptainUniform.LAYER_LOCATION, ModelGuardCaptainUniform::createBodyLayer);
		event.registerLayerDefinition(ModelPenitant_Outfit.LAYER_LOCATION, ModelPenitant_Outfit::createBodyLayer);
		event.registerLayerDefinition(Modelmercenaryswordsman.LAYER_LOCATION, Modelmercenaryswordsman::createBodyLayer);
		event.registerLayerDefinition(Modelexecutionerclothes.LAYER_LOCATION, Modelexecutionerclothes::createBodyLayer);
		event.registerLayerDefinition(Modelsnowtigerarmor.LAYER_LOCATION, Modelsnowtigerarmor::createBodyLayer);
		event.registerLayerDefinition(ModelHighlands_longkilt.LAYER_LOCATION, ModelHighlands_longkilt::createBodyLayer);
		event.registerLayerDefinition(Modelfurnace_master_armor.LAYER_LOCATION, Modelfurnace_master_armor::createBodyLayer);
		event.registerLayerDefinition(Modelgrizzlybeartb.LAYER_LOCATION, Modelgrizzlybeartb::createBodyLayer);
		event.registerLayerDefinition(Modelratcatcher_armor.LAYER_LOCATION, Modelratcatcher_armor::createBodyLayer);
		event.registerLayerDefinition(Modelmountainmenclothes.LAYER_LOCATION, Modelmountainmenclothes::createBodyLayer);
	}
}

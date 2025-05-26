
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lowlandsclothing.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.lowlandsclothing.client.model.Modelsnowtigerarmorv01;
import net.mcreator.lowlandsclothing.client.model.Modelsnowtigerarmor;
import net.mcreator.lowlandsclothing.client.model.Modelratcatcher_armor;
import net.mcreator.lowlandsclothing.client.model.Modelmountainmenclothes;
import net.mcreator.lowlandsclothing.client.model.Modelmercenaryswordsman;
import net.mcreator.lowlandsclothing.client.model.Modelgrizzlybeartb;
import net.mcreator.lowlandsclothing.client.model.Modelfurnace_master_armor_v01;
import net.mcreator.lowlandsclothing.client.model.Modelfurnace_master_armor;
import net.mcreator.lowlandsclothing.client.model.Modelexecutionerclothes;
import net.mcreator.lowlandsclothing.client.model.Modelexecutioner_armorV01;
import net.mcreator.lowlandsclothing.client.model.Modelaxolotl_armor;
import net.mcreator.lowlandsclothing.client.model.ModelWingedcavaleryarmor;
import net.mcreator.lowlandsclothing.client.model.ModelPlaguedoctor_v01;
import net.mcreator.lowlandsclothing.client.model.ModelPlaguedoctor;
import net.mcreator.lowlandsclothing.client.model.ModelPenitant_Outfit;
import net.mcreator.lowlandsclothing.client.model.ModelNorsian_armor_corected;
import net.mcreator.lowlandsclothing.client.model.ModelNorsian_armor;
import net.mcreator.lowlandsclothing.client.model.ModelHighlands_longkilt;
import net.mcreator.lowlandsclothing.client.model.ModelGuardCaptainUniform;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class LowlandsClothingModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelPlaguedoctor.LAYER_LOCATION, ModelPlaguedoctor::createBodyLayer);
		event.registerLayerDefinition(ModelPenitant_Outfit.LAYER_LOCATION, ModelPenitant_Outfit::createBodyLayer);
		event.registerLayerDefinition(ModelPlaguedoctor_v01.LAYER_LOCATION, ModelPlaguedoctor_v01::createBodyLayer);
		event.registerLayerDefinition(Modelexecutionerclothes.LAYER_LOCATION, Modelexecutionerclothes::createBodyLayer);
		event.registerLayerDefinition(ModelHighlands_longkilt.LAYER_LOCATION, ModelHighlands_longkilt::createBodyLayer);
		event.registerLayerDefinition(Modelgrizzlybeartb.LAYER_LOCATION, Modelgrizzlybeartb::createBodyLayer);
		event.registerLayerDefinition(Modelexecutioner_armorV01.LAYER_LOCATION, Modelexecutioner_armorV01::createBodyLayer);
		event.registerLayerDefinition(Modelsnowtigerarmorv01.LAYER_LOCATION, Modelsnowtigerarmorv01::createBodyLayer);
		event.registerLayerDefinition(Modelfurnace_master_armor_v01.LAYER_LOCATION, Modelfurnace_master_armor_v01::createBodyLayer);
		event.registerLayerDefinition(ModelNorsian_armor.LAYER_LOCATION, ModelNorsian_armor::createBodyLayer);
		event.registerLayerDefinition(ModelGuardCaptainUniform.LAYER_LOCATION, ModelGuardCaptainUniform::createBodyLayer);
		event.registerLayerDefinition(Modelmercenaryswordsman.LAYER_LOCATION, Modelmercenaryswordsman::createBodyLayer);
		event.registerLayerDefinition(Modelsnowtigerarmor.LAYER_LOCATION, Modelsnowtigerarmor::createBodyLayer);
		event.registerLayerDefinition(Modelfurnace_master_armor.LAYER_LOCATION, Modelfurnace_master_armor::createBodyLayer);
		event.registerLayerDefinition(Modelratcatcher_armor.LAYER_LOCATION, Modelratcatcher_armor::createBodyLayer);
		event.registerLayerDefinition(ModelWingedcavaleryarmor.LAYER_LOCATION, ModelWingedcavaleryarmor::createBodyLayer);
		event.registerLayerDefinition(Modelaxolotl_armor.LAYER_LOCATION, Modelaxolotl_armor::createBodyLayer);
		event.registerLayerDefinition(Modelmountainmenclothes.LAYER_LOCATION, Modelmountainmenclothes::createBodyLayer);
		event.registerLayerDefinition(ModelNorsian_armor_corected.LAYER_LOCATION, ModelNorsian_armor_corected::createBodyLayer);
	}
}

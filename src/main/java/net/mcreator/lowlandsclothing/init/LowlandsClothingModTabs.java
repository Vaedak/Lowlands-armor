
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lowlandsclothing.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.lowlandsclothing.LowlandsClothingMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LowlandsClothingModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LowlandsClothingMod.MODID);
	public static final RegistryObject<CreativeModeTab> ARMORSOFTHE_LOWLANDS = REGISTRY.register("armorsofthe_lowlands", () -> CreativeModeTab.builder().title(Component.translatable("item_group.lowlands_clothing.armorsofthe_lowlands"))
			.icon(() -> new ItemStack(LowlandsClothingModItems.GUARD_CAPTAIN_ARMOR_HELMET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LowlandsClothingModItems.GUARD_CAPTAIN_ARMOR_HELMET.get());
				tabData.accept(LowlandsClothingModItems.GUARD_CAPTAIN_ARMOR_CHESTPLATE.get());
				tabData.accept(LowlandsClothingModItems.GUARD_CAPTAIN_ARMOR_LEGGINGS.get());
				tabData.accept(LowlandsClothingModItems.GUARD_CAPTAIN_ARMOR_BOOTS.get());
				tabData.accept(LowlandsClothingModItems.MERCENARY_SWORDMAN_HELMET.get());
				tabData.accept(LowlandsClothingModItems.MERCENARY_SWORDMAN_CHESTPLATE.get());
				tabData.accept(LowlandsClothingModItems.MERCENARY_SWORDMAN_LEGGINGS.get());
				tabData.accept(LowlandsClothingModItems.MERCENARY_SWORDMAN_BOOTS.get());
				tabData.accept(LowlandsClothingModItems.MOUNTAINMENCLOTHES_HELMET.get());
				tabData.accept(LowlandsClothingModItems.MOUNTAINMENCLOTHES_CHESTPLATE.get());
				tabData.accept(LowlandsClothingModItems.MOUNTAINMENCLOTHES_LEGGINGS.get());
				tabData.accept(LowlandsClothingModItems.MOUNTAINMENCLOTHES_BOOTS.get());
				tabData.accept(LowlandsClothingModItems.SNOWTIGERARMOR_HELMET.get());
				tabData.accept(LowlandsClothingModItems.SNOWTIGERARMOR_CHESTPLATE.get());
				tabData.accept(LowlandsClothingModItems.SNOWTIGERARMOR_LEGGINGS.get());
				tabData.accept(LowlandsClothingModItems.SNOWTIGERARMOR_BOOTS.get());
				tabData.accept(LowlandsClothingModItems.RATCATCHERROBES_HELMET.get());
				tabData.accept(LowlandsClothingModItems.RATCATCHERROBES_CHESTPLATE.get());
				tabData.accept(LowlandsClothingModItems.RATCATCHERROBES_LEGGINGS.get());
				tabData.accept(LowlandsClothingModItems.RATCATCHERROBES_BOOTS.get());
				tabData.accept(LowlandsClothingModItems.EXECUTORARMOR_HELMET.get());
				tabData.accept(LowlandsClothingModItems.EXECUTORARMOR_CHESTPLATE.get());
				tabData.accept(LowlandsClothingModItems.EXECUTORARMOR_LEGGINGS.get());
				tabData.accept(LowlandsClothingModItems.EXECUTORARMOR_BOOTS.get());
				tabData.accept(LowlandsClothingModItems.FURNACEMASTERAMOR_HELMET.get());
				tabData.accept(LowlandsClothingModItems.FURNACEMASTERAMOR_CHESTPLATE.get());
				tabData.accept(LowlandsClothingModItems.FURNACEMASTERAMOR_LEGGINGS.get());
				tabData.accept(LowlandsClothingModItems.FURNACEMASTERAMOR_BOOTS.get());
				tabData.accept(LowlandsClothingModItems.HIGHLANDSLONGKILT_HELMET.get());
				tabData.accept(LowlandsClothingModItems.HIGHLANDSLONGKILT_CHESTPLATE.get());
				tabData.accept(LowlandsClothingModItems.HIGHLANDSLONGKILT_BOOTS.get());
				tabData.accept(LowlandsClothingModItems.PLAGUE_DOCTOR_SUIT_HELMET.get());
				tabData.accept(LowlandsClothingModItems.PLAGUE_DOCTOR_SUIT_CHESTPLATE.get());
				tabData.accept(LowlandsClothingModItems.PLAGUE_DOCTOR_SUIT_LEGGINGS.get());
				tabData.accept(LowlandsClothingModItems.PLAGUE_DOCTOR_SUIT_BOOTS.get());
				tabData.accept(LowlandsClothingModItems.PENITENT_RAGS_HELMET.get());
				tabData.accept(LowlandsClothingModItems.PENITENT_RAGS_CHESTPLATE.get());
				tabData.accept(LowlandsClothingModItems.PENITENT_RAGS_LEGGINGS.get());
				tabData.accept(LowlandsClothingModItems.PENITENT_RAGS_BOOTS.get());
				tabData.accept(LowlandsClothingModItems.WINGEDCAVALERYARMOR_HELMET.get());
				tabData.accept(LowlandsClothingModItems.WINGEDCAVALERYARMOR_CHESTPLATE.get());
				tabData.accept(LowlandsClothingModItems.WINGEDCAVALERYARMOR_LEGGINGS.get());
				tabData.accept(LowlandsClothingModItems.WINGEDCAVALERYARMOR_BOOTS.get());
				tabData.accept(LowlandsClothingModItems.AXOLOTL_ARMOR_HELMET.get());
				tabData.accept(LowlandsClothingModItems.AXOLOTL_ARMOR_CHESTPLATE.get());
				tabData.accept(LowlandsClothingModItems.AXOLOTL_ARMOR_LEGGINGS.get());
				tabData.accept(LowlandsClothingModItems.AXOLOTL_ARMOR_BOOTS.get());
				tabData.accept(LowlandsClothingModItems.NORSIAN_ARMOR_HELMET.get());
				tabData.accept(LowlandsClothingModItems.NORSIAN_ARMOR_CHESTPLATE.get());
				tabData.accept(LowlandsClothingModItems.NORSIAN_ARMOR_LEGGINGS.get());
				tabData.accept(LowlandsClothingModItems.NORSIAN_ARMOR_BOOTS.get());
			})

			.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

			tabData.accept(LowlandsClothingModItems.GRIZZLY_BEAR_SPAWN_EGG.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {

			tabData.accept(LowlandsClothingModItems.FURPELT.get());
			tabData.accept(LowlandsClothingModItems.CLOTH_FABRIC.get());
			tabData.accept(LowlandsClothingModItems.HERBS_FIBER.get());
			tabData.accept(LowlandsClothingModItems.TREATEDLEATHER.get());
			tabData.accept(LowlandsClothingModItems.AXOLOTLIRON.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(LowlandsClothingModItems.HERBS_WHIP.get());

		}
	}
}

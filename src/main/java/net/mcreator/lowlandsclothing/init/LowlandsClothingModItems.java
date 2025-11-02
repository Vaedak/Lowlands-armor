
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lowlandsclothing.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.lowlandsclothing.item.WingedcavaleryarmorItem;
import net.mcreator.lowlandsclothing.item.WaldKnightArmorItem;
import net.mcreator.lowlandsclothing.item.TreatedleatherItem;
import net.mcreator.lowlandsclothing.item.SnowtigerarmorItem;
import net.mcreator.lowlandsclothing.item.SeaUpgradeTemplateItem;
import net.mcreator.lowlandsclothing.item.RawgrizzlymeatItem;
import net.mcreator.lowlandsclothing.item.RatcatcherrobesItem;
import net.mcreator.lowlandsclothing.item.PlagueDoctorSuitItem;
import net.mcreator.lowlandsclothing.item.PenitentRagsItem;
import net.mcreator.lowlandsclothing.item.NorsianArmorItem;
import net.mcreator.lowlandsclothing.item.MountainmenclothesItem;
import net.mcreator.lowlandsclothing.item.MercenarySwordmanItem;
import net.mcreator.lowlandsclothing.item.MaskeradeArmorItem;
import net.mcreator.lowlandsclothing.item.KouignAmannItem;
import net.mcreator.lowlandsclothing.item.HighlandslongkiltItem;
import net.mcreator.lowlandsclothing.item.HerbsWhipItem;
import net.mcreator.lowlandsclothing.item.HerbsFiberItem;
import net.mcreator.lowlandsclothing.item.GuardCaptainArmorItem;
import net.mcreator.lowlandsclothing.item.GoldenKouignAmannItem;
import net.mcreator.lowlandsclothing.item.FurpeltItem;
import net.mcreator.lowlandsclothing.item.FurnacemasteramorItem;
import net.mcreator.lowlandsclothing.item.ExecutorarmorItem;
import net.mcreator.lowlandsclothing.item.DepthScaphanderItem;
import net.mcreator.lowlandsclothing.item.CookedgrizzlymeatItem;
import net.mcreator.lowlandsclothing.item.ClothFabricItem;
import net.mcreator.lowlandsclothing.item.BretCorsairArmorItem;
import net.mcreator.lowlandsclothing.item.BretClothesItem;
import net.mcreator.lowlandsclothing.item.AxolotlironItem;
import net.mcreator.lowlandsclothing.item.AxolotlArmorItem;
import net.mcreator.lowlandsclothing.LowlandsClothingMod;

public class LowlandsClothingModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(LowlandsClothingMod.MODID);
	public static final DeferredItem<Item> GUARD_CAPTAIN_ARMOR_HELMET = REGISTRY.register("guard_captain_armor_helmet", GuardCaptainArmorItem.Helmet::new);
	public static final DeferredItem<Item> GUARD_CAPTAIN_ARMOR_CHESTPLATE = REGISTRY.register("guard_captain_armor_chestplate", GuardCaptainArmorItem.Chestplate::new);
	public static final DeferredItem<Item> GUARD_CAPTAIN_ARMOR_LEGGINGS = REGISTRY.register("guard_captain_armor_leggings", GuardCaptainArmorItem.Leggings::new);
	public static final DeferredItem<Item> GUARD_CAPTAIN_ARMOR_BOOTS = REGISTRY.register("guard_captain_armor_boots", GuardCaptainArmorItem.Boots::new);
	public static final DeferredItem<Item> MERCENARY_SWORDMAN_HELMET = REGISTRY.register("mercenary_swordman_helmet", MercenarySwordmanItem.Helmet::new);
	public static final DeferredItem<Item> MERCENARY_SWORDMAN_CHESTPLATE = REGISTRY.register("mercenary_swordman_chestplate", MercenarySwordmanItem.Chestplate::new);
	public static final DeferredItem<Item> MERCENARY_SWORDMAN_LEGGINGS = REGISTRY.register("mercenary_swordman_leggings", MercenarySwordmanItem.Leggings::new);
	public static final DeferredItem<Item> MERCENARY_SWORDMAN_BOOTS = REGISTRY.register("mercenary_swordman_boots", MercenarySwordmanItem.Boots::new);
	public static final DeferredItem<Item> MOUNTAINMENCLOTHES_HELMET = REGISTRY.register("mountainmenclothes_helmet", MountainmenclothesItem.Helmet::new);
	public static final DeferredItem<Item> MOUNTAINMENCLOTHES_CHESTPLATE = REGISTRY.register("mountainmenclothes_chestplate", MountainmenclothesItem.Chestplate::new);
	public static final DeferredItem<Item> MOUNTAINMENCLOTHES_LEGGINGS = REGISTRY.register("mountainmenclothes_leggings", MountainmenclothesItem.Leggings::new);
	public static final DeferredItem<Item> MOUNTAINMENCLOTHES_BOOTS = REGISTRY.register("mountainmenclothes_boots", MountainmenclothesItem.Boots::new);
	public static final DeferredItem<Item> SNOWTIGERARMOR_HELMET = REGISTRY.register("snowtigerarmor_helmet", SnowtigerarmorItem.Helmet::new);
	public static final DeferredItem<Item> SNOWTIGERARMOR_CHESTPLATE = REGISTRY.register("snowtigerarmor_chestplate", SnowtigerarmorItem.Chestplate::new);
	public static final DeferredItem<Item> SNOWTIGERARMOR_LEGGINGS = REGISTRY.register("snowtigerarmor_leggings", SnowtigerarmorItem.Leggings::new);
	public static final DeferredItem<Item> SNOWTIGERARMOR_BOOTS = REGISTRY.register("snowtigerarmor_boots", SnowtigerarmorItem.Boots::new);
	public static final DeferredItem<Item> RATCATCHERROBES_HELMET = REGISTRY.register("ratcatcherrobes_helmet", RatcatcherrobesItem.Helmet::new);
	public static final DeferredItem<Item> RATCATCHERROBES_CHESTPLATE = REGISTRY.register("ratcatcherrobes_chestplate", RatcatcherrobesItem.Chestplate::new);
	public static final DeferredItem<Item> RATCATCHERROBES_LEGGINGS = REGISTRY.register("ratcatcherrobes_leggings", RatcatcherrobesItem.Leggings::new);
	public static final DeferredItem<Item> RATCATCHERROBES_BOOTS = REGISTRY.register("ratcatcherrobes_boots", RatcatcherrobesItem.Boots::new);
	public static final DeferredItem<Item> EXECUTORARMOR_HELMET = REGISTRY.register("executorarmor_helmet", ExecutorarmorItem.Helmet::new);
	public static final DeferredItem<Item> EXECUTORARMOR_CHESTPLATE = REGISTRY.register("executorarmor_chestplate", ExecutorarmorItem.Chestplate::new);
	public static final DeferredItem<Item> EXECUTORARMOR_LEGGINGS = REGISTRY.register("executorarmor_leggings", ExecutorarmorItem.Leggings::new);
	public static final DeferredItem<Item> EXECUTORARMOR_BOOTS = REGISTRY.register("executorarmor_boots", ExecutorarmorItem.Boots::new);
	public static final DeferredItem<Item> FURNACEMASTERAMOR_HELMET = REGISTRY.register("furnacemasteramor_helmet", FurnacemasteramorItem.Helmet::new);
	public static final DeferredItem<Item> FURNACEMASTERAMOR_CHESTPLATE = REGISTRY.register("furnacemasteramor_chestplate", FurnacemasteramorItem.Chestplate::new);
	public static final DeferredItem<Item> FURNACEMASTERAMOR_LEGGINGS = REGISTRY.register("furnacemasteramor_leggings", FurnacemasteramorItem.Leggings::new);
	public static final DeferredItem<Item> FURNACEMASTERAMOR_BOOTS = REGISTRY.register("furnacemasteramor_boots", FurnacemasteramorItem.Boots::new);
	public static final DeferredItem<Item> HIGHLANDSLONGKILT_HELMET = REGISTRY.register("highlandslongkilt_helmet", HighlandslongkiltItem.Helmet::new);
	public static final DeferredItem<Item> HIGHLANDSLONGKILT_CHESTPLATE = REGISTRY.register("highlandslongkilt_chestplate", HighlandslongkiltItem.Chestplate::new);
	public static final DeferredItem<Item> HIGHLANDSLONGKILT_LEGGINGS = REGISTRY.register("highlandslongkilt_leggings", HighlandslongkiltItem.Leggings::new);
	public static final DeferredItem<Item> HIGHLANDSLONGKILT_BOOTS = REGISTRY.register("highlandslongkilt_boots", HighlandslongkiltItem.Boots::new);
	public static final DeferredItem<Item> PLAGUE_DOCTOR_SUIT_HELMET = REGISTRY.register("plague_doctor_suit_helmet", PlagueDoctorSuitItem.Helmet::new);
	public static final DeferredItem<Item> PLAGUE_DOCTOR_SUIT_CHESTPLATE = REGISTRY.register("plague_doctor_suit_chestplate", PlagueDoctorSuitItem.Chestplate::new);
	public static final DeferredItem<Item> PLAGUE_DOCTOR_SUIT_LEGGINGS = REGISTRY.register("plague_doctor_suit_leggings", PlagueDoctorSuitItem.Leggings::new);
	public static final DeferredItem<Item> PLAGUE_DOCTOR_SUIT_BOOTS = REGISTRY.register("plague_doctor_suit_boots", PlagueDoctorSuitItem.Boots::new);
	public static final DeferredItem<Item> PENITENT_RAGS_HELMET = REGISTRY.register("penitent_rags_helmet", PenitentRagsItem.Helmet::new);
	public static final DeferredItem<Item> PENITENT_RAGS_CHESTPLATE = REGISTRY.register("penitent_rags_chestplate", PenitentRagsItem.Chestplate::new);
	public static final DeferredItem<Item> PENITENT_RAGS_LEGGINGS = REGISTRY.register("penitent_rags_leggings", PenitentRagsItem.Leggings::new);
	public static final DeferredItem<Item> PENITENT_RAGS_BOOTS = REGISTRY.register("penitent_rags_boots", PenitentRagsItem.Boots::new);
	public static final DeferredItem<Item> INVISIBLELIGHT = block(LowlandsClothingModBlocks.INVISIBLELIGHT);
	public static final DeferredItem<Item> FURPELT = REGISTRY.register("furpelt", FurpeltItem::new);
	public static final DeferredItem<Item> GRIZZLY_BEAR_SPAWN_EGG = REGISTRY.register("grizzly_bear_spawn_egg", () -> new DeferredSpawnEggItem(LowlandsClothingModEntities.GRIZZLY_BEAR, -12964834, -7112895, new Item.Properties()));
	public static final DeferredItem<Item> CLOTH_FABRIC = REGISTRY.register("cloth_fabric", ClothFabricItem::new);
	public static final DeferredItem<Item> HERBS_FIBER = REGISTRY.register("herbs_fiber", HerbsFiberItem::new);
	public static final DeferredItem<Item> HERBS_WHIP = REGISTRY.register("herbs_whip", HerbsWhipItem::new);
	public static final DeferredItem<Item> TREATEDLEATHER = REGISTRY.register("treatedleather", TreatedleatherItem::new);
	public static final DeferredItem<Item> WINGEDCAVALERYARMOR_HELMET = REGISTRY.register("wingedcavaleryarmor_helmet", WingedcavaleryarmorItem.Helmet::new);
	public static final DeferredItem<Item> WINGEDCAVALERYARMOR_CHESTPLATE = REGISTRY.register("wingedcavaleryarmor_chestplate", WingedcavaleryarmorItem.Chestplate::new);
	public static final DeferredItem<Item> WINGEDCAVALERYARMOR_LEGGINGS = REGISTRY.register("wingedcavaleryarmor_leggings", WingedcavaleryarmorItem.Leggings::new);
	public static final DeferredItem<Item> WINGEDCAVALERYARMOR_BOOTS = REGISTRY.register("wingedcavaleryarmor_boots", WingedcavaleryarmorItem.Boots::new);
	public static final DeferredItem<Item> AXOLOTL_ARMOR_HELMET = REGISTRY.register("axolotl_armor_helmet", AxolotlArmorItem.Helmet::new);
	public static final DeferredItem<Item> AXOLOTL_ARMOR_CHESTPLATE = REGISTRY.register("axolotl_armor_chestplate", AxolotlArmorItem.Chestplate::new);
	public static final DeferredItem<Item> AXOLOTL_ARMOR_LEGGINGS = REGISTRY.register("axolotl_armor_leggings", AxolotlArmorItem.Leggings::new);
	public static final DeferredItem<Item> AXOLOTL_ARMOR_BOOTS = REGISTRY.register("axolotl_armor_boots", AxolotlArmorItem.Boots::new);
	public static final DeferredItem<Item> NORSIAN_ARMOR_HELMET = REGISTRY.register("norsian_armor_helmet", NorsianArmorItem.Helmet::new);
	public static final DeferredItem<Item> NORSIAN_ARMOR_CHESTPLATE = REGISTRY.register("norsian_armor_chestplate", NorsianArmorItem.Chestplate::new);
	public static final DeferredItem<Item> NORSIAN_ARMOR_LEGGINGS = REGISTRY.register("norsian_armor_leggings", NorsianArmorItem.Leggings::new);
	public static final DeferredItem<Item> NORSIAN_ARMOR_BOOTS = REGISTRY.register("norsian_armor_boots", NorsianArmorItem.Boots::new);
	public static final DeferredItem<Item> AXOLOTLIRON = REGISTRY.register("axolotliron", AxolotlironItem::new);
	public static final DeferredItem<Item> WALD_KNIGHT_ARMOR_HELMET = REGISTRY.register("wald_knight_armor_helmet", WaldKnightArmorItem.Helmet::new);
	public static final DeferredItem<Item> WALD_KNIGHT_ARMOR_CHESTPLATE = REGISTRY.register("wald_knight_armor_chestplate", WaldKnightArmorItem.Chestplate::new);
	public static final DeferredItem<Item> WALD_KNIGHT_ARMOR_LEGGINGS = REGISTRY.register("wald_knight_armor_leggings", WaldKnightArmorItem.Leggings::new);
	public static final DeferredItem<Item> WALD_KNIGHT_ARMOR_BOOTS = REGISTRY.register("wald_knight_armor_boots", WaldKnightArmorItem.Boots::new);
	public static final DeferredItem<Item> MASKERADE_ARMOR_HELMET = REGISTRY.register("maskerade_armor_helmet", MaskeradeArmorItem.Helmet::new);
	public static final DeferredItem<Item> MASKERADE_ARMOR_CHESTPLATE = REGISTRY.register("maskerade_armor_chestplate", MaskeradeArmorItem.Chestplate::new);
	public static final DeferredItem<Item> MASKERADE_ARMOR_LEGGINGS = REGISTRY.register("maskerade_armor_leggings", MaskeradeArmorItem.Leggings::new);
	public static final DeferredItem<Item> MASKERADE_ARMOR_BOOTS = REGISTRY.register("maskerade_armor_boots", MaskeradeArmorItem.Boots::new);
	public static final DeferredItem<Item> BRET_CORSAIR_ARMOR_HELMET = REGISTRY.register("bret_corsair_armor_helmet", BretCorsairArmorItem.Helmet::new);
	public static final DeferredItem<Item> BRET_CORSAIR_ARMOR_CHESTPLATE = REGISTRY.register("bret_corsair_armor_chestplate", BretCorsairArmorItem.Chestplate::new);
	public static final DeferredItem<Item> BRET_CORSAIR_ARMOR_LEGGINGS = REGISTRY.register("bret_corsair_armor_leggings", BretCorsairArmorItem.Leggings::new);
	public static final DeferredItem<Item> BRET_CORSAIR_ARMOR_BOOTS = REGISTRY.register("bret_corsair_armor_boots", BretCorsairArmorItem.Boots::new);
	public static final DeferredItem<Item> BRET_CLOTHES_HELMET = REGISTRY.register("bret_clothes_helmet", BretClothesItem.Helmet::new);
	public static final DeferredItem<Item> BRET_CLOTHES_CHESTPLATE = REGISTRY.register("bret_clothes_chestplate", BretClothesItem.Chestplate::new);
	public static final DeferredItem<Item> BRET_CLOTHES_LEGGINGS = REGISTRY.register("bret_clothes_leggings", BretClothesItem.Leggings::new);
	public static final DeferredItem<Item> BRET_CLOTHES_BOOTS = REGISTRY.register("bret_clothes_boots", BretClothesItem.Boots::new);
	public static final DeferredItem<Item> SEA_UPGRADE_TEMPLATE = REGISTRY.register("sea_upgrade_template", SeaUpgradeTemplateItem::new);
	public static final DeferredItem<Item> DEPTH_SCAPHANDER_HELMET = REGISTRY.register("depth_scaphander_helmet", DepthScaphanderItem.Helmet::new);
	public static final DeferredItem<Item> DEPTH_SCAPHANDER_CHESTPLATE = REGISTRY.register("depth_scaphander_chestplate", DepthScaphanderItem.Chestplate::new);
	public static final DeferredItem<Item> DEPTH_SCAPHANDER_LEGGINGS = REGISTRY.register("depth_scaphander_leggings", DepthScaphanderItem.Leggings::new);
	public static final DeferredItem<Item> DEPTH_SCAPHANDER_BOOTS = REGISTRY.register("depth_scaphander_boots", DepthScaphanderItem.Boots::new);
	public static final DeferredItem<Item> KOUIGN_AMANN = REGISTRY.register("kouign_amann", KouignAmannItem::new);
	public static final DeferredItem<Item> GOLDEN_KOUIGN_AMANN = REGISTRY.register("golden_kouign_amann", GoldenKouignAmannItem::new);
	public static final DeferredItem<Item> RAWGRIZZLYMEAT = REGISTRY.register("rawgrizzlymeat", RawgrizzlymeatItem::new);
	public static final DeferredItem<Item> COOKEDGRIZZLYMEAT = REGISTRY.register("cookedgrizzlymeat", CookedgrizzlymeatItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}

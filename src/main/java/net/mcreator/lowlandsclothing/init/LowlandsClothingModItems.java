
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lowlandsclothing.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.lowlandsclothing.item.TreatedleatherItem;
import net.mcreator.lowlandsclothing.item.SnowtigerarmorItem;
import net.mcreator.lowlandsclothing.item.RatcatcherrobesItem;
import net.mcreator.lowlandsclothing.item.PlagueDoctorSuitItem;
import net.mcreator.lowlandsclothing.item.PenitentRagsItem;
import net.mcreator.lowlandsclothing.item.MountainmenclothesItem;
import net.mcreator.lowlandsclothing.item.MercenarySwordmanItem;
import net.mcreator.lowlandsclothing.item.HighlandslongkiltItem;
import net.mcreator.lowlandsclothing.item.HerbsWhipItem;
import net.mcreator.lowlandsclothing.item.HerbsFiberItem;
import net.mcreator.lowlandsclothing.item.GuardCaptainArmorItem;
import net.mcreator.lowlandsclothing.item.FurpeltItem;
import net.mcreator.lowlandsclothing.item.FurnacemasteramorItem;
import net.mcreator.lowlandsclothing.item.ExecutorarmorItem;
import net.mcreator.lowlandsclothing.item.ClothFabricItem;
import net.mcreator.lowlandsclothing.LowlandsClothingMod;

public class LowlandsClothingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LowlandsClothingMod.MODID);
	public static final RegistryObject<Item> GUARD_CAPTAIN_ARMOR_HELMET = REGISTRY.register("guard_captain_armor_helmet", () -> new GuardCaptainArmorItem.Helmet());
	public static final RegistryObject<Item> GUARD_CAPTAIN_ARMOR_CHESTPLATE = REGISTRY.register("guard_captain_armor_chestplate", () -> new GuardCaptainArmorItem.Chestplate());
	public static final RegistryObject<Item> GUARD_CAPTAIN_ARMOR_LEGGINGS = REGISTRY.register("guard_captain_armor_leggings", () -> new GuardCaptainArmorItem.Leggings());
	public static final RegistryObject<Item> GUARD_CAPTAIN_ARMOR_BOOTS = REGISTRY.register("guard_captain_armor_boots", () -> new GuardCaptainArmorItem.Boots());
	public static final RegistryObject<Item> MERCENARY_SWORDMAN_HELMET = REGISTRY.register("mercenary_swordman_helmet", () -> new MercenarySwordmanItem.Helmet());
	public static final RegistryObject<Item> MERCENARY_SWORDMAN_CHESTPLATE = REGISTRY.register("mercenary_swordman_chestplate", () -> new MercenarySwordmanItem.Chestplate());
	public static final RegistryObject<Item> MERCENARY_SWORDMAN_LEGGINGS = REGISTRY.register("mercenary_swordman_leggings", () -> new MercenarySwordmanItem.Leggings());
	public static final RegistryObject<Item> MERCENARY_SWORDMAN_BOOTS = REGISTRY.register("mercenary_swordman_boots", () -> new MercenarySwordmanItem.Boots());
	public static final RegistryObject<Item> MOUNTAINMENCLOTHES_HELMET = REGISTRY.register("mountainmenclothes_helmet", () -> new MountainmenclothesItem.Helmet());
	public static final RegistryObject<Item> MOUNTAINMENCLOTHES_CHESTPLATE = REGISTRY.register("mountainmenclothes_chestplate", () -> new MountainmenclothesItem.Chestplate());
	public static final RegistryObject<Item> MOUNTAINMENCLOTHES_LEGGINGS = REGISTRY.register("mountainmenclothes_leggings", () -> new MountainmenclothesItem.Leggings());
	public static final RegistryObject<Item> MOUNTAINMENCLOTHES_BOOTS = REGISTRY.register("mountainmenclothes_boots", () -> new MountainmenclothesItem.Boots());
	public static final RegistryObject<Item> SNOWTIGERARMOR_HELMET = REGISTRY.register("snowtigerarmor_helmet", () -> new SnowtigerarmorItem.Helmet());
	public static final RegistryObject<Item> SNOWTIGERARMOR_CHESTPLATE = REGISTRY.register("snowtigerarmor_chestplate", () -> new SnowtigerarmorItem.Chestplate());
	public static final RegistryObject<Item> SNOWTIGERARMOR_LEGGINGS = REGISTRY.register("snowtigerarmor_leggings", () -> new SnowtigerarmorItem.Leggings());
	public static final RegistryObject<Item> SNOWTIGERARMOR_BOOTS = REGISTRY.register("snowtigerarmor_boots", () -> new SnowtigerarmorItem.Boots());
	public static final RegistryObject<Item> RATCATCHERROBES_HELMET = REGISTRY.register("ratcatcherrobes_helmet", () -> new RatcatcherrobesItem.Helmet());
	public static final RegistryObject<Item> RATCATCHERROBES_CHESTPLATE = REGISTRY.register("ratcatcherrobes_chestplate", () -> new RatcatcherrobesItem.Chestplate());
	public static final RegistryObject<Item> RATCATCHERROBES_LEGGINGS = REGISTRY.register("ratcatcherrobes_leggings", () -> new RatcatcherrobesItem.Leggings());
	public static final RegistryObject<Item> RATCATCHERROBES_BOOTS = REGISTRY.register("ratcatcherrobes_boots", () -> new RatcatcherrobesItem.Boots());
	public static final RegistryObject<Item> EXECUTORARMOR_HELMET = REGISTRY.register("executorarmor_helmet", () -> new ExecutorarmorItem.Helmet());
	public static final RegistryObject<Item> EXECUTORARMOR_CHESTPLATE = REGISTRY.register("executorarmor_chestplate", () -> new ExecutorarmorItem.Chestplate());
	public static final RegistryObject<Item> EXECUTORARMOR_LEGGINGS = REGISTRY.register("executorarmor_leggings", () -> new ExecutorarmorItem.Leggings());
	public static final RegistryObject<Item> EXECUTORARMOR_BOOTS = REGISTRY.register("executorarmor_boots", () -> new ExecutorarmorItem.Boots());
	public static final RegistryObject<Item> FURNACEMASTERAMOR_HELMET = REGISTRY.register("furnacemasteramor_helmet", () -> new FurnacemasteramorItem.Helmet());
	public static final RegistryObject<Item> FURNACEMASTERAMOR_CHESTPLATE = REGISTRY.register("furnacemasteramor_chestplate", () -> new FurnacemasteramorItem.Chestplate());
	public static final RegistryObject<Item> FURNACEMASTERAMOR_LEGGINGS = REGISTRY.register("furnacemasteramor_leggings", () -> new FurnacemasteramorItem.Leggings());
	public static final RegistryObject<Item> FURNACEMASTERAMOR_BOOTS = REGISTRY.register("furnacemasteramor_boots", () -> new FurnacemasteramorItem.Boots());
	public static final RegistryObject<Item> HIGHLANDSLONGKILT_HELMET = REGISTRY.register("highlandslongkilt_helmet", () -> new HighlandslongkiltItem.Helmet());
	public static final RegistryObject<Item> HIGHLANDSLONGKILT_CHESTPLATE = REGISTRY.register("highlandslongkilt_chestplate", () -> new HighlandslongkiltItem.Chestplate());
	public static final RegistryObject<Item> HIGHLANDSLONGKILT_BOOTS = REGISTRY.register("highlandslongkilt_boots", () -> new HighlandslongkiltItem.Boots());
	public static final RegistryObject<Item> PLAGUE_DOCTOR_SUIT_HELMET = REGISTRY.register("plague_doctor_suit_helmet", () -> new PlagueDoctorSuitItem.Helmet());
	public static final RegistryObject<Item> PLAGUE_DOCTOR_SUIT_CHESTPLATE = REGISTRY.register("plague_doctor_suit_chestplate", () -> new PlagueDoctorSuitItem.Chestplate());
	public static final RegistryObject<Item> PLAGUE_DOCTOR_SUIT_LEGGINGS = REGISTRY.register("plague_doctor_suit_leggings", () -> new PlagueDoctorSuitItem.Leggings());
	public static final RegistryObject<Item> PLAGUE_DOCTOR_SUIT_BOOTS = REGISTRY.register("plague_doctor_suit_boots", () -> new PlagueDoctorSuitItem.Boots());
	public static final RegistryObject<Item> PENITENT_RAGS_HELMET = REGISTRY.register("penitent_rags_helmet", () -> new PenitentRagsItem.Helmet());
	public static final RegistryObject<Item> PENITENT_RAGS_CHESTPLATE = REGISTRY.register("penitent_rags_chestplate", () -> new PenitentRagsItem.Chestplate());
	public static final RegistryObject<Item> PENITENT_RAGS_LEGGINGS = REGISTRY.register("penitent_rags_leggings", () -> new PenitentRagsItem.Leggings());
	public static final RegistryObject<Item> PENITENT_RAGS_BOOTS = REGISTRY.register("penitent_rags_boots", () -> new PenitentRagsItem.Boots());
	public static final RegistryObject<Item> INVISIBLELIGHT = block(LowlandsClothingModBlocks.INVISIBLELIGHT);
	public static final RegistryObject<Item> FURPELT = REGISTRY.register("furpelt", () -> new FurpeltItem());
	public static final RegistryObject<Item> GRIZZLY_BEAR_SPAWN_EGG = REGISTRY.register("grizzly_bear_spawn_egg", () -> new ForgeSpawnEggItem(LowlandsClothingModEntities.GRIZZLY_BEAR, -12964834, -7112895, new Item.Properties()));
	public static final RegistryObject<Item> CLOTH_FABRIC = REGISTRY.register("cloth_fabric", () -> new ClothFabricItem());
	public static final RegistryObject<Item> HERBS_FIBER = REGISTRY.register("herbs_fiber", () -> new HerbsFiberItem());
	public static final RegistryObject<Item> HERBS_WHIP = REGISTRY.register("herbs_whip", () -> new HerbsWhipItem());
	public static final RegistryObject<Item> TREATEDLEATHER = REGISTRY.register("treatedleather", () -> new TreatedleatherItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}

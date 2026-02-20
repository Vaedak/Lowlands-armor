package net.mcreator.lowlandsclothing.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.lowlandsclothing.init.LowlandsClothingModItems;

public class SwamplanFolksAttiressetProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.SWAMPLAND_FOLKS_ATTIRES_HELMET.get()) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.SWAMPLAND_FOLKS_ATTIRES_CHESTPLATE.get()) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.SWAMPLAND_FOLKS_ATTIRES_LEGGINGS.get()) {
					if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("swamp")) || world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("mangrove_swamp"))
							|| world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_swamp")))
							|| world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("forge:is_swamp")))) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 120, 0));
					}
				}
			}
		}
	}
}

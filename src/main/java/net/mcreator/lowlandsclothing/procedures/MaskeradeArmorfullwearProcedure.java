package net.mcreator.lowlandsclothing.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.lowlandsclothing.init.LowlandsClothingModItems;

public class MaskeradeArmorfullwearProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.MASKERADE_ARMOR_HELMET.get()) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.MASKERADE_ARMOR_CHESTPLATE.get()) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.MASKERADE_ARMOR_LEGGINGS.get()) {
					if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.MASKERADE_ARMOR_BOOTS.get()) {
						if (!(entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(MobEffects.BAD_OMEN)) || !(entity instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(MobEffects.MOVEMENT_SPEED))) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.BAD_OMEN, 60000, 1, false, false));
							if (world instanceof ServerLevel _level11 && _level11.isRaided(BlockPos.containing(x, y, z))) {
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 60, 4, false, false));
							}
						}
					}
				}
			}
		}
	}
}

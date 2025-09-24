package net.mcreator.lowlandsclothing.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

import net.mcreator.lowlandsclothing.init.LowlandsClothingModItems;

public class DepthscaphandertickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.DEPTH_SCAPHANDER_HELMET.get()) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.DEPTH_SCAPHANDER_CHESTPLATE.get()) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.DEPTH_SCAPHANDER_LEGGINGS.get()) {
					if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.DEPTH_SCAPHANDER_BOOTS.get()) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 120, 0));
						if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BUBBLE_COLUMN
								|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WATER) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 120, 1));
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 120, 1));
						}
					}
				}
			}
		}
	}
}

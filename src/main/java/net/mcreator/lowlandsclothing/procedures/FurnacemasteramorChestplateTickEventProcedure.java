package net.mcreator.lowlandsclothing.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.lowlandsclothing.init.LowlandsClothingModItems;
import net.mcreator.lowlandsclothing.init.LowlandsClothingModBlocks;

public class FurnacemasteramorChestplateTickEventProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.FURNACEMASTERAMOR_HELMET.get()) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.FURNACEMASTERAMOR_CHESTPLATE.get()) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.FURNACEMASTERAMOR_LEGGINGS.get()) {
					if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.FURNACEMASTERAMOR_BOOTS.get()) {
						if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
							world.setBlock(BlockPos.containing(x, y, z), LowlandsClothingModBlocks.INVISIBLELIGHT.get().defaultBlockState(), 3);
						} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.VOID_AIR) {
							world.setBlock(BlockPos.containing(x, y, z), LowlandsClothingModBlocks.INVISIBLELIGHT.get().defaultBlockState(), 3);
						} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CAVE_AIR) {
							world.setBlock(BlockPos.containing(x, y, z), LowlandsClothingModBlocks.INVISIBLELIGHT.get().defaultBlockState(), 3);
						} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.CAVE_AIR) {
							world.setBlock(BlockPos.containing(x, y + 1, z), LowlandsClothingModBlocks.INVISIBLELIGHT.get().defaultBlockState(), 3);
						} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.VOID_AIR) {
							world.setBlock(BlockPos.containing(x, y + 1, z), LowlandsClothingModBlocks.INVISIBLELIGHT.get().defaultBlockState(), 3);
						} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
							world.setBlock(BlockPos.containing(x, y + 1, z), LowlandsClothingModBlocks.INVISIBLELIGHT.get().defaultBlockState(), 3);
						}
					}
				}
			}
		}
	}
}

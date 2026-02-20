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
import net.mcreator.lowlandsclothing.init.LowlandsClothingModBlocks;

public class NetherbornpirateequipedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.NETHERBORN_PIRATE_HELMET.get()) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.NETHERBORN_PIRATE_CHESTPLATE.get()) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.NETHERBORN_PIRATE_LEGGINGS.get()) {
					if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.NETHERBORN_PIRATE_BOOTS.get()) {
						if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.LAVA && !((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.LAVA)) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 120, 0));
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 120, 0));
							if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.LAVA) {
								world.setBlock(BlockPos.containing(x - 1, y - 1, z), LowlandsClothingModBlocks.FRAGILEMAGMA.get().defaultBlockState(), 3);
							}
							if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == Blocks.LAVA) {
								world.setBlock(BlockPos.containing(x + 1, y - 1, z), LowlandsClothingModBlocks.FRAGILEMAGMA.get().defaultBlockState(), 3);
							}
							if ((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == Blocks.LAVA) {
								world.setBlock(BlockPos.containing(x, y - 1, z - 1), LowlandsClothingModBlocks.FRAGILEMAGMA.get().defaultBlockState(), 3);
							}
							if ((world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == Blocks.LAVA) {
								world.setBlock(BlockPos.containing(x, y - 1, z + 1), LowlandsClothingModBlocks.FRAGILEMAGMA.get().defaultBlockState(), 3);
							}
							if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.LAVA) {
								world.setBlock(BlockPos.containing(x, y - 1, z), LowlandsClothingModBlocks.FRAGILEMAGMA.get().defaultBlockState(), 3);
							}
						}
					}
				}
			}
		}
	}
}

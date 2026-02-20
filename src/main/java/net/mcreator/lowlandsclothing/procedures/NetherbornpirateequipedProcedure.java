package net.mcreator.lowlandsclothing.procedures;

import net.minecraftforge.eventbus.api.Event;

public class NetherbornpirateequipedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.DELETED_MOD_ELEMENT_HELMET.get()) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.DELETED_MOD_ELEMENT_CHESTPLATE.get()) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.DELETED_MOD_ELEMENT_LEGGINGS.get()) {
					if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.DELETED_MOD_ELEMENT_BOOTS.get()) {
						if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.LAVA && !((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.LAVA)) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 120, 0));
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 120, 0));
							if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.LAVA) {
								world.setBlock(BlockPos.containing(x - 1, y - 1, z), LowlandsClothingModItems.DELETED_MOD_ELEMENT.get().defaultBlockState(), 3);
							}
							if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == Blocks.LAVA) {
								world.setBlock(BlockPos.containing(x + 1, y - 1, z), LowlandsClothingModItems.DELETED_MOD_ELEMENT.get().defaultBlockState(), 3);
							}
							if ((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == Blocks.LAVA) {
								world.setBlock(BlockPos.containing(x, y - 1, z - 1), LowlandsClothingModItems.DELETED_MOD_ELEMENT.get().defaultBlockState(), 3);
							}
							if ((world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == Blocks.LAVA) {
								world.setBlock(BlockPos.containing(x, y - 1, z + 1), LowlandsClothingModItems.DELETED_MOD_ELEMENT.get().defaultBlockState(), 3);
							}
							if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.LAVA) {
								world.setBlock(BlockPos.containing(x, y - 1, z), LowlandsClothingModItems.DELETED_MOD_ELEMENT.get().defaultBlockState(), 3);
							}
						}
					}
				}
			}
		}
	}
}

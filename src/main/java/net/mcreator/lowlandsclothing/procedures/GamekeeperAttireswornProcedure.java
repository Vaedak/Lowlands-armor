package net.mcreator.lowlandsclothing.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.lowlandsclothing.init.LowlandsClothingModItems;

import java.util.Comparator;

public class GamekeeperAttireswornProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.GAMEKEEPER_ATTIRES_HELMET.get()) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.GAMEKEEPER_ATTIRES_CHESTPLATE.get()) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.GAMEKEEPER_ATTIRES_LEGGINGS.get()) {
					if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == LowlandsClothingModItems.GAMEKEEPER_ATTIRES_BOOTS.get()) {
						if (!world.getEntitiesOfClass(Wolf.class, AABB.ofSize(new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), 15, 15, 15), e -> true).isEmpty()) {
							if (((Entity) world.getEntitiesOfClass(Wolf.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 2, false, false));
							if (((Entity) world.getEntitiesOfClass(Wolf.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 1, false, false));
							if (((Entity) world.getEntitiesOfClass(Wolf.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 3, false, false));
						}
					}
				}
			}
		}
	}
}

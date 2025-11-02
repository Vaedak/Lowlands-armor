
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lowlandsclothing.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.lowlandsclothing.entity.GrizzlyBearEntity;
import net.mcreator.lowlandsclothing.LowlandsClothingMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class LowlandsClothingModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, LowlandsClothingMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<GrizzlyBearEntity>> GRIZZLY_BEAR = register("grizzly_bear",
			EntityType.Builder.<GrizzlyBearEntity>of(GrizzlyBearEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		GrizzlyBearEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GRIZZLY_BEAR.get(), GrizzlyBearEntity.createAttributes().build());
	}
}

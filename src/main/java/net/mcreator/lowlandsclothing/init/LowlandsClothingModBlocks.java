
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lowlandsclothing.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.lowlandsclothing.block.InvisiblelightBlock;
import net.mcreator.lowlandsclothing.LowlandsClothingMod;

public class LowlandsClothingModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LowlandsClothingMod.MODID);
	public static final RegistryObject<Block> INVISIBLELIGHT = REGISTRY.register("invisiblelight", () -> new InvisiblelightBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}

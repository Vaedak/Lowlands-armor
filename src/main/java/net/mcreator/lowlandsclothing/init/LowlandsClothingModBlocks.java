
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lowlandsclothing.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.lowlandsclothing.block.InvisiblelightBlock;
import net.mcreator.lowlandsclothing.LowlandsClothingMod;

public class LowlandsClothingModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(LowlandsClothingMod.MODID);
	public static final DeferredBlock<Block> INVISIBLELIGHT = REGISTRY.register("invisiblelight", InvisiblelightBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}

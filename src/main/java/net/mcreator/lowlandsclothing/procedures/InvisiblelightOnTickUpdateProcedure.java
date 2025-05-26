package net.mcreator.lowlandsclothing.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class InvisiblelightOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double lighttimer = 0;
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}

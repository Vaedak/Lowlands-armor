package net.mcreator.lowlandsclothing.procedures;

import net.minecraftforge.eventbus.api.Event;

public class FragilemagmaOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x, y, z), Blocks.LAVA.defaultBlockState(), 3);
	}
}

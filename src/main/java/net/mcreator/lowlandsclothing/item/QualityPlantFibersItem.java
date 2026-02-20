
package net.mcreator.lowlandsclothing.item;

public class QualityPlantFibersItem extends Item {
	public QualityPlantFibersItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Rare Harvest on Grass using a Grass Whip or Common Harvest on Tall Grass."));
	}
}

package net.mcreator.lowlandsclothing.item;

public class HerbsFiberItem extends Item {
	public HerbsFiberItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Harvest on grass using a Grass Whip ."));
	}
}
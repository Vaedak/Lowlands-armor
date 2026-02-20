
package net.mcreator.lowlandsclothing.item;

public class SlimyFibersItem extends Item {
	public SlimyFibersItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("An Uncommon material harvested on lilypads and seaweeds with a Grass Whip ."));
	}
}
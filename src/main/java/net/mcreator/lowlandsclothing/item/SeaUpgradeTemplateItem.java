
package net.mcreator.lowlandsclothing.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SeaUpgradeTemplateItem extends Item {
	public SeaUpgradeTemplateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}

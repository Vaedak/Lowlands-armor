
package net.mcreator.lowlandsclothing.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IronSmithingTemplateItem extends Item {
	public IronSmithingTemplateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}

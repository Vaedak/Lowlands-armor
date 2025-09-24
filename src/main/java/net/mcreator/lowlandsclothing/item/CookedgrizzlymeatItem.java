
package net.mcreator.lowlandsclothing.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedgrizzlymeatItem extends Item {
	public CookedgrizzlymeatItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(5).saturationMod(1f).meat().build()));
	}
}

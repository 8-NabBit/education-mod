package com.education.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import com.education.item.icebomb.IceBombItem;

import java.util.function.Function;

public class ModItems {

	public static final Item ICE_BOMB = register(ModItemIds.ICE_BOMB, IceBombItem::new, new IceBombItem.Properties().stacksTo(16));

	public static Item register(ResourceKey<Item> itemKey, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
		Item item = itemFactory.apply(settings.setId(itemKey));
		Registry.register(BuiltInRegistries.ITEM, itemKey, item);

		return item;
	}

	public static void initialize() {}
}

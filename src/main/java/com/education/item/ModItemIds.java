package com.education.item;

import com.education.JavaEducation;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class ModItemIds {

	public static final ResourceKey<Item> ICE_BOMB = create("ice_bomb");

	public static ResourceKey<Item> create(String name) {
		return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(JavaEducation.MOD_ID, name));
	}
}

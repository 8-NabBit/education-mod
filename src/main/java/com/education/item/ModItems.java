package com.education.item;

import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import com.education.block.ModBlocks;
import com.education.item.icebomb.IceBombItem;
import com.education.block.ModBlockItemIds;
import com.education.item.rapidfertilizer.RapidFertilizerItem;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.references.BlockItemId;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ModItems {

	public static final Item ICE_BOMB = register(ModItemIds.ICE_BOMB, IceBombItem::new, new IceBombItem.Properties().stacksTo(16).useCooldown(0.5F));
	public static final Item RAPID_FERTILIZER = register(ModItemIds.RAPID_FERTILIZER, RapidFertilizerItem::new, new RapidFertilizerItem.Properties());
	public static final Item UNDERWATER_TORCH = registerBlock(ModBlockItemIds.UNDERWATER_TORCH, ModBlocks.UNDERWATER_TORCH, (b, p) -> new StandingAndWallBlockItem(b, ModBlocks.UNDERWATER_WALL_TORCH, Direction.DOWN, p), new Item.Properties());

	public static Item register(ResourceKey<Item> itemKey, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
		Item item = itemFactory.apply(settings.setId(itemKey));
		Registry.register(BuiltInRegistries.ITEM, itemKey, item);

		return item;
	}

	private static Item registerBlock(
		final BlockItemId id, final Block block, final BiFunction<Block, Item.Properties, Item> itemFactory, final Item.Properties properties
	) {
		return register(id.item(), p -> itemFactory.apply(block, p), properties.useBlockDescriptionPrefix().requiredFeatures(block.requiredFeatures()));
	}

	public static void initialize() {}
}

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
import com.education.item.compound.*;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.references.BlockItemId;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ModItems {

	public static final Item ICE_BOMB = register(ModItemIds.ICE_BOMB, IceBombItem::new, new IceBombItem.Properties().stacksTo(16).useCooldown(0.5F));
	public static final Item RAPID_FERTILIZER = register(ModItemIds.RAPID_FERTILIZER, RapidFertilizerItem::new, new RapidFertilizerItem.Properties());
	public static final Item UNDERWATER_TORCH = registerBlock(ModBlockItemIds.UNDERWATER_TORCH, ModBlocks.UNDERWATER_TORCH, (b, p) -> new StandingAndWallBlockItem(b, ModBlocks.UNDERWATER_WALL_TORCH, Direction.DOWN, p), new Item.Properties());

	// compounds
	public static final Item ALUMINIUM_OXIDE = register(ModItemIds.ALUMINIUM_OXIDE, AluminiumOxideItem::new, new AluminiumOxideItem.Properties());
	public static final Item AMMONIA = register(ModItemIds.AMMONIA, AmmoniaItem::new, new AmmoniaItem.Properties());
	public static final Item BARIUM_SULFATE = register(ModItemIds.BARIUM_SULFATE, BariumSulfateItem::new, new BariumSulfateItem.Properties());
	public static final Item BENZENE = register(ModItemIds.BENZENE, BenzeneItem::new, new BenzeneItem.Properties());
	public static final Item BORON_TRIOXIDE = register(ModItemIds.BORON_TRIOXIDE, BoronTrioxideItem::new, new BoronTrioxideItem.Properties());
	public static final Item CALCIUM_BROMIDE = register(ModItemIds.CALCIUM_BROMIDE, CalciumBromideItem::new, new CalciumBromideItem.Properties());
	public static final Item CRUDE_OIL = register(ModItemIds.CRUDE_OIL, CrudeOilItem::new, new CrudeOilItem.Properties());
	public static final Item GLUE = register(ModItemIds.GLUE, GlueItem::new, new GlueItem.Properties());
	public static final Item HYDROGEN_PEROXIDE = register(ModItemIds.HYDROGEN_PEROXIDE, HydrogenPeroxideItem::new, new HydrogenPeroxideItem.Properties());
	public static final Item IRON_SULFIDE = register(ModItemIds.IRON_SULFIDE, IronSulfideItem::new, new IronSulfideItem.Properties());
	public static final Item LATEX = register(ModItemIds.LATEX, LatexItem::new, new LatexItem.Properties());
	public static final Item LITHIUM_HYDRIDE = register(ModItemIds.LITHIUM_HYDRIDE, LithiumHydrideItem::new, new LithiumHydrideItem.Properties());
	public static final Item LUMINOL = register(ModItemIds.LUMINOL, LuminolItem::new, new LuminolItem.Properties());
	public static final Item LYE = register(ModItemIds.LYE, LyeItem::new, new LyeItem.Properties());
	public static final Item MAGNESIUM_NITRATE = register(ModItemIds.MAGNESIUM_NITRATE, MagnesiumNitrateItem::new, new MagnesiumNitrateItem.Properties());
	public static final Item MAGNESIUM_OXIDE = register(ModItemIds.MAGNESIUM_OXIDE, MagnesiumOxideItem::new, new MagnesiumOxideItem.Properties());
	public static final Item POLYETHYLENE = register(ModItemIds.POLYETHYLENE, PolyethyleneItem::new, new PolyethyleneItem.Properties());
	public static final Item POTASSIUM_IODIDE = register(ModItemIds.POTASSIUM_IODIDE, PotassiumIodideItem::new, new PotassiumIodideItem.Properties());
	public static final Item SOAP = register(ModItemIds.SOAP, SoapItem::new, new SoapItem.Properties());
	public static final Item SODIUM_ACETATE = register(ModItemIds.SODIUM_ACETATE, SodiumAcetateItem::new, new SodiumAcetateItem.Properties());
	public static final Item SODIUM_FLUORIDE = register(ModItemIds.SODIUM_FLUORIDE, SodiumFluorideItem::new, new SodiumFluorideItem.Properties());
	public static final Item SODIUM_HYDRIDE = register(ModItemIds.SODIUM_HYDRIDE, SodiumHydrideItem::new, new SodiumHydrideItem.Properties());
	public static final Item SODIUM_HYPOCHLORITE = register(ModItemIds.SODIUM_HYPOCHLORITE, SodiumHypochloriteItem::new, new SodiumHypochloriteItem.Properties());
	public static final Item SODIUM_OXIDE = register(ModItemIds.SODIUM_OXIDE, SodiumOxideItem::new, new SodiumOxideItem.Properties());
	public static final Item SULFATE = register(ModItemIds.SULFATE, SulfateItem::new, new SulfateItem.Properties());
	public static final Item SALT = register(ModItemIds.SALT, SaltItem::new, new SaltItem.Properties());
	public static final Item CALCIUM_CHLORIDE = register(ModItemIds.CALCIUM_CHLORIDE, CalciumChlorideItem::new, new CalciumChlorideItem.Properties());
	public static final Item CERIUM_CHLORIDE = register(ModItemIds.CERIUM_CHLORIDE, CeriumChlorideItem::new, new CeriumChlorideItem.Properties());
	public static final Item MERCURIC_CHLORIDE = register(ModItemIds.MERCURIC_CHLORIDE, MercuricChlorideItem::new, new MercuricChlorideItem.Properties());
	public static final Item POTASSIUM_CHLORIDE = register(ModItemIds.POTASSIUM_CHLORIDE, PotassiumChlorideItem::new, new PotassiumChlorideItem.Properties());
	public static final Item TUNGSTEN_CHLORIDE = register(ModItemIds.TUNGSTEN_CHLORIDE, TungstenChlorideItem::new, new TungstenChlorideItem.Properties());

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

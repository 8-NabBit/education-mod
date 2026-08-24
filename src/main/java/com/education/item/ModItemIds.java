package com.education.item;

import com.education.JavaEducation;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class ModItemIds {

	public static final ResourceKey<Item> ICE_BOMB = create("ice_bomb");
	public static final ResourceKey<Item> RAPID_FERTILIZER = create("rapid_fertilizer");

	// compounds
	public static final ResourceKey<Item> ALUMINIUM_OXIDE = create("aluminium_oxide");
	public static final ResourceKey<Item> AMMONIA = create("ammonia");
	public static final ResourceKey<Item> BARIUM_SULFATE = create("barium_sulfate");
	public static final ResourceKey<Item> BENZENE = create("benzene");
	public static final ResourceKey<Item> BORON_TRIOXIDE = create("boron_trioxide");
	public static final ResourceKey<Item> CALCIUM_BROMIDE = create("calcium_bromide");
	public static final ResourceKey<Item> CRUDE_OIL = create("crude_oil");
	public static final ResourceKey<Item> GLUE = create("glue");
	public static final ResourceKey<Item> HYDROGEN_PEROXIDE = create("hydrogen_peroxide");
	public static final ResourceKey<Item> IRON_SULFIDE = create("iron_sulfide");
	public static final ResourceKey<Item> LATEX = create("latex");
	public static final ResourceKey<Item> LITHIUM_HYDRIDE = create("lithium_hydride");
	public static final ResourceKey<Item> LUMINOL = create("luminol");
	public static final ResourceKey<Item> LYE = create("lye");
	public static final ResourceKey<Item> MAGNESIUM_NITRATE = create("magnesium_nitrate");
	public static final ResourceKey<Item> MAGNESIUM_OXIDE = create("magnesium_oxide");
	public static final ResourceKey<Item> POLYETHYLENE = create("polyethylene");
	public static final ResourceKey<Item> POTASSIUM_IODIDE = create("potassium_iodide");
	public static final ResourceKey<Item> SOAP = create("soap");
	public static final ResourceKey<Item> SODIUM_ACETATE = create("sodium_acetate");
	public static final ResourceKey<Item> SODIUM_FLUORIDE = create("sodium_fluoride");
	public static final ResourceKey<Item> SODIUM_HYDRIDE = create("sodium_hydride");
	public static final ResourceKey<Item> SODIUM_HYPOCHLORITE = create("sodium_hypochlorite");
	public static final ResourceKey<Item> SODIUM_OXIDE = create("sodium_oxide");
	public static final ResourceKey<Item> SULFATE = create("sulfate");
	public static final ResourceKey<Item> SALT = create("salt");
	public static final ResourceKey<Item> CALCIUM_CHLORIDE = create("calcium_chloride");
	public static final ResourceKey<Item> CERIUM_CHLORIDE = create("cerium_chloride");
	public static final ResourceKey<Item> MERCURIC_CHLORIDE = create("mercuric_chloride");
	public static final ResourceKey<Item> POTASSIUM_CHLORIDE = create("potassium_chloride");
	public static final ResourceKey<Item> TUNGSTEN_CHLORIDE = create("tungsten_chloride");

	public static ResourceKey<Item> create(String name) {
		return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(JavaEducation.MOD_ID, name));
	}
}

package com.education.block;

import com.education.JavaEducation;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;

public class ModBlockIds {
    public static final ResourceKey<Block> UNDERWATER_WALL_TORCH = create("underwater_wall_torch");

    private static ResourceKey<Block> create(final String name) {
		return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(JavaEducation.MOD_ID, name));
	}
}

package com.education.block;

import com.education.JavaEducation;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;

public class ModBlockItemIds {
    public static final BlockItemId UNDERWATER_TORCH = create("underwater_torch");

    public static BlockItemId create(final String name) {
		Identifier id = Identifier.fromNamespaceAndPath(JavaEducation.MOD_ID, name);
		return BlockItemId.create(id, id);
	}
}
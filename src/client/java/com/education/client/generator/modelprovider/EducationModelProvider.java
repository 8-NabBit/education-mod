package com.education.client.generator.modelprovider;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;

public class EducationModelProvider extends FabricModelProvider {
	public EducationModelProvider(FabricPackOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
		
	}

	@Override
	public void generateItemModels(ItemModelGenerators itemModelGenerator) {
	}

	@Override
	public String getName() {
		return "EducationModelProvider";
	}
}

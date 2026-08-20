package com.education.client;

import com.education.client.generator.EducationModelProvider;
import com.education.generator.EducationBlockLootTableProvider;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class JavaEducationDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(EducationModelProvider::new);
		pack.addProvider(EducationBlockLootTableProvider::new);
	}
}

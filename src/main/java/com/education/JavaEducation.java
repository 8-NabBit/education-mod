package com.education;

import com.education.item.ModItems;
import com.education.creativemodetab.ModCreativeModeTabs;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaEducation implements ModInitializer {
	public static final String MOD_ID = "education-mod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Java Education Edition Mod");
		ModItems.initialize();
		ModCreativeModeTabs.register();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}

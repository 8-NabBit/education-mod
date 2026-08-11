package com.education.client;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import com.education.entity.ModEntities;

public class JavaEducationClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		EntityRenderers.register(ModEntities.THROWN_ICE_BOMB, ThrownItemRenderer::new);
	}
}

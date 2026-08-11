package com.education.entity;

import com.education.JavaEducation;
import com.education.entity.icebomb.ThrownIceBombEntity;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public final class ModEntities {
    public static final Identifier THROWN_ICE_BOMB_ID =
        Identifier.fromNamespaceAndPath(JavaEducation.MOD_ID, "thrown_ice_bomb");

    public static final ResourceKey<EntityType<?>> THROWN_ICE_BOMB_KEY =
        ResourceKey.create(
            Registries.ENTITY_TYPE,
            THROWN_ICE_BOMB_ID
        );

    public static final EntityType<ThrownIceBombEntity> THROWN_ICE_BOMB =
        register(
            THROWN_ICE_BOMB_KEY,
            THROWN_ICE_BOMB_ID,
            EntityType.Builder.<ThrownIceBombEntity>of(ThrownIceBombEntity::new, MobCategory.MISC)
                .sized(0.25F, 0.25F)
                .clientTrackingRange(4)
                .updateInterval(10)
        );

    public static <T extends Entity> EntityType<T> register(ResourceKey<EntityType<?>> key, Identifier id, EntityType.Builder<T> builder) {
        return Registry.register(BuiltInRegistries.ENTITY_TYPE, id.toString(), builder.build(key));
    }

    public static void initialize() {
    }
}

package com.education.entity.icebomb;

import com.education.entity.ModEntities;
import net.minecraft.world.entity.projectile.throwableitemprojectile.ThrowableItemProjectile;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import com.education.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ThrownIceBombEntity extends ThrowableItemProjectile {
    public ThrownIceBombEntity(EntityType<? extends ThrowableItemProjectile> type, Level level) {
        super(type, level);
    }

    public ThrownIceBombEntity(Level level, LivingEntity owner, ItemStack stack) {
        super(ModEntities.THROWN_ICE_BOMB, owner, level, stack);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.ICE_BOMB;
    }
}
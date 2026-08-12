package com.education.entity.icebomb;

import com.education.entity.ModEntities;
import com.education.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.throwableitemprojectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;

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

    protected void onHitEntity(final EntityHitResult hitResult) {
        super.onHitEntity(hitResult);
        this.discard();
    }

    @Override
    public void tick() {
        super.tick();

        Level level = this.level();
        if (level.isClientSide()) {
            return;
        }

        if (this.isInLava() || level.getFluidState(this.blockPosition()).is(FluidTags.LAVA)) {
            this.discard();
        }

        if (this.isInWater() || level.getFluidState(this.blockPosition()).is(FluidTags.WATER)) {
            freezeWaterAround(this.blockPosition());
            this.discard();
        }
    }

    protected void onHitBlock(final BlockHitResult hitResult) {
        super.onHitBlock(hitResult);

        freezeWaterAround(hitResult.getBlockPos());
        this.discard();
    }

    private void freezeWaterAround(BlockPos center) {
        Level level = this.level();

        for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {
                for (int z = -1; z <= 1; z++) {
                    BlockPos pos = center.offset(x, y, z);
                    if (level.getFluidState(pos).is(FluidTags.WATER)) {
                        level.setBlockAndUpdate(pos, Blocks.ICE.defaultBlockState());
                    }
                }
            }
        }
    }
}

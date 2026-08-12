package com.education.entity.icebomb;

import com.education.entity.ModEntities;
import net.minecraft.world.entity.projectile.throwableitemprojectile.ThrowableItemProjectile;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import com.education.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.ArrayList;
import java.util.List;

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
    }

    protected void onHitBlock(final BlockHitResult hitResult) {
        super.onHitBlock(hitResult);

        Level level = this.level();
        List<BlockPos> positions = new ArrayList<BlockPos>();
        for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {
                for (int z = -1; z <= 1; z++) {
                    Block block = level.getBlockState(hitResult.getBlockPos()).getBlock();
                    if (block != null && block != Blocks.AIR) {
                        positions.add(hitResult.getBlockPos().offset(x, y, z));
                    }
                }
            }
        }
        for (BlockPos pos : positions) {
            level.setBlockAndUpdate(pos, Blocks.ICE.defaultBlockState());
        }
        this.discard();
    }
}

package com.education.mixin;

import com.education.JavaEducation;
import com.education.block.ModBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.beans.JavaBean;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LiquidBlock.class)
public abstract class WaterFluidMixin {

    private static final int HEAT_RADIUS = 2;

    @Inject(
        method = "randomTick",
        at = @At("HEAD"),
        cancellable = true
    )
    private void preventWaterFreezing(
            BlockState state,
            ServerLevel level,
            BlockPos pos,
            RandomSource random,
            CallbackInfo ci
    ) {
        if (!state.is(Blocks.WATER)) {
            return;
        }

        for (int dx = -HEAT_RADIUS; dx <= HEAT_RADIUS; dx++) {
            for (int dy = -HEAT_RADIUS; dy <= HEAT_RADIUS; dy++) {
                for (int dz = -HEAT_RADIUS; dz <= HEAT_RADIUS; dz++) {

                    if (Math.abs(dx) + Math.abs(dy) + Math.abs(dz) > HEAT_RADIUS) {
                        continue;
                    }

                    BlockPos heatPos = pos.offset(dx, dy, dz);

                    if (level.getBlockState(heatPos).is(ModBlocks.HEAT_BLOCK)) {
                        ci.cancel();
                        return;
                    }
                }
            }
        }
    }
}

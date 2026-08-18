package com.education.block.HeatBlock;

import com.education.JavaEducation;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.level.block.state.BlockState;

public class HeatBlock extends Block {
    private static final int HEAT_RADIUS = 2;

    public HeatBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected void randomTick(
            BlockState state,
            ServerLevel level,
            BlockPos pos,
            RandomSource random) {

        for (int dx = -HEAT_RADIUS; dx <= HEAT_RADIUS; dx++) {
            for (int dy = -HEAT_RADIUS; dy <= HEAT_RADIUS; dy++) {
                for (int dz = -HEAT_RADIUS; dz <= HEAT_RADIUS; dz++) {

                    if (Math.abs(dx) + Math.abs(dy) + Math.abs(dz) > HEAT_RADIUS) {
                        continue;
                    }

                    BlockPos targetPos = pos.offset(dx, dy, dz);
                    BlockState targetState = level.getBlockState(targetPos);

                    if (targetState.is(Blocks.SNOW)) {
                        if (random.nextFloat() < 0.70f) {

                            int layers = targetState.getValue(SnowLayerBlock.LAYERS);

                            if (layers <= 1) {
                                level.removeBlock(targetPos, false);
                            } else {
                                level.setBlock(
                                        targetPos,
                                        targetState.setValue(
                                                SnowLayerBlock.LAYERS,
                                                layers - 1
                                        ),
                                        3
                                );
                            }
                        }
                    }

                    else if (targetState.is(Blocks.SNOW_BLOCK)) {
                        if (random.nextFloat() < 0.20f) {
                            level.setBlock(
                                    targetPos,
                                    Blocks.WATER.defaultBlockState(),
                                    3
                            );
                        }
                    }

                    else if (targetState.is(Blocks.ICE)) {
                        if (random.nextFloat() < 0.05f) {
                            level.setBlock(
                                    targetPos,
                                    Blocks.WATER.defaultBlockState(),
                                    3
                            );
                        }
                    }
                }
            }
        }
    }
}

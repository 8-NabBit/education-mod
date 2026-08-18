package com.education.item.rapidfertilizer;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LevelEvent;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import java.util.List;

public class RapidFertilizerItem extends BoneMealItem {
    public static final int MAX_TRIES = 256;

    private static final List<Block> multipleBonemeal = List.of(
        Blocks.ACACIA_SAPLING,
        Blocks.AZALEA,
        Blocks.BEETROOTS,
        Blocks.BIRCH_SAPLING,
        Blocks.BROWN_MUSHROOM,
        Blocks.CARROTS,
        Blocks.CHERRY_SAPLING,
        Blocks.COCOA,
        Blocks.CRIMSON_FUNGUS,
        Blocks.DARK_OAK_SAPLING,
        Blocks.FLOWERING_AZALEA,
        Blocks.JUNGLE_SAPLING,
        Blocks.MANGROVE_PROPAGULE,
        Blocks.MELON_STEM,
        Blocks.OAK_SAPLING,
        Blocks.PALE_OAK_SAPLING,
        Blocks.PITCHER_CROP,
        Blocks.POTATOES,
        Blocks.PUMPKIN_STEM,
        Blocks.RED_MUSHROOM,
        Blocks.SPRUCE_SAPLING,
        Blocks.TORCHFLOWER_CROP,
        Blocks.WARPED_FUNGUS,
        Blocks.WHEAT
    );

    public RapidFertilizerItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(final UseOnContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        BlockPos relative = pos.relative(context.getClickedFace());
        BlockState clickedState = level.getBlockState(pos);
        boolean needsMultipleBonemeal = isMultipleBonemeal(clickedState.getBlock());

        if (!needsMultipleBonemeal) {
            if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), level, pos)) {
                return finishBonemealUse(context, pos);
            }

            if (clickedState.isFaceSturdy(level, pos, context.getClickedFace())
                    && BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), level, relative, context.getClickedFace())) {
                return finishBonemealUse(context, relative);
            }

            return InteractionResult.PASS;
        }

        if (cycleCropGrowth(level, pos)) {
            return finishBonemealUse(context, pos);
        }

        if (clickedState.isFaceSturdy(level, pos, context.getClickedFace()) && cycleWaterGrowth(level, relative, context.getClickedFace())) {
            return finishBonemealUse(context, relative);
        }

        return InteractionResult.PASS;
    }

    private InteractionResult finishBonemealUse(UseOnContext context, BlockPos pos) {
        Level level = context.getLevel();

        if (!level.isClientSide()) {
            context.getItemInHand().causeUseVibration(context.getPlayer(), GameEvent.ITEM_INTERACT_FINISH);
            level.levelEvent(LevelEvent.PARTICLES_AND_SOUND_PLANT_GROWTH, pos, 15);
            context.getItemInHand().shrink(1);
            return InteractionResult.SUCCESS_SERVER;
        }

        return InteractionResult.SUCCESS;
    }

    private static boolean isMultipleBonemeal(Block block) {
        return multipleBonemeal.contains(block);
    }

    private static boolean cycleCropGrowth(Level level, BlockPos posToGrow) {
        return cycleGrowth(level, posToGrow, null, false);
    }

    private static boolean cycleWaterGrowth(Level level, BlockPos posToGrow, Direction face) {
        return cycleGrowth(level, posToGrow, face, true);
    }

    private static boolean cycleGrowth(Level level, BlockPos posToGrow, Direction face, boolean water) {
        boolean hasGrown = false;
        boolean grew = false;
        ItemStack simulatedStack = new ItemStack(Items.BONE_MEAL, 2);

        for (int i = 0; i < MAX_TRIES; i++) {
            if (water) {
                grew = BoneMealItem.growWaterPlant(simulatedStack, level, posToGrow, face);
            } else {
                grew = BoneMealItem.growCrop(simulatedStack, level, posToGrow);
            }

            if (grew) {
                simulatedStack.grow(1);
                hasGrown = true;
            } else if (hasGrown) {
                return true;
            } else {
                break;
            }
        }

        return false;
    }
}

package com.education.block.UnderwaterWallTorchBlock;

import com.education.block.UnderwaterTorchBlock.UnderwaterTorchBlock;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import java.util.Map;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import org.jspecify.annotations.Nullable;

public class UnderwaterWallTorchBlock extends UnderwaterTorchBlock{

    public static final MapCodec<UnderwaterWallTorchBlock> CODEC = RecordCodecBuilder.mapCodec(
		i -> i.group(PARTICLE_OPTIONS_FIELD.forGetter(b -> b.flameParticle), propertiesCodec()).apply(i, UnderwaterWallTorchBlock::new)
	);

    public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;
    private static final Map<Direction, VoxelShape> SHAPES = Shapes.rotateHorizontal(Block.boxZ(5.0, 3.0, 13.0, 11.0, 16.0));

    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    @Override
	public MapCodec<UnderwaterWallTorchBlock> codec() {
		return CODEC;
	}

    @Override
	protected void createBlockStateDefinition(final StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(WATERLOGGED).add(FACING);
	}

    public UnderwaterWallTorchBlock(final SimpleParticleType flameParticle, final Properties properties) {
        super(flameParticle, properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, false).setValue(FACING, Direction.NORTH));
    }

    @Override
	protected VoxelShape getShape(final BlockState state, final BlockGetter level, final BlockPos pos, final CollisionContext context) {
		return getShape(state);
	}

	public static VoxelShape getShape(final BlockState state) {
		return SHAPES.get(state.getValue(FACING));
	}

	@Override
	protected boolean canSurvive(final BlockState state, final LevelReader level, final BlockPos pos) {
		return canSurvive(level, pos, state.getValue(FACING));
	}

	public static boolean canSurvive(final LevelReader level, final BlockPos pos, final Direction facing) {
		BlockPos relativePos = pos.relative(facing.getOpposite());
		BlockState relativeState = level.getBlockState(relativePos);
		return relativeState.isFaceSturdy(level, relativePos, facing);
	}

	@Override
	public @Nullable BlockState getStateForPlacement(final BlockPlaceContext context) {
		BlockState state = this.defaultBlockState();
		LevelReader level = context.getLevel();
		BlockPos pos = context.getClickedPos();
		Direction[] directions = context.getNearestLookingDirections();

        FluidState replacedFluidState = context.getLevel().getFluidState(pos);
        boolean isWaterSource = replacedFluidState.is(Fluids.WATER);

		for (Direction direction : directions) {
			if (direction.getAxis().isHorizontal()) {
				Direction facing = direction.getOpposite();
				state = state.setValue(FACING, facing).setValue(WATERLOGGED, isWaterSource);
				if (state.canSurvive(level, pos)) {
					return state;
				}
			}
		}

		return null;
	}

	@Override
	protected BlockState updateShape(
		final BlockState state,
		final LevelReader level,
		final ScheduledTickAccess ticks,
		final BlockPos pos,
		final Direction directionToNeighbour,
		final BlockPos neighbourPos,
		final BlockState neighbourState,
		final RandomSource random
	) {
        if (state.getValue(WATERLOGGED)) {
			ticks.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
		}

		return directionToNeighbour.getOpposite() == state.getValue(FACING) && !state.canSurvive(level, pos) 
            ? Blocks.AIR.defaultBlockState() : super.updateShape(state, level, ticks, pos, directionToNeighbour, neighbourPos, neighbourState, random);
	}

    @Override
	public void animateTick(final BlockState state, final Level level, final BlockPos pos, final RandomSource random) {
		Direction direction = state.getValue(FACING);
		double x = pos.getX() + 0.5;
		double y = pos.getY() + 0.7;
		double z = pos.getZ() + 0.5;
		Direction opposite = direction.getOpposite();
		level.addParticle(ParticleTypes.SMOKE, x + 0.27 * opposite.getStepX(), y + 0.22, z + 0.27 * opposite.getStepZ(), 0.0, 0.0, 0.0);
	}

    @Override
	protected BlockState rotate(final BlockState state, final Rotation rotation) {
		return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
	}

	@Override
	protected BlockState mirror(final BlockState state, final Mirror mirror) {
		return state.rotate(mirror.getRotation(state.getValue(FACING)));
	}
}

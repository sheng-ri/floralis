package com.luxtracon.floralis.block;

import com.luxtracon.floralis.registry.FloralisBlockStateProperties;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.neoforge.common.PlantType;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@SuppressWarnings("deprecation")
@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class CactusCropBlock extends CropBlock {
	public static final VoxelShape[] SHAPES = new VoxelShape[] {
		Block.box(7.0D, 0.0D, 7.0D, 9.0D, 2.0D, 9.0D), Block.box(6.0D, 0.0D, 6.0D, 10.0D, 4.0D, 10.0D), Block.box(5.0D, 0.0D, 5.0D, 11.0D, 6.0D, 11.0D), Block.box(4.0D, 0.0D, 4.0D, 12.0D, 8.0D, 12.0D), Block.box(4.0D, 0.0D, 4.0D, 12.0D, 8.0D, 12.0D), Block.box(4.0D, 0.0D, 4.0D, 12.0D, 8.0D, 12.0D)
	};

	public CactusCropBlock(Properties pProperties) {
		super(pProperties);
		this.registerDefaultState(this.stateDefinition.any().setValue(this.getAgeProperty(), 0));
	}

	@Override
	public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
		return (pLevel.getRawBrightness(pPos, 0) >= 8 || pLevel.canSeeSky(pPos)) && this.mayPlaceOn(pLevel.getBlockState(pPos.below()), pLevel, pPos);
	}

	@Override
	public boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
		return pState.is(BlockTags.SAND);
	}

	@Override
	public int getBonemealAgeIncrease(Level pLevel) {
		return Mth.nextInt(pLevel.random, 1, 3);
	}

	@Override
	public int getMaxAge() {
		return 5;
	}

	@Override
	public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
		pBuilder.add(FloralisBlockStateProperties.AGE);
	}

	@Override
	public void entityInside(BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity) {
		super.entityInside(pState,pLevel,pPos, pEntity);
		// Use super method
//		if (pEntity instanceof Ravager && EventHooks.getMobGriefingEvent(pLevel, pEntity)) {
//			pLevel.destroyBlock(pPos, true, pEntity);
//		}

		if (pEntity instanceof Villager) {
			pEntity.setInvulnerable(true);
		}

		if (this.getAge(pState) >= 3) {
			pEntity.hurt(pLevel.damageSources().cactus(), 1.0F);
		}
	}

	@Override
	public BlockPathTypes getBlockPathType(BlockState pState, BlockGetter pLevel, BlockPos pPos, @Nullable Mob pMob) {
		return  this.getAge(pState) >= 3 ? BlockPathTypes.DAMAGE_OTHER : BlockPathTypes.WALKABLE;
	}

	@Override
	public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
		return !pState.canSurvive(pLevel, pCurrentPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
	}

	@Override
	public IntegerProperty getAgeProperty() {
		return FloralisBlockStateProperties.AGE;
	}

	@Override
	public ItemLike getBaseSeedId() {
		return this;
	}

	@Override
	@Nullable
	public PlantType getPlantType(BlockGetter pLevel, BlockPos pPos) {
		return this.mayPlaceOn(pLevel.getBlockState(pPos.below()), pLevel, pPos) ? PlantType.DESERT : null;
	}

	@Override
	public VoxelShape getCollisionShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
		return CactusCropBlock.SHAPES[pState.getValue(this.getAgeProperty())];
	}

	@Override
	public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
		return CactusCropBlock.SHAPES[pState.getValue(this.getAgeProperty())];
	}
}

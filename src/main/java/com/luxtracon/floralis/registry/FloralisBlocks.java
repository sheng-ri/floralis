package com.luxtracon.floralis.registry;

import com.luxtracon.floralis.block.*;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("unused")
@MethodsReturnNonnullByDefault

public class FloralisBlocks {
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(FloralisConstant.ID);

	public static final DeferredBlock<Block> WHITE_DYE_BLOCK = BLOCKS.register("white_dye_block", () -> new PureFallingBlock(FloralisBlocks.propertiesDyeBlock(MapColor.SNOW)));
	public static final DeferredBlock<Block> LIGHT_GRAY_DYE_BLOCK = BLOCKS.register("light_gray_dye_block", () -> new PureFallingBlock(FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_LIGHT_GRAY)));
	public static final DeferredBlock<Block> GRAY_DYE_BLOCK = BLOCKS.register("gray_dye_block", () -> new PureFallingBlock(FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_GRAY)));
	public static final DeferredBlock<Block> BLACK_DYE_BLOCK = BLOCKS.register("black_dye_block", () -> new PureFallingBlock(FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_BLACK)));
	public static final DeferredBlock<Block> BROWN_DYE_BLOCK = BLOCKS.register("brown_dye_block", () -> new PureFallingBlock(FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_BROWN)));
	public static final DeferredBlock<Block> RED_DYE_BLOCK = BLOCKS.register("red_dye_block", () -> new PureFallingBlock(FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_RED)));
	public static final DeferredBlock<Block> ORANGE_DYE_BLOCK = BLOCKS.register("orange_dye_block", () -> new PureFallingBlock(FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_ORANGE)));
	public static final DeferredBlock<Block> YELLOW_DYE_BLOCK = BLOCKS.register("yellow_dye_block", () -> new PureFallingBlock(FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_YELLOW)));
	public static final DeferredBlock<Block> LIME_DYE_BLOCK = BLOCKS.register("lime_dye_block", () -> new PureFallingBlock(FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_LIGHT_GREEN)));
	public static final DeferredBlock<Block> GREEN_DYE_BLOCK = BLOCKS.register("green_dye_block", () -> new PureFallingBlock(FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_GREEN)));
	public static final DeferredBlock<Block> CYAN_DYE_BLOCK = BLOCKS.register("cyan_dye_block", () -> new PureFallingBlock(FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_CYAN)));
	public static final DeferredBlock<Block> LIGHT_BLUE_DYE_BLOCK = BLOCKS.register("light_blue_dye_block", () -> new PureFallingBlock(FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_LIGHT_BLUE)));
	public static final DeferredBlock<Block> BLUE_DYE_BLOCK = BLOCKS.register("blue_dye_block", () -> new PureFallingBlock(FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_BLUE)));
	public static final DeferredBlock<Block> PURPLE_DYE_BLOCK = BLOCKS.register("purple_dye_block", () -> new PureFallingBlock(FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_PURPLE)));
	public static final DeferredBlock<Block> MAGENTA_DYE_BLOCK = BLOCKS.register("magenta_dye_block", () -> new PureFallingBlock(FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_MAGENTA)));
	public static final DeferredBlock<Block> PINK_DYE_BLOCK = BLOCKS.register("pink_dye_block", () -> new PureFallingBlock(FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_PINK)));

	public static final DeferredBlock<Block> PLANT_FIBERS_BLOCK = BLOCKS.register("plant_fibers_block", () -> new PlantFibersBlock(FloralisBlocks.propertiesFibersBlock()));

	public static final DeferredBlock<Block> WHITE_FLOWER = BLOCKS.register("white_flower", () -> new FlowerPlantBlock(FloralisBlocks.propertiesFlower()));
	public static final DeferredBlock<Block> LIGHT_GRAY_FLOWER = BLOCKS.register("light_gray_flower", () -> new FlowerPlantBlock(FloralisBlocks.propertiesFlower()));
	public static final DeferredBlock<Block> GRAY_FLOWER = BLOCKS.register("gray_flower", () -> new FlowerPlantBlock(FloralisBlocks.propertiesFlower()));
	public static final DeferredBlock<Block> BLACK_FLOWER = BLOCKS.register("black_flower", () -> new FlowerPlantBlock(FloralisBlocks.propertiesFlower()));
	public static final DeferredBlock<Block> BROWN_FLOWER = BLOCKS.register("brown_flower", () -> new FlowerPlantBlock(FloralisBlocks.propertiesFlower()));
	public static final DeferredBlock<Block> RED_FLOWER = BLOCKS.register("red_flower", () -> new FlowerPlantBlock(FloralisBlocks.propertiesFlower()));
	public static final DeferredBlock<Block> ORANGE_FLOWER = BLOCKS.register("orange_flower", () -> new FlowerPlantBlock(FloralisBlocks.propertiesFlower()));
	public static final DeferredBlock<Block> YELLOW_FLOWER = BLOCKS.register("yellow_flower", () -> new FlowerPlantBlock(FloralisBlocks.propertiesFlower()));
	public static final DeferredBlock<Block> LIME_FLOWER = BLOCKS.register("lime_flower", () -> new FlowerPlantBlock(FloralisBlocks.propertiesFlower()));
	public static final DeferredBlock<Block> GREEN_FLOWER = BLOCKS.register("green_flower", () -> new FlowerPlantBlock(FloralisBlocks.propertiesFlower()));
	public static final DeferredBlock<Block> CYAN_FLOWER = BLOCKS.register("cyan_flower", () -> new FlowerPlantBlock(FloralisBlocks.propertiesFlower()));
	public static final DeferredBlock<Block> LIGHT_BLUE_FLOWER = BLOCKS.register("light_blue_flower", () -> new FlowerPlantBlock(FloralisBlocks.propertiesFlower()));
	public static final DeferredBlock<Block> BLUE_FLOWER = BLOCKS.register("blue_flower", () -> new FlowerPlantBlock(FloralisBlocks.propertiesFlower()));
	public static final DeferredBlock<Block> PURPLE_FLOWER = BLOCKS.register("purple_flower", () -> new FlowerPlantBlock(FloralisBlocks.propertiesFlower()));
	public static final DeferredBlock<Block> MAGENTA_FLOWER = BLOCKS.register("magenta_flower", () -> new FlowerPlantBlock(FloralisBlocks.propertiesFlower()));
	public static final DeferredBlock<Block> PINK_FLOWER = BLOCKS.register("pink_flower", () -> new FlowerPlantBlock(FloralisBlocks.propertiesFlower()));

	public static final DeferredBlock<Block> WHITE_CACTUS = BLOCKS.register("white_cactus", () -> new CactusPlantBlock(FloralisBlocks.propertiesCactus()));
	public static final DeferredBlock<Block> LIGHT_GRAY_CACTUS = BLOCKS.register("light_gray_cactus", () -> new CactusPlantBlock(FloralisBlocks.propertiesCactus()));
	public static final DeferredBlock<Block> GRAY_CACTUS = BLOCKS.register("gray_cactus", () -> new CactusPlantBlock(FloralisBlocks.propertiesCactus()));
	public static final DeferredBlock<Block> BLACK_CACTUS = BLOCKS.register("black_cactus", () -> new CactusPlantBlock(FloralisBlocks.propertiesCactus()));
	public static final DeferredBlock<Block> BROWN_CACTUS = BLOCKS.register("brown_cactus", () -> new CactusPlantBlock(FloralisBlocks.propertiesCactus()));
	public static final DeferredBlock<Block> RED_CACTUS = BLOCKS.register("red_cactus", () -> new CactusPlantBlock(FloralisBlocks.propertiesCactus()));
	public static final DeferredBlock<Block> ORANGE_CACTUS = BLOCKS.register("orange_cactus", () -> new CactusPlantBlock(FloralisBlocks.propertiesCactus()));
	public static final DeferredBlock<Block> YELLOW_CACTUS = BLOCKS.register("yellow_cactus", () -> new CactusPlantBlock(FloralisBlocks.propertiesCactus()));
	public static final DeferredBlock<Block> LIME_CACTUS = BLOCKS.register("lime_cactus", () -> new CactusPlantBlock(FloralisBlocks.propertiesCactus()));
	public static final DeferredBlock<Block> GREEN_CACTUS = BLOCKS.register("green_cactus", () -> new CactusPlantBlock(FloralisBlocks.propertiesCactus()));
	public static final DeferredBlock<Block> CYAN_CACTUS = BLOCKS.register("cyan_cactus", () -> new CactusPlantBlock(FloralisBlocks.propertiesCactus()));
	public static final DeferredBlock<Block> LIGHT_BLUE_CACTUS = BLOCKS.register("light_blue_cactus", () -> new CactusPlantBlock(FloralisBlocks.propertiesCactus()));
	public static final DeferredBlock<Block> BLUE_CACTUS = BLOCKS.register("blue_cactus", () -> new CactusPlantBlock(FloralisBlocks.propertiesCactus()));
	public static final DeferredBlock<Block> PURPLE_CACTUS = BLOCKS.register("purple_cactus", () -> new CactusPlantBlock(FloralisBlocks.propertiesCactus()));
	public static final DeferredBlock<Block> MAGENTA_CACTUS = BLOCKS.register("magenta_cactus", () -> new CactusPlantBlock(FloralisBlocks.propertiesCactus()));
	public static final DeferredBlock<Block> PINK_CACTUS = BLOCKS.register("pink_cactus", () -> new CactusPlantBlock(FloralisBlocks.propertiesCactus()));

	public static final DeferredBlock<Block> POTTED_WHITE_FLOWER = BLOCKS.register("potted_white_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, WHITE_FLOWER, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_LIGHT_GRAY_FLOWER = BLOCKS.register("potted_light_gray_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, LIGHT_GRAY_FLOWER, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_GRAY_FLOWER = BLOCKS.register("potted_gray_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, GRAY_FLOWER, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_BLACK_FLOWER = BLOCKS.register("potted_black_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BLACK_FLOWER, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_BROWN_FLOWER = BLOCKS.register("potted_brown_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BROWN_FLOWER, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_RED_FLOWER = BLOCKS.register("potted_red_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RED_FLOWER, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_ORANGE_FLOWER = BLOCKS.register("potted_orange_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ORANGE_FLOWER, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_YELLOW_FLOWER = BLOCKS.register("potted_yellow_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, YELLOW_FLOWER, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_LIME_FLOWER = BLOCKS.register("potted_lime_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, LIME_FLOWER, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_GREEN_FLOWER = BLOCKS.register("potted_green_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, GREEN_FLOWER, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_CYAN_FLOWER = BLOCKS.register("potted_cyan_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, CYAN_FLOWER, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_LIGHT_BLUE_FLOWER = BLOCKS.register("potted_light_blue_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, LIGHT_BLUE_FLOWER, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_BLUE_FLOWER = BLOCKS.register("potted_blue_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BLUE_FLOWER, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_PURPLE_FLOWER = BLOCKS.register("potted_purple_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, PURPLE_FLOWER, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_MAGENTA_FLOWER = BLOCKS.register("potted_magenta_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, MAGENTA_FLOWER, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_PINK_FLOWER = BLOCKS.register("potted_pink_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, PINK_FLOWER, FloralisBlocks.propertiesPotted()));

	public static final DeferredBlock<Block> POTTED_WHITE_CACTUS = BLOCKS.register("potted_white_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, WHITE_CACTUS, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_LIGHT_GRAY_CACTUS = BLOCKS.register("potted_light_gray_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, LIGHT_GRAY_CACTUS, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_GRAY_CACTUS = BLOCKS.register("potted_gray_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, GRAY_CACTUS, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_BLACK_CACTUS = BLOCKS.register("potted_black_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BLACK_CACTUS, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_BROWN_CACTUS = BLOCKS.register("potted_brown_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BROWN_CACTUS, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_RED_CACTUS = BLOCKS.register("potted_red_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RED_CACTUS, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_ORANGE_CACTUS = BLOCKS.register("potted_orange_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ORANGE_CACTUS, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_YELLOW_CACTUS = BLOCKS.register("potted_yellow_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, YELLOW_CACTUS, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_LIME_CACTUS = BLOCKS.register("potted_lime_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, LIME_CACTUS, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_GREEN_CACTUS = BLOCKS.register("potted_green_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, GREEN_CACTUS, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_CYAN_CACTUS = BLOCKS.register("potted_cyan_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, CYAN_CACTUS, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_LIGHT_BLUE_CACTUS = BLOCKS.register("potted_light_blue_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, LIGHT_BLUE_CACTUS, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_BLUE_CACTUS = BLOCKS.register("potted_blue_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BLUE_CACTUS, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_PURPLE_CACTUS = BLOCKS.register("potted_purple_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, PURPLE_CACTUS, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_MAGENTA_CACTUS = BLOCKS.register("potted_magenta_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, MAGENTA_CACTUS, FloralisBlocks.propertiesPotted()));
	public static final DeferredBlock<Block> POTTED_PINK_CACTUS = BLOCKS.register("potted_pink_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, PINK_CACTUS, FloralisBlocks.propertiesPotted()));

	public static final List<DeferredBlock<CactusCropBlock>> CROP_BLOCK = new ArrayList<>();
	
	public static final DeferredBlock<Block> WHITE_FLOWER_CROP = BLOCKS.register("white_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> LIGHT_GRAY_FLOWER_CROP = BLOCKS.register("light_gray_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> GRAY_FLOWER_CROP = BLOCKS.register("gray_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> BLACK_FLOWER_CROP = BLOCKS.register("black_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> BROWN_FLOWER_CROP = BLOCKS.register("brown_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> RED_FLOWER_CROP = BLOCKS.register("red_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> ORANGE_FLOWER_CROP = BLOCKS.register("orange_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> YELLOW_FLOWER_CROP = BLOCKS.register("yellow_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> LIME_FLOWER_CROP = BLOCKS.register("lime_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> GREEN_FLOWER_CROP = BLOCKS.register("green_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> CYAN_FLOWER_CROP = BLOCKS.register("cyan_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> LIGHT_BLUE_FLOWER_CROP = BLOCKS.register("light_blue_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> BLUE_FLOWER_CROP = BLOCKS.register("blue_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> PURPLE_FLOWER_CROP = BLOCKS.register("purple_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> MAGENTA_FLOWER_CROP = BLOCKS.register("magenta_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> PINK_FLOWER_CROP = BLOCKS.register("pink_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));

	public static final DeferredBlock<CactusCropBlock> WHITE_CACTUS_CROP = registerCactusCrop("white_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> LIGHT_GRAY_CACTUS_CROP = registerCactusCrop("light_gray_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> GRAY_CACTUS_CROP = registerCactusCrop("gray_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> BLACK_CACTUS_CROP = registerCactusCrop("black_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> BROWN_CACTUS_CROP = registerCactusCrop("brown_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> RED_CACTUS_CROP = registerCactusCrop("red_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> ORANGE_CACTUS_CROP = registerCactusCrop("orange_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> YELLOW_CACTUS_CROP = registerCactusCrop("yellow_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> LIME_CACTUS_CROP = registerCactusCrop("lime_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> GREEN_CACTUS_CROP = registerCactusCrop("green_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> CYAN_CACTUS_CROP = registerCactusCrop("cyan_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> LIGHT_BLUE_CACTUS_CROP = registerCactusCrop("light_blue_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> BLUE_CACTUS_CROP = registerCactusCrop("blue_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> PURPLE_CACTUS_CROP = registerCactusCrop("purple_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> MAGENTA_CACTUS_CROP = registerCactusCrop("magenta_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> PINK_CACTUS_CROP = registerCactusCrop("pink_cactus_crop");

	public static final DeferredBlock<Block> CLOCHED_WHITE_FLOWER_CROP = BLOCKS.register("cloched_white_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> CLOCHED_LIGHT_GRAY_FLOWER_CROP = BLOCKS.register("cloched_light_gray_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> CLOCHED_GRAY_FLOWER_CROP = BLOCKS.register("cloched_gray_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> CLOCHED_BLACK_FLOWER_CROP = BLOCKS.register("cloched_black_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> CLOCHED_BROWN_FLOWER_CROP = BLOCKS.register("cloched_brown_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> CLOCHED_RED_FLOWER_CROP = BLOCKS.register("cloched_red_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> CLOCHED_ORANGE_FLOWER_CROP = BLOCKS.register("cloched_orange_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> CLOCHED_YELLOW_FLOWER_CROP = BLOCKS.register("cloched_yellow_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> CLOCHED_LIME_FLOWER_CROP = BLOCKS.register("cloched_lime_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> CLOCHED_GREEN_FLOWER_CROP = BLOCKS.register("cloched_green_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> CLOCHED_CYAN_FLOWER_CROP = BLOCKS.register("cloched_cyan_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> CLOCHED_LIGHT_BLUE_FLOWER_CROP = BLOCKS.register("cloched_light_blue_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> CLOCHED_BLUE_FLOWER_CROP = BLOCKS.register("cloched_blue_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> CLOCHED_PURPLE_FLOWER_CROP = BLOCKS.register("cloched_purple_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> CLOCHED_MAGENTA_FLOWER_CROP = BLOCKS.register("cloched_magenta_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));
	public static final DeferredBlock<Block> CLOCHED_PINK_FLOWER_CROP = BLOCKS.register("cloched_pink_flower_crop", () -> new FlowerCropBlock(FloralisBlocks.propertiesCrop()));

	public static final DeferredBlock<CactusCropBlock> CLOCHED_WHITE_CACTUS_CROP = registerCactusCrop("cloched_white_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> CLOCHED_LIGHT_GRAY_CACTUS_CROP = registerCactusCrop("cloched_light_gray_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> CLOCHED_GRAY_CACTUS_CROP = registerCactusCrop("cloched_gray_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> CLOCHED_BLACK_CACTUS_CROP = registerCactusCrop("cloched_black_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> CLOCHED_BROWN_CACTUS_CROP = registerCactusCrop("cloched_brown_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> CLOCHED_RED_CACTUS_CROP = registerCactusCrop("cloched_red_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> CLOCHED_ORANGE_CACTUS_CROP = registerCactusCrop("cloched_orange_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> CLOCHED_YELLOW_CACTUS_CROP = registerCactusCrop("cloched_yellow_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> CLOCHED_LIME_CACTUS_CROP = registerCactusCrop("cloched_lime_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> CLOCHED_GREEN_CACTUS_CROP = registerCactusCrop("cloched_green_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> CLOCHED_CYAN_CACTUS_CROP = registerCactusCrop("cloched_cyan_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> CLOCHED_LIGHT_BLUE_CACTUS_CROP = registerCactusCrop("cloched_light_blue_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> CLOCHED_BLUE_CACTUS_CROP = registerCactusCrop("cloched_blue_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> CLOCHED_PURPLE_CACTUS_CROP = registerCactusCrop("cloched_purple_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> CLOCHED_MAGENTA_CACTUS_CROP = registerCactusCrop("cloched_magenta_cactus_crop");
	public static final DeferredBlock<CactusCropBlock> CLOCHED_PINK_CACTUS_CROP = registerCactusCrop("cloched_pink_cactus_crop");

	public static DeferredBlock<CactusCropBlock> registerCactusCrop(String name) {
		final var holder = BLOCKS.register(name, () -> new CactusCropBlock(FloralisBlocks.propertiesCactus()));
		CROP_BLOCK.add(holder);
		return holder;
	}
	
	public static BlockBehaviour.Properties propertiesDyeBlock(MapColor pColor) {
		return BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.SNARE).mapColor(pColor).sound(SoundType.SAND).explosionResistance(0.5F).strength(0.5F);
	}

	public static BlockBehaviour.Properties propertiesFibersBlock() {
		return BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BANJO).mapColor(MapColor.COLOR_GREEN).sound(SoundType.GRASS).explosionResistance(0.5F).strength(0.5F);
	}

	public static BlockBehaviour.Properties propertiesFlower() {
		return BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).pushReaction(PushReaction.DESTROY).sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).instabreak().noCollission();
	}

	public static BlockBehaviour.Properties propertiesCactus() {
		return BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).pushReaction(PushReaction.DESTROY).sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).dynamicShape().instabreak().noCollission();
	}

	public static BlockBehaviour.Properties propertiesPotted() {
		return BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).instabreak().noOcclusion();
	}

	public static BlockBehaviour.Properties propertiesCrop() {
		return BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).pushReaction(PushReaction.DESTROY).sound(SoundType.CROP).instabreak().noCollission().randomTicks();
	}
}

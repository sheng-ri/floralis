package com.luxtracon.floralis.registry;

import com.luxtracon.floralis.item.PlantFibersItem;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;

import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;

public class FloralisItems {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FloralisConstant.ID);

	public static final List<DeferredItem<BlockItem>> DYE_BLOCKS = new ArrayList<>();
	public static final DeferredItem<BlockItem> WHITE_DYE_BLOCK = registerDyeBlock("white_dye_block",FloralisBlocks.WHITE_DYE_BLOCK);
	public static final DeferredItem<BlockItem> LIGHT_GRAY_DYE_BLOCK = registerDyeBlock("light_gray_dye_block", FloralisBlocks.LIGHT_GRAY_DYE_BLOCK);
	public static final DeferredItem<BlockItem> GRAY_DYE_BLOCK = registerDyeBlock("gray_dye_block", FloralisBlocks.GRAY_DYE_BLOCK);
	public static final DeferredItem<BlockItem> BLACK_DYE_BLOCK = registerDyeBlock("black_dye_block", FloralisBlocks.BLACK_DYE_BLOCK);
	public static final DeferredItem<BlockItem> BROWN_DYE_BLOCK = registerDyeBlock("brown_dye_block", FloralisBlocks.BROWN_DYE_BLOCK);
	public static final DeferredItem<BlockItem> RED_DYE_BLOCK = registerDyeBlock("red_dye_block", FloralisBlocks.RED_DYE_BLOCK);
	public static final DeferredItem<BlockItem> ORANGE_DYE_BLOCK = registerDyeBlock("orange_dye_block", FloralisBlocks.ORANGE_DYE_BLOCK);
	public static final DeferredItem<BlockItem> YELLOW_DYE_BLOCK = registerDyeBlock("yellow_dye_block", FloralisBlocks.YELLOW_DYE_BLOCK);
	public static final DeferredItem<BlockItem> LIME_DYE_BLOCK = registerDyeBlock("lime_dye_block", FloralisBlocks.LIME_DYE_BLOCK);
	public static final DeferredItem<BlockItem> GREEN_DYE_BLOCK = registerDyeBlock("green_dye_block", FloralisBlocks.GREEN_DYE_BLOCK);
	public static final DeferredItem<BlockItem> CYAN_DYE_BLOCK = registerDyeBlock("cyan_dye_block", FloralisBlocks.CYAN_DYE_BLOCK);
	public static final DeferredItem<BlockItem> LIGHT_BLUE_DYE_BLOCK = registerDyeBlock("light_blue_dye_block", FloralisBlocks.LIGHT_BLUE_DYE_BLOCK);
	public static final DeferredItem<BlockItem> BLUE_DYE_BLOCK = registerDyeBlock("blue_dye_block", FloralisBlocks.BLUE_DYE_BLOCK);
	public static final DeferredItem<BlockItem> PURPLE_DYE_BLOCK = registerDyeBlock("purple_dye_block", FloralisBlocks.PURPLE_DYE_BLOCK);
	public static final DeferredItem<BlockItem> MAGENTA_DYE_BLOCK = registerDyeBlock("magenta_dye_block", FloralisBlocks.MAGENTA_DYE_BLOCK);
	public static final DeferredItem<BlockItem> PINK_DYE_BLOCK = registerDyeBlock("pink_dye_block", FloralisBlocks.PINK_DYE_BLOCK);

	public static DeferredItem<BlockItem> registerDyeBlock(String name, DeferredBlock<Block> deferredBlock) {
		final var holder = ITEMS.registerSimpleBlockItem(name, deferredBlock);
		DYE_BLOCKS.add(holder);
		return holder;
	}
	
	public static final DeferredItem<BlockItem> PLANT_FIBERS_BLOCK = ITEMS.register("plant_fibers_block", () -> new BlockItem(FloralisBlocks.PLANT_FIBERS_BLOCK.get(), new Item.Properties()));

	// Seems this don't need a list for plant.
//	public static final List<DeferredItem<BlockItem>> PLANT_ITEMS = new ArrayList<>();
	
	public static final DeferredItem<BlockItem> WHITE_FLOWER = registerPlant("white_flower", FloralisBlocks.WHITE_FLOWER);
	public static final DeferredItem<BlockItem> LIGHT_GRAY_FLOWER = registerPlant("light_gray_flower", FloralisBlocks.LIGHT_GRAY_FLOWER);
	public static final DeferredItem<BlockItem> GRAY_FLOWER = registerPlant("gray_flower", FloralisBlocks.GRAY_FLOWER);
	public static final DeferredItem<BlockItem> BLACK_FLOWER = registerPlant("black_flower", FloralisBlocks.BLACK_FLOWER);
	public static final DeferredItem<BlockItem> BROWN_FLOWER = registerPlant("brown_flower", FloralisBlocks.BROWN_FLOWER);
	public static final DeferredItem<BlockItem> RED_FLOWER = registerPlant("red_flower", FloralisBlocks.RED_FLOWER);
	public static final DeferredItem<BlockItem> ORANGE_FLOWER = registerPlant("orange_flower", FloralisBlocks.ORANGE_FLOWER);
	public static final DeferredItem<BlockItem> YELLOW_FLOWER = registerPlant("yellow_flower", FloralisBlocks.YELLOW_FLOWER);
	public static final DeferredItem<BlockItem> LIME_FLOWER = registerPlant("lime_flower", FloralisBlocks.LIME_FLOWER);
	public static final DeferredItem<BlockItem> GREEN_FLOWER = registerPlant("green_flower", FloralisBlocks.GREEN_FLOWER);
	public static final DeferredItem<BlockItem> CYAN_FLOWER = registerPlant("cyan_flower", FloralisBlocks.CYAN_FLOWER);
	public static final DeferredItem<BlockItem> LIGHT_BLUE_FLOWER = registerPlant("light_blue_flower", FloralisBlocks.LIGHT_BLUE_FLOWER);
	public static final DeferredItem<BlockItem> BLUE_FLOWER = registerPlant("blue_flower", FloralisBlocks.BLUE_FLOWER);
	public static final DeferredItem<BlockItem> PURPLE_FLOWER = registerPlant("purple_flower", FloralisBlocks.PURPLE_FLOWER);
	public static final DeferredItem<BlockItem> MAGENTA_FLOWER = registerPlant("magenta_flower", FloralisBlocks.MAGENTA_FLOWER);
	public static final DeferredItem<BlockItem> PINK_FLOWER = registerPlant("pink_flower", FloralisBlocks.PINK_FLOWER);

	public static final DeferredItem<BlockItem> WHITE_CACTUS = registerPlant("white_cactus", FloralisBlocks.WHITE_CACTUS);
	public static final DeferredItem<BlockItem> LIGHT_GRAY_CACTUS = registerPlant("light_gray_cactus", FloralisBlocks.LIGHT_GRAY_CACTUS);
	public static final DeferredItem<BlockItem> GRAY_CACTUS = registerPlant("gray_cactus", FloralisBlocks.GRAY_CACTUS);
	public static final DeferredItem<BlockItem> BLACK_CACTUS = registerPlant("black_cactus", FloralisBlocks.BLACK_CACTUS);
	public static final DeferredItem<BlockItem> BROWN_CACTUS = registerPlant("brown_cactus", FloralisBlocks.BROWN_CACTUS);
	public static final DeferredItem<BlockItem> RED_CACTUS = registerPlant("red_cactus", FloralisBlocks.RED_CACTUS);
	public static final DeferredItem<BlockItem> ORANGE_CACTUS = registerPlant("orange_cactus", FloralisBlocks.ORANGE_CACTUS);
	public static final DeferredItem<BlockItem> YELLOW_CACTUS = registerPlant("yellow_cactus", FloralisBlocks.YELLOW_CACTUS);
	public static final DeferredItem<BlockItem> LIME_CACTUS = registerPlant("lime_cactus", FloralisBlocks.LIME_CACTUS);
	public static final DeferredItem<BlockItem> GREEN_CACTUS = registerPlant("green_cactus", FloralisBlocks.GREEN_CACTUS);
	public static final DeferredItem<BlockItem> CYAN_CACTUS = registerPlant("cyan_cactus", FloralisBlocks.CYAN_CACTUS);
	public static final DeferredItem<BlockItem> LIGHT_BLUE_CACTUS = registerPlant("light_blue_cactus", FloralisBlocks.LIGHT_BLUE_CACTUS);
	public static final DeferredItem<BlockItem> BLUE_CACTUS = registerPlant("blue_cactus", FloralisBlocks.BLUE_CACTUS);
	public static final DeferredItem<BlockItem> PURPLE_CACTUS = registerPlant("purple_cactus", FloralisBlocks.PURPLE_CACTUS);
	public static final DeferredItem<BlockItem> MAGENTA_CACTUS = registerPlant("magenta_cactus", FloralisBlocks.MAGENTA_CACTUS);
	public static final DeferredItem<BlockItem> PINK_CACTUS = registerPlant("pink_cactus", FloralisBlocks.PINK_CACTUS);

	public static DeferredItem<BlockItem> registerPlant(String name,DeferredBlock<Block> deferredBlock) {
		final var holder = ITEMS.registerSimpleBlockItem(name, deferredBlock);
//		PLANT_ITEMS.add(holder);
		return holder;
	}
	
	public static final DeferredItem<BlockItem> WHITE_FLOWER_SEEDS = ITEMS.register("white_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.WHITE_FLOWER_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> LIGHT_GRAY_FLOWER_SEEDS = ITEMS.register("light_gray_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.LIGHT_GRAY_FLOWER_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> GRAY_FLOWER_SEEDS = ITEMS.register("gray_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.GRAY_FLOWER_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> BLACK_FLOWER_SEEDS = ITEMS.register("black_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.BLACK_FLOWER_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> BROWN_FLOWER_SEEDS = ITEMS.register("brown_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.BROWN_FLOWER_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> RED_FLOWER_SEEDS = ITEMS.register("red_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.RED_FLOWER_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> ORANGE_FLOWER_SEEDS = ITEMS.register("orange_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.ORANGE_FLOWER_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> YELLOW_FLOWER_SEEDS = ITEMS.register("yellow_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.YELLOW_FLOWER_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> LIME_FLOWER_SEEDS = ITEMS.register("lime_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.LIME_FLOWER_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> GREEN_FLOWER_SEEDS = ITEMS.register("green_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.GREEN_FLOWER_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> CYAN_FLOWER_SEEDS = ITEMS.register("cyan_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.CYAN_FLOWER_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> LIGHT_BLUE_FLOWER_SEEDS = ITEMS.register("light_blue_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.LIGHT_BLUE_FLOWER_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> BLUE_FLOWER_SEEDS = ITEMS.register("blue_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.BLUE_FLOWER_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> PURPLE_FLOWER_SEEDS = ITEMS.register("purple_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.PURPLE_FLOWER_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> MAGENTA_FLOWER_SEEDS = ITEMS.register("magenta_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.MAGENTA_FLOWER_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> PINK_FLOWER_SEEDS = ITEMS.register("pink_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.PINK_FLOWER_CROP.get(), new Item.Properties()));

	public static final DeferredItem<BlockItem> WHITE_CACTUS_SEEDS = ITEMS.register("white_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.WHITE_CACTUS_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> LIGHT_GRAY_CACTUS_SEEDS = ITEMS.register("light_gray_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.LIGHT_GRAY_CACTUS_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> GRAY_CACTUS_SEEDS = ITEMS.register("gray_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.GRAY_CACTUS_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> BLACK_CACTUS_SEEDS = ITEMS.register("black_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.BLACK_CACTUS_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> BROWN_CACTUS_SEEDS = ITEMS.register("brown_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.BROWN_CACTUS_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> RED_CACTUS_SEEDS = ITEMS.register("red_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.RED_CACTUS_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> ORANGE_CACTUS_SEEDS = ITEMS.register("orange_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.ORANGE_CACTUS_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> YELLOW_CACTUS_SEEDS = ITEMS.register("yellow_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.YELLOW_CACTUS_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> LIME_CACTUS_SEEDS = ITEMS.register("lime_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.LIME_CACTUS_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> GREEN_CACTUS_SEEDS = ITEMS.register("green_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.GREEN_CACTUS_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> CYAN_CACTUS_SEEDS = ITEMS.register("cyan_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.CYAN_CACTUS_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> LIGHT_BLUE_CACTUS_SEEDS = ITEMS.register("light_blue_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.LIGHT_BLUE_CACTUS_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> BLUE_CACTUS_SEEDS = ITEMS.register("blue_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.BLUE_CACTUS_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> PURPLE_CACTUS_SEEDS = ITEMS.register("purple_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.PURPLE_CACTUS_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> MAGENTA_CACTUS_SEEDS = ITEMS.register("magenta_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.MAGENTA_CACTUS_CROP.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> PINK_CACTUS_SEEDS = ITEMS.register("pink_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.PINK_CACTUS_CROP.get(), new Item.Properties()));

	public static List<DeferredItem<Item>> PETAL_ITEMS = new ArrayList<>();
	
	public static final DeferredItem<Item> WHITE_PETALS = registerPetal("white_petals");
	public static final DeferredItem<Item> LIGHT_GRAY_PETALS = registerPetal("light_gray_petals");
	public static final DeferredItem<Item> GRAY_PETALS = registerPetal("gray_petals");
	public static final DeferredItem<Item> BLACK_PETALS = registerPetal("black_petals");
	public static final DeferredItem<Item> BROWN_PETALS = registerPetal("brown_petals");
	public static final DeferredItem<Item> RED_PETALS = registerPetal("red_petals");
	public static final DeferredItem<Item> ORANGE_PETALS = registerPetal("orange_petals");
	public static final DeferredItem<Item> YELLOW_PETALS = registerPetal("yellow_petals");
	public static final DeferredItem<Item> LIME_PETALS = registerPetal("lime_petals");
	public static final DeferredItem<Item> GREEN_PETALS = registerPetal("green_petals");
	public static final DeferredItem<Item> CYAN_PETALS = registerPetal("cyan_petals");
	public static final DeferredItem<Item> LIGHT_BLUE_PETALS = registerPetal("light_blue_petals");
	public static final DeferredItem<Item> BLUE_PETALS = registerPetal("blue_petals");
	public static final DeferredItem<Item> PURPLE_PETALS = registerPetal("purple_petals");
	public static final DeferredItem<Item> MAGENTA_PETALS = registerPetal("magenta_petals");
	public static final DeferredItem<Item> PINK_PETALS = registerPetal("pink_petals");

	public static DeferredItem<Item> registerPetal(String name) {
		final var holder = ITEMS.registerSimpleItem(name);
		PETAL_ITEMS.add(holder);
		return holder;
	}
	
	public static final DeferredItem<PlantFibersItem> PLANT_FIBERS = ITEMS.register("plant_fibers", () -> new PlantFibersItem(new Item.Properties()));
}

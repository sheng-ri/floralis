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

	public static final DeferredItem<BlockItem> WHITE_FLOWER = ITEMS.register("white_flower", () -> new BlockItem(FloralisBlocks.WHITE_FLOWER.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> LIGHT_GRAY_FLOWER = ITEMS.register("light_gray_flower", () -> new BlockItem(FloralisBlocks.LIGHT_GRAY_FLOWER.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> GRAY_FLOWER = ITEMS.register("gray_flower", () -> new BlockItem(FloralisBlocks.GRAY_FLOWER.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> BLACK_FLOWER = ITEMS.register("black_flower", () -> new BlockItem(FloralisBlocks.BLACK_FLOWER.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> BROWN_FLOWER = ITEMS.register("brown_flower", () -> new BlockItem(FloralisBlocks.BROWN_FLOWER.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> RED_FLOWER = ITEMS.register("red_flower", () -> new BlockItem(FloralisBlocks.RED_FLOWER.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> ORANGE_FLOWER = ITEMS.register("orange_flower", () -> new BlockItem(FloralisBlocks.ORANGE_FLOWER.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> YELLOW_FLOWER = ITEMS.register("yellow_flower", () -> new BlockItem(FloralisBlocks.YELLOW_FLOWER.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> LIME_FLOWER = ITEMS.register("lime_flower", () -> new BlockItem(FloralisBlocks.LIME_FLOWER.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> GREEN_FLOWER = ITEMS.register("green_flower", () -> new BlockItem(FloralisBlocks.GREEN_FLOWER.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> CYAN_FLOWER = ITEMS.register("cyan_flower", () -> new BlockItem(FloralisBlocks.CYAN_FLOWER.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> LIGHT_BLUE_FLOWER = ITEMS.register("light_blue_flower", () -> new BlockItem(FloralisBlocks.LIGHT_BLUE_FLOWER.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> BLUE_FLOWER = ITEMS.register("blue_flower", () -> new BlockItem(FloralisBlocks.BLUE_FLOWER.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> PURPLE_FLOWER = ITEMS.register("purple_flower", () -> new BlockItem(FloralisBlocks.PURPLE_FLOWER.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> MAGENTA_FLOWER = ITEMS.register("magenta_flower", () -> new BlockItem(FloralisBlocks.MAGENTA_FLOWER.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> PINK_FLOWER = ITEMS.register("pink_flower", () -> new BlockItem(FloralisBlocks.PINK_FLOWER.get(), new Item.Properties()));

	public static final DeferredItem<BlockItem> WHITE_CACTUS = ITEMS.register("white_cactus", () -> new BlockItem(FloralisBlocks.WHITE_CACTUS.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> LIGHT_GRAY_CACTUS = ITEMS.register("light_gray_cactus", () -> new BlockItem(FloralisBlocks.LIGHT_GRAY_CACTUS.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> GRAY_CACTUS = ITEMS.register("gray_cactus", () -> new BlockItem(FloralisBlocks.GRAY_CACTUS.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> BLACK_CACTUS = ITEMS.register("black_cactus", () -> new BlockItem(FloralisBlocks.BLACK_CACTUS.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> BROWN_CACTUS = ITEMS.register("brown_cactus", () -> new BlockItem(FloralisBlocks.BROWN_CACTUS.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> RED_CACTUS = ITEMS.register("red_cactus", () -> new BlockItem(FloralisBlocks.RED_CACTUS.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> ORANGE_CACTUS = ITEMS.register("orange_cactus", () -> new BlockItem(FloralisBlocks.ORANGE_CACTUS.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> YELLOW_CACTUS = ITEMS.register("yellow_cactus", () -> new BlockItem(FloralisBlocks.YELLOW_CACTUS.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> LIME_CACTUS = ITEMS.register("lime_cactus", () -> new BlockItem(FloralisBlocks.LIME_CACTUS.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> GREEN_CACTUS = ITEMS.register("green_cactus", () -> new BlockItem(FloralisBlocks.GREEN_CACTUS.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> CYAN_CACTUS = ITEMS.register("cyan_cactus", () -> new BlockItem(FloralisBlocks.CYAN_CACTUS.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> LIGHT_BLUE_CACTUS = ITEMS.register("light_blue_cactus", () -> new BlockItem(FloralisBlocks.LIGHT_BLUE_CACTUS.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> BLUE_CACTUS = ITEMS.register("blue_cactus", () -> new BlockItem(FloralisBlocks.BLUE_CACTUS.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> PURPLE_CACTUS = ITEMS.register("purple_cactus", () -> new BlockItem(FloralisBlocks.PURPLE_CACTUS.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> MAGENTA_CACTUS = ITEMS.register("magenta_cactus", () -> new BlockItem(FloralisBlocks.MAGENTA_CACTUS.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> PINK_CACTUS = ITEMS.register("pink_cactus", () -> new BlockItem(FloralisBlocks.PINK_CACTUS.get(), new Item.Properties()));

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

	public static final DeferredItem<Item> WHITE_PETALS = ITEMS.register("white_petals", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> LIGHT_GRAY_PETALS = ITEMS.register("light_gray_petals", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GRAY_PETALS = ITEMS.register("gray_petals", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> BLACK_PETALS = ITEMS.register("black_petals", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> BROWN_PETALS = ITEMS.register("brown_petals", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> RED_PETALS = ITEMS.register("red_petals", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> ORANGE_PETALS = ITEMS.register("orange_petals", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> YELLOW_PETALS = ITEMS.register("yellow_petals", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> LIME_PETALS = ITEMS.register("lime_petals", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GREEN_PETALS = ITEMS.register("green_petals", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> CYAN_PETALS = ITEMS.register("cyan_petals", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> LIGHT_BLUE_PETALS = ITEMS.register("light_blue_petals", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> BLUE_PETALS = ITEMS.register("blue_petals", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> PURPLE_PETALS = ITEMS.register("purple_petals", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> MAGENTA_PETALS = ITEMS.register("magenta_petals", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> PINK_PETALS = ITEMS.register("pink_petals", () -> new Item(new Item.Properties()));

	public static final DeferredItem<PlantFibersItem> PLANT_FIBERS = ITEMS.register("plant_fibers", () -> new PlantFibersItem(new Item.Properties()));
}

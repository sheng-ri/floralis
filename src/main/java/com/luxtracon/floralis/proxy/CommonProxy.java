package com.luxtracon.floralis.proxy;

import com.google.common.collect.ImmutableMap;
import com.luxtracon.floralis.registry.FloralisCompostables;
import com.luxtracon.floralis.registry.FloralisFlammables;
import com.luxtracon.floralis.registry.FloralisItems;
import com.luxtracon.floralis.registry.FloralisPottables;
import com.luxtracon.floralis.trade.EmeraldsForItemsTrade;
import com.luxtracon.floralis.trade.ItemsForEmeraldsTrade;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerAboutToStartEvent;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault

public class CommonProxy {
	public CommonProxy() {

	}

	public void onCreativeModeTabRegister(BuildCreativeModeTabContentsEvent pEvent) {

	}

	public void onFMLCommonSetup(FMLCommonSetupEvent pEvent) {
		pEvent.enqueueWork(FloralisCompostables::setup);
		pEvent.enqueueWork(FloralisFlammables::setup);
		pEvent.enqueueWork(FloralisPottables::setup);
	}

	public void onFMLLoadComplete(FMLLoadCompleteEvent pEvent) {

	}

	public void onServerAboutToStart(ServerAboutToStartEvent pEvent) {
	}

	public void onVillagerTrades(VillagerTradesEvent pEvent) {
		if (pEvent.getType().equals(VillagerProfession.FARMER)) {
			final var level1Trade = pEvent.getTrades().get(1);
			level1Trade.add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.WHITE_PETALS.get())));
			level1Trade.add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.LIGHT_GRAY_PETALS.get())));
			level1Trade.add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.GRAY_PETALS.get())));
			level1Trade.add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.BLACK_PETALS.get())));
			level1Trade.add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.BROWN_PETALS.get())));
			level1Trade.add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.RED_PETALS.get())));
			level1Trade.add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.ORANGE_PETALS.get())));
			level1Trade.add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.YELLOW_PETALS.get())));
			level1Trade.add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.LIME_PETALS.get())));
			level1Trade.add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.GREEN_PETALS.get())));
			level1Trade.add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.CYAN_PETALS.get())));
			level1Trade.add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.LIGHT_BLUE_PETALS.get())));
			level1Trade.add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.BLUE_PETALS.get())));
			level1Trade.add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.PURPLE_PETALS.get())));
			level1Trade.add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.MAGENTA_PETALS.get())));
			level1Trade.add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.PINK_PETALS.get())));

			level1Trade.add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.WHITE_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.WHITE_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.WHITE_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.WHITE_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.WHITE_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.WHITE_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.WHITE_FLOWER_SEEDS.get()).build()));
			level1Trade.add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.LIGHT_GRAY_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get()).build()));
			level1Trade.add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.GRAY_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.GRAY_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.GRAY_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.GRAY_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.GRAY_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.GRAY_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.GRAY_FLOWER_SEEDS.get()).build()));
			level1Trade.add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.BLACK_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.BLACK_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.BLACK_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.BLACK_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.BLACK_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.BLACK_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.BLACK_FLOWER_SEEDS.get()).build()));
			level1Trade.add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.BROWN_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.BROWN_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.BROWN_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.BROWN_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.BROWN_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.BROWN_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.BROWN_FLOWER_SEEDS.get()).build()));
			level1Trade.add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.RED_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.RED_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.RED_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.RED_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.RED_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.RED_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.RED_FLOWER_SEEDS.get()).build()));
			level1Trade.add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.ORANGE_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.ORANGE_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.ORANGE_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.ORANGE_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.ORANGE_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.ORANGE_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.ORANGE_FLOWER_SEEDS.get()).build()));
			level1Trade.add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.YELLOW_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.YELLOW_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.YELLOW_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.YELLOW_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.YELLOW_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.YELLOW_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.YELLOW_FLOWER_SEEDS.get()).build()));
			level1Trade.add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.LIME_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.LIME_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.LIME_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.LIME_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.LIME_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.LIME_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.LIME_FLOWER_SEEDS.get()).build()));
			level1Trade.add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.GREEN_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.GREEN_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.GREEN_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.GREEN_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.GREEN_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.GREEN_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.GREEN_FLOWER_SEEDS.get()).build()));
			level1Trade.add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.CYAN_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.CYAN_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.CYAN_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.CYAN_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.CYAN_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.CYAN_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.CYAN_FLOWER_SEEDS.get()).build()));
			level1Trade.add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.LIGHT_BLUE_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get()).build()));
			level1Trade.add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.BLUE_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.BLUE_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.BLUE_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.BLUE_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.BLUE_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.BLUE_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.BLUE_FLOWER_SEEDS.get()).build()));
			level1Trade.add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.PURPLE_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.PURPLE_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.PURPLE_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.PURPLE_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.PURPLE_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.PURPLE_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.PURPLE_FLOWER_SEEDS.get()).build()));
			level1Trade.add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.MAGENTA_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.MAGENTA_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.MAGENTA_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.MAGENTA_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.MAGENTA_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.MAGENTA_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.MAGENTA_FLOWER_SEEDS.get()).build()));
			level1Trade.add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.PINK_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.PINK_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.PINK_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.PINK_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.PINK_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.PINK_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.PINK_FLOWER_SEEDS.get()).build()));
		}

	}
}

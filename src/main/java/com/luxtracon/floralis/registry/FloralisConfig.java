package com.luxtracon.floralis.registry;

import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.ModConfigSpec;

public class FloralisConfig {
	public static ModConfigSpec.IntValue DESERT_FARM;
	public static ModConfigSpec.IntValue PLAINS_FARM;
	public static ModConfigSpec.IntValue SAVANNA_FARM;
	public static ModConfigSpec.IntValue SNOWY_FARM;
	public static ModConfigSpec.IntValue TAIGA_FARM;
	public static ModConfigSpec.BooleanValue ENABLE_TRADE;

	public static void registerClientConfig() {
		var builder = new ModConfigSpec.Builder();

		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, builder.build());
	}

	public static void registerCommonConfig() {
		var builder = new ModConfigSpec.Builder();

		builder.comment("Structure settings").push("structureSettings");

		DESERT_FARM = builder.comment("Default: 4. Spawn rate for cactus farms in desert villages. 0 disables spawning cactus farms in desert villages.").defineInRange("desertFarms", 4, 0, 256);
		PLAINS_FARM = builder.comment("Default: 4. Spawn rate for flower farms in plains villages. 0 disables spawning flower farms in plains villages.").defineInRange("plainsFarms", 4, 0, 256);
		SAVANNA_FARM = builder.comment("Default: 4. Spawn rate for flower farms in savanna villages. 0 disables spawning flower farms in savanna villages.").defineInRange("savannaFarms", 4, 0, 256);
		SNOWY_FARM = builder.comment("Default: 4. Spawn rate for flower farms in snowy villages. 0 disables spawning flower farms in snowy villages.").defineInRange("snowyFarms", 4, 0, 256);
		TAIGA_FARM = builder.comment("Default: 4. Spawn rate for flower farms in taiga villages. 0 disables spawning flower farms in taiga villages.").defineInRange("taigaFarms", 4, 0, 256);
		ENABLE_TRADE = builder.comment("Default: false. Enable trade flower and cactus with village.").define("enableTrade",false);
		builder.pop();

		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, builder.build());
	}

	public static void registerServerConfig() {
		var builder = new ModConfigSpec.Builder();

		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, builder.build());
	}
}

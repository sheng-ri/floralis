package com.luxtracon.floralis.datagen;

import com.luxtracon.floralis.registry.FloralisBlocks;
import com.luxtracon.floralis.registry.FloralisConstant;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.BlockPredicateFilter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class WorldGEn extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = (new RegistrySetBuilder())
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, WorldGEn::bootstrap)
            .add(Registries.CONFIGURED_FEATURE, WorldGEn::boostrapConfigure)
            .add(Registries.PLACED_FEATURE, WorldGEn::boostrapFeature);

    public static final List<ResourceKey<PlacedFeature>> plantPlaceKeys = new ArrayList<>();

    public static void boostrapFeature(BootstapContext<PlacedFeature> context) {
        final var configureRegistry = context.lookup(Registries.CONFIGURED_FEATURE);

        final var cactusId = new ResourceLocation("floralis", "black_cactus");
        final var configureCactusKey = ResourceKey.create(Registries.CONFIGURED_FEATURE, cactusId);

//        context.register(configureCactusKey, new PlacedFeature(
//                configureCactusKey.
//        ));
    }

    public static void boostrapConfigure(BootstapContext<ConfiguredFeature<?, ?>> context) {

        final var cactusId = new ResourceLocation("floralis", "black_cactus");
        final var configureCactusKey = ResourceKey.create(Registries.CONFIGURED_FEATURE, cactusId);

        context.register(configureCactusKey, new ConfiguredFeature<>(
                Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(
                        64, 4, 4,
                        PlacementUtils.inlinePlaced(
                                Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.BLACK_CACTUS.get())),
                                BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE)
                        )
                ))
        );

    }

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        final var addFeature = context.lookup(Registries.PLACED_FEATURE);
//        final var biomes = context.lookup(Registries.BIOME);
//        var SOME_FEATURE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstant.ID, "black_cactus"));
//        final var key = ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(FloralisConstant.ID, "black_cactus"));
//
//        final var cactisFeature = new ResourceLocation("floralis", "black_cactus");
//        context.register(SOME_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
//                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
//                HolderSet.direct(addFeature.getOrThrow(key)),
//                GenerationStep.Decoration.VEGETAL_DECORATION));

//        context.register()

    }

    public WorldGEn(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(FloralisConstant.ID));
    }
}

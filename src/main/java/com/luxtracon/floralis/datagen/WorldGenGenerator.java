package com.luxtracon.floralis.datagen;

import com.google.common.collect.ImmutableList;
import com.luxtracon.floralis.registry.FloralisBlocks;
import com.luxtracon.floralis.registry.FloralisConstant;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.Pools;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.structure.pools.SinglePoolElement;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class WorldGenGenerator extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = (new RegistrySetBuilder())
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, WorldGenGenerator::bootstrap)
            .add(Registries.CONFIGURED_FEATURE, WorldGenGenerator::boostrapConfigure)
            .add(Registries.PLACED_FEATURE, WorldGenGenerator::boostrapFeature);
//            .add(Registries.TEMPLATE_POOL,WorldGenGenerator::boostrapProcessor);

    // Doesn't work.
    private static void boostrapProcessor(BootstapContext<StructureTemplatePool> context) {
        var poolGetter = context.lookup(Registries.TEMPLATE_POOL);
        final var terminators = Pools.createKey("village/plains/terminators");

        Pools.register(
                context,
                "village/plains/florails",
                new StructureTemplatePool(
                        poolGetter.getOrThrow(Pools.EMPTY),
                        ImmutableList.of(
                                Pair.of(SinglePoolElement.single("village/plains/florails/flower"), 1)
                        ),
                        StructureTemplatePool.Projection.TERRAIN_MATCHING
                )
        );
    }


    public static void boostrapFeature(BootstapContext<PlacedFeature> context) {
        final var configureRegistry = context.lookup(Registries.CONFIGURED_FEATURE);


        for (var holder : FloralisBlocks.PLANT_BLOCK) {

            final var configureFeatureId = new ResourceLocation(FloralisConstant.ID, holder.getId().getPath());
            final var configureKey = ResourceKey.create(Registries.CONFIGURED_FEATURE, configureFeatureId);
            final var placeKey = ResourceKey.create(Registries.PLACED_FEATURE, configureFeatureId);

            context.register(placeKey, new PlacedFeature(
                    configureRegistry.getOrThrow(configureKey),
                    List.of(
                            RarityFilter.onAverageOnceEvery(256),
                            HeightmapPlacement.onHeightmap(Heightmap.Types.MOTION_BLOCKING),
                            InSquarePlacement.spread()
                    )
            ));

        }

    }

    public static void boostrapConfigure(BootstapContext<ConfiguredFeature<?, ?>> context) {

        for (var holder : FloralisBlocks.PLANT_BLOCK) {
            final var configureFeatureId = new ResourceLocation(FloralisConstant.ID, holder.getId().getPath());
            final var configureKey = ResourceKey.create(Registries.CONFIGURED_FEATURE, configureFeatureId);
            context.register(configureKey, new ConfiguredFeature<>(
                    Feature.RANDOM_PATCH,
                    new RandomPatchConfiguration(
                            64, 4, 4,
                            PlacementUtils.inlinePlaced(
                                    Feature.SIMPLE_BLOCK,
                                    new SimpleBlockConfiguration(BlockStateProvider.simple(holder.get())),
                                    BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE)
                            )
                    ))
            );
        }

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

//    public static void bootstrap(BootstapContext<StructureSet> context) {
//        final var addFeature = context.lookup(Registries.PLACED_FEATURE);

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
//    }

    public WorldGenGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(FloralisConstant.ID));
    }
}

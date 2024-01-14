package com.luxtracon.floralis.datagen;

import com.luxtracon.floralis.registry.FloralisBlocks;
import com.luxtracon.floralis.registry.FloralisConstant;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderSet;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.*;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class WorldGenGenerator extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, WorldGenGenerator::bootstrapBiomeModifier)
            .add(Registries.CONFIGURED_FEATURE, WorldGenGenerator::boostrapConfigure)
            .add(Registries.PLACED_FEATURE, WorldGenGenerator::boostrapFeature);

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

    public static void bootstrapBiomeModifier(BootstapContext<BiomeModifier> context) {
        final var addFeature = context.lookup(Registries.PLACED_FEATURE);
        final var biomeGetter = context.lookup(Registries.BIOME);
        for (DeferredBlock<? extends BushBlock> holder : FloralisBlocks.PLANT_BLOCK) {
            if (holder.getId().getPath().contains("flower")) {
                final var biomeKey = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, holder.getId());
                final var featureKey = ResourceKey.create(Registries.PLACED_FEATURE, holder.getId());
                context.register(biomeKey, new BiomeModifiers.AddFeaturesBiomeModifier(
                        biomeGetter.getOrThrow(BiomeTags.IS_OVERWORLD),
                        HolderSet.direct(addFeature.getOrThrow(featureKey)),
                        GenerationStep.Decoration.VEGETAL_DECORATION));
            } else {
                final var desertBiomeKey = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
                        new ResourceLocation(FloralisConstant.ID, holder.getId().getPath() + "_desert"));
                final var badlandBiomeKey = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
                        new ResourceLocation(FloralisConstant.ID, holder.getId().getPath() + "_badland"));
                final var featureKey = ResourceKey.create(Registries.PLACED_FEATURE, holder.getId());
                context.register(desertBiomeKey, new BiomeModifiers.AddFeaturesBiomeModifier(
                        biomeGetter.getOrThrow(Tags.Biomes.IS_DESERT),
                        HolderSet.direct(addFeature.getOrThrow(featureKey)),
                        GenerationStep.Decoration.VEGETAL_DECORATION));
                context.register(badlandBiomeKey, new BiomeModifiers.AddFeaturesBiomeModifier(
                        biomeGetter.getOrThrow(BiomeTags.IS_BADLANDS),
                        HolderSet.direct(addFeature.getOrThrow(featureKey)),
                        GenerationStep.Decoration.VEGETAL_DECORATION));
            }
        }
    }

    public WorldGenGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(FloralisConstant.ID));
    }
}

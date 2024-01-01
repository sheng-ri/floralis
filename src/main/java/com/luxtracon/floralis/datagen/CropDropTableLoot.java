package com.luxtracon.floralis.datagen;

import com.luxtracon.floralis.block.CactusCropBlock;
import com.luxtracon.floralis.registry.FloralisBlockStateProperties;
import com.luxtracon.floralis.registry.FloralisBlocks;
import com.luxtracon.floralis.registry.FloralisConstant;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.NotNull;

import java.util.function.BiConsumer;

public class CropDropTableLoot implements LootTableSubProvider {

    private static ResourceLocation seed(ResourceLocation id) {
        return new ResourceLocation(FloralisConstant.ID, id.getPath()
                .replace("crop", "seeds")
                .replace("cloched_",""));
    }

    private static ResourceLocation plant(ResourceLocation id) {
        return new ResourceLocation(FloralisConstant.ID, id.getPath()
                .replace("_crop", "")
                .replace("cloched_",""));
    }

    @Override
    public void generate(@NotNull BiConsumer<ResourceLocation, LootTable.Builder> builder) {
        for (DeferredBlock<CactusCropBlock> holder : FloralisBlocks.CROP_BLOCK) {
            final var block = holder.get();
            final var seedId = seed(holder.getId());
            final var seedItem = BuiltInRegistries.ITEM.get(seedId);

            final var plantId = plant(holder.getId());
            final var plantItem = BuiltInRegistries.ITEM.get(plantId);

            final var maxAgeCondition = LootItemBlockStatePropertyCondition
                    .hasBlockStateProperties(block)
                    .setProperties(StatePropertiesPredicate.Builder.properties()
                            .hasProperty(FloralisBlockStateProperties.AGE, 5));

            builder.accept(LootTableGenerator.blockLootTable(holder.getId()), LootTable.lootTable()
                    .withPool(LootPool.lootPool()
                            .setRolls(ConstantValue.exactly(1))
                            .when(maxAgeCondition)
                            .add(LootItem.lootTableItem(seedItem))
                            .add(LootItem.lootTableItem(plantItem))
                    )
            );
        }
    }
}

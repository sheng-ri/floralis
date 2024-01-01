package com.luxtracon.floralis.datagen;

import com.luxtracon.floralis.registry.FloralisItems;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.neoforged.neoforge.registries.DeferredItem;
import org.jetbrains.annotations.NotNull;

import java.util.function.BiConsumer;

public class BlockDropTableLoot implements LootTableSubProvider {
    @Override
    public void generate(@NotNull BiConsumer<ResourceLocation, LootTable.Builder> builder) {
        for (DeferredItem<BlockItem> plantBlock : FloralisItems.PLANT_ITEMS) {
            addDrop(builder,plantBlock);
        }

        for (DeferredItem<BlockItem> dyeBlock : FloralisItems.DYE_BLOCKS) {
            addDrop(builder,dyeBlock);
        }
    }

    private void addDrop(BiConsumer<ResourceLocation, LootTable.Builder> builder, DeferredItem<BlockItem> holder) {
        final var item = holder.get();
        builder.accept(LootTableGenerator.blockLootTable(holder.getId()), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(item)))
        );
    }
}

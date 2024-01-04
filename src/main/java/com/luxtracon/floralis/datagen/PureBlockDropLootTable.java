package com.luxtracon.floralis.datagen;

import com.luxtracon.floralis.registry.FloralisBlocks;
import com.luxtracon.floralis.registry.FloralisItems;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.ExplosionCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import org.jetbrains.annotations.NotNull;

import java.util.function.BiConsumer;

public class PureBlockDropLootTable implements LootTableSubProvider {
    @Override
    public void generate(@NotNull BiConsumer<ResourceLocation, LootTable.Builder> builder) {
        for (DeferredItem<BlockItem> dyeBlock : FloralisItems.DYE_BLOCK_ITEMS) {
            addDrop(builder,dyeBlock.getId(),dyeBlock.get());
        }
        addDrop(builder,FloralisItems.PLANT_FIBERS_BLOCK.getId(),FloralisItems.PLANT_FIBERS_BLOCK.asItem());
        for (DeferredBlock<? extends BushBlock> plantBlock : FloralisBlocks.PLANT_BLOCK) {
            final var id = plantBlock.getId();
            addDrop(builder, new ResourceLocation(id.getNamespace(),"potted_" + id.getPath() ), plantBlock.asItem());
        }
    }

    private void addDrop(BiConsumer<ResourceLocation, LootTable.Builder> builder, ResourceLocation blockId,Item item) {
        builder.accept(LootTableGenerator.blockLootTable(blockId), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(ExplosionCondition.survivesExplosion())
                        .add(LootItem.lootTableItem(item)))
        );
    }
}

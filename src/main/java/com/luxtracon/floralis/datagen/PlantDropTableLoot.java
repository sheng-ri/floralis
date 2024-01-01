package com.luxtracon.floralis.datagen;

import com.luxtracon.floralis.registry.FloralisBlocks;
import com.luxtracon.floralis.registry.FloralisConstant;
import com.luxtracon.floralis.registry.FloralisItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.ApplyExplosionDecay;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.NotNull;

import java.util.function.BiConsumer;

import static com.luxtracon.floralis.datagen.LootTableGenerator.*;

public class PlantDropTableLoot implements LootTableSubProvider {

    // white_flower/white_cactus
    // +_seeds => seeds
    // => plant
    // remove (_flower|_cactus|cloched_) and +_petals => petals

    private static Item seed(ResourceLocation id) {
        return BuiltInRegistries.ITEM.get(new ResourceLocation(FloralisConstant.ID,
                id.getPath() + "_seeds"));
    }

    private static Item plant(ResourceLocation id) {
        return BuiltInRegistries.ITEM.get(id);
    }

    private static Item petals(ResourceLocation id) {
        String id1 = id.getPath();
        return BuiltInRegistries.ITEM.get(new ResourceLocation(FloralisConstant.ID,
                id1.replace("_flower", "")
                        .replace("_cactus", "")
                        .replace("cloched_", "") + "_petals"));
    }


    @Override
    public void generate(@NotNull BiConsumer<ResourceLocation, LootTable.Builder> builder) {
        for (var plantBlock : FloralisBlocks.PLANT_BLOCK) {
            buildPlant(builder, plantBlock);
        }
    }

    private void buildPlant(@NotNull BiConsumer<ResourceLocation, LootTable.Builder> builder, DeferredBlock<? extends BushBlock> holder) {
        final var plantItem = plant(holder.getId());
        final var petalsItem = petals(holder.getId());
        final var seedsItem = seed(holder.getId());
        builder.accept(LootTableGenerator.blockLootTable(holder.getId()), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(plantItem)
                                .when(SHEARS_AND_SILK_TOUCH))
                ).withPool(
                        LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(FloralisItems.PLANT_FIBERS)
                                        .when(INVERT_SHEARS_AND_SILK_TOUCH)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)))
                                        .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))
                                        .apply(ApplyExplosionDecay.explosionDecay())
                                ))
                .withPool(
                        LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(petalsItem)
                                        .when(INVERT_SHEARS_AND_SILK_TOUCH)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)))
                                        .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))
                                        .apply(ApplyExplosionDecay.explosionDecay())))
                .withPool(
                        LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(petalsItem)))
                .withPool(
                        LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(seedsItem)
                                        .when(INVERT_SHEARS_AND_SILK_TOUCH)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2)))
                                        .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))
                                        .apply(ApplyExplosionDecay.explosionDecay())))
        );


    }
}

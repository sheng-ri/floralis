package com.luxtracon.floralis.datagen;

import com.luxtracon.floralis.registry.FloralisBlockStateProperties;
import com.luxtracon.floralis.registry.FloralisBlocks;
import com.luxtracon.floralis.registry.FloralisConstant;
import com.luxtracon.floralis.registry.FloralisItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.ApplyExplosionDecay;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.NotNull;

import java.util.function.BiConsumer;

import static com.luxtracon.floralis.datagen.LootTableGenerator.*;

public class CropDropLootTable implements LootTableSubProvider {

    // white_flower_crop/white_cactus_crop
    // repalce(crop,seeeds) => seeds
    // repalce(_crop,) => plant
    // repalce(crop,petals) => petals
    public static final StatePropertiesPredicate.Builder MAX_AGE_PREDICATE = StatePropertiesPredicate.Builder.properties()
            .hasProperty(FloralisBlockStateProperties.AGE, 5);

    private static Item seed(ResourceLocation id) {
        return BuiltInRegistries.ITEM.get(new ResourceLocation(FloralisConstant.ID,id.getPath()
                .replace("crop", "seeds")));
    }

    private static Item plant(ResourceLocation id) {
        return BuiltInRegistries.ITEM.get(new ResourceLocation(FloralisConstant.ID, id.getPath()
                .replace("_crop", "")));
    }

    private static Item petals(ResourceLocation id) {
        return BuiltInRegistries.ITEM.get(new ResourceLocation(FloralisConstant.ID, id.getPath()
                .replace("crop", "petals").replace("_flower", "")
                .replace("_cactus", "")
                .replace("cloched_", "")));
    }

    @Override
    public void generate(@NotNull BiConsumer<ResourceLocation, LootTable.Builder> builder) {
        for (var cropBlock : FloralisBlocks.CROP_BLOCK) {
            buildPlant(builder, cropBlock);
        }
    }

    private void buildPlant(@NotNull BiConsumer<ResourceLocation, LootTable.Builder> builder, DeferredBlock<? extends CropBlock> holder) {
        final var plantItem = plant(holder.getId());
        final var petalsItem = petals(holder.getId());
        final var seedsItem = seed(holder.getId());

        final var maxAgeCondition = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(holder.get())
                .setProperties(MAX_AGE_PREDICATE);

        builder.accept(LootTableGenerator.blockLootTable(holder.getId()), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(SHEARS_AND_SILK_TOUCH.and(maxAgeCondition))
                        .add(LootItem.lootTableItem(plantItem))
                        .add(LootItem.lootTableItem(seedsItem))
                ).withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(INVERT_SHEARS_AND_SILK_TOUCH.and(maxAgeCondition))
                        .add(LootItem.lootTableItem(FloralisItems.PLANT_FIBERS)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)))
                                .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))
                                .apply(ApplyExplosionDecay.explosionDecay())
                        ).add(LootItem.lootTableItem(petalsItem)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)))
                                .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))
                                .apply(ApplyExplosionDecay.explosionDecay())
                        ).add(LootItem.lootTableItem(seedsItem)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2)))
                                .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))
                                .apply(ApplyExplosionDecay.explosionDecay())
                        )
                ).withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(INVERT_SHEARS_AND_SILK_TOUCH.and(maxAgeCondition.invert()))
                        .add(LootItem.lootTableItem(seedsItem)
                                .apply(ApplyExplosionDecay.explosionDecay()))
                )
        );
    }

}

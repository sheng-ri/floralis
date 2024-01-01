package com.luxtracon.floralis.datagen;

import com.luxtracon.floralis.registry.FloralisItems;
import net.minecraft.advancements.critereon.EnchantmentPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.neoforged.neoforge.registries.DeferredItem;
import org.jetbrains.annotations.NotNull;

import java.util.function.BiConsumer;

// In vanilla, flowers will drop without condition, so I remove this.
public class NoUsePlantDropTableLoot implements LootTableSubProvider {

    @Override
    public void generate(@NotNull BiConsumer<ResourceLocation, LootTable.Builder> builder) {
        final var shearsAndSilkTouchCondition =
                MatchTool.toolMatches(ItemPredicate.Builder.item().of(Items.SHEARS))
                        .or(MatchTool.toolMatches(ItemPredicate.Builder.item().hasEnchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.Ints.ANY))));
        for (DeferredItem<BlockItem> holder : FloralisItems.PLANT_ITEMS) {
            final var item = holder.get();
            builder.accept(LootTableGenerator.blockLootTable(holder.getId()), LootTable.lootTable()
                    .withPool(LootPool.lootPool()
                            .setRolls(ConstantValue.exactly(1))
                            .when(shearsAndSilkTouchCondition)
                            .add(LootItem.lootTableItem(item)))
            );
        }
    }
}

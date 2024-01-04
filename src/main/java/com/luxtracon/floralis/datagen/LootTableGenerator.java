package com.luxtracon.floralis.datagen;

import com.luxtracon.floralis.registry.FloralisConstant;
import net.minecraft.advancements.critereon.EnchantmentPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.predicates.AnyOfCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;

import java.util.Collections;
import java.util.List;

public class LootTableGenerator extends LootTableProvider {

    public static final AnyOfCondition.Builder SHEARS_AND_SILK_TOUCH = MatchTool.toolMatches(ItemPredicate.Builder.item().of(Items.SHEARS))
            .or(MatchTool.toolMatches(ItemPredicate.Builder.item().hasEnchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.Ints.ANY))));
    public static final LootItemCondition.Builder INVERT_SHEARS_AND_SILK_TOUCH = MatchTool.toolMatches(ItemPredicate.Builder.item().of(Items.SHEARS))
            .or(MatchTool.toolMatches(ItemPredicate.Builder.item().hasEnchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.Ints.ANY)))).invert();

    public LootTableGenerator(PackOutput p_254123_) {
        super(p_254123_, Collections.emptySet(), List.of(
                new SubProviderEntry(PureBlockDropLootTable::new, LootContextParamSets.BLOCK),
                new SubProviderEntry(CropDropLootTable::new, LootContextParamSets.BLOCK),
                new SubProviderEntry(PlantDropTableLoot::new, LootContextParamSets.BLOCK)
        ));
    }

    public static ResourceLocation blockLootTable(ResourceLocation location) {
        return new ResourceLocation(FloralisConstant.ID, "blocks/" + location.getPath());
    }


}

package com.luxtracon.floralis.datagen;

import com.luxtracon.floralis.registry.FloralisItems;
import com.mojang.math.MethodsReturnNonnullByDefault;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.registries.DeferredItem;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@MethodsReturnNonnullByDefault
public class RecipeGenerator extends RecipeProvider {

    public static final float COOKING_EXP = 0.1f;
    public static final int COOKING_TIME = 200;

    public RecipeGenerator(PackOutput p_248933_, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(p_248933_, lookupProvider);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        buildDyeBlockRecipes(output);
        buildDyeCookRecipes(output);
    }

    private void buildDyeCookRecipes(RecipeOutput output) {
        for (DeferredItem<Item> holder : FloralisItems.PETAL_ITEMS) {
            final var dyeColor = holder.getId().getPath().replace("_petals", "");

            final var location = new ResourceLocation("minecraft:" + dyeColor + "_dye");
            final var dyeItem = BuiltInRegistries.ITEM.get(location);
            final var cookingItem = holder.get();
            createSingleDyeCookRecipe(output, cookingItem,dyeColor, dyeItem);
        }
    }

    private void createSingleDyeCookRecipe(RecipeOutput output, Item cookingItem, String dyeColor, Item dyeItem) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(cookingItem), RecipeCategory.MISC, dyeItem, COOKING_EXP, COOKING_TIME)
                .unlockedBy("has_item",has(cookingItem)) // How the recipe is unlocked
                .save(output,dyeColor + "_petals_cook"); // Add data to builder
    }

    private void buildDyeBlockRecipes(RecipeOutput output) {
        for (DeferredItem<BlockItem> holder : FloralisItems.DYE_BLOCKS) {
            final var dyeColor = holder.getId().getPath().replace("_block", "");

            final var location = new ResourceLocation("minecraft:" + dyeColor);
            final var dyeItem = BuiltInRegistries.ITEM.get(location);
            final var dyeBlockItem = holder.get();
            createSingleDyeBlockRecipe(output, dyeItem, dyeBlockItem);
        }
        
    }

    private void createSingleDyeBlockRecipe(RecipeOutput output, Item dye, Item dyeBlock) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, dyeBlock)
                .pattern("---") // Create recipe pattern
                .pattern("---") // Create recipe pattern
                .pattern("---") // Create recipe pattern
                .define('-', dye) // Define what the symbol represents
                .unlockedBy("has_item", has(dye)) // How the recipe is unlocked
                .save(output); // Add data to builder
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, dye, 9)
                .requires(dyeBlock)
                .unlockedBy("has_item", has(dyeBlock)) // How the recipe is unlocked
                .save(output); // Add data to builder
    }

    protected static Criterion<InventoryChangeTrigger.TriggerInstance> has(@NotNull ItemLike item) {
        return CriteriaTriggers.INVENTORY_CHANGED.createCriterion(new InventoryChangeTrigger.TriggerInstance(Optional.empty(), InventoryChangeTrigger.TriggerInstance.Slots.ANY, Collections.singletonList(ItemPredicate.Builder.item().of(item).build())));
    }
}

package com.luxtracon.floralis.datagen;

import com.luxtracon.floralis.registry.FloralisConstant;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.Collections;
import java.util.List;

public class LootTableGenerator extends LootTableProvider {

    public LootTableGenerator(PackOutput p_254123_) {
        super(p_254123_, Collections.emptySet(), List.of(
                new SubProviderEntry(CropDropTableLoot::new, LootContextParamSets.BLOCK),
                new SubProviderEntry(BlockDropTableLoot::new, LootContextParamSets.BLOCK)
        ));
    }

    public static ResourceLocation blockLootTable(ResourceLocation location) {
        return new ResourceLocation(FloralisConstant.ID, "blocks/" + location.getPath());
    }


}

package com.luxtracon.floralis.datagen;


import com.luxtracon.floralis.registry.FloralisConstant;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = FloralisConstant.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerator {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        final var generator = event.getGenerator();
        final var lookupProvider = event.getLookupProvider();
        final var packOutput = generator.getPackOutput();
        generator.addProvider(event.includeServer(), new RecipeGenerator(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new LootTableGenerator(packOutput));
    }
}

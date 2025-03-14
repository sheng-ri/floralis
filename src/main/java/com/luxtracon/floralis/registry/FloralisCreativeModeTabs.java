package com.luxtracon.floralis.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


public class FloralisCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FloralisConstant.ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FLORALIS = FloralisCreativeModeTabs.CREATIVE_MODE_TABS
            .register(FloralisConstant.ID, () -> CreativeModeTab.builder().icon(() -> new ItemStack(FloralisItems.PURPLE_CACTUS.get())).title(Component.translatable("tab." + FloralisConstant.ID + ".item_group")).withSearchBar().withTabsBefore(CreativeModeTabs.SPAWN_EGGS).build());
}

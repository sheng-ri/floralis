package com.luxtracon.floralis.datagen;

import com.luxtracon.floralis.registry.FloralisBlocks;
import com.luxtracon.floralis.registry.FloralisConstant;
import com.luxtracon.floralis.registry.FloralisItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BushBlock;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class BlockTagGenerator extends BlockTagsProvider {

    public BlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, FloralisConstant.ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        addPlantTag();
        addCropTag();
        addNeoforgeTag();

        tag(BlockTags.MINEABLE_WITH_HOE).add(FloralisBlocks.PLANT_FIBERS_BLOCK.get());
    }

    private void addNeoforgeTag() {
        final var storageBlock = tag(Tags.Blocks.STORAGE_BLOCKS);
        for (DeferredItem<BlockItem> item : FloralisItems.DYE_BLOCK_ITEMS) {
            storageBlock.add(item.get().getBlock());
        }
    }

    private void addCropTag() {
        final var cropTags = List.of(tag(BlockTags.BEE_GROWABLES),
                tag(BlockTags.SWORD_EFFICIENT),
                tag(BlockTags.MINEABLE_WITH_AXE),
                tag(BlockTags.MAINTAINS_FARMLAND),
                tag(BlockTags.CROPS)
        );
        for (var holder : FloralisBlocks.CROP_BLOCK) {
            final var block = holder.get();
            for (IntrinsicTagAppender<Block> tags : cropTags) {
                tags.add(block);
            }
        }
    }

    private void addPlantTag() {
        final var plantTags = List.of(
                tag(BlockTags.ENDERMAN_HOLDABLE),
                tag(BlockTags.SWORD_EFFICIENT),
                tag(BlockTags.SMALL_FLOWERS),
                tag(BlockTags.FLOWERS)
        );
        for (var holder : FloralisBlocks.PLANT_BLOCK) {
            final BushBlock block = holder.get();
            for (IntrinsicTagAppender<Block> tags : plantTags) {
                tags.add(block);
            }
        }
    }
}

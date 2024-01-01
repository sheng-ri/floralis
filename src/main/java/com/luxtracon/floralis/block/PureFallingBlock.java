package com.luxtracon.floralis.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.block.FallingBlock;
import org.jetbrains.annotations.NotNull;

public class PureFallingBlock extends FallingBlock {

    public static final MapCodec<PureFallingBlock> CODEC = simpleCodec(PureFallingBlock::new);


    public PureFallingBlock(Properties p_53205_) {
        super(p_53205_);
    }

    @Override
    protected @NotNull MapCodec<? extends FallingBlock> codec() {
        return CODEC;
    }
}

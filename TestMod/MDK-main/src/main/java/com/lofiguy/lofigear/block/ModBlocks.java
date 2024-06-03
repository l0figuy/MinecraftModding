package com.lofiguy.lofigear.block;

import com.lofiguy.lofigear.LofiGear;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(LofiGear.MOD_ID);

    public static final DeferredBlock<Block> BLUUBY_ORE = BLOCKS.register("bluuby_ore", () ->
            new DropExperienceBlock((IntProvider) IntProvider.codec(0, 2), BlockBehaviour.Properties.of()
                    .strength(3f)
                    .requiresCorrectToolForDrops()
                    .destroyTime(200f)));
}

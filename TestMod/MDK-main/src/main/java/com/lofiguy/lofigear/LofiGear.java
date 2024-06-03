package com.lofiguy.lofigear;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

import static com.lofiguy.lofigear.block.ModBlocks.BLOCKS;
import static com.lofiguy.lofigear.item.ModItems.ITEMS;

@Mod(LofiGear.MOD_ID)
public class LofiGear {
    public static final String MOD_ID = "lofigear";
    private static final Logger LOGGER = LogUtils.getLogger();

    public LofiGear(IEventBus modEventBus, ModContainer modContainer) {

        ITEMS.register(modEventBus);
        BLOCKS.register(modEventBus);

    }

}

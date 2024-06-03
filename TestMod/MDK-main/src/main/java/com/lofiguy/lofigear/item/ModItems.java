package com.lofiguy.lofigear.item;

import com.lofiguy.lofigear.LofiGear;
import com.lofiguy.lofigear.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LofiGear.MOD_ID);

    public static final DeferredItem<Item> BLUUBY = ITEMS.register("bluuby", () ->
            new Item(new Item.Properties()));


    public static final DeferredItem<BlockItem> BLUUBY_ORE= ITEMS.registerSimpleBlockItem("bluuby_ore", ModBlocks.BLUUBY_ORE);
}

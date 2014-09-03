package com.blazingmarimba.baconmod.init;

import com.blazingmarimba.baconmod.items.ItemBacon;
import com.blazingmarimba.baconmod.items.ItemMB;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemMB bacon = new ItemBacon();

    public static void init()
    {
        GameRegistry.registerItem(bacon, "bacon");
    }
}

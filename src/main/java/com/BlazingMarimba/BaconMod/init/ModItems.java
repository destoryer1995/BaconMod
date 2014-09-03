package com.blazingmarimba.baconmod.init;

import com.blazingmarimba.baconmod.items.ItemMB;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemMB Bacon = new ItemMB();

    public static void init()
    {
        GameRegistry.registerItem(Bacon, "Bacon");
    }
}

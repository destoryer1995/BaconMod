package com.blazingmarimba.baconmod.init;

import com.blazingmarimba.baconmod.items.ItemBacon;
import com.blazingmarimba.baconmod.items.ItemBelly;
import com.blazingmarimba.baconmod.items.ItemMB;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemMB bacon = new ItemBacon();
    public static final ItemMB belly = new ItemBelly();

    public static void init()
    {
        GameRegistry.registerItem(bacon, "bacon");
        GameRegistry.registerItem(belly, "belly");
    }
}

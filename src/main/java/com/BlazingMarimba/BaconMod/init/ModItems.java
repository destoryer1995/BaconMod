package com.blazingmarimba.baconmod.init;

import com.blazingmarimba.baconmod.items.ItemBM;
import com.blazingmarimba.baconmod.items.ItemBacon;
import com.blazingmarimba.baconmod.items.ItemBelly;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemBM bacon = new ItemBacon();
    public static final ItemBM belly = new ItemBelly();

    public static void init()
    {
        GameRegistry.registerItem(bacon, "bacon");
        GameRegistry.registerItem(belly, "belly");
    }
}

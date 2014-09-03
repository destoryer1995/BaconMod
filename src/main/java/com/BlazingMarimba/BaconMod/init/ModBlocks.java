package com.blazingmarimba.baconmod.init;

import com.blazingmarimba.baconmod.blocks.BlockBM;
import com.blazingmarimba.baconmod.blocks.BlockSmoker;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static BlockBM smoker = new BlockSmoker();

    public static void init()
    {
        GameRegistry.registerBlock(smoker, "smoker");
    }
}

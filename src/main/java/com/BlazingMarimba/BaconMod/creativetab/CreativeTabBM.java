package com.blazingmarimba.baconmod.creativetab;

import com.blazingmarimba.baconmod.init.ModItems;
import com.blazingmarimba.baconmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBM
{
    public static  final CreativeTabs BM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.bacon;
        }
    };

}

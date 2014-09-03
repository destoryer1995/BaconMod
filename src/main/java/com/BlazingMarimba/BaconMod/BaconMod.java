package com.blazingmarimba.baconmod;

import com.blazingmarimba.baconmod.handler.ConfigurationHandler;
import com.blazingmarimba.baconmod.proxy.IProxy;
import com.blazingmarimba.baconmod.reference.Reference;
import com.blazingmarimba.baconmod.utilty.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY)
public class BaconMod {

    @Mod.Instance("baconmod")
    public static BaconMod instance;

    @SidedProxy(clientSide = Reference.Client_Proxy, serverSide = Reference.Server_Proxy)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());


        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete");
    }
}

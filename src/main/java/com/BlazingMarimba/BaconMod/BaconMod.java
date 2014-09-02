package com.BlazingMarimba.BaconMod;

import com.BlazingMarimba.BaconMod.proxy.IProxy;
import com.BlazingMarimba.BaconMod.reference.Reference;
import com.BlazingMarimba.BaconMod.utilty.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class BaconMod {

    @Mod.Instance("BaconMod")
    public static BaconMod instance;

    @SidedProxy(clientSide = Reference.Client_Proxy, serverSide = Reference.Server_Proxy)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
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

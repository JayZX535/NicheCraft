package com.niche.nichecraft;

import java.awt.Color;
import java.util.Random;

import com.niche.nichecraft.entity.EntityTribeling;
import com.niche.nichecraft.entity.render.RenderTribeling;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = NicheCraft.MODID, name = NicheCraft.MODNAME, version = NicheCraft.VERSION)
public class NicheCraft {

    public static final String MODID = "nichecraft";
    public static final String MODNAME = "NicheCraft";
    public static final String VERSION = "0.0.1";
        
    @Instance
    public static NicheCraft instance = new NicheCraft();
       
    @SidedProxy(clientSide="com.niche.nichecraft.ClientProxy", serverSide="com.niche.nichecraft.ServerProxy")
    public static CommonProxy proxy;
     
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	proxy.preInit(e);  
    }
        
    @EventHandler
    public void init(FMLInitializationEvent e) {
    	proxy.init(e); 
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	proxy.postInit(e);
    }
}
    	
    	
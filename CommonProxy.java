package com.niche.nichecraft;

import java.awt.Color;

import com.niche.nichecraft.entity.EntityTribeling;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    
    	ModBlocks.createBlocks();
    	EntityRegistry.registerModEntity(EntityTribeling.class, "NicheTribeling", 1, NicheCraft.MODID, 80, 3, true, (new Color(0, 0, 0)).getRGB(), (new Color(15, 15, 15)).getRGB());
    }

    public void init(FMLInitializationEvent e) {

    	
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}

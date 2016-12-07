package com.niche.nichecraft;

import com.niche.nichecraft.block.NestBlock;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;


public final class ModBlocks {

	public static Block nestBlock;
	private static ModelResourceLocation nestblockitem = new ModelResourceLocation("nichecraft:nestblock");
    public static void createBlocks() {
    	//GameRegistry.registerBlock(tutorialBlock = new BasicBlock("tutorial_block"), "tutorial_block");
    	nestBlock = new NestBlock();
    	
    }
    public static void registerBlockModels()
    {
    	//block is the instance of your block
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(nestBlock), nestBlock.getMetaFromState(nestBlock.getDefaultState()), new ModelResourceLocation(nestBlock.getRegistryName(), "inventory"));
    }
}

package com.niche.nichecraft;

import com.niche.nichecraft.block.BlockRenderRegister;
import com.niche.nichecraft.block.NestBlock;
import com.niche.nichecraft.entity.EntityTribeling;
import com.niche.nichecraft.entity.render.RenderTribeling;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
    	//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.nestBlock), Block.getStateId(ModBlocks.nestBlock.getDefaultState()), new ModelResourceLocation(ModBlocks.nestBlock.getRegistryName(), "inventory"));
    	ModBlocks.registerBlockModels();
    	net.minecraftforge.fml.client.registry.RenderingRegistry.registerEntityRenderingHandler(EntityTribeling.class, RenderTribeling.FACTORY);
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
    	//BlockRenderRegister.registerBlockRenderer();
        super.init(e);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }

}
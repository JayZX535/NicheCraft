package com.niche.nichecraft.block;

import com.niche.nichecraft.ModBlocks;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class BlockRenderRegister {
    public static void registerBlockRenderer() {
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.nestBlock), 0, new ModelResourceLocation("modid:blockname", "inventory"));
    }
}

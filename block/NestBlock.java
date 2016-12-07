package com.niche.nichecraft.block;

import javax.annotation.Nullable;

import com.niche.nichecraft.NicheCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class NestBlock extends Block {

    /**public NestBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.MISC);
        this.setHardness(0.1F);
        this.setResistance(1.0F);
        setRegistryName("nestblock");        // The unique name (within your mod) that identifies this block
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }*/
	protected static final AxisAlignedBB NESTBLOCK_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);

	public NestBlock() {
        super(Material.LEAVES);
        this.setCreativeTab(CreativeTabs.MISC);
        setUnlocalizedName(NicheCraft.MODID + ".nestblock");     // Used for localization (en_US.lang)
        setRegistryName("nestblock");        // The unique name (within your mod) that identifies this block
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }
	
    /**
     * Used to determine ambient occlusion and culling when rebuilding chunks for render
     */
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    public boolean isFullCube(IBlockState state)
    {
        return false;
    }
	
    @Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World worldIn, BlockPos pos)
    {
        return NESTBLOCK_AABB;
    }

    /**public NestBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.LEAVES, hardness, resistance);
    }

    public NestBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }*/
}

package com.niche.nichecraft.entity.ai;

import com.niche.nichecraft.CommonProxy;
import com.niche.nichecraft.ModBlocks;
import com.niche.nichecraft.entity.EntityTribeling;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.ai.EntityAIMoveToBlock;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityAINestTribeling extends EntityAIMoveToBlock
{
    private final EntityTribeling entity;

    public EntityAINestTribeling(EntityTribeling tribeling, double p_i45315_2_)
    {
        super(tribeling, p_i45315_2_, 8);
        this.entity = tribeling;
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        return this.entity.isPregnant() && !this.entity.isSitting() && super.shouldExecute();
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean continueExecuting()
    {
        return super.continueExecuting();
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        super.startExecuting();
        this.entity.getAISit().setSitting(false);
        System.out.println("seeking nest");
    }

    /**
     * Resets the task
     */
    public void resetTask()
    {
        super.resetTask();
        this.entity.setSitting(false);
    }

    /**
     * Updates the task
     */
    public void updateTask()
    {
        super.updateTask();
        this.entity.getAISit().setSitting(false);

        if (!this.getIsAboveDestination())
        {
            this.entity.setSitting(false);
        }
        else if (!this.entity.isSitting())
        {
            this.entity.setSitting(true);
        }
    }

    /**
     * Return true to set given position as destination
     */
    protected boolean shouldMoveTo(World worldIn, BlockPos pos)
    {
        if (!worldIn.isAirBlock(pos.up()))
        {
            return false;
        }
        else
        {
            IBlockState iblockstate = worldIn.getBlockState(pos);
            Block block = iblockstate.getBlock();
            
            if (block == ModBlocks.nestBlock)
            if (block == Blocks.CHEST)
            {
            	return true;
            }

            return false;
        }
    }
}
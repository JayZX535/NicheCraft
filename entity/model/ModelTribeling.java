package com.niche.nichecraft.entity.model;

import com.niche.nichecraft.entity.EntityTribeling;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.math.MathHelper;

public class ModelTribeling extends ModelBase
{
  //fields
    ModelRenderer StandardHead;
    ModelRenderer ManeTop;
    ModelRenderer ManeR;
    ModelRenderer ManeL;
    ModelRenderer ChestStandard;
    ModelRenderer BackStandard;
    ModelRenderer Belly;
    ModelRenderer FrontLegR;
    ModelRenderer FrontLegL;
    ModelRenderer BackLegR;
    ModelRenderer BackLegL;
    ModelRenderer Tail;
  
  public ModelTribeling()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      StandardHead = new ModelRenderer(this, 0, 10);
      StandardHead.addBox(-3F, -6F, -3F, 6, 6, 6);
      StandardHead.setRotationPoint(0F, 16F, -10F);
      StandardHead.setTextureSize(128, 64);
      StandardHead.mirror = true;
      setRotation(StandardHead, 0F, 0F, 0F);
      //muzzle
      this.StandardHead.setTextureOffset(0, 23).addBox(-2F, -4F, -6F, 4, 4, 4, 0.0F);
      //ears
      this.StandardHead.setTextureOffset(0, 0).addBox(-4.5F, -9.5F, 0F, 4, 5, 2, 0.0F);
      this.StandardHead.setTextureOffset(0, 0).addBox(0.5F, -9.5F, 0F, 4, 5, 2, 0.0F);
      //male mane
      //this.StandardHead.setTextureOffset(0, 32).addBox(-1.5F, -3F, -3F, 3, 3, 4);
      //this.StandardHead.setTextureOffset(15, 33).addBox(0F, -1.466667F, -3F, 2, 3, 3);
      //this.StandardHead.setTextureOffset(15, 33).addBox(-2F, -1.466667F, -3F, 2, 3, 3);
      ManeTop = new ModelRenderer(this, 0, 32);
      ManeTop.addBox(-1.5F, -3F, -3F, 3, 3, 4);
      ManeTop.setRotationPoint(0F, 11F, -8F);
      ManeTop.setTextureSize(128, 64);
      ManeTop.mirror = true;
      setRotation(ManeTop, 0F, 0F, 0F);
      //this.StandardHead.addChild(this.ManeTop);
      ManeR = new ModelRenderer(this, 15, 33);
      ManeR.addBox(-2F, -1.466667F, -3F, 2, 3, 3);
      ManeR.setRotationPoint(-2F, 13F, -7.5F);
      ManeR.setTextureSize(128, 64);
      ManeR.mirror = true;
      setRotation(ManeR, 0F, 0F, 0F);
      //this.StandardHead.addChild(this.ManeR);
      ManeL = new ModelRenderer(this, 15, 33);
      ManeL.addBox(0F, -1.466667F, -3F, 2, 3, 3);
      ManeL.setRotationPoint(2F, 13F, -7.5F);
      ManeL.setTextureSize(128, 64);
      setRotation(ManeL, 0F, 0F, 0F);
      ManeL.mirror = false;
      //this.StandardHead.addChild(this.ManeL);
      
      ChestStandard = new ModelRenderer(this, 25, 0);
      ChestStandard.addBox(-4F, -4F, -7F, 8, 8, 7);
      ChestStandard.setRotationPoint(0F, 13.5F, 0F);
      ChestStandard.setTextureSize(128, 64);
      ChestStandard.mirror = true;
      setRotation(ChestStandard, 0F, 0F, 0F);
      this.ChestStandard.setTextureOffset(0, 11).addBox(-2.5F, 2.5F, -7.5F, 1, 1, 1, 0.0F);
      this.ChestStandard.setTextureOffset(0, 11).addBox(-0.5F, 2.5F, -7.5F, 1, 1, 1, 0.0F);
      this.ChestStandard.setTextureOffset(0, 11).addBox(1.5F, 2.5F, -7.5F, 1, 1, 1, 0.0F);
      BackStandard = new ModelRenderer(this, 25, 16);
      BackStandard.addBox(-3F, -4F, 0F, 6, 6, 7);
      BackStandard.setRotationPoint(0F, 14.5F, 0F);
      BackStandard.setTextureSize(128, 64);
      BackStandard.mirror = true;
      setRotation(BackStandard, 0F, 0F, 0F);
      Belly = new ModelRenderer(this, 56, 0);
      Belly.addBox(-2.5F, 0F, 0F, 5, 4, 5);
      Belly.setRotationPoint(0F, 14.5F, 0F);
      Belly.setTextureSize(128, 64);
      Belly.mirror = true;
      setRotation(Belly, 0F, 0F, 0F);
      //this.BackStandard.addChild(this.Belly);
     
      FrontLegR = new ModelRenderer(this, 52, 16);
      FrontLegR.addBox(-1F, 0F, -1F, 2, 8, 2);
      FrontLegR.setRotationPoint(-2F, 16F, -5F);
      FrontLegR.setTextureSize(128, 64);
      FrontLegR.mirror = true;
      setRotation(FrontLegR, 0F, 0F, 0F);
      FrontLegL = new ModelRenderer(this, 52, 16);
      FrontLegL.addBox(-1F, 0F, -1F, 2, 8, 2);
      FrontLegL.setRotationPoint(2F, 16F, -5F);
      FrontLegL.setTextureSize(128, 64);
      FrontLegL.mirror = true;
      setRotation(FrontLegL, 0F, 0F, 0F);
      BackLegR = new ModelRenderer(this, 52, 27);
      BackLegR.addBox(-1F, 0F, -1F, 2, 8, 2);
      BackLegR.setRotationPoint(-2F, 16F, 5F);
      BackLegR.setTextureSize(128, 64);
      BackLegR.mirror = true;
      setRotation(BackLegR, 0F, 0F, 0F);
      BackLegL = new ModelRenderer(this, 52, 27);
      BackLegL.addBox(-1F, 0F, -1F, 2, 8, 2);
      BackLegL.setRotationPoint(2F, 16F, 5F);
      BackLegL.setTextureSize(128, 64);
      BackLegL.mirror = true;
      setRotation(BackLegL, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 52, 38);
      Tail.addBox(-1F, 0F, -1F, 2, 8, 2);
      Tail.setRotationPoint(0F, 12F, 6F);
      Tail.setTextureSize(128, 64);
      Tail.mirror = true;
      setRotation(Tail, 1.570796F, 0F, 0F);
  }
  public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
  {
	  EntityTribeling entity = (EntityTribeling)entityIn;
      super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
      this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);

      if (this.isChild)
      {
          float f = 2.0F;
          GlStateManager.pushMatrix();
          GlStateManager.translate(0.0F, 5.0F * scale, 4.0F * scale);
          this.StandardHead.renderWithRotation(scale);
          if (entity.getGender() == 1)
          {
        	  this.ManeTop.renderWithRotation(scale);
        	  this.ManeR.renderWithRotation(scale);
        	  this.ManeL.renderWithRotation(scale);
          }
          GlStateManager.popMatrix();
          GlStateManager.pushMatrix();
          GlStateManager.scale(0.5F, 0.5F, 0.5F);
          GlStateManager.translate(0.0F, 24.0F * scale, 0.0F);
          this.BackStandard.render(scale);
          this.FrontLegL.render(scale);
          this.FrontLegR.render(scale);
          this.BackLegL.render(scale);
          this.BackLegR.render(scale);
          this.Tail.renderWithRotation(scale);
          this.ChestStandard.render(scale);
          GlStateManager.popMatrix();
      }
      else
      {
    	  this.StandardHead.renderWithRotation(scale);
          if (entity.getGender() == 1)
          {
        	  this.ManeTop.renderWithRotation(scale);
        	  this.ManeR.renderWithRotation(scale);
        	  this.ManeL.renderWithRotation(scale);
          }
          this.BackStandard.render(scale);
          if (entity.isPregnant() == true)
          {
        	  this.Belly.render(scale);
          }
          this.FrontLegL.render(scale);
          this.FrontLegR.render(scale);
          this.BackLegL.render(scale);
          this.BackLegR.render(scale);
          this.Tail.renderWithRotation(scale);
          this.ChestStandard.render(scale);
      }
  }

  /**
   * Used for easily adding entity-dependent animations. The second and third float params here are the same second
   * and third as in the setRotationAngles method.
   */
  public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float p_78086_2_, float p_78086_3_, float partialTickTime)
  {
      EntityTribeling entity = (EntityTribeling)entitylivingbaseIn;

      if (entity.isAngry())
      {
          this.Tail.rotateAngleZ = 0.0F;
      }
      else
      {
          //this.Tail.rotateAngleZ = MathHelper.cos(p_78086_2_ * 0.6662F) * 1.4F * p_78086_3_;
    	  this.Tail.rotateAngleZ = MathHelper.cos(p_78086_2_ * 0.6662F) * 1.4F * p_78086_3_;
    	  //this.Tail.rotateAngleY = 0.0F;
      }

      if (entity.isSitting())
      {
    	  this.ChestStandard.setRotationPoint(0, 17.0F, -2.0F);
          this.ChestStandard.rotateAngleX = -0.5F;
          this.ChestStandard.rotateAngleY = 0.0F;
          this.BackStandard.setRotationPoint(0.0F, 18.0F, -4.0F);
          this.BackStandard.rotateAngleX = this.ChestStandard.rotateAngleX - 0.3F;
          this.Belly.setRotationPoint(0.0F, 18.0F, -4.0F);
          this.Belly.rotateAngleX = this.BackStandard.rotateAngleX;
          this.Tail.setRotationPoint(0.0F, 21.0F, 3.0F);
          this.BackLegL.setRotationPoint(1.9F, 22.0F, 2.0F);
          this.BackLegL.rotateAngleX = ((float)Math.PI * 3F / 2F);
          this.BackLegR.setRotationPoint(-1.9F, 22.0F, 2.0F);
          this.BackLegR.rotateAngleX = ((float)Math.PI * 3F / 2F);
          this.FrontLegL.rotateAngleX = 5.811947F;
          this.FrontLegL.setRotationPoint(2F, 17.0F, -6.0F);
          this.FrontLegR.rotateAngleX = 5.811947F;
          this.FrontLegR.setRotationPoint(-2F, 17.0F, -6.0F);
      }
      else
      {
          this.BackStandard.setRotationPoint(0F, 14.5F, 0F);
          this.BackStandard.rotateAngleX = (0);
          this.Belly.setRotationPoint(0F, 14.5F, 0F);
          this.Belly.rotateAngleX = this.BackStandard.rotateAngleX;
          this.ChestStandard.setRotationPoint(0F, 13.5F, 0F);
          this.ChestStandard.rotateAngleX = this.BackStandard.rotateAngleX;
          this.Tail.setRotationPoint(0F, 12F, 6F);
          this.BackLegL.setRotationPoint(2F, 16F, -5F);
          this.BackLegR.setRotationPoint(-2F, 16F, -5F);
          this.FrontLegL.setRotationPoint(2F, 16F, 5F);
          this.FrontLegR.setRotationPoint(-2F, 16F, 5F);
          this.BackLegL.rotateAngleX = MathHelper.cos(p_78086_2_ * 0.6662F) * 1.4F * p_78086_3_;
          this.BackLegR.rotateAngleX = MathHelper.cos(p_78086_2_ * 0.6662F + (float)Math.PI) * 1.4F * p_78086_3_;
          this.FrontLegL.rotateAngleX = MathHelper.cos(p_78086_2_ * 0.6662F + (float)Math.PI) * 1.4F * p_78086_3_;
          this.FrontLegR.rotateAngleX = MathHelper.cos(p_78086_2_ * 0.6662F) * 1.4F * p_78086_3_;
      }

      this.StandardHead.rotateAngleZ = entity.getInterestedAngle(partialTickTime) + entity.getShakeAngle(partialTickTime, 0.0F);
      /**this.ManeTop.rotateAngleZ = this.StandardHead.rotateAngleZ;
      this.ManeL.rotateAngleZ = this.StandardHead.rotateAngleZ;
      this.ManeR.rotateAngleZ = this.StandardHead.rotateAngleZ;
      this.ManeTop.rotateAngleY = this.StandardHead.rotateAngleY;
      this.ManeL.rotateAngleY = this.StandardHead.rotateAngleY;
      this.ManeR.rotateAngleY = this.StandardHead.rotateAngleY;
      this.ManeTop.rotateAngleX = this.StandardHead.rotateAngleX;
      this.ManeL.rotateAngleX = this.StandardHead.rotateAngleX;
      this.ManeR.rotateAngleX = this.StandardHead.rotateAngleX;*/
      this.ChestStandard.rotateAngleZ = entity.getShakeAngle(partialTickTime, -0.08F);
      this.BackStandard.rotateAngleZ = entity.getShakeAngle(partialTickTime, -0.16F);
      this.Belly.rotateAngleZ = this.BackStandard.rotateAngleZ;
      this.Tail.rotateAngleY = entity.getShakeAngle(partialTickTime, -0.2F);
  }

  /**
   * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
   * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
   * "far" arms and legs can swing at most.
   */
  public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
  {
      super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
      this.StandardHead.rotateAngleX = headPitch * 0.017453292F;
      this.StandardHead.rotateAngleY = netHeadYaw * 0.017453292F;
      //this.Tail.rotateAngleZ = ageInTicks;
      this.Tail.rotateAngleX = 1.5F;
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}

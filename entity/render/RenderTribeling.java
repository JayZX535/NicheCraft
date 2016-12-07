package com.niche.nichecraft.entity.render;

import javax.annotation.Nonnull;

import com.niche.nichecraft.entity.EntityTribeling;
import com.niche.nichecraft.entity.model.ModelTribeling;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderTribeling extends RenderLiving<EntityTribeling> {

    private ResourceLocation mobTexture = new ResourceLocation("nichecraft:textures/entity/NicheTribeling-default.png");

    public static final Factory FACTORY = new Factory();

    public RenderTribeling(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelTribeling(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityTribeling entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityTribeling> {

        @Override
        public Render<? super EntityTribeling> createRenderFor(RenderManager manager) {
            return new RenderTribeling(manager);
        }

    }

}
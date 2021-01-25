package com.idealland.memblock.entity;

import com.idealland.memblock.IdlFramework;
import com.idealland.memblock.entity.creatures.moroon.EntityMoroonUnitBase;
import com.idealland.memblock.entity.creatures.render.RenderBullet;
import com.idealland.memblock.entity.creatures.render.RenderMoroonHumanoid;
import com.idealland.memblock.entity.projectiles.EntityIdlProjectile;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void registerEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityMoroonUnitBase.class, RenderMoroonHumanoid::new);

        RenderingRegistry.registerEntityRenderingHandler(EntityIdlProjectile.class, renderManager -> new RenderBullet<>(renderManager, new ResourceLocation(IdlFramework.MODID,
                "textures/entity/projectiles/bullet_norm.png")));
    }
}

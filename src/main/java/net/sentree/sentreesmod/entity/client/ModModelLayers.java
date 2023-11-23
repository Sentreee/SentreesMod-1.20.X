package net.sentree.sentreesmod.entity.client;

import net.sentree.sentreesmod.SentreesMod;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer PORCUPINE =
            new EntityModelLayer(new Identifier(SentreesMod.MOD_ID, "porcupine"), "main");
}

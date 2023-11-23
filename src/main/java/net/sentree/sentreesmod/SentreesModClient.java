package net.sentree.sentreesmod;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import com.terraformersmc.terraform.sign.SpriteIdentifierRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.client.util.SpriteIdentifier;
import net.sentree.sentreesmod.block.ModBlocks;
import net.sentree.sentreesmod.block.entity.ModBlockEntities;
import net.sentree.sentreesmod.block.entity.renderer.PicklerBlockEntityRenderer;
import net.sentree.sentreesmod.entity.ModBoats;
import net.sentree.sentreesmod.entity.ModEntities;
import net.sentree.sentreesmod.entity.client.ModModelLayers;
import net.sentree.sentreesmod.entity.client.PorcupineModel;
import net.sentree.sentreesmod.entity.client.PorcupineRenderer;
import net.sentree.sentreesmod.screen.CookingPotScreen;
import net.sentree.sentreesmod.screen.ModScreenHandlers;
import net.sentree.sentreesmod.screen.PicklerScreen;

public class SentreesModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SALT_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SALT_TRAPDOOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TOMATO_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CUCUMBER_CROP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MUSTARD_BLOSSOMS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_MUSTARD_BLOSSOMS, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SALTY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SALTY_SAPLING, RenderLayer.getCutout());

        BlockEntityRendererFactories.register(ModBlockEntities.PICKLER_BLOCK_ENTITY, PicklerBlockEntityRenderer::new);

        EntityRendererRegistry.register(ModEntities.PORCUPINE, PorcupineRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.PORCUPINE, PorcupineModel::getTexturedModelData);

        HandledScreens.register(ModScreenHandlers.PICKLER_SCREEN_HANDLER, PicklerScreen::new);
        HandledScreens.register(ModScreenHandlers.COOKING_POT_SCREEN_HANDLER, CookingPotScreen::new);

        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.SALTY_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.SALTY_HANGING_SIGN_TEXTURE));

        TerraformBoatClientHelper.registerModelLayers(ModBoats.SALTY_BOAT_ID, false);

        EntityRendererRegistry.register(ModEntities.DICE_PROJECTILE, FlyingItemEntityRenderer::new);


    }
}

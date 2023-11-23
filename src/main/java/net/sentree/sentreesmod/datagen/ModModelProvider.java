package net.sentree.sentreesmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;
import net.sentree.sentreesmod.block.ModBlocks;
import net.sentree.sentreesmod.block.custom.CucumberCropBlock;
import net.sentree.sentreesmod.block.custom.TomatoCropBlock;
import net.sentree.sentreesmod.item.ModItems;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool saltpool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SALTBLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COOKED_WIENER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SALTORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WIENER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLEGENBLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COMPRESSED_SALT_BLOCK);

        saltpool.stairs(ModBlocks.SALT_STAIRS);
        saltpool.slab(ModBlocks.SALT_SLAB);
        saltpool.button(ModBlocks.SALT_BUTTON);
        saltpool.pressurePlate(ModBlocks.SALT_PRESSURE_PLATE);
        saltpool.fence(ModBlocks.SALT_FENCE);
        saltpool.fenceGate(ModBlocks.SALT_FENCE_GATE);
        saltpool.wall(ModBlocks.SALT_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.SALT_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.SALT_TRAPDOOR);

        blockStateModelGenerator.registerCrop(ModBlocks.TOMATO_CROP, TomatoCropBlock.AGE, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.CUCUMBER_CROP, CucumberCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7, 8);

        blockStateModelGenerator.registerSimpleState(ModBlocks.PICKLER);
        blockStateModelGenerator.registerSimpleState(ModBlocks.COOKINGPOT);

        blockStateModelGenerator.registerLog(ModBlocks.SALTY_LOG).log(ModBlocks.SALTY_LOG).wood(ModBlocks.SALTY_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_SALTY_LOG).log(ModBlocks.STRIPPED_SALTY_LOG).wood(ModBlocks.STRIPPED_SALTY_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SALTY_LEAVES);
        blockStateModelGenerator.registerTintableCross(ModBlocks.SALTY_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        BlockStateModelGenerator.BlockTexturePool salty_wood_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SALTY_PLANKS);
        salty_wood_pool.family(ModBlocks.SALTY_FAMILY);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MUSTARD_BLOSSOMS, ModBlocks.POTTED_MUSTARD_BLOSSOMS, BlockStateModelGenerator.TintType.NOT_TINTED);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.REFINEDSALT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RADCOAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CUCUMBER, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOTDOGBUN, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOTDOG, Models.GENERATED);
        itemModelGenerator.register(ModItems.KETCHUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.LOADEDHOTDOG, Models.GENERATED);
        itemModelGenerator.register(ModItems.METALDETECTOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSTARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSTARDSEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RELISH, Models.GENERATED);
        itemModelGenerator.register(ModItems.SALTCHUNK, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.WIENER, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKEDWIENER, Models.GENERATED);
        itemModelGenerator.register(ModItems.DICE, Models.GENERATED);

        itemModelGenerator.register(ModItems.HANGING_SALTY_SIGN, Models.GENERATED);

        itemModelGenerator.register(ModItems.SALT_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SALT_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SALT_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SALT_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SALT_AXE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.CMONFREESTYLE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.DO_IT_AGAIN_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHAMPIONS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.DOPE_MUSIC_DISC, Models.GENERATED);

        itemModelGenerator.register(ModItems.COTTONWOOD_ALBUM, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SALT_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SALT_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SALT_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SALT_BOOTS));

        itemModelGenerator.register(ModItems.SALTY_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SALTY_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(ModItems.PORCUPINE_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")),Optional.empty()));
    }
}

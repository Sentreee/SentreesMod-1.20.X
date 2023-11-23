package net.sentree.sentreesmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sentree.sentreesmod.SentreesMod;
import net.sentree.sentreesmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup SENTREES_SHENANIGANS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SentreesMod.MOD_ID,"hotdog"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.hotdog"))
                    .icon(() -> new ItemStack(ModItems.HOTDOG)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COOKEDWIENER);
                        entries.add(ModItems.HOTDOGBUN);
                        entries.add(ModItems.HOTDOG);
                        entries.add(ModItems.WIENER);

                        entries.add(ModItems.KETCHUP);
                        entries.add(ModItems.RELISH);
                        entries.add(ModItems.MUSTARD);

                        entries.add(ModItems.PICKLE);
                        entries.add(ModItems.CUCUMBER);
                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.MUSTARDSEEDS);
                        entries.add(ModItems.TOMATO_SEEDS);
                        entries.add(ModItems.CUCUMBER_SEEDS);

                        entries.add(ModItems.DICE);

                        entries.add(ModItems.SALTCHUNK);
                        entries.add(ModItems.REFINEDSALT);
                        entries.add(ModItems.SALT_STAFF);

                        entries.add(ModItems.SALT_HELMET);
                        entries.add(ModItems.SALT_CHESTPLATE);
                        entries.add(ModItems.SALT_LEGGINGS);
                        entries.add(ModItems.SALT_BOOTS);

                        entries.add(ModItems.SALT_PICKAXE);
                        entries.add(ModItems.SALT_SHOVEL);
                        entries.add(ModItems.SALT_HOE);
                        entries.add(ModItems.SALT_AXE);
                        entries.add(ModItems.SALT_SWORD);

                        entries.add(ModItems.SALTY_SIGN);
                        entries.add(ModItems.HANGING_SALTY_SIGN);

                        entries.add(ModItems.SALTY_BOAT);
                        entries.add(ModItems.SALTY_CHEST_BOAT);

                        entries.add(ModItems.COTTONWOOD_ALBUM);

                        entries.add(ModItems.CMONFREESTYLE_MUSIC_DISC);
                        entries.add(ModItems.DO_IT_AGAIN_MUSIC_DISC);
                        entries.add(ModItems.CHAMPIONS_MUSIC_DISC);
                        entries.add(ModItems.DOPE_MUSIC_DISC);

                        entries.add(ModItems.PORCUPINE_SPAWN_EGG);

                        entries.add(ModBlocks.WIENER_BLOCK);
                        entries.add(ModBlocks.COOKED_WIENER_BLOCK);
                        entries.add(ModBlocks.PICKLER);
                        entries.add(ModBlocks.COOKINGPOT);
                        entries.add(ModBlocks.COMPRESSED_SALT_BLOCK);

                        entries.add(ModBlocks.MUSTARD_BLOSSOMS);

                        entries.add(ModBlocks.SALTBLOCK);
                        entries.add(ModBlocks.SALTORE);

                        entries.add(ModItems.METALDETECTOR);
                        entries.add(ModBlocks.COBBLEGENBLOCK);

                        entries.add(ModBlocks.SALT_TRAPDOOR);
                        entries.add(ModBlocks.SALT_STAIRS);
                        entries.add(ModBlocks.SALT_DOOR);
                        entries.add(ModBlocks.SALT_BUTTON);
                        entries.add(ModBlocks.SALT_FENCE);
                        entries.add(ModBlocks.SALT_FENCE_GATE);
                        entries.add(ModBlocks.SALT_SLAB);
                        entries.add(ModBlocks.SALT_WALL);
                        entries.add(ModBlocks.SALT_PRESSURE_PLATE);

                        entries.add(ModBlocks.SALTY_LEAVES);
                        entries.add(ModBlocks.SALTY_LOG);
                        entries.add(ModBlocks.SALTY_PLANKS);
                        entries.add(ModBlocks.SALTY_WOOD);
                        entries.add(ModBlocks.STRIPPED_SALTY_LOG);
                        entries.add(ModBlocks.STRIPPED_SALTY_WOOD);
                        entries.add(ModBlocks.SALTY_SAPLING);

                        entries.add(ModItems.RADCOAL);

                    }).build());


    public static void registerItemGroups() {
        SentreesMod.LOGGER.info("Registering Item Groups for " + SentreesMod.MOD_ID);
    }
}

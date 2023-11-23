package net.sentree.sentreesmod.datagen;

import dev.architectury.platform.Mod;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.sentree.sentreesmod.block.ModBlocks;
import net.sentree.sentreesmod.item.ModItems;
import net.sentree.sentreesmod.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Items.PLANKS)
                .add(Items.ACACIA_PLANKS)
                .add(Items.BAMBOO_PLANKS)
                .add(Items.BIRCH_PLANKS)
                .add(Items.CHERRY_PLANKS)
                .add(Items.CRIMSON_PLANKS)
                .add(Items.JUNGLE_PLANKS)
                .add(Items.DARK_OAK_PLANKS)
                .add(Items.MANGROVE_PLANKS)
                .add(Items.OAK_PLANKS)
                .add(Items.SPRUCE_PLANKS)
                .add(Items.WARPED_PLANKS);

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.SALTY_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.SALTY_LOG.asItem())
                .add(ModBlocks.SALTY_WOOD.asItem())
                .add(ModBlocks.STRIPPED_SALTY_LOG.asItem())
                .add(ModBlocks.STRIPPED_SALTY_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS)
                .add(ModBlocks.SALTY_LOG.asItem());

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.SALT_HELMET)
                .add(ModItems.SALT_CHESTPLATE)
                .add(ModItems.SALT_LEGGINGS)
                .add(ModItems.SALT_BOOTS);

        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.CMONFREESTYLE_MUSIC_DISC)
                .add(ModItems.DO_IT_AGAIN_MUSIC_DISC)
                .add(ModItems.CHAMPIONS_MUSIC_DISC)
                .add(ModItems.DOPE_MUSIC_DISC);
    }
}

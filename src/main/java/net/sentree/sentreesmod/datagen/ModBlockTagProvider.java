package net.sentree.sentreesmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.sentree.sentreesmod.block.ModBlocks;
import net.sentree.sentreesmod.block.custom.CookingPotBlock;
import net.sentree.sentreesmod.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.METAl_DETECTOR_DETECTABLE_BLOCKS)
                .add(ModBlocks.SALTORE)
                .forceAddTag(BlockTags.GOLD_ORES)
                .forceAddTag(BlockTags.EMERALD_ORES)
                .forceAddTag(BlockTags.REDSTONE_ORES)
                .forceAddTag(BlockTags.LAPIS_ORES)
                .forceAddTag(BlockTags.DIAMOND_ORES)
                .forceAddTag(BlockTags.IRON_ORES)
                .forceAddTag(BlockTags.COPPER_ORES)
                .forceAddTag(BlockTags.COAL_ORES);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SALTORE)
                .add(ModBlocks.SALTBLOCK)
                .add(ModBlocks.COOKINGPOT)
                .add(ModBlocks.COBBLEGENBLOCK)
                .add(ModBlocks.COMPRESSED_SALT_BLOCK)

                .add(ModBlocks.DICE_BLOCK)

                .add(ModBlocks.SALT_STAIRS)
                .add(ModBlocks.SALT_SLAB)
                .add(ModBlocks.SALT_BUTTON)
                .add(ModBlocks.SALT_PRESSURE_PLATE)
                .add(ModBlocks.SALT_FENCE_GATE)
                .add(ModBlocks.SALT_FENCE)
                .add(ModBlocks.SALT_WALL)
                .add(ModBlocks.SALT_DOOR)
                .add(ModBlocks.SALT_TRAPDOOR)

                .add(ModBlocks.SALTY_PLANKS)
                .add(ModBlocks.SALTY_LOG)
                .add(ModBlocks.SALTY_WOOD)
                .add(ModBlocks.STRIPPED_SALTY_LOG)
                .add(ModBlocks.STRIPPED_SALTY_WOOD)

                .add(ModBlocks.HANGING_SALTY_SIGN)
                .add(ModBlocks.STANDING_SALTY_SIGN)
                .add(ModBlocks.WALL_SALTY_SIGN)
                .add(ModBlocks.WALL_HANGING_SALTY_SIGN);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.PICKLER);


        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SALTORE)
                .add(ModBlocks.SALTBLOCK)
                .add(ModBlocks.SALT_STAIRS)
                .add(ModBlocks.SALT_SLAB)
                .add(ModBlocks.SALT_BUTTON)
                .add(ModBlocks.SALT_PRESSURE_PLATE)
                .add(ModBlocks.SALT_FENCE_GATE)
                .add(ModBlocks.SALT_FENCE)
                .add(ModBlocks.SALT_WALL)
                .add(ModBlocks.SALT_DOOR)
                .add(ModBlocks.SALT_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.COOKINGPOT)

                .add(ModBlocks.SALT_STAIRS)
                .add(ModBlocks.SALT_SLAB)
                .add(ModBlocks.SALT_BUTTON)
                .add(ModBlocks.SALT_PRESSURE_PLATE)
                .add(ModBlocks.SALT_FENCE_GATE)
                .add(ModBlocks.SALT_FENCE)
                .add(ModBlocks.SALT_WALL)
                .add(ModBlocks.SALT_DOOR)
                .add(ModBlocks.SALT_TRAPDOOR)

                .add(ModBlocks.SALTY_PLANKS)
                .add(ModBlocks.SALTY_LOG)
                .add(ModBlocks.SALTY_WOOD)
                .add(ModBlocks.STRIPPED_SALTY_LOG)
                .add(ModBlocks.STRIPPED_SALTY_WOOD)

                .add(ModBlocks.HANGING_SALTY_SIGN)
                .add(ModBlocks.STANDING_SALTY_SIGN)
                .add(ModBlocks.WALL_SALTY_SIGN)
                .add(ModBlocks.WALL_HANGING_SALTY_SIGN);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.COMPRESSED_SALT_BLOCK);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric","needs_tool_level_4")));

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.SALT_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.SALT_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.SALT_WALL);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.SALTY_LOG)
                .add(ModBlocks.SALTY_WOOD)
                .add(ModBlocks.STRIPPED_SALTY_LOG)
                .add(ModBlocks.STRIPPED_SALTY_WOOD);
    }
}

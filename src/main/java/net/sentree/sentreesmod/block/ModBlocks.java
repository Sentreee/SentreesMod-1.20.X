package net.sentree.sentreesmod.block;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.BlockFace;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.sentree.sentreesmod.SentreesMod;
import net.sentree.sentreesmod.block.custom.*;
import net.sentree.sentreesmod.world.tree.SaltySaplingGenerator;

public class ModBlocks {
    public static final Block WIENER_BLOCK = registerBlock("wienerblock",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_WART_BLOCK)));

    public static final Block COOKED_WIENER_BLOCK = registerBlock("cookedwienerblock",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_WART_BLOCK).strength(1.5f)));

    public static final Block PICKLER = registerBlock("pickler",
            new PicklerBlock(FabricBlockSettings.copyOf(Blocks.BARREL).nonOpaque()));

    public static final Block COOKINGPOT = registerBlock("cookingpot",
            new CookingPotBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).nonOpaque()
                    .requiresTool().strength(7.0f, 1200)));

    public static final Block SALTBLOCK = registerBlock("saltblock",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().strength(14.0f, 30.0f)));

    public static final Block COMPRESSED_SALT_BLOCK = registerBlock("compressedsaltblock",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).mapColor(MapColor.GRAY)
                    .requiresTool().strength(35.0f, 1000f)));

    public static final Block TOMATO_CROP = Registry.register(Registries.BLOCK, new Identifier(SentreesMod.MOD_ID, "tomatocrop"),
            new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block CUCUMBER_CROP = Registry.register(Registries.BLOCK, new Identifier(SentreesMod.MOD_ID, "cucumbercrop"),
            new CucumberCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block SALTORE = registerBlock("saltore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE)
                    .requiresTool().strength(2.0f, 2.0f), UniformIntProvider.create(2, 5)));

    public static final Block COBBLEGENBLOCK = registerBlock("cobblegenblock",
            new CobbleGenBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool().strength(2.5f, 6.5f)));

    public static final Block MUSTARD_BLOSSOMS = registerBlock("mustardblossoms",
            new FlowerBlock(StatusEffects.BLINDNESS, 10,
                    FabricBlockSettings.copyOf(Blocks.DANDELION).nonOpaque().noCollision()));

    public static final Block POTTED_MUSTARD_BLOSSOMS = registerBlock("pottedmustardblossoms",
            new FlowerPotBlock(MUSTARD_BLOSSOMS, FabricBlockSettings.copyOf(Blocks.POTTED_DANDELION).nonOpaque()));

    public static final Block SALT_STAIRS = registerBlock("saltstairs",
            new StairsBlock(ModBlocks.SALTBLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().strength(4.0f, 5.0f)));
    public static final Block SALT_SLAB = registerBlock("saltslab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().strength(4.0f, 5.0f)));

    public static final Block SALT_BUTTON = registerBlock("saltbutton",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().strength(4.0f, 5.0f), BlockSetType.IRON, 10, true));
    public static final Block SALT_PRESSURE_PLATE = registerBlock("saltpressureplate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().strength(4.0f, 5.0f), BlockSetType.IRON));

    public static final Block SALT_FENCE = registerBlock("saltfence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().strength(4.0f, 5.0f)));
    public static final Block SALT_FENCE_GATE = registerBlock("saltfencegate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().strength(4.0f, 5.0f), WoodType.OAK));
    public static final Block SALT_WALL = registerBlock("saltwall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().strength(4.0f, 5.0f)));

    public static final Block SALT_DOOR = registerBlock("saltdoor",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque().requiresTool().strength(4.0f, 5.0f), BlockSetType.OAK));
    public static final Block SALT_TRAPDOOR = registerBlock("salttrapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque().requiresTool().strength(4.0f, 5.0f), BlockSetType.OAK));

    public static final Block SALTY_LOG = registerBlock("salty_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(5f)));
    public static final Block SALTY_WOOD = registerBlock("salty_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(5f)));
    public static final Block STRIPPED_SALTY_LOG = registerBlock("stripped_salty_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(5f)));
    public static final Block STRIPPED_SALTY_WOOD = registerBlock("stripped_salty_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(5f)));

    public static final Block SALTY_PLANKS = registerBlock("salty_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));
    public static final Block SALTY_LEAVES = registerBlock("salty_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(3.5f).nonOpaque()));

    public static final Identifier SALTY_SIGN_TEXTURE = new Identifier(SentreesMod.MOD_ID, "entity/signs/salty");
    public static final Identifier SALTY_HANGING_SIGN_TEXTURE = new Identifier(SentreesMod.MOD_ID, "entity/signs/hanging/salty");
    public static final Identifier SALTY_HANGING_GUI_SIGN_TEXTURE = new Identifier(SentreesMod.MOD_ID, "textures/gui/hanging_signs/salty");

    public static final Block STANDING_SALTY_SIGN = Registry.register(Registries.BLOCK, new Identifier(SentreesMod.MOD_ID, "salty_standing_sign"),
            new TerraformSignBlock(SALTY_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN).sounds(BlockSoundGroup.STONE)));

    public static final Block WALL_SALTY_SIGN = Registry.register(Registries.BLOCK, new Identifier(SentreesMod.MOD_ID, "salty_wall_sign"),
            new TerraformWallSignBlock(SALTY_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN).sounds(BlockSoundGroup.STONE)));

    public static final Block HANGING_SALTY_SIGN = Registry.register(Registries.BLOCK, new Identifier(SentreesMod.MOD_ID, "salty_hanging_sign"),
            new TerraformHangingSignBlock(SALTY_HANGING_SIGN_TEXTURE, SALTY_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN).sounds(BlockSoundGroup.STONE)));

    public static final Block WALL_HANGING_SALTY_SIGN = Registry.register(Registries.BLOCK, new Identifier(SentreesMod.MOD_ID, "salty_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(SALTY_HANGING_SIGN_TEXTURE, SALTY_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN).sounds(BlockSoundGroup.STONE)));

    public static final BlockFamily SALTY_FAMILY = BlockFamilies.register(ModBlocks.SALTY_PLANKS)
            .sign(ModBlocks.STANDING_SALTY_SIGN, ModBlocks.WALL_SALTY_SIGN)
            .group("stone").unlockCriterionName("has_planks").build();

    public static final Block DICE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(SentreesMod.MOD_ID, "dice_block"),
            new DiceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block SALTY_SAPLING = registerBlock("salty_sapling",
            new SaplingBlock(new SaltySaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SentreesMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(SentreesMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        SentreesMod.LOGGER.info("Registering Mod Blocks " + SentreesMod.MOD_ID);
    }
}

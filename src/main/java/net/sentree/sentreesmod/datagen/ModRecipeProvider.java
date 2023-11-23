package net.sentree.sentreesmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.sentree.sentreesmod.block.ModBlocks;
import net.sentree.sentreesmod.entity.ModEntities;
import net.sentree.sentreesmod.item.ModItems;
import net.sentree.sentreesmod.util.ModTags;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static List<ItemConvertible> SALT_SMELTABLES = List.of(ModItems.SALTCHUNK,
            ModBlocks.SALTORE);

    private static List<ItemConvertible> WIENER = List.of(ModItems.WIENER);

    private static List<ItemConvertible> WIENER_BLOCK = List.of(ModBlocks.WIENER_BLOCK);

    private static List<ItemConvertible> HOTDOG = List.of(ModItems.HOTDOGBUN, ModItems.COOKEDWIENER);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, WIENER, RecipeCategory.MISC, ModItems.COOKEDWIENER,
                0.35f,200,"cookedwiener");

        offerSmelting(exporter, WIENER_BLOCK, RecipeCategory.MISC, ModBlocks.COOKED_WIENER_BLOCK,
                0.35f,200,"cookedwienerblock");

        offerSmelting(exporter, SALT_SMELTABLES, RecipeCategory.MISC, ModItems.REFINEDSALT,
                0.7f,200, "refinedsalt");

        offerBlasting(exporter, SALT_SMELTABLES, RecipeCategory.MISC, ModItems.REFINEDSALT,
                0.7f,100, "refinedsalt");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.REFINEDSALT, RecipeCategory.DECORATIONS,
                ModBlocks.SALTBLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.COOKEDWIENER, RecipeCategory.DECORATIONS,
                ModBlocks.COOKED_WIENER_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.WIENER, RecipeCategory.DECORATIONS,
                ModBlocks.WIENER_BLOCK);

        createDoorRecipe(ModBlocks.SALT_DOOR, Ingredient.ofItems(ModBlocks.SALTBLOCK))
                .criterion(hasItem(ModBlocks.SALTBLOCK), conditionsFromItem(ModBlocks.SALTBLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SALT_DOOR)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_SLAB, ModBlocks.SALTBLOCK);

        createStairsRecipe(ModBlocks.SALT_STAIRS, Ingredient.ofItems(ModBlocks.SALTBLOCK))
                .criterion(hasItem(ModBlocks.SALTBLOCK), conditionsFromItem(ModBlocks.SALTBLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SALT_STAIRS)));;

        offerPressurePlateRecipe(exporter, ModBlocks.SALT_PRESSURE_PLATE, ModBlocks.SALTBLOCK);

        createTrapdoorRecipe(ModBlocks.SALT_TRAPDOOR, Ingredient.ofItems(ModBlocks.SALTBLOCK))
                .criterion(hasItem(ModBlocks.SALTBLOCK), conditionsFromItem(ModBlocks.SALTBLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SALT_TRAPDOOR)));

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_WALL, ModBlocks.SALTBLOCK);

        createFenceGateRecipe(ModBlocks.SALT_FENCE_GATE, Ingredient.ofItems(ModBlocks.SALTBLOCK))
                .criterion(hasItem(ModBlocks.SALTBLOCK), conditionsFromItem(ModBlocks.SALTBLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SALT_FENCE_GATE)));

        createFenceRecipe(ModBlocks.SALT_FENCE, Ingredient.ofItems(ModBlocks.SALTBLOCK))
                .criterion(hasItem(ModBlocks.SALTBLOCK), conditionsFromItem(ModBlocks.SALTBLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SALT_FENCE)));

        offerShapelessRecipe(exporter, ModItems.DICE, Items.QUARTZ_BLOCK, "dice", 1);

        offerShapelessRecipe(exporter, ModBlocks.SALT_BUTTON, ModBlocks.SALTBLOCK, "saltbutton", 1);

        offerShapelessRecipe(exporter, ModItems.TOMATO_SEEDS, ModItems.TOMATO, "tomatoseeds", 4);
        offerShapelessRecipe(exporter, ModItems.CUCUMBER_SEEDS, ModItems.CUCUMBER, "cucumberseeds", 4);

        offerShapelessRecipe(exporter, ModItems.MUSTARDSEEDS, ModBlocks.MUSTARD_BLOSSOMS, "mustardseeds", 4);

        offerShapelessRecipe(exporter, ModBlocks.SALTY_PLANKS, ModBlocks.SALTY_LOG, "salty_planks", 4);
        offerShapelessRecipe(exporter, ModBlocks.SALTY_PLANKS, ModBlocks.STRIPPED_SALTY_LOG, "salty_planks", 4);
        offerShapelessRecipe(exporter, ModBlocks.SALTY_PLANKS, ModBlocks.SALTY_WOOD, "salty_planks", 4);
        offerShapelessRecipe(exporter, ModBlocks.SALTY_PLANKS, ModBlocks.STRIPPED_SALTY_WOOD, "salty_planks", 4);

        offerShapelessRecipe(exporter, ModItems.WIENER, Items.BEEF, "wiener", 1);
        offerShapelessRecipe(exporter, ModItems.WIENER, Items.CHICKEN, "wiener", 1);
        offerShapelessRecipe(exporter, ModItems.WIENER, Items.PORKCHOP, "wiener", 1);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HOTDOGBUN, 3)
                .pattern("WWW")
                .pattern("   ")
                .pattern("WWW")
                .input('W', Items.WHEAT)
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HOTDOGBUN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HOTDOG, 1)
                .pattern("C")
                .pattern("H")
                .input('C', ModItems.COOKEDWIENER)
                .input('H', ModItems.HOTDOGBUN)
                .criterion(hasItem(ModItems.COOKEDWIENER), conditionsFromItem(ModItems.COOKEDWIENER))
                .criterion(hasItem(ModItems.HOTDOGBUN), conditionsFromItem(ModItems.HOTDOGBUN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HOTDOG)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.COBBLEGENBLOCK, 1)
                .pattern("CCC")
                .pattern("WGL")
                .pattern("CCC")
                .input('W', Items.WATER_BUCKET)
                .input('G', Items.GLASS)
                .input('L', Items.LAVA_BUCKET)
                .input('C', Items.COBBLESTONE)
                .criterion(hasItem(Items.LAVA_BUCKET), conditionsFromItem(Items.LAVA_BUCKET))
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.COBBLEGENBLOCK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.COOKINGPOT, 1)
                .pattern("S S")
                .pattern("SNS")
                .pattern("SBS")
                .input('S', Items.STICK)
                .input('N', Blocks.NETHERITE_BLOCK)
                .input('B', Items.BLAZE_ROD)
                .criterion(hasItem(Items.NETHERITE_BLOCK), conditionsFromItem(Items.NETHERITE_BLOCK))
                .criterion(hasItem(Items.BLAZE_ROD), conditionsFromItem(Items.BLAZE_ROD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.COOKINGPOT)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.METALDETECTOR, 1)
                .pattern(" CI")
                .pattern(" SC")
                .pattern("S  ")
                .input('S', Items.STICK)
                .input('I', Blocks.IRON_BLOCK)
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Blocks.IRON_BLOCK), conditionsFromItem(Blocks.IRON_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.METALDETECTOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PICKLER, 1)
                .pattern("P P")
                .pattern("PCP")
                .pattern("PPP")
                .input('P', ModTags.Items.PLANKS)
                .input('C', ModItems.CUCUMBER)
                .criterion(hasItem(ModItems.CUCUMBER), conditionsFromItem(ModItems.CUCUMBER))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PICKLER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RADCOAL, 4)
                .pattern("SSS")
                .pattern("SCS")
                .pattern("SSS")
                .input('S', Items.FERMENTED_SPIDER_EYE)
                .input('C', Items.COAL)
                .criterion(hasItem(Items.FERMENTED_SPIDER_EYE), conditionsFromItem(Items.FERMENTED_SPIDER_EYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RADCOAL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SALT_STAFF, 1)
                .pattern("B")
                .pattern("S")
                .pattern("S")
                .input('S', Items.STICK)
                .input('B', ModBlocks.SALTBLOCK)
                .criterion(hasItem(ModBlocks.SALTBLOCK), conditionsFromItem(ModBlocks.SALTBLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SALT_STAFF)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SALT_SWORD, 1)
                .pattern("S")
                .pattern("S")
                .pattern("^")
                .input('S', ModBlocks.COMPRESSED_SALT_BLOCK)
                .input('^', Items.STICK)
                .criterion(hasItem(ModBlocks.COMPRESSED_SALT_BLOCK), conditionsFromItem(ModBlocks.COMPRESSED_SALT_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SALT_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SALT_SHOVEL, 1)
                .pattern("S")
                .pattern("^")
                .pattern("^")
                .input('S', ModBlocks.COMPRESSED_SALT_BLOCK)
                .input('^', Items.STICK)
                .criterion(hasItem(ModBlocks.COMPRESSED_SALT_BLOCK), conditionsFromItem(ModBlocks.COMPRESSED_SALT_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SALT_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SALT_HOE, 1)
                .pattern("SS")
                .pattern("^ ")
                .pattern("^ ")
                .input('S', ModBlocks.COMPRESSED_SALT_BLOCK)
                .input('^', Items.STICK)
                .criterion(hasItem(ModBlocks.COMPRESSED_SALT_BLOCK), conditionsFromItem(ModBlocks.COMPRESSED_SALT_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SALT_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SALT_PICKAXE, 1)
                .pattern("SSS")
                .pattern(" ^ ")
                .pattern(" ^ ")
                .input('S', ModBlocks.COMPRESSED_SALT_BLOCK)
                .input('^', Items.STICK)
                .criterion(hasItem(ModBlocks.COMPRESSED_SALT_BLOCK), conditionsFromItem(ModBlocks.COMPRESSED_SALT_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SALT_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SALT_AXE, 1)
                .pattern("SS")
                .pattern("^S")
                .pattern("^ ")
                .input('S', ModBlocks.COMPRESSED_SALT_BLOCK)
                .input('^', Items.STICK)
                .criterion(hasItem(ModBlocks.COMPRESSED_SALT_BLOCK), conditionsFromItem(ModBlocks.COMPRESSED_SALT_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SALT_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_SALT_BLOCK, 1)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModBlocks.SALTBLOCK)
                .criterion(hasItem(ModBlocks.SALTBLOCK), conditionsFromItem(ModBlocks.SALTBLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.COMPRESSED_SALT_BLOCK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SALT_HELMET, 1)
                .pattern("SSS")
                .pattern("S S")
                .input('S', ModBlocks.COMPRESSED_SALT_BLOCK)
                .criterion(hasItem(ModBlocks.COMPRESSED_SALT_BLOCK), conditionsFromItem(ModBlocks.COMPRESSED_SALT_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SALT_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SALT_CHESTPLATE, 1)
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModBlocks.COMPRESSED_SALT_BLOCK)
                .criterion(hasItem(ModBlocks.COMPRESSED_SALT_BLOCK), conditionsFromItem(ModBlocks.COMPRESSED_SALT_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SALT_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SALT_LEGGINGS, 1)
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .input('S', ModBlocks.COMPRESSED_SALT_BLOCK)
                .criterion(hasItem(ModBlocks.COMPRESSED_SALT_BLOCK), conditionsFromItem(ModBlocks.COMPRESSED_SALT_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SALT_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SALT_BOOTS, 1)
                .pattern("S S")
                .pattern("S S")
                .input('S', ModBlocks.COMPRESSED_SALT_BLOCK)
                .criterion(hasItem(ModBlocks.COMPRESSED_SALT_BLOCK), conditionsFromItem(ModBlocks.COMPRESSED_SALT_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SALT_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COTTONWOOD_ALBUM, 1)
                .pattern("GGG")
                .pattern("DDD")
                .pattern("AAA")
                .input('G', Blocks.GOLD_BLOCK)
                .input('D', Blocks.COBBLED_DEEPSLATE)
                .input('A', Blocks.AMETHYST_BLOCK)
                .criterion(hasItem(Blocks.GOLD_BLOCK), conditionsFromItem(Blocks.GOLD_BLOCK))
                .criterion(hasItem(Blocks.AMETHYST_BLOCK), conditionsFromItem(Blocks.AMETHYST_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COTTONWOOD_ALBUM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RELISH, 1)
                .pattern("PPP")
                .pattern(" B ")
                .input('P', ModItems.PICKLE)
                .input('B', Items.BUCKET)
                .criterion(hasItem(ModItems.COOKEDWIENER), conditionsFromItem(ModItems.COOKEDWIENER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RELISH)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.KETCHUP, 1)
                .pattern("TTT")
                .pattern(" B ")
                .input('T', ModItems.TOMATO)
                .input('B', Items.BUCKET)
                .criterion(hasItem(ModItems.TOMATO), conditionsFromItem(ModItems.TOMATO))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.KETCHUP)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSTARD, 1)
                .pattern("MMM")
                .pattern(" B ")
                .input('M', ModItems.MUSTARDSEEDS)
                .input('B', Items.BUCKET)
                .criterion(hasItem(ModItems.MUSTARDSEEDS), conditionsFromItem(ModItems.MUSTARDSEEDS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MUSTARD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STANDING_SALTY_SIGN, 6)
                .pattern("SSS")
                .pattern("SSS")
                .pattern(" T ")
                .input('S', ModBlocks.SALTY_PLANKS)
                .input('T', Items.STICK)
                .criterion(hasItem(ModBlocks.SALTY_PLANKS), conditionsFromItem(ModBlocks.SALTY_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STANDING_SALTY_SIGN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HANGING_SALTY_SIGN, 6)
                .pattern("C C")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModBlocks.STRIPPED_SALTY_LOG)
                .input('C', Items.CHAIN)
                .criterion(hasItem(ModBlocks.STRIPPED_SALTY_LOG), conditionsFromItem(ModBlocks.STRIPPED_SALTY_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.HANGING_SALTY_SIGN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, ModItems.SALTY_BOAT, 1)
                .pattern("S S")
                .pattern("SSS")
                .input('S', ModBlocks.SALTY_PLANKS)
                .criterion(hasItem(ModBlocks.SALTY_PLANKS), conditionsFromItem(ModBlocks.SALTY_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SALTY_BOAT)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, ModItems.SALTY_CHEST_BOAT, 1)
                .pattern("C")
                .pattern("B")
                .input('C', Items.CHEST)
                .input('B', ModItems.SALTY_BOAT)
                .criterion(hasItem(ModItems.SALTY_BOAT), conditionsFromItem(ModItems.SALTY_BOAT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SALTY_CHEST_BOAT)));
    }
}

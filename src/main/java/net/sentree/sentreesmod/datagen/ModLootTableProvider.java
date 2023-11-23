package net.sentree.sentreesmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.AnyOfLootCondition;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.sentree.sentreesmod.block.ModBlocks;
import net.sentree.sentreesmod.block.custom.CucumberCropBlock;
import net.sentree.sentreesmod.block.custom.TomatoCropBlock;
import net.sentree.sentreesmod.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SALTBLOCK);
        addDrop(ModBlocks.COBBLEGENBLOCK);
        addDrop(ModBlocks.COOKINGPOT);
        addDrop(ModBlocks.COOKED_WIENER_BLOCK);
        addDrop(ModBlocks.PICKLER);
        addDrop(ModBlocks.WIENER_BLOCK);
        addDrop(ModBlocks.COMPRESSED_SALT_BLOCK);

        addDrop(ModBlocks.STANDING_SALTY_SIGN);
        addDrop(ModBlocks.HANGING_SALTY_SIGN);
        addDrop(ModBlocks.WALL_HANGING_SALTY_SIGN);
        addDrop(ModBlocks.WALL_SALTY_SIGN);

        addDrop(ModBlocks.DICE_BLOCK, ModItems.DICE);

        addDrop(ModBlocks.SALTORE, copperLikeOreDrops(ModBlocks.SALTORE, ModItems.SALTCHUNK));

        addDrop(ModBlocks.SALT_STAIRS);
        addDrop(ModBlocks.SALT_TRAPDOOR);
        addDrop(ModBlocks.SALT_WALL);
        addDrop(ModBlocks.SALT_FENCE);
        addDrop(ModBlocks.SALT_FENCE_GATE);
        addDrop(ModBlocks.SALT_BUTTON);
        addDrop(ModBlocks.SALT_PRESSURE_PLATE);

        addDrop(ModBlocks.SALT_DOOR, doorDrops(ModBlocks.SALT_DOOR));
        addDrop(ModBlocks.SALT_SLAB, slabDrops(ModBlocks.SALT_SLAB));

        addDrop(ModBlocks.SALTY_LOG);
        addDrop(ModBlocks.SALTY_WOOD);
        addDrop(ModBlocks.STRIPPED_SALTY_LOG);
        addDrop(ModBlocks.STRIPPED_SALTY_WOOD);
        addDrop(ModBlocks.SALTY_PLANKS);
        addDrop(ModBlocks.SALTY_SAPLING);

        addDrop(ModBlocks.SALTY_LEAVES, leavesDrops(ModBlocks.SALTY_LEAVES, ModBlocks.SALTY_SAPLING, 0.005f));

        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.TOMATO_CROP).properties(StatePredicate.Builder.create()
               .exactMatch(TomatoCropBlock.AGE, 5));
        addDrop(ModBlocks.TOMATO_CROP, cropDrops(ModBlocks.TOMATO_CROP, ModItems.TOMATO, ModItems.TOMATO_SEEDS, builder));

        //AnyOfLootCondition.Builder builder2 =
        //        BlockStatePropertyLootCondition.builder(ModBlocks.CUCUMBER_CROP).properties(StatePredicate.Builder.create()
        //                        .exactMatch(CucumberCropBlock.AGE, 7))
        //                .or(BlockStatePropertyLootCondition.builder(ModBlocks.CUCUMBER_CROP).properties(StatePredicate.Builder.create()
        //                        .exactMatch(CucumberCropBlock.AGE, 8)));

        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.CUCUMBER_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(CucumberCropBlock.AGE, 8));
        addDrop(ModBlocks.CUCUMBER_CROP, cropDrops(ModBlocks.CUCUMBER_CROP, ModItems.CUCUMBER, ModItems.CUCUMBER_SEEDS, builder2));

        addDrop(ModBlocks.MUSTARD_BLOSSOMS);
        addPottedPlantDrops(ModBlocks.POTTED_MUSTARD_BLOSSOMS);
    }


    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.
                                        builder(UniformLootNumberProvider
                                                .create(2.0f, 5.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}

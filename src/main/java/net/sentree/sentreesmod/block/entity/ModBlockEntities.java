package net.sentree.sentreesmod.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sentree.sentreesmod.SentreesMod;
import net.sentree.sentreesmod.block.ModBlocks;

public class ModBlockEntities {
    public static final BlockEntityType<PicklerBlockEntity> PICKLER_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(SentreesMod.MOD_ID, "pickler_be"),
                    FabricBlockEntityTypeBuilder.create(PicklerBlockEntity::new,
                            ModBlocks.PICKLER).build());

    public static final BlockEntityType<CookingPotBlockEntity> COOKING_POT_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(SentreesMod.MOD_ID, "cooking_pot_be"),
                    FabricBlockEntityTypeBuilder.create(CookingPotBlockEntity::new,
                            ModBlocks.COOKINGPOT).build());

    public static void registerBlockEntities() {
        SentreesMod.LOGGER.info("Registering Block Entities for " + SentreesMod.MOD_ID);
    }
}

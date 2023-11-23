package net.sentree.sentreesmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.sentree.sentreesmod.block.ModBlocks;
import net.sentree.sentreesmod.block.entity.ModBlockEntities;
import net.sentree.sentreesmod.entity.ModBoats;
import net.sentree.sentreesmod.entity.ModEntities;
import net.sentree.sentreesmod.entity.custom.PorcupineEntity;
import net.sentree.sentreesmod.item.ModItemGroups;
import net.sentree.sentreesmod.item.ModItems;
import net.sentree.sentreesmod.recipe.ModRecipes;
import net.sentree.sentreesmod.screen.ModScreenHandlers;
import net.sentree.sentreesmod.sound.ModSoundsClass;
import net.sentree.sentreesmod.util.ModLootTableModifiers;
import net.sentree.sentreesmod.world.biome.ModBiomes;
import net.sentree.sentreesmod.world.biome.ModTerrablenderAPI;
import net.sentree.sentreesmod.world.gen.ModWorldGeneration;
import net.sentree.sentreesmod.world.tree.ModTrunkPlacerTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SentreesMod implements ModInitializer {
	public static final String MOD_ID = "sentreesmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModSoundsClass.registerSounds();

		ModLootTableModifiers.modifyLootTables();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();

		ModRecipes.registerRecipes();
		ModTrunkPlacerTypes.register();

		ModBoats.registerBoats();

		FuelRegistry.INSTANCE.add(ModItems.RADCOAL, 25000);

		FabricDefaultAttributeRegistry.register(ModEntities.PORCUPINE, PorcupineEntity.createPorcupineAttributes());

		StrippableBlockRegistry.register(ModBlocks.SALTY_LOG, ModBlocks.STRIPPED_SALTY_LOG);
		StrippableBlockRegistry.register(ModBlocks.SALTY_WOOD, ModBlocks.STRIPPED_SALTY_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SALTY_LOG,5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SALTY_WOOD,5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_SALTY_LOG,5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_SALTY_WOOD,5, 5);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SALTY_PLANKS,5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SALTY_LEAVES,30, 60);

		ModWorldGeneration.generateModWorldGen();
	}
}
package net.sentree.sentreesmod.entity;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.sentree.sentreesmod.SentreesMod;
import net.sentree.sentreesmod.block.ModBlocks;
import net.sentree.sentreesmod.item.ModItems;

public class ModBoats {
    public static final Identifier SALTY_BOAT_ID = new Identifier(SentreesMod.MOD_ID, "salty_boat");
    public static final Identifier SALTY_CHEST_BOAT_ID = new Identifier(SentreesMod.MOD_ID, "salty_chest_boat");

    public static final RegistryKey<TerraformBoatType> SALTY_BOAT_KEY = TerraformBoatTypeRegistry.createKey(SALTY_BOAT_ID);

    public static void registerBoats() {
        TerraformBoatType chestnutBoat = new TerraformBoatType.Builder()
                .item(ModItems.SALTY_BOAT)
                .chestItem(ModItems.SALTY_CHEST_BOAT)
                .planks(ModBlocks.SALTY_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, SALTY_BOAT_KEY, chestnutBoat);
    }

}

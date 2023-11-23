package net.sentree.sentreesmod.recipe;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sentree.sentreesmod.SentreesMod;

public class ModRecipes {
    public static void  registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(SentreesMod.MOD_ID, CookingPotRecipe.Serializer.ID),
                CookingPotRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(SentreesMod.MOD_ID, CookingPotRecipe.Type.ID),
                CookingPotRecipe.Type.INSTANCE);

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(SentreesMod.MOD_ID, PicklerRecipe.Serializer.ID),
                PicklerRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(SentreesMod.MOD_ID, PicklerRecipe.Type.ID),
                PicklerRecipe.Type.INSTANCE);
    }
}

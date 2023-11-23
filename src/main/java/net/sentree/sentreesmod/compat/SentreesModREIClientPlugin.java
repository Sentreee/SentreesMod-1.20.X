package net.sentree.sentreesmod.compat;

import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.sentree.sentreesmod.block.ModBlocks;
import net.sentree.sentreesmod.recipe.CookingPotRecipe;
import net.sentree.sentreesmod.recipe.PicklerRecipe;
import net.sentree.sentreesmod.screen.CookingPotScreen;

public class SentreesModREIClientPlugin implements REIClientPlugin {
    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(new CookingPotCategory());
        registry.add(new PicklerCategory());

        registry.addWorkstations(CookingPotCategory.COOKING, EntryStacks.of(ModBlocks.COOKINGPOT));
        registry.addWorkstations(PicklerCategory.PICKLING, EntryStacks.of(ModBlocks.PICKLER));
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerRecipeFiller(CookingPotRecipe.class, CookingPotRecipe.Type.INSTANCE,
                CookingPotDisplay::new);

        registry.registerRecipeFiller(PicklerRecipe.class, PicklerRecipe.Type.INSTANCE,
                PicklerDisplay::new);
    }

    @Override
    public void registerScreens(ScreenRegistry registry) {
        registry.registerClickArea(screen -> new Rectangle(75, 30, 20, 30), CookingPotScreen.class,
                CookingPotCategory.COOKING);
    }
}
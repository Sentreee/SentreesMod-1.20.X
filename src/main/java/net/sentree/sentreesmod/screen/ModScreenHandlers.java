package net.sentree.sentreesmod.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.sentree.sentreesmod.SentreesMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.sentree.sentreesmod.block.entity.CookingPotBlockEntity;

public class ModScreenHandlers {
    public static final ScreenHandlerType<PicklerScreenHandler> PICKLER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(SentreesMod.MOD_ID, "pickler"),
                    new ExtendedScreenHandlerType<>(PicklerScreenHandler::new));

    public static final ScreenHandlerType<CookingPotScreenHandler> COOKING_POT_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(SentreesMod.MOD_ID, "cooking_pot"),
                    new ExtendedScreenHandlerType<>(CookingPotScreenHandler::new));

    public static void registerScreenHandlers() {
        SentreesMod.LOGGER.info("Registering Screen Handlers for " + SentreesMod.MOD_ID);
    }
}
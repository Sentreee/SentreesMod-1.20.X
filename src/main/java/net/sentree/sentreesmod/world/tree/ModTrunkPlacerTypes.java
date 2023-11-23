package net.sentree.sentreesmod.world.tree;

import net.sentree.sentreesmod.SentreesMod;
import net.sentree.sentreesmod.mixin.TrunkPlacerTypeInvoker;
import net.sentree.sentreesmod.world.tree.custom.SaltyTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class ModTrunkPlacerTypes {
    public static final TrunkPlacerType<?> SALTY_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("salty_trunk_placer", SaltyTrunkPlacer.CODEC);

    public static void register() {
        SentreesMod.LOGGER.info("Registering Trunk Placers for " + SentreesMod.MOD_ID);
    }
}

package net.sentree.sentreesmod.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.sentree.sentreesmod.SentreesMod;

public class ModSoundsClass {
    public static final SoundEvent METAL_DETECTOR_FOUND_ORE = registerSoundEvent("metaldetectorfoundore");

    public static final SoundEvent CMON_FREESTYLE = registerSoundEvent("cmonfreestyle");
    public static final SoundEvent DO_IT_AGAIN = registerSoundEvent("doitagain");
    public static final SoundEvent CHAMPIONS = registerSoundEvent("champions");
    public static final SoundEvent DOPE = registerSoundEvent("dope");



    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(SentreesMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));

    }

    public static void registerSounds() {
        SentreesMod.LOGGER.info("Registering Sounds for " + SentreesMod.MOD_ID);
    }
}

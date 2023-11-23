package net.sentree.sentreesmod.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.sentree.sentreesmod.SentreesMod;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> METAl_DETECTOR_DETECTABLE_BLOCKS =
                createTag("metaldetectordetectableblocks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(SentreesMod.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> PLANKS =
                createTag("planks");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(SentreesMod.MOD_ID, name));
        }
    }

}

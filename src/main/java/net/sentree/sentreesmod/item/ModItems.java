package net.sentree.sentreesmod.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sentree.sentreesmod.SentreesMod;
import net.sentree.sentreesmod.block.ModBlocks;
import net.sentree.sentreesmod.entity.ModBoats;
import net.sentree.sentreesmod.entity.ModEntities;
import net.sentree.sentreesmod.item.custom.CottonWoodAlbumItem;
import net.sentree.sentreesmod.item.custom.DiceItem;
import net.sentree.sentreesmod.item.custom.MetalDetectorItem;
import net.sentree.sentreesmod.item.custom.ModArmorItem;
import net.sentree.sentreesmod.sound.ModSoundsClass;

public class ModItems {

    //Food
    public static final Item HOTDOG = registerItem("hotdog", new Item(new FabricItemSettings().food(ModFoodComponents.HOTDOG)));
    public static final Item WIENER = registerItem("wiener", new Item(new FabricItemSettings().food(ModFoodComponents.WIENER)));
    public static final Item COOKEDWIENER = registerItem("cookedwiener", new Item(new FabricItemSettings().food(ModFoodComponents.COOKEDWIENER)));
    public static final Item HOTDOGBUN = registerItem("hdbun", new Item(new FabricItemSettings().food(ModFoodComponents.HOTDOGBUN)));
    public static final Item LOADEDHOTDOG = registerItem("loadedhotdog", new Item(new FabricItemSettings().food(ModFoodComponents.LOADEDHOTDOG)));

    //Condiments
    public static final Item KETCHUP = registerItem("ketchup", new Item(new FabricItemSettings().food(ModFoodComponents.KETCHUP)));
    public static final Item RELISH = registerItem("relish", new Item(new FabricItemSettings().food(ModFoodComponents.RELISH)));
    public static final Item MUSTARD = registerItem("mustard", new Item(new FabricItemSettings().food(ModFoodComponents.MUSTARD)));

    //Ingredients
    public static final Item PICKLE = registerItem("pickle", new Item(new FabricItemSettings().food(ModFoodComponents.PICKLE)));
    public static final Item CUCUMBER = registerItem("cucumber", new Item(new FabricItemSettings().food(ModFoodComponents.CUCUMBER)));
    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item MUSTARDSEEDS = registerItem("mustardseeds", new Item(new FabricItemSettings()));

    public static final Item TOMATO_SEEDS = registerItem("tomatoseeds",
            new AliasedBlockItem(ModBlocks.TOMATO_CROP, new FabricItemSettings()));

    public static final Item CUCUMBER_SEEDS = registerItem("cucumberseeds",
            new AliasedBlockItem(ModBlocks.CUCUMBER_CROP, new FabricItemSettings()));

    //Minerals
    public static final Item REFINEDSALT = registerItem("refinedsalt", new Item(new FabricItemSettings()));
    public static final Item SALTCHUNK = registerItem("saltchunk", new Item(new FabricItemSettings()));

    //Advanced
    public static final Item METALDETECTOR = registerItem("metaldetector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(100)));

    public static final Item DICE = registerItem("dice", new DiceItem(new FabricItemSettings()));

    public static final Item COTTONWOOD_ALBUM = registerItem("cottonwood_album", new CottonWoodAlbumItem(new FabricItemSettings()));

    //Fuel
    public static final Item RADCOAL = registerItem("radcoal", new Item(new FabricItemSettings()));

    //3D Items
    public static final Item SALT_STAFF = registerItem("saltstaff",
            new Item(new FabricItemSettings().maxCount(1)));

    //Tools
    public static final Item SALT_SWORD = registerItem("saltsword",
            new SwordItem(ModToolMaterial.SALT,7, -2.4f,
                    new FabricItemSettings().maxCount(1)));

    public static final Item SALT_HOE = registerItem("salthoe",
            new HoeItem(ModToolMaterial.SALT,1,0.0f,
                    new FabricItemSettings().maxCount(1)));

    public static final Item SALT_SHOVEL = registerItem("saltshovel",
            new ShovelItem(ModToolMaterial.SALT,5.5f,-3f,
                    new FabricItemSettings().maxCount(1)));

    public static final Item SALT_PICKAXE = registerItem("saltpickaxe",
            new PickaxeItem(ModToolMaterial.SALT,5,-2.8f,
                    new FabricItemSettings().maxCount(1)));

    public static final Item SALT_AXE = registerItem("saltaxe",
            new AxeItem(ModToolMaterial.SALT,9, -3f,
                    new FabricItemSettings().maxCount(1)));

    //Armor
    public static final Item SALT_HELMET = registerItem("salthelmet",
            new ModArmorItem(ModArmorMaterials.SALT, ArmorItem.Type.HELMET,
                    new FabricItemSettings().maxCount(1)));

    public static final Item SALT_CHESTPLATE = registerItem("saltchestplate",
            new ArmorItem(ModArmorMaterials.SALT, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings().maxCount(1)));

    public static final Item SALT_LEGGINGS = registerItem("saltleggings",
            new ArmorItem(ModArmorMaterials.SALT, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings().maxCount(1)));

    public static final Item SALT_BOOTS = registerItem("saltboots",
            new ArmorItem(ModArmorMaterials.SALT, ArmorItem.Type.BOOTS,
                    new FabricItemSettings().maxCount(1)));

    //Music Disc
    public static final Item CMONFREESTYLE_MUSIC_DISC = registerItem("cmonfreestyle_music_disc",
            new MusicDiscItem(7, ModSoundsClass.CMON_FREESTYLE, new FabricItemSettings().maxCount(1),160));
    public static final Item DO_IT_AGAIN_MUSIC_DISC = registerItem("do_it_again_music_disc",
            new MusicDiscItem(7, ModSoundsClass.DO_IT_AGAIN, new FabricItemSettings().maxCount(1),230));
    public static final Item CHAMPIONS_MUSIC_DISC = registerItem("champions_music_disc",
            new MusicDiscItem(7, ModSoundsClass.CHAMPIONS, new FabricItemSettings().maxCount(1),260));
    public static final Item DOPE_MUSIC_DISC = registerItem("dope_music_disc",
            new MusicDiscItem(7, ModSoundsClass.DOPE, new FabricItemSettings().maxCount(1),180));


    public static final Item PORCUPINE_SPAWN_EGG = registerItem("porcupine_spawn_egg",
            new SpawnEggItem(ModEntities.PORCUPINE, 0xa86518, 0x3b260f, new FabricItemSettings()));

    //Signs
    public static final Item SALTY_SIGN = registerItem("salty_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_SALTY_SIGN, ModBlocks.WALL_SALTY_SIGN));

    public static final Item HANGING_SALTY_SIGN = registerItem("salty_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_SALTY_SIGN, ModBlocks.WALL_HANGING_SALTY_SIGN, new FabricItemSettings().maxCount(16)));

    //Boats
    public static final Item SALTY_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.SALTY_BOAT_ID, ModBoats.SALTY_BOAT_KEY, false);
    public static final Item SALTY_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.SALTY_CHEST_BOAT_ID, ModBoats.SALTY_BOAT_KEY, true);



    private static void addItemsToFoodAndDrinkItemGroup(FabricItemGroupEntries entries) {
        entries.add(HOTDOG);
        entries.add(WIENER);
        entries.add(HOTDOGBUN);
        entries.add(COOKEDWIENER);
        entries.add(LOADEDHOTDOG);

        entries.add(KETCHUP);
        entries.add(RELISH);
        entries.add(MUSTARD);

        entries.add(PICKLE);
        entries.add(CUCUMBER);
        entries.add(TOMATO);
        entries.add(MUSTARDSEEDS);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SentreesMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SentreesMod.LOGGER.info("Registering Mod Items for " + SentreesMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodAndDrinkItemGroup);
    }
}

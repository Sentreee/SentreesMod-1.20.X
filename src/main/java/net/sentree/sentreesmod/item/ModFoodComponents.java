package net.sentree.sentreesmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent HOTDOG = new FoodComponent.Builder().hunger(9).saturationModifier(0.95f).meat().build();
    public static final FoodComponent WIENER = new FoodComponent.Builder().hunger(2).saturationModifier(0.35f).meat().build();
    public static final FoodComponent COOKEDWIENER = new FoodComponent.Builder().hunger(6).saturationModifier(0.75f).meat().build();
    public static final FoodComponent HOTDOGBUN = new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).build();
    public static final FoodComponent LOADEDHOTDOG = new FoodComponent.Builder().hunger(14).saturationModifier(1.35f).alwaysEdible().meat()
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,600, 5), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,600, 3), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH,1, 10), 1f).build();

    public static final FoodComponent KETCHUP = new FoodComponent.Builder().hunger(1).saturationModifier(0.25f).snack().build();
    public static final FoodComponent RELISH = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).snack().build();
    public static final FoodComponent MUSTARD = new FoodComponent.Builder().hunger(1).saturationModifier(0.25f).snack().build();

    public static final FoodComponent PICKLE = new FoodComponent.Builder().hunger(6).saturationModifier(0.85f).build();
    public static final FoodComponent CUCUMBER = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build();
    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(3).saturationModifier(0.55f).build();

}

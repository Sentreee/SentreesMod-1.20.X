package net.sentree.sentreesmod.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.sentree.sentreesmod.item.ModItems;

public class CottonWoodAlbumItem extends Item {
    public CottonWoodAlbumItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound(null, user.getX(), user.getY(), user.getZ(),
                SoundEvents.BLOCK_CHEST_OPEN, SoundCategory.NEUTRAL, 0.5f, 0.4f / (world.getRandom().nextFloat() * 0.4f + 0.8f));

        if (!world.isClient) {
            user.giveItemStack(new ItemStack(ModItems.CMONFREESTYLE_MUSIC_DISC,1));
            user.giveItemStack(new ItemStack(ModItems.DO_IT_AGAIN_MUSIC_DISC,1));
            user.giveItemStack(new ItemStack(ModItems.CHAMPIONS_MUSIC_DISC,1));
            user.giveItemStack(new ItemStack(ModItems.DOPE_MUSIC_DISC,1));


        }

        user.incrementStat(Stats.USED.getOrCreateStat(this));
        if (!user.getAbilities().creativeMode) {
            itemStack.decrement(1);
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }
}

package net.sentree.sentreesmod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CobbleGenBlock extends Block {
    public CobbleGenBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(!world.isClient()) {
            ItemStack cobblestoneStack = new ItemStack(Items.COBBLESTONE, 1);
            player.getInventory().insertStack(cobblestoneStack);
        }

        return ActionResult.SUCCESS;
    }
}

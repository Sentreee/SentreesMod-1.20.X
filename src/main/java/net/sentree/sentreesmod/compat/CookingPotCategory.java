package net.sentree.sentreesmod.compat;

import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.sentree.sentreesmod.SentreesMod;
import net.sentree.sentreesmod.block.ModBlocks;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sentree.sentreesmod.compat.CookingPotDisplay;

import java.util.LinkedList;
import java.util.List;

// Done with the help:
// https://github.com/TeamGalacticraft/Galacticraft/tree/main (MIT License)
public class CookingPotCategory implements DisplayCategory<BasicDisplay> {
    public static final Identifier TEXTURE =
            new Identifier(SentreesMod.MOD_ID, "textures/gui/cooking_pot_gui.png");
    public static final CategoryIdentifier<CookingPotDisplay> COOKING =
            CategoryIdentifier.of(SentreesMod.MOD_ID, "cooking");

    @Override
    public CategoryIdentifier<? extends BasicDisplay> getCategoryIdentifier() {
        return COOKING;
    }

    @Override
    public Text getTitle() {
        return Text.literal("Cooking Pot");
    }

    @Override
    public Renderer getIcon() {
        return EntryStacks.of(ModBlocks.COOKINGPOT.asItem().getDefaultStack());
    }

    @Override
    public List<Widget> setupDisplay(BasicDisplay display, Rectangle bounds) {
        final Point startPoint = new Point(bounds.getCenterX() - 87, bounds.getCenterY() - 35);
        List<Widget> widgets = new LinkedList<>();
        widgets.add(Widgets.createTexturedWidget(TEXTURE, new Rectangle(startPoint.x, startPoint.y, 175, 82)));

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 80, startPoint.y + 11))
                .entries(display.getInputEntries().get(0)));

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 17, startPoint.y + 11))
                .entries(display.getInputEntries().get(2)));

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 35, startPoint.y + 11))
                .entries(display.getInputEntries().get(3)));

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 53, startPoint.y + 11))
                .entries(display.getInputEntries().get(4)));

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 35, startPoint.y + 29))
                .entries(display.getInputEntries().get(5)));

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 80, startPoint.y + 59))
                .markOutput().entries(display.getOutputEntries().get(0)));




        return widgets;
    }

    @Override
    public int getDisplayHeight() {
        return 90;
    }
}
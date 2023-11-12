package unexpectedlyalarming.beyondslumber.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import unexpectedlyalarming.beyondslumber.block.ModBlocks;
import unexpectedlyalarming.beyondslumber.item.ModItems;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> SLEEPIUM_INGOT_SMELTABLES = List.of(ModItems.SLEEPIUM_DUST, ModBlocks.SLEEPIUM_ORE, ModBlocks.DEEPSLATE_SLEEPIUM_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }


    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, SLEEPIUM_INGOT_SMELTABLES, RecipeCategory.MISC, ModItems.SLEEPIUM_INGOT, 0.7f, 200, "sleepium");
        offerBlasting(exporter, SLEEPIUM_INGOT_SMELTABLES, RecipeCategory.MISC, ModItems.SLEEPIUM_INGOT, 0.7f, 100, "sleepium");
        offerSmelting(exporter, List.of(Items.ROTTEN_FLESH), RecipeCategory.MISC, ModItems.DRIED_FLESH, 0.35f, 200, "cooked_flesh");

        //Crafting

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.POGO_STICK, 1)
                .pattern(" AB")
                .pattern(" CA")
                .pattern("I  ")
                .input('A', Items.AMETHYST_SHARD)
                .input('B', Items.COPPER_BLOCK)
                .input('C', Items.COPPER_INGOT)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.COPPER_BLOCK), conditionsFromItem(Items.COPPER_BLOCK))
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);






    }
}

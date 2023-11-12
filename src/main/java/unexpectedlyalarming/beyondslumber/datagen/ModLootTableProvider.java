package unexpectedlyalarming.beyondslumber.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import unexpectedlyalarming.beyondslumber.block.ModBlocks;
import unexpectedlyalarming.beyondslumber.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SLEEPIUM_ORE, oreDrops(ModBlocks.SLEEPIUM_ORE, ModItems.SLEEPIUM_DUST));
        addDrop(ModBlocks.DEEPSLATE_SLEEPIUM_ORE, oreDrops(ModBlocks.DEEPSLATE_SLEEPIUM_ORE, ModItems.SLEEPIUM_DUST));
        addDrop(ModBlocks.DREAM_ALTAR, ModBlocks.DREAM_ALTAR);
        addDrop(ModBlocks.RED_LANTERN, ModBlocks.RED_LANTERN);


    }
}

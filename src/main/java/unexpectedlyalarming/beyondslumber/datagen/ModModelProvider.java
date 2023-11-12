package unexpectedlyalarming.beyondslumber.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import unexpectedlyalarming.beyondslumber.block.ModBlocks;
import unexpectedlyalarming.beyondslumber.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DREAM_ALTAR);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SLEEPIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SLEEPIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_LANTERN);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.DREAMCATCHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.SLEEPIUM_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.SLEEPIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BACKPACK, Models.GENERATED);
        itemModelGenerator.register(ModItems.COAL_PELLET, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRIED_FLESH, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHEPHERDS_PIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.POGO_STICK, Models.GENERATED);


    }
}

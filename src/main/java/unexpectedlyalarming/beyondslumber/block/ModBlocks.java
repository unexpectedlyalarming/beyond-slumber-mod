package unexpectedlyalarming.beyondslumber.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.client.gl.Uniform;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import unexpectedlyalarming.beyondslumber.BeyondSlumber;

public class ModBlocks {

    public static final Block DREAM_ALTAR = registerBlock("dream_altar", new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).luminance((state) -> 8).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    //For reference to self. UniformIntProvider.create(1, 5) is the amount of experience dropped. 1 is the minimum, 5 is the maximum.
    //Ores should use ExpreienceDroppingBlock, not Block.
    public static final Block SLEEPIUM_ORE = registerBlock("sleepium_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE).luminance((state) -> 1), UniformIntProvider.create(1, 5)));
    public static final Block DEEPSLATE_SLEEPIUM_ORE = registerBlock("deepslate_sleepium_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE).luminance((state) -> 1), UniformIntProvider.create(1, 5)));
    public static final Block RED_LANTERN = registerBlock("red_lantern", new Block(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP).luminance((state) -> 15)));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BeyondSlumber.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BeyondSlumber.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        BeyondSlumber.LOGGER.info("Registering Mod Blocks");


    }
}

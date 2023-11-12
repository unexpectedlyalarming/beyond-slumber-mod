package unexpectedlyalarming.beyondslumber.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import unexpectedlyalarming.beyondslumber.BeyondSlumber;
import unexpectedlyalarming.beyondslumber.block.ModBlocks;

public class ModItemGroups {


    public static final ItemGroup BEYOND_SLUMBER_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(BeyondSlumber.MOD_ID,
    "beyond_slumber_group"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.beyondslumber"))
            .icon(() -> new ItemStack(ModItems.DREAMCATCHER)).entries((displayContext, entries) -> {
                entries.add(ModItems.DREAMCATCHER);
                entries.add(ModItems.SLEEPING_PILLS);
                entries.add(ModItems.BACKPACK);
                entries.add(ModBlocks.DREAM_ALTAR);
                entries.add(ModItems.SLEEPIUM_DUST);
                entries.add(ModItems.SLEEPIUM_INGOT);
                entries.add(ModBlocks.SLEEPIUM_ORE);
                entries.add(ModBlocks.DEEPSLATE_SLEEPIUM_ORE);
                entries.add(ModItems.SHEPHERDS_PIE);
                entries.add(ModItems.DRIED_FLESH);
                entries.add(ModItems.COAL_PELLET);
                entries.add(ModBlocks.RED_LANTERN);
}).build());

    public static void registerItemGroups() {
        BeyondSlumber.LOGGER.info("Registering Mod Item Groups");
    }
}

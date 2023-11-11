package unexpectedlyalarming.beyondslumber.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import unexpectedlyalarming.beyondslumber.BeyondSlumber;

public class ModItemGroups {


    public static final ItemGroup BEYOND_SLUMBER_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(BeyondSlumber.MOD_ID,
    "beyond_slumber_group"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.beyondslumber"))
            .icon(() -> new ItemStack(ModItems.DREAMCATCHER)).entries((displayContext, entries) -> {
                entries.add(ModItems.DREAMCATCHER);
}).build());

    public static void registerItemGroups() {
        BeyondSlumber.LOGGER.info("Registering Mod Item Groups");
    }
}

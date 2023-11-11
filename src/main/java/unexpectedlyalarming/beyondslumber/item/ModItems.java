package unexpectedlyalarming.beyondslumber.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import unexpectedlyalarming.beyondslumber.BeyondSlumber;

public class ModItems {

    public static final Item DREAMCATCHER = registerItem("dreamcatcher", new Item(new FabricItemSettings()));
    public static final Item SLEEPING_PILLS = registerItem("sleeping_pills", new Item(new FabricItemSettings()));
    public static final Item BACKPACK = registerItem("backpack", new Item(new FabricItemSettings()));
    public static final Item SLEEPIUM_DUST = registerItem("sleepium_dust", new Item(new FabricItemSettings()));
    public static final Item SLEEPIUM_INGOT = registerItem("sleepium_ingot", new Item(new FabricItemSettings()));

    private static void addItemsToCreativeMenu(FabricItemGroupEntries entries) {

        entries.add(DREAMCATCHER);
        entries.add(SLEEPING_PILLS);
        entries.add(BACKPACK);
        entries.add(SLEEPIUM_DUST);
        entries.add(SLEEPIUM_INGOT);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier((BeyondSlumber.MOD_ID), name), item);
    }

    public static void RegisterModItems() {
        BeyondSlumber.LOGGER.info("Registering Mod Items");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::addItemsToCreativeMenu);
    }
}

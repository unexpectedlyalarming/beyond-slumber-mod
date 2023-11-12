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
import unexpectedlyalarming.beyondslumber.item.custom.PogoStickItem;

public class ModItems {

    public static final Item DREAMCATCHER = registerItem("dreamcatcher", new Item(new FabricItemSettings()));

    public static final Item BACKPACK = registerItem("backpack", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item SLEEPIUM_DUST = registerItem("sleepium_dust", new Item(new FabricItemSettings()));
    public static final Item SLEEPIUM_INGOT = registerItem("sleepium_ingot", new Item(new FabricItemSettings()));

    public static final Item SHEPHERDS_PIE = registerItem("shepherds_pie", new Item(new FabricItemSettings().food(ModFoodComponents.SHEPHERDS_PIE)));
    public static final Item DRIED_FLESH = registerItem("dried_flesh", new Item(new FabricItemSettings()));

    public static final Item COAL_PELLET = registerItem("coal_pellet", new Item(new FabricItemSettings()));

    public static final Item POGO_STICK = registerItem("pogo_stick", new PogoStickItem(new FabricItemSettings().maxDamage(30)));

    private static void addItemsToCreativeMenu(FabricItemGroupEntries entries) {

        entries.add(DREAMCATCHER);
        entries.add(BACKPACK);


        entries.add(SLEEPIUM_DUST);
        entries.add(SLEEPIUM_INGOT);
        entries.add(SHEPHERDS_PIE);
        entries.add(DRIED_FLESH);
        entries.add(COAL_PELLET);
        entries.add(POGO_STICK);



    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier((BeyondSlumber.MOD_ID), name), item);
    }

    public static void RegisterModItems() {
        BeyondSlumber.LOGGER.info("Registering Mod Items");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::addItemsToCreativeMenu);

    }
}

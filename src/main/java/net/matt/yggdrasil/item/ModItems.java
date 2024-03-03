package net.matt.yggdrasil.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.matt.yggdrasil.Yggdrasil_mod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item YGGDRASIL_ESSENCE = registerItem("yggdrasil_essence",
            new Item(new FabricItemSettings().food(ModFoodComponents.YGGDRASIL_ESSENCE)));


    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
//        entries.add(RUBY);
//        entries.add(RAW_RUBY);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Yggdrasil_mod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Yggdrasil_mod.LOGGER.info("Registering Mod Items for " + Yggdrasil_mod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
package net.bokix.calisthenicsmod.item;

import net.bokix.calisthenicsmod.CalisthenicsMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item Steel_Ingot = registerItem(name: "steel_ingot", new Item (new Item.Settings()));

    private static Item registerItem(String name,Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CalisthenicsMod.MOD_ID, name), item);
    }


    public static void registerModItems() {
        CalisthenicsMod.LOGGER.info("Registering Mod Items for " + CalisthenicsMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(Steel_Ingot);
        });
    }
}

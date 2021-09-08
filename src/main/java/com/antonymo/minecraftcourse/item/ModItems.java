package com.antonymo.minecraftcourse.item;

import com.antonymo.minecraftcourse.util.Registration;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;

public class ModItems {
    public static RegistryObject<Item> COPPER_INGOT =
            Registration.ITEMS.register("copper_ingot",
                    () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static void register() { }
}

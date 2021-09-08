package com.antonymo.minecraftcourse.block;

import com.antonymo.minecraftcourse.util.Registration;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fmllegacy.RegistryObject;

import java.util.function.Supplier;
import net.minecraftforge.common.ToolAction;

public class ModBlocks {
    public static final RegistryObject<Block> COPPER_BLOCK = register("copper_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops()
                    .strength(3f, 3f)
                    .sound(SoundType.METAL)
            ));

    public static final RegistryObject<Block> COPPER_ORE = register("copper_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops()
                    .strength(3f, 3f)
                    .sound(SoundType.STONE)
            ));

    public static void register() { }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        return toReturn;


    }
}

package com.education.block;
import java.util.function.Function;

import com.education.JavaEducation;
import com.education.block.HeatBlock.HeatBlock;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;


public class ModBlocks {
    public static final Block HEAT_BLOCK = registerBlock("heat_block", properties -> new HeatBlock(properties.strength(2.f)
        .requiresCorrectToolForDrops().sound(SoundType.STONE).randomTicks()));

        
    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK,
            Identifier.fromNamespaceAndPath(JavaEducation.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(JavaEducation.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(JavaEducation.MOD_ID, name), 
            new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(JavaEducation.MOD_ID, name)))));
    }
    
    public static void registerModBlocks() {
        JavaEducation.LOGGER.info("Registering Mod Blocks for " + JavaEducation.MOD_ID);
    }

}

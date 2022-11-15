package net.kysen.taverndrinkmod.block;

import net.kysen.taverndrinkmod.TavernDrinkMod;
import net.kysen.taverndrinkmod.block.custom.*;
import net.kysen.taverndrinkmod.fluid.ModFluids;
import net.kysen.taverndrinkmod.item.ModCreativeModeTab;
import net.kysen.taverndrinkmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS  =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TavernDrinkMod.MOD_ID);



public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
        ()-> new Block(BlockBehaviour.Properties.of(Material.STONE)
                .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TavernDrink_TAB);

    public static final RegistryObject<Block> FERMENTER_BARREL_STATION = registerBlock("fermenter_barrel",
            ()-> new Fermenterbarrelstationblock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.TavernDrink_TAB);

    public static final RegistryObject<Block> DRINK_BARREL_STATION = registerBlock("drink_barrel",
            ()-> new Drinkbarrelstationblock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.TavernDrink_TAB);

    public static final RegistryObject<Block> TANKARD = registerBlock("tankard",
            ()-> new Tankardblock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.05f).requiresCorrectToolForDrops()), ModCreativeModeTab.TavernDrink_TAB);


    public static final RegistryObject<Block> HOPS_CROP = BLOCKS.register("hops_crop",
            () -> new HopsCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT))) ;

    public static final RegistryObject<Block> GRAPE_CROP = BLOCKS.register("grape_crop",
            () -> new GrapeCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT))) ;
    public static final RegistryObject<Block> BLUEBERRY_CROP = BLOCKS.register("blueberry_crop",
            () -> new BlueberryCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT))) ;

    public static final RegistryObject<Block> RASPBERRY_BUSH = BLOCKS.register("raspberry_bush",
            () -> new RaspberryBushBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH))) ;

    public static final RegistryObject<Block> BLACKBERRY_BUSH = BLOCKS.register("blackberry_bush",
            () -> new BlackberryBushBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH))) ;



    public static final RegistryObject<LiquidBlock> SOAP_WATER_BLOCK = BLOCKS.register("soap_water_block",
            () -> new LiquidBlock(ModFluids.SOURCE_SOAP_WATER, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> APPLE_BEER_BLOCK = BLOCKS.register("apple_beer_block",
            () -> new LiquidBlock(ModFluids.SOURCE_APPLE_BEER, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> FLOVERED_BEER_BLOCK = BLOCKS.register("flovered_beer_block",
            () -> new LiquidBlock(ModFluids.SOURCE_FLOVERED_BEER, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> GLOWBERRIES_BEER_BLOCK = BLOCKS.register("glowberries_beer_block",
            () -> new LiquidBlock(ModFluids.SOURCE_GLOWBERRIES_BEER, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> SWEETBERRIES_BEER_BLOCK = BLOCKS.register("sweetberries_beer_block",
            () -> new LiquidBlock(ModFluids.SOURCE_SWEETBERRIES_BEER, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> WILDBERRIES_BEER_BLOCK = BLOCKS.register("wildberries_beer_block",
            () -> new LiquidBlock(ModFluids.SOURCE_WILDBERRIES_BEER, BlockBehaviour.Properties.copy(Blocks.WATER)));




    public static final RegistryObject<LiquidBlock> APPLE_WINE_BLOCK = BLOCKS.register("apple_wine_block",
            () -> new LiquidBlock(ModFluids.SOURCE_APPLE_WINE, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> BLACKBERRY_WINE_BLOCK = BLOCKS.register("blackberry_wine_block",
            () -> new LiquidBlock(ModFluids.SOURCE_BLACKBERRY_WINE, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> BLUEBERRY_WINE_BLOCK = BLOCKS.register("blueberry_wine_block",
            () -> new LiquidBlock(ModFluids.SOURCE_BLUEBERRY_WINE, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> GLOWBERRIES_WINE_BLOCK = BLOCKS.register("glowberries_wine_block",
            () -> new LiquidBlock(ModFluids.SOURCE_GLOWBERRIES_WINE, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> GRAPE_WINE_BLOCK = BLOCKS.register("grape_wine_block",
            () -> new LiquidBlock(ModFluids.SOURCE_GRAPE_WINE, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> RASPBERRY_WINE_BLOCK = BLOCKS.register("raspberry_wine_block",
            () -> new LiquidBlock(ModFluids.SOURCE_RASPBERRY_WINE, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> ROSE_WINE_BLOCK = BLOCKS.register("rose_wine_block",
            () -> new LiquidBlock(ModFluids.SOURCE_ROSE_WINE, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> SWEETBERRIES_WINE_BLOCK = BLOCKS.register("sweetberries_wine_block",
            () -> new LiquidBlock(ModFluids.SOURCE_SWEETBERRIES_WINE, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> WATERMELON_WINE_BLOCK = BLOCKS.register("watermelon_wine_block",
            () -> new LiquidBlock(ModFluids.SOURCE_WATERMELON_WINE, BlockBehaviour.Properties.copy(Blocks.WATER)));






    private static <T extends  Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
    RegistryObject<T> toReturn= BLOCKS.register(name, block);
        registerBlockItem(name,toReturn,tab);
     return toReturn;

    }

    private static <T extends  Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                             CreativeModeTab tab){

        return ModItems.ITEMS.register(name,()-> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static  void register(IEventBus eventBus){
        BLOCKS.register(eventBus);

    }
}

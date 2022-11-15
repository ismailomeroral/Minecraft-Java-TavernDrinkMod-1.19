package net.kysen.taverndrinkmod.fluid;

import net.kysen.taverndrinkmod.TavernDrinkMod;
import net.kysen.taverndrinkmod.block.ModBlocks;
import net.kysen.taverndrinkmod.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, TavernDrinkMod.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_SOAP_WATER = FLUIDS.register("soap_water_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.SOAP_WATER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_SOAP_WATER = FLUIDS.register("flowing_soap_water",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.SOAP_WATER_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties SOAP_WATER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.SOAP_WATER_FLUID_TYPE, SOURCE_SOAP_WATER, FLOWING_SOAP_WATER)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.SOAP_WATER_BLOCK)
            .bucket(ModItems.SOAP_WATER_BUCKET);



    public static final RegistryObject<FlowingFluid> SOURCE_APPLE_BEER = FLUIDS.register("apple_beer_drink",
            () -> new ForgeFlowingFluid.Source(ModFluids.APPLE_BEER_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> FLOWING_APPLE_BEER = FLUIDS.register("flowing_apple_beer",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.APPLE_BEER_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties APPLE_BEER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModApplebeerTypes.APPLE_BEER_DRINK_TYPE, SOURCE_APPLE_BEER, FLOWING_APPLE_BEER)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.APPLE_BEER_BLOCK)
            .bucket(ModItems.APPLE_BEER_BUCKET);


    public static final RegistryObject<FlowingFluid> SOURCE_FLOVERED_BEER = FLUIDS.register("flovered_beer_drink",
            () -> new ForgeFlowingFluid.Source(ModFluids.FLOVERED_BEER_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> FLOWING_FLOVERED_BEER = FLUIDS.register("flowing_flovered_beer",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.FLOVERED_BEER_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties FLOVERED_BEER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFloveredbeerTypes.FLOVERED_BEER_DRINK_TYPE, SOURCE_FLOVERED_BEER, FLOWING_FLOVERED_BEER)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.FLOVERED_BEER_BLOCK)
            .bucket(ModItems.FLOVERED_BEER_BUCKET);



    public static final RegistryObject<FlowingFluid> SOURCE_GLOWBERRIES_BEER = FLUIDS.register("glowberries_beer_drink",
            () -> new ForgeFlowingFluid.Source(ModFluids.GLOWBERRIES_BEER_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> FLOWING_GLOWBERRIES_BEER = FLUIDS.register("flowing_glowberries_beer",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.GLOWBERRIES_BEER_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties GLOWBERRIES_BEER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModGlowberriesbeerTypes.GLOWBERRIES_BEER_DRINK_TYPE, SOURCE_GLOWBERRIES_BEER, FLOWING_GLOWBERRIES_BEER)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.GLOWBERRIES_BEER_BLOCK)
            .bucket(ModItems.GLOWBERRIES_BEER_BUCKET);


    public static final RegistryObject<FlowingFluid> SOURCE_SWEETBERRIES_BEER = FLUIDS.register("sweetberries_beer_drink",
            () -> new ForgeFlowingFluid.Source(ModFluids.SWEETBERRIES_BEER_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> FLOWING_SWEETBERRIES_BEER = FLUIDS.register("flowing_sweetberries_beer",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.SWEETBERRIES_BEER_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties SWEETBERRIES_BEER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModSweetberriesbeerTypes.SWEETBERRIES_BEER_DRINK_TYPE, SOURCE_SWEETBERRIES_BEER, FLOWING_SWEETBERRIES_BEER)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.SWEETBERRIES_BEER_BLOCK)
            .bucket(ModItems.SWEETBERRIES_BEER_BUCKET);


    public static final RegistryObject<FlowingFluid> SOURCE_WILDBERRIES_BEER = FLUIDS.register("wildberries_beer_drink",
            () -> new ForgeFlowingFluid.Source(ModFluids.WILDBERRIES_BEER_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> FLOWING_WILDBERRIES_BEER = FLUIDS.register("flowing_wildberries_beer",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.WILDBERRIES_BEER_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties WILDBERRIES_BEER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModWildberriesbeerTypes.WILDBERRIES_BEER_DRINK_TYPE, SOURCE_WILDBERRIES_BEER, FLOWING_WILDBERRIES_BEER)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.WILDBERRIES_BEER_BLOCK)
            .bucket(ModItems.WILDBERRIES_BEER_BUCKET);




    public static final RegistryObject<FlowingFluid> SOURCE_APPLE_WINE = FLUIDS.register("apple_wine_drink",
            () -> new ForgeFlowingFluid.Source(ModFluids.APPLE_WINE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> FLOWING_APPLE_WINE = FLUIDS.register("flowing_apple_wine",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.APPLE_WINE_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties APPLE_WINE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModApplewineTypes.APPLE_WINE_DRINK_TYPE, SOURCE_APPLE_WINE, FLOWING_APPLE_WINE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.APPLE_WINE_BLOCK)
            .bucket(ModItems.APPLE_WINE_BUCKET);




    public static final RegistryObject<FlowingFluid> SOURCE_BLACKBERRY_WINE = FLUIDS.register("blackberry_wine_drink",
            () -> new ForgeFlowingFluid.Source(ModFluids.BLACKBERRY_WINE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> FLOWING_BLACKBERRY_WINE = FLUIDS.register("flowing_blackberry_wine",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.BLACKBERRY_WINE_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties BLACKBERRY_WINE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModBlackberrywineTypes.BLACKBERRY_WINE_DRINK_TYPE, SOURCE_BLACKBERRY_WINE, FLOWING_BLACKBERRY_WINE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.BLACKBERRY_WINE_BLOCK)
            .bucket(ModItems.BLACKBERRY_WINE_BUCKET);




    public static final RegistryObject<FlowingFluid> SOURCE_BLUEBERRY_WINE = FLUIDS.register("blueberry_wine_drink",
            () -> new ForgeFlowingFluid.Source(ModFluids.BLUEBERRY_WINE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> FLOWING_BLUEBERRY_WINE = FLUIDS.register("flowing_blueberry_wine",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.BLUEBERRY_WINE_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties BLUEBERRY_WINE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModBlueberrywineTypes.BLUEBERRY_WINE_DRINK_TYPE, SOURCE_BLUEBERRY_WINE, FLOWING_BLUEBERRY_WINE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.BLUEBERRY_WINE_BLOCK)
            .bucket(ModItems.BLUEBERRY_WINE_BUCKET);



    public static final RegistryObject<FlowingFluid> SOURCE_GLOWBERRIES_WINE = FLUIDS.register("glowberries_wine_drink",
            () -> new ForgeFlowingFluid.Source(ModFluids.GLOWBERRIES_WINE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> FLOWING_GLOWBERRIES_WINE = FLUIDS.register("flowing_glowberries_wine",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.GLOWBERRIES_WINE_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties GLOWBERRIES_WINE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModGlowberrieswineTypes.GLOWBERRIESS_WINE_DRINK_TYPE, SOURCE_GLOWBERRIES_WINE, FLOWING_GLOWBERRIES_WINE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.GLOWBERRIES_WINE_BLOCK)
            .bucket(ModItems.GLOWBERRIES_WINE_BUCKET);



    public static final RegistryObject<FlowingFluid> SOURCE_GRAPE_WINE = FLUIDS.register("grape_wine_drink",
            () -> new ForgeFlowingFluid.Source(ModFluids.GRAPE_WINE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> FLOWING_GRAPE_WINE = FLUIDS.register("flowing_grape_wine",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.GRAPE_WINE_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties GRAPE_WINE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModGrapewineTypes.GRAPE_WINE_DRINK_TYPE, SOURCE_GRAPE_WINE, FLOWING_GRAPE_WINE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.GRAPE_WINE_BLOCK)
            .bucket(ModItems.GRAPE_WINE_BUCKET);



    public static final RegistryObject<FlowingFluid> SOURCE_RASPBERRY_WINE = FLUIDS.register("raspberry_wine_drink",
            () -> new ForgeFlowingFluid.Source(ModFluids.RASPBERRY_WINE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> FLOWING_RASPBERRY_WINE = FLUIDS.register("flowing_raspberry_wine",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.RASPBERRY_WINE_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties RASPBERRY_WINE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModRaspberrywineTypes.RASPBERRY_WINE_DRINK_TYPE, SOURCE_RASPBERRY_WINE, FLOWING_RASPBERRY_WINE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.RASPBERRY_WINE_BLOCK)
            .bucket(ModItems.RASPBERRY_WINE_BUCKET);



    public static final RegistryObject<FlowingFluid> SOURCE_ROSE_WINE = FLUIDS.register("rose_wine_drink",
            () -> new ForgeFlowingFluid.Source(ModFluids.ROSE_WINE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> FLOWING_ROSE_WINE = FLUIDS.register("flowing_rose_wine",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.ROSE_WINE_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties ROSE_WINE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModRosewineTypes.ROSE_WINE_DRINK_TYPE, SOURCE_ROSE_WINE, FLOWING_ROSE_WINE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.ROSE_WINE_BLOCK)
            .bucket(ModItems.ROSE_WINE_BUCKET);



    public static final RegistryObject<FlowingFluid> SOURCE_SWEETBERRIES_WINE = FLUIDS.register("sweetberries_wine_drink",
            () -> new ForgeFlowingFluid.Source(ModFluids.SWEETBERRIES_WINE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> FLOWING_SWEETBERRIES_WINE = FLUIDS.register("flowing_sweetberries_wine",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.SWEETBERRIES_WINE_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties SWEETBERRIES_WINE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModSweetberrieswineTypes.SWEETBERRIES_WINE_DRINK_TYPE, SOURCE_SWEETBERRIES_WINE, FLOWING_SWEETBERRIES_WINE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.SWEETBERRIES_WINE_BLOCK)
            .bucket(ModItems.SWEETBERRIES_WINE_BUCKET);




    public static final RegistryObject<FlowingFluid> SOURCE_WATERMELON_WINE = FLUIDS.register("watermelon_wine_drink",
            () -> new ForgeFlowingFluid.Source(ModFluids.WATERMELON_WINE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> FLOWING_WATERMELON_WINE = FLUIDS.register("flowing_watermelon_wine",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.WATERMELON_WINE_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties WATERMELON_WINE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModWatermelonwineTypes.WATERMELON_WINE_DRINK_TYPE, SOURCE_WATERMELON_WINE, FLOWING_WATERMELON_WINE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.WATERMELON_WINE_BLOCK)
            .bucket(ModItems.WATERMELON_WINE_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}

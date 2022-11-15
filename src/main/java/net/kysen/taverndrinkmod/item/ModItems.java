package net.kysen.taverndrinkmod.item;

import net.kysen.taverndrinkmod.TavernDrinkMod;
import net.kysen.taverndrinkmod.block.ModBlocks;
import net.kysen.taverndrinkmod.fluid.ModFluids;
import net.kysen.taverndrinkmod.item.custom.EightBallItem;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, TavernDrinkMod.MOD_ID);


    public  static  final RegistryObject<Item> STEEL=
            ITEMS.register("steel",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB)));
    public  static  final RegistryObject<Item> EIGHT_BALL=
            ITEMS.register("eight_ball",() -> new EightBallItem(new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB).stacksTo(1)));

    public  static  final RegistryObject<Item> BEER_YEAST=
            ITEMS.register("beer_yeast",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB)));
       public  static  final RegistryObject<Item> WINE_YEAST=
            ITEMS.register("wine_yeast",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB)));
    public  static  final RegistryObject<Item> OLD_BEER_YEAST=
            ITEMS.register("old_beer_yeast",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB)));
    public  static  final RegistryObject<Item> OLD_WINE_YEAST=
            ITEMS.register("old_wine_yeast",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB)));


    public  static  final RegistryObject<Item> SWEETBERRY_BEER_YEAST_BOWL=
            ITEMS.register("sweetberry_beer_yeast_bowl",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB).stacksTo(1)));
    public  static  final RegistryObject<Item> APPLE_BEER_YEAST_BOWL=
            ITEMS.register("apple_beer_yeast_bowl",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB).stacksTo(1)));
    public  static  final RegistryObject<Item> GLOW_BERRIES_BEER_YEAST_BOWL=
            ITEMS.register("glow_berries_beer_yeast_bowl",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB).stacksTo(1)));
    public  static  final RegistryObject<Item> WILDBERRIES_BEER_YEAST_BOWL=
            ITEMS.register("wildberries_beer_yeast_bowl",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB)));
    public  static  final RegistryObject<Item> FLAVORED_BEER_YEAST_BOWL=
            ITEMS.register("flavored_beer_yeast_bowl",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB)));


    public  static  final RegistryObject<Item> SWEETBERRY_WINE_YEAST_BOWL=
            ITEMS.register("sweetberry_wine_yeast_bowl",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB).stacksTo(1)));
    public  static  final RegistryObject<Item> APPLE_WINE_YEAST_BOWL=
            ITEMS.register("apple_wine_yeast_bowl",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB).stacksTo(1)));
       public  static  final RegistryObject<Item> GLOW_BERRIES_WINE_YEAST_BOWL=
            ITEMS.register("glow_berries_wine_yeast_bowl",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB).stacksTo(1)));
    public  static  final RegistryObject<Item> WATERMELON_WINE_YEAST_BOWL=
            ITEMS.register("watermelon_wine_yeast_bowl",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB).stacksTo(1)));
    public  static  final RegistryObject<Item> BLACKBERRY_WINE_YEAST_BOWL=
            ITEMS.register("blackberry_wine_yeast_bowl",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB).stacksTo(1)));
    public  static  final RegistryObject<Item> BLUEBERRY_WINE_YEAST_BOWL=
            ITEMS.register("blueberry_wine_yeast_bowl",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB).stacksTo(1)));
    public  static  final RegistryObject<Item> GRAPE_WINE_YEAST_BOWL=
            ITEMS.register("grape_wine_yeast_bowl",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB).stacksTo(1)));
    public  static  final RegistryObject<Item> RASPBERRY_WINE_YEAST_BOWL=
            ITEMS.register("raspberry_wine_yeast_bowl",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB).stacksTo(1)));
    public  static  final RegistryObject<Item> ROSE_WINE_YEAST_BOWL=
            ITEMS.register("rose_wine_yeast_bowl",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB).stacksTo(1)));


    public  static  final RegistryObject<Item> HOPS_SEEDS=
            ITEMS.register("hops_seeds",() -> new ItemNameBlockItem(ModBlocks.HOPS_CROP.get(),new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB)));
    public  static  final RegistryObject<Item> HOPS=
            ITEMS.register("hops",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB).food(new FoodProperties.Builder().nutrition(3).saturationMod(4f).build())));
    public  static  final RegistryObject<Item> BLUEBERRY_SEEDS=
            ITEMS.register("blueberry_seeds",() -> new ItemNameBlockItem(ModBlocks.BLUEBERRY_CROP.get(),new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB)));
    public  static  final RegistryObject<Item> BLUEBERRY=
            ITEMS.register("blueberry",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(3f).build())));

    public  static  final RegistryObject<Item> GRAPE_SEEDS=
            ITEMS.register("grape_seeds",() -> new ItemNameBlockItem(ModBlocks.GRAPE_CROP.get(),new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB)));
    public  static  final RegistryObject<Item> GRAPE=
            ITEMS.register("grape",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB).food(new FoodProperties.Builder().nutrition(4).saturationMod(2f).build())));

    public  static  final RegistryObject<Item> RASPBERRY=
            ITEMS.register("raspberry",() -> new ItemNameBlockItem(ModBlocks.RASPBERRY_BUSH.get(),new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB).food(new FoodProperties.Builder().nutrition(3).saturationMod(3f).build())));
    public  static  final RegistryObject<Item> BLACKBERRY=
            ITEMS.register("blackberry",() -> new ItemNameBlockItem(ModBlocks.BLACKBERRY_BUSH.get(),new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB).food(new FoodProperties.Builder().nutrition(3).saturationMod(1f).build())));




    public static final RegistryObject<Item> APPLE_BEER_BUCKET = ITEMS.register("apple_beer_bucket",
            () -> new BucketItem(ModFluids.SOURCE_APPLE_BEER,
                    new Item.Properties().tab(ModCreativeModeTab.TavernDrinkBucket_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> FLOVERED_BEER_BUCKET = ITEMS.register("flovered_beer_bucket",
            () -> new BucketItem(ModFluids.SOURCE_FLOVERED_BEER,
                    new Item.Properties().tab(ModCreativeModeTab.TavernDrinkBucket_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item>  GLOWBERRIES_BEER_BUCKET = ITEMS.register("glowberries_beer_bucket",
            () -> new BucketItem(ModFluids.SOURCE_GLOWBERRIES_BEER,
                    new Item.Properties().tab(ModCreativeModeTab.TavernDrinkBucket_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item>  SWEETBERRIES_BEER_BUCKET = ITEMS.register("sweetberries_beer_bucket",
            () -> new BucketItem(ModFluids.SOURCE_SWEETBERRIES_BEER,
                    new Item.Properties().tab(ModCreativeModeTab.TavernDrinkBucket_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item>  WILDBERRIES_BEER_BUCKET = ITEMS.register("wildberries_beer_bucket",
            () -> new BucketItem(ModFluids.SOURCE_WILDBERRIES_BEER,
                    new Item.Properties().tab(ModCreativeModeTab.TavernDrinkBucket_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));




    public static final RegistryObject<Item>  APPLE_WINE_BUCKET = ITEMS.register("apple_wine_bucket",
            () -> new BucketItem(ModFluids.SOURCE_APPLE_WINE,
                    new Item.Properties().tab(ModCreativeModeTab.TavernDrinkBucket_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item>  BLACKBERRY_WINE_BUCKET = ITEMS.register("blackberry_wine_bucket",
            () -> new BucketItem(ModFluids.SOURCE_BLACKBERRY_WINE,
                    new Item.Properties().tab(ModCreativeModeTab.TavernDrinkBucket_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item>  BLUEBERRY_WINE_BUCKET = ITEMS.register("blueberry_wine_bucket",
            () -> new BucketItem(ModFluids.SOURCE_BLUEBERRY_WINE,
                    new Item.Properties().tab(ModCreativeModeTab.TavernDrinkBucket_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item>  GLOWBERRIES_WINE_BUCKET = ITEMS.register("glowberries_wine_bucket",
            () -> new BucketItem(ModFluids.SOURCE_GLOWBERRIES_WINE,
                    new Item.Properties().tab(ModCreativeModeTab.TavernDrinkBucket_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> GRAPE_WINE_BUCKET = ITEMS.register("grape_wine_bucket",
            () -> new BucketItem(ModFluids.SOURCE_GRAPE_WINE,
                    new Item.Properties().tab(ModCreativeModeTab.TavernDrinkBucket_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> RASPBERRY_WINE_BUCKET = ITEMS.register("raspberry_wine_bucket",
            () -> new BucketItem(ModFluids.SOURCE_RASPBERRY_WINE,
                    new Item.Properties().tab(ModCreativeModeTab.TavernDrinkBucket_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item>  ROSE_WINE_BUCKET = ITEMS.register("rose_wine_bucket",
            () -> new BucketItem(ModFluids.SOURCE_ROSE_WINE,
                    new Item.Properties().tab(ModCreativeModeTab.TavernDrinkBucket_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item>  SWEETBERRIES_WINE_BUCKET = ITEMS.register("sweetberries_wine_bucket",
            () -> new BucketItem(ModFluids.SOURCE_SWEETBERRIES_WINE,
                    new Item.Properties().tab(ModCreativeModeTab.TavernDrinkBucket_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item>  WATERMELON_WINE_BUCKET = ITEMS.register("watermelon_wine_bucket",
            () -> new BucketItem(ModFluids.SOURCE_WATERMELON_WINE,
                    new Item.Properties().tab(ModCreativeModeTab.TavernDrinkBucket_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));

















    public static final RegistryObject<Item> SOAP_WATER_BUCKET = ITEMS.register("soap_water_bucket",
            () -> new BucketItem(ModFluids.SOURCE_SOAP_WATER,
                    new Item.Properties().tab(ModCreativeModeTab.TavernDrink_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));



    public static  void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }
}

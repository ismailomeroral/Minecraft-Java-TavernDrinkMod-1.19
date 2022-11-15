package net.kysen.taverndrinkmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static  final CreativeModeTab TavernDrink_TAB = new CreativeModeTab("taverndrinktab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BEER_YEAST.get());
        }
    };
    public static  final CreativeModeTab TavernDrinkBucket_TAB = new CreativeModeTab("taverndrinkbuckettab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GRAPE_WINE_BUCKET.get());
        }
    };
}

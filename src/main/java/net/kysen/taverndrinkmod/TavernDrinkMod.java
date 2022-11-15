package net.kysen.taverndrinkmod;

import com.google.common.eventbus.Subscribe;
import com.mojang.logging.LogUtils;
import net.kysen.taverndrinkmod.block.ModBlocks;
import net.kysen.taverndrinkmod.fluid.*;
import net.kysen.taverndrinkmod.item.ModItems;
import net.kysen.taverndrinkmod.screen.FermenterBarrelStationScreen;
import net.kysen.taverndrinkmod.screen.ModMenuTypes;
import net.kysen.taverndrinkmod.villager.ModVillager;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TavernDrinkMod.MOD_ID)
public class TavernDrinkMod
{
    public static final String MOD_ID = "taverndrinkmod";
    private static final Logger LOGGER = LogUtils.getLogger();
    public TavernDrinkMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModVillager.register(modEventBus);
        ModFluidTypes.register(modEventBus);
        ModApplebeerTypes.register(modEventBus);
        ModFloveredbeerTypes.register(modEventBus);
        ModFluids.register(modEventBus);
        ModGlowberriesbeerTypes.register(modEventBus);
        ModSweetberriesbeerTypes.register(modEventBus);
        ModWildberriesbeerTypes.register(modEventBus);

        ModApplewineTypes.register(modEventBus);
        ModBlackberrywineTypes.register(modEventBus);
        ModBlueberrywineTypes.register(modEventBus);
        ModGrapewineTypes.register(modEventBus);
        ModGlowberrieswineTypes.register(modEventBus);
        ModRaspberrywineTypes.register(modEventBus);
        ModRosewineTypes.register(modEventBus);
        ModSweetberrieswineTypes.register(modEventBus);
        ModWatermelonwineTypes.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void commonSetup(final FMLClientSetupEvent event){
        event.enqueueWork(()->{
           ModVillager.registerPOIs();

        });
    }
    @Mod.EventBusSubscriber(modid = MOD_ID,bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class clientSetup{
     @SubscribeEvent
         public static void onClientSetup(FMLClientSetupEvent event){
         MenuScreens.register(ModMenuTypes.FERMENTER_BARREL_BLOCK_MENU.get(), FermenterBarrelStationScreen::new);

         ItemBlockRenderTypes.setRenderLayer(ModBlocks.HOPS_CROP.get(),RenderType.cutout());
         ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUEBERRY_CROP.get(),RenderType.cutout());
         ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAPE_CROP.get(),RenderType.cutout());
         ItemBlockRenderTypes.setRenderLayer(ModBlocks.RASPBERRY_BUSH.get(),RenderType.cutout());
         ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACKBERRY_BUSH.get(),RenderType.cutout());


         ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_SOAP_WATER.get(),RenderType.translucent());
         ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_SOAP_WATER.get(),RenderType.translucent());

         ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_APPLE_BEER.get(),RenderType.translucent());
         ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_APPLE_BEER.get(),RenderType.translucent());

         ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_FLOVERED_BEER.get(),RenderType.translucent());
         ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_FLOVERED_BEER.get(),RenderType.translucent());

         ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_GLOWBERRIES_BEER.get(),RenderType.translucent());
         ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_GLOWBERRIES_BEER.get(),RenderType.translucent());

         ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_SWEETBERRIES_BEER.get(),RenderType.translucent());
         ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_SWEETBERRIES_BEER.get(),RenderType.translucent());

         ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_WILDBERRIES_BEER.get(),RenderType.translucent());
         ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_WILDBERRIES_BEER.get(),RenderType.translucent());


         ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_APPLE_WINE.get(),RenderType.translucent());
         ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_APPLE_WINE.get(),RenderType.translucent());

         ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_BLACKBERRY_WINE.get(),RenderType.translucent());
         ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_BLACKBERRY_WINE.get(),RenderType.translucent());

         ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_BLUEBERRY_WINE.get(),RenderType.translucent());
         ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_BLUEBERRY_WINE.get(),RenderType.translucent());

         ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_GLOWBERRIES_WINE.get(),RenderType.translucent());
         ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_GLOWBERRIES_WINE.get(),RenderType.translucent());

         ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_GRAPE_WINE.get(),RenderType.translucent());
         ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_GRAPE_WINE.get(),RenderType.translucent());

         ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_RASPBERRY_WINE.get(),RenderType.translucent());
         ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_RASPBERRY_WINE.get(),RenderType.translucent());

         ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_ROSE_WINE.get(),RenderType.translucent());
         ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_ROSE_WINE.get(),RenderType.translucent());

         ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_SWEETBERRIES_WINE.get(),RenderType.translucent());
         ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_SWEETBERRIES_WINE.get(),RenderType.translucent());

         ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_WATERMELON_WINE.get(),RenderType.translucent());
         ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_WATERMELON_WINE.get(),RenderType.translucent());


     }
   }


}

package net.kysen.taverndrinkmod.fluid;

import com.mojang.math.Vector3f;
import net.kysen.taverndrinkmod.TavernDrinkMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModWatermelonwineTypes {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATERMELON_WINE_OVERLAY_RL = new ResourceLocation(TavernDrinkMod.MOD_ID, "misc/in_watermelon_wine");



    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, TavernDrinkMod.MOD_ID);


    public static final RegistryObject<FluidType> WATERMELON_WINE_DRINK_TYPE = register("watermelon_wine_drink",
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK));


    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATERMELON_WINE_OVERLAY_RL,
                0xFFBB170B, new Vector3f(187f / 255f, 23f / 255f, 11f / 255f), properties));


    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}

package net.kysen.taverndrinkmod.villager;

import com.google.common.collect.ImmutableSet;
import net.kysen.taverndrinkmod.TavernDrinkMod;
import net.kysen.taverndrinkmod.block.ModBlocks;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.client.event.sound.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.concurrent.Immutable;
import java.lang.reflect.InvocationTargetException;

public class ModVillager {
    public static final DeferredRegister<PoiType>POI_TYPES=
            DeferredRegister.create(ForgeRegistries.POI_TYPES, TavernDrinkMod.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS=
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS,TavernDrinkMod.MOD_ID);

    public static final RegistryObject<PoiType> FERMENTER_BARREL_POI= POI_TYPES.register("fermenter_barrel"
            ,()-> new PoiType(ImmutableSet.copyOf(ModBlocks.STEEL_BLOCK.get().getStateDefinition().getPossibleStates()),1,2) );
    public static final RegistryObject<VillagerProfession> DRINK_MASTER =VILLAGER_PROFESSIONS.register("drink_master",() -> new VillagerProfession("drink_master"
            , x -> x.get()==FERMENTER_BARREL_POI.get(),x ->x.get() == FERMENTER_BARREL_POI.get(),ImmutableSet.of() ,ImmutableSet.of(), SoundEvents.VILLAGER_WORK_CLERIC));
public static void registerPOIs(){
    try {
        ObfuscationReflectionHelper.findMethod(PoiType.class,
                "registerBlockStates",PoiType.class).invoke(null,FERMENTER_BARREL_POI.get());
    }catch (InvocationTargetException | IllegalAccessException exception){
exception.printStackTrace();
    }
}
     public static void register(IEventBus eventBus){
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}

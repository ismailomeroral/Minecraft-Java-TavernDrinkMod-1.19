package net.kysen.taverndrinkmod.block.entity;

import net.kysen.taverndrinkmod.TavernDrinkMod;
import net.kysen.taverndrinkmod.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TavernDrinkMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<fermenterBarrelBlockEntity>> FERMENTER_BARREL_STATION =
            BLOCK_ENTITIES.register("gem_infusing_station", () ->
                    BlockEntityType.Builder.of(fermenterBarrelBlockEntity::new,
                            ModBlocks.FERMENTER_BARREL_STATION.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
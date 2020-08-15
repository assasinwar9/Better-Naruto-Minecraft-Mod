package com.benarutomod.tbroski.event;

import com.benarutomod.tbroski.Main;
import com.benarutomod.tbroski.blocks.ModdedSaplingBlock;
import com.benarutomod.tbroski.command.impl.BeNMPointsCommand;
import com.benarutomod.tbroski.command.impl.BodyModeCommand;
import com.benarutomod.tbroski.command.impl.DojutsuCommand;
import com.benarutomod.tbroski.init.BiomeInit;
import com.benarutomod.tbroski.init.BlockInit;
import com.benarutomod.tbroski.items.materials.ModdedSpawnEggItem;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber {

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onPostRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
        ModdedSpawnEggItem.initUnaddedEggs();
    }

    @SubscribeEvent
    public static void onRegisterBiomes(final RegistryEvent.Register<Biome> event) {
        BiomeInit.registerBiomes();
    }

    @Mod.EventBusSubscriber(modid = com.benarutomod.tbroski.Main.MODID)
    public static class Main {

        @SubscribeEvent
        public static void serverStarting(final FMLServerStartingEvent event) {
            BeNMPointsCommand.register(event.getCommandDispatcher());
            DojutsuCommand.register(event.getCommandDispatcher());
            BodyModeCommand.register(event.getCommandDispatcher());
        }
    }
}

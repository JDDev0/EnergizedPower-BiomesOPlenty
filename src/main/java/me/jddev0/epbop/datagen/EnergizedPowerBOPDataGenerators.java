package me.jddev0.epbop.datagen;

import me.jddev0.epbop.EnergizedPowerBOPMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = EnergizedPowerBOPMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class EnergizedPowerBOPDataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        CompletableFuture<HolderLookup.Provider> lookupProvider =
                generator.addProvider(event.includeServer(), new ModRegistriesProvider(output, event.getLookupProvider())).
                        getRegistryProvider();

        generator.addProvider(event.includeServer(), new ModRecipeProvider(output, lookupProvider));

        generator.addProvider(event.includeServer(), new ModSoilTypeTagProvider(output, lookupProvider, existingFileHelper));
    }
}

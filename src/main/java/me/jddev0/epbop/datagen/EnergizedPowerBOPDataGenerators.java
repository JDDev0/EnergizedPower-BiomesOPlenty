package me.jddev0.epbop.datagen;

import me.jddev0.epbop.EnergizedPowerBOPMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = EnergizedPowerBOPMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EnergizedPowerBOPDataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();

        generator.addProvider(event.includeServer(), new ModRecipeProvider(output));
    }
}

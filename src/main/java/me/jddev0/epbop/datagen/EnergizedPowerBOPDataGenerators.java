package me.jddev0.epbop.datagen;


import me.jddev0.ep.datagen.ModRegistriesProvider;
import me.jddev0.ep.registry.EPRegistries;
import me.jddev0.epbop.soil.EPBOPSoilTypes;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;

public class EnergizedPowerBOPDataGenerators implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModRegistriesProvider::new);

        pack.addProvider(ModRecipeProvider::new);

        pack.addProvider(ModSoilTypeTagProvider::new);
    }

    @Override
    public void buildRegistry(RegistrySetBuilder registryBuilder) {
        registryBuilder.add(EPRegistries.SOIL_TYPE, EPBOPSoilTypes::bootstrap);
    }
}
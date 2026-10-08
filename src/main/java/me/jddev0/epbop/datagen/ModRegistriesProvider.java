package me.jddev0.epbop.datagen;

import me.jddev0.ep.registry.EPRegistries;
import me.jddev0.ep.soil.EPSoilTypes;
import me.jddev0.ep.soil.SoilType;
import me.jddev0.epbop.EnergizedPowerBOPMod;
import me.jddev0.epbop.soil.EPBOPSoilTypes;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.PackOutput;
import net.minecraft.data.worldgen.BootstrapContext;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public final class ModRegistriesProvider {
    private ModRegistriesProvider() {}

    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder().
            add(EPRegistries.SOIL_TYPE, ModRegistriesProvider::bootstrapSoilTypesFix);

    public static DatapackBuiltinEntriesProvider create(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        return DatapackBuiltinEntriesProvider.forWorldLayer(output, "Energized Power - BOP", registries, BUILDER, Set.of(EnergizedPowerBOPMod.MODID));
    }

    private static void bootstrapSoilTypesFix(BootstrapContext<SoilType> context) {
        //Include EP Soil Types, but do not generate data files for them (Not included in RegistryProvider mod id set)
        EPSoilTypes.bootstrap(context);

        EPBOPSoilTypes.bootstrap(context);
    }
}

package me.jddev0.epbop.datagen;

import me.jddev0.ep.registry.EPRegistries;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModRegistriesProvider extends FabricDynamicRegistryProvider {
    public ModRegistriesProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    @Override
    protected void configure(HolderLookup.Provider lookupProvider, Entries entries) {
        entries.addAll(lookupProvider.lookupOrThrow(EPRegistries.SOIL_TYPE));
    }

    @Override
    public String getName() {
        return "Registries Provider";
    }
}

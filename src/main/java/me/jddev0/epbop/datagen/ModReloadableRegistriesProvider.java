package me.jddev0.epbop.datagen;

import me.jddev0.epbop.EnergizedPowerBOPMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public final class ModReloadableRegistriesProvider {
    private ModReloadableRegistriesProvider() {}

    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder().
            add(ModRecipeProvider.create());

    public static DatapackBuiltinEntriesProvider create(PackOutput output, CompletableFuture<HolderLookup.Provider> worldRegistries,
                                                        CompletableFuture<HolderLookup.Provider> reloadableRegistries) {
        return DatapackBuiltinEntriesProvider.
                forReloadableLayer(output, "Energized Power - BOP (Reloadable)", worldRegistries, reloadableRegistries, BUILDER, Set.of(EnergizedPowerBOPMod.MODID));
    }
}

package me.jddev0.epbop.datagen;

import me.jddev0.ep.registry.EPRegistries;
import me.jddev0.ep.soil.EPSoilTypes;
import me.jddev0.ep.soil.SoilType;
import me.jddev0.epbop.soil.EPBOPSoilTypeTags;
import me.jddev0.epbop.soil.EPBOPSoilTypes;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModSoilTypeTagProvider extends FabricTagsProvider<SoilType> {
    public ModSoilTypeTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, EPRegistries.SOIL_TYPE, lookupProvider);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        builder(EPBOPSoilTypeTags.END_FLOWERS).
                add(EPSoilTypes.END_STONE).
                add(EPBOPSoilTypes.ALGAL_END_STONE);
    }
}

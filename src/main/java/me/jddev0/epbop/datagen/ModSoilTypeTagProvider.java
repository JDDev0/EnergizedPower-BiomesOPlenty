package me.jddev0.epbop.datagen;

import me.jddev0.ep.registry.EPRegistries;
import me.jddev0.ep.soil.EPSoilTypes;
import me.jddev0.ep.soil.SoilType;
import me.jddev0.epbop.soil.EPBOPSoilTypeTags;
import me.jddev0.epbop.soil.EPBOPSoilTypes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModSoilTypeTagProvider extends FabricTagProvider<SoilType> {
    public ModSoilTypeTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, EPRegistries.SOIL_TYPE, lookupProvider);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        tag(EPBOPSoilTypeTags.END_FLOWERS).
                add(EPSoilTypes.END_STONE).
                add(EPBOPSoilTypes.ALGAL_END_STONE);
    }
}

package me.jddev0.epbop.datagen;

import me.jddev0.ep.registry.EPRegistries;
import me.jddev0.ep.soil.EPSoilTypes;
import me.jddev0.ep.soil.SoilType;
import me.jddev0.epbop.EnergizedPowerBOPMod;
import me.jddev0.epbop.soil.EPBOPSoilTypeTags;
import me.jddev0.epbop.soil.EPBOPSoilTypes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.KeyTagProvider;

import java.util.concurrent.CompletableFuture;

public class ModSoilTypeTagProvider extends KeyTagProvider<SoilType> {
    public ModSoilTypeTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, EPRegistries.SOIL_TYPE, lookupProvider, EnergizedPowerBOPMod.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        tag(EPBOPSoilTypeTags.END_FLOWERS).
                add(EPSoilTypes.END_STONE).
                add(EPBOPSoilTypes.ALGAL_END_STONE);
    }
}

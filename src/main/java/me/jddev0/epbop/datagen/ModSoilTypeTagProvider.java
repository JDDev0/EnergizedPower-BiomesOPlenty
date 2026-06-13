package me.jddev0.epbop.datagen;

import me.jddev0.ep.registry.EPRegistries;
import me.jddev0.ep.soil.EPSoilTypes;
import me.jddev0.ep.soil.SoilType;
import me.jddev0.epbop.EnergizedPowerBOPMod;
import me.jddev0.epbop.soil.EPBOPSoilTypeTags;
import me.jddev0.epbop.soil.EPBOPSoilTypes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModSoilTypeTagProvider extends TagsProvider<SoilType> {
    public ModSoilTypeTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                  @Nullable ExistingFileHelper existingFileHelper) {
        super(output, EPRegistries.SOIL_TYPE, lookupProvider, EnergizedPowerBOPMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        tag(EPBOPSoilTypeTags.NETHER_FLOWERS).
                add(EPBOPSoilTypes.NETHERRACK).
                add(EPBOPSoilTypes.NYLIUM);

        tag(EPBOPSoilTypeTags.END_FLOWERS).
                add(EPSoilTypes.END_STONE).
                add(EPBOPSoilTypes.ALGAL_END_STONE);
    }
}

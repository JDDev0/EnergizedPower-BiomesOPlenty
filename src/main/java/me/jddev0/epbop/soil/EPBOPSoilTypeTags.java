package me.jddev0.epbop.soil;

import me.jddev0.ep.registry.EPRegistries;
import me.jddev0.ep.soil.SoilType;
import me.jddev0.epbop.EnergizedPowerBOPMod;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;

public class EPBOPSoilTypeTags {
    private EPBOPSoilTypeTags() {}

    public static final TagKey<SoilType> NETHER_FLOWERS = TagKey.create(EPRegistries.SOIL_TYPE,
            Identifier.fromNamespaceAndPath(EnergizedPowerBOPMod.MODID, "nether_crops"));
    public static final TagKey<SoilType> END_FLOWERS = TagKey.create(EPRegistries.SOIL_TYPE,
            Identifier.fromNamespaceAndPath(EnergizedPowerBOPMod.MODID, "end_flowers"));
}

package me.jddev0.epbop.soil;

import me.jddev0.ep.registry.EPRegistries;
import me.jddev0.ep.soil.SoilType;
import me.jddev0.epbop.EnergizedPowerBOPMod;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

public final class EPBOPSoilTypes {
    private EPBOPSoilTypes() {}

    public static final ResourceKey<SoilType> ALGAL_END_STONE = registerKey("algal_end_stone"); //Like Grass

    public static void bootstrap(BootstrapContext<SoilType> context) {
        context.register(ALGAL_END_STONE, new SoilType(Component.translatable("block.biomesoplenty.algal_end_stone").withColor(0xae946c)));
    }

    public static ResourceKey<SoilType> registerKey(String name) {
        return ResourceKey.create(EPRegistries.SOIL_TYPE, ResourceLocation.fromNamespaceAndPath(EnergizedPowerBOPMod.MODID, name));
    }
}

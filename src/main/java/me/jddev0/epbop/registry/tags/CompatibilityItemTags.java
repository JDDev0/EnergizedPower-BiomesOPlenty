package me.jddev0.epbop.registry.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public final class CompatibilityItemTags {
    private CompatibilityItemTags() {}

    public static final TagKey<Item> FIR_LOGS = TagKey.create(Registries.ITEM,
            new ResourceLocation("biomesoplenty", "fir_logs"));
    public static final TagKey<Item> PINE_LOGS = TagKey.create(Registries.ITEM,
            new ResourceLocation("biomesoplenty", "pine_logs"));
    public static final TagKey<Item> MAPLE_LOGS = TagKey.create(Registries.ITEM,
            new ResourceLocation("biomesoplenty", "maple_logs"));
    public static final TagKey<Item> REDWOOD_LOGS = TagKey.create(Registries.ITEM,
            new ResourceLocation("biomesoplenty", "redwood_logs"));
    public static final TagKey<Item> MAHOGANY_LOGS = TagKey.create(Registries.ITEM,
            new ResourceLocation("biomesoplenty", "mahogany_logs"));
    public static final TagKey<Item> JACARANDA_LOGS = TagKey.create(Registries.ITEM,
            new ResourceLocation("biomesoplenty", "jacaranda_logs"));
    public static final TagKey<Item> PALM_LOGS = TagKey.create(Registries.ITEM,
            new ResourceLocation("biomesoplenty", "palm_logs"));
    public static final TagKey<Item> WILLOW_LOGS = TagKey.create(Registries.ITEM,
            new ResourceLocation("biomesoplenty", "willow_logs"));
    public static final TagKey<Item> DEAD_LOGS = TagKey.create(Registries.ITEM,
            new ResourceLocation("biomesoplenty", "dead_logs"));
    public static final TagKey<Item> MAGIC_LOGS = TagKey.create(Registries.ITEM,
            new ResourceLocation("biomesoplenty", "magic_logs"));
    public static final TagKey<Item> UMBRAN_LOGS = TagKey.create(Registries.ITEM,
            new ResourceLocation("biomesoplenty", "umbran_logs"));
    public static final TagKey<Item> HELLBARK_LOGS = TagKey.create(Registries.ITEM,
            new ResourceLocation("biomesoplenty", "hellbark_logs"));
}
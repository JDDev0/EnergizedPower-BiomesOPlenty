package me.jddev0.epbop.datagen.recipe;

import biomesoplenty.api.BOPAPI;
import biomesoplenty.api.item.BOPItems;
import biomesoplenty.init.ModTags;
import me.jddev0.ep.recipe.*;
import me.jddev0.ep.soil.EPSoilTypeTags;
import me.jddev0.ep.soil.SoilType;
import me.jddev0.epbop.EnergizedPowerBOPMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;

public class ModRecipeGenerator extends RecipeProvider {
    private static final String BIOMES_O_PLENTY_MOD_ID = BOPAPI.MOD_ID;
    private static final String PATH_PREFIX = "compat/" + BIOMES_O_PLENTY_MOD_ID + "/";

    public ModRecipeGenerator(HolderLookup.Provider registries, RecipeOutput exporter) {
        super(registries, exporter);
    }

    @Override
    public void buildRecipes() {
        buildCrusherRecipes();
        buildSawmillRecipes();
        buildPlantGrowthChamberRecipes();
        buildCrystalGrowthChamberRecipes();
    }

    private void buildCrusherRecipes() {
        addCrusherRecipe(Ingredient.of(BOPItems.WHITE_SANDSTONE), new ItemStackTemplate(BOPItems.WHITE_SAND),
                "white_sandstone");
        addCrusherRecipe(Ingredient.of(BOPItems.SMOOTH_WHITE_SANDSTONE, BOPItems.CUT_WHITE_SANDSTONE,
                        BOPItems.CHISELED_WHITE_SANDSTONE), new ItemStackTemplate(BOPItems.WHITE_SAND),
                "white_sandstone_variants");

        addCrusherRecipe(Ingredient.of(BOPItems.ORANGE_SANDSTONE), new ItemStackTemplate(BOPItems.ORANGE_SAND),
                "orange_sandstone");
        addCrusherRecipe(Ingredient.of(BOPItems.SMOOTH_ORANGE_SANDSTONE, BOPItems.CUT_ORANGE_SANDSTONE,
                        BOPItems.CHISELED_ORANGE_SANDSTONE), new ItemStackTemplate(BOPItems.ORANGE_SAND),
                "orange_sandstone_variants");

        addCrusherRecipe(Ingredient.of(BOPItems.BLACK_SANDSTONE), new ItemStackTemplate(BOPItems.BLACK_SAND),
                "black_sandstone");
        addCrusherRecipe(Ingredient.of(BOPItems.SMOOTH_BLACK_SANDSTONE, BOPItems.CUT_BLACK_SANDSTONE,
                        BOPItems.CHISELED_BLACK_SANDSTONE), new ItemStackTemplate(BOPItems.BLACK_SAND),
                "black_sandstone_variants");

        addCrusherRecipe(Ingredient.of(BOPItems.BRIMSTONE_BRICKS, BOPItems.CHISELED_BRIMSTONE_BRICKS),
                new ItemStackTemplate(BOPItems.BRIMSTONE),
                "brimstone_variants");
    }

    private void buildSawmillRecipes() {
        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.ORIGIN_OAK_PLANKS),
                tag(ModTags.Items.ORIGIN_OAK_LOGS), Ingredient.of(BOPItems.ORIGIN_OAK_FENCE),
                Ingredient.of(BOPItems.ORIGIN_OAK_FENCE_GATE), Ingredient.of(BOPItems.ORIGIN_OAK_DOOR),
                Ingredient.of(BOPItems.ORIGIN_OAK_TRAPDOOR), Ingredient.of(BOPItems.ORIGIN_OAK_PRESSURE_PLATE),
                Ingredient.of(BOPItems.ORIGIN_OAK_SIGN), Ingredient.of(BOPItems.ORIGIN_OAK_SHELF),
                Ingredient.of(BOPItems.ORIGIN_OAK_BOAT), Ingredient.of(BOPItems.ORIGIN_OAK_CHEST_BOAT),
                false, "origin_oak");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.FIR_PLANKS),
                tag(ModTags.Items.FIR_LOGS), Ingredient.of(BOPItems.FIR_FENCE),
                Ingredient.of(BOPItems.FIR_FENCE_GATE), Ingredient.of(BOPItems.FIR_DOOR),
                Ingredient.of(BOPItems.FIR_TRAPDOOR), Ingredient.of(BOPItems.FIR_PRESSURE_PLATE),
                Ingredient.of(BOPItems.FIR_SIGN), Ingredient.of(BOPItems.FIR_SHELF),
                Ingredient.of(BOPItems.FIR_BOAT), Ingredient.of(BOPItems.FIR_CHEST_BOAT),
                false, "fir");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.PINE_PLANKS),
                tag(ModTags.Items.PINE_LOGS), Ingredient.of(BOPItems.PINE_FENCE),
                Ingredient.of(BOPItems.PINE_FENCE_GATE), Ingredient.of(BOPItems.PINE_DOOR),
                Ingredient.of(BOPItems.PINE_TRAPDOOR), Ingredient.of(BOPItems.PINE_PRESSURE_PLATE),
                Ingredient.of(BOPItems.PINE_SIGN), Ingredient.of(BOPItems.PINE_SHELF),
                Ingredient.of(BOPItems.PINE_BOAT), Ingredient.of(BOPItems.PINE_CHEST_BOAT),
                false, "pine");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.MAPLE_PLANKS),
                tag(ModTags.Items.MAPLE_LOGS), Ingredient.of(BOPItems.MAPLE_FENCE),
                Ingredient.of(BOPItems.MAPLE_FENCE_GATE), Ingredient.of(BOPItems.MAPLE_DOOR),
                Ingredient.of(BOPItems.MAPLE_TRAPDOOR), Ingredient.of(BOPItems.MAPLE_PRESSURE_PLATE),
                Ingredient.of(BOPItems.MAPLE_SIGN), Ingredient.of(BOPItems.MAPLE_SHELF),
                Ingredient.of(BOPItems.MAPLE_BOAT), Ingredient.of(BOPItems.MAPLE_CHEST_BOAT),
                false, "maple");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.REDWOOD_PLANKS),
                tag(ModTags.Items.REDWOOD_LOGS), Ingredient.of(BOPItems.REDWOOD_FENCE),
                Ingredient.of(BOPItems.REDWOOD_FENCE_GATE), Ingredient.of(BOPItems.REDWOOD_DOOR),
                Ingredient.of(BOPItems.REDWOOD_TRAPDOOR), Ingredient.of(BOPItems.REDWOOD_PRESSURE_PLATE),
                Ingredient.of(BOPItems.REDWOOD_SIGN), Ingredient.of(BOPItems.REDWOOD_SHELF),
                Ingredient.of(BOPItems.REDWOOD_BOAT), Ingredient.of(BOPItems.REDWOOD_CHEST_BOAT),
                false, "redwood");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.MAHOGANY_PLANKS),
                tag(ModTags.Items.MAHOGANY_LOGS), Ingredient.of(BOPItems.MAHOGANY_FENCE),
                Ingredient.of(BOPItems.MAHOGANY_FENCE_GATE), Ingredient.of(BOPItems.MAHOGANY_DOOR),
                Ingredient.of(BOPItems.MAHOGANY_TRAPDOOR), Ingredient.of(BOPItems.MAHOGANY_PRESSURE_PLATE),
                Ingredient.of(BOPItems.MAHOGANY_SIGN), Ingredient.of(BOPItems.MAHOGANY_SHELF),
                Ingredient.of(BOPItems.MAHOGANY_BOAT), Ingredient.of(BOPItems.MAHOGANY_CHEST_BOAT),
                false, "mahogany");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.JACARANDA_PLANKS),
                tag(ModTags.Items.JACARANDA_LOGS), Ingredient.of(BOPItems.JACARANDA_FENCE),
                Ingredient.of(BOPItems.JACARANDA_FENCE_GATE), Ingredient.of(BOPItems.JACARANDA_DOOR),
                Ingredient.of(BOPItems.JACARANDA_TRAPDOOR), Ingredient.of(BOPItems.JACARANDA_PRESSURE_PLATE),
                Ingredient.of(BOPItems.JACARANDA_SIGN), Ingredient.of(BOPItems.JACARANDA_SHELF),
                Ingredient.of(BOPItems.JACARANDA_BOAT), Ingredient.of(BOPItems.JACARANDA_CHEST_BOAT),
                false, "jacaranda");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.PALM_PLANKS),
                tag(ModTags.Items.PALM_LOGS), Ingredient.of(BOPItems.PALM_FENCE),
                Ingredient.of(BOPItems.PALM_FENCE_GATE), Ingredient.of(BOPItems.PALM_DOOR),
                Ingredient.of(BOPItems.PALM_TRAPDOOR), Ingredient.of(BOPItems.PALM_PRESSURE_PLATE),
                Ingredient.of(BOPItems.PALM_SIGN), Ingredient.of(BOPItems.PALM_SHELF),
                Ingredient.of(BOPItems.PALM_BOAT), Ingredient.of(BOPItems.PALM_CHEST_BOAT),
                false, "palm");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.WILLOW_PLANKS),
                tag(ModTags.Items.WILLOW_LOGS), Ingredient.of(BOPItems.WILLOW_FENCE),
                Ingredient.of(BOPItems.WILLOW_FENCE_GATE), Ingredient.of(BOPItems.WILLOW_DOOR),
                Ingredient.of(BOPItems.WILLOW_TRAPDOOR), Ingredient.of(BOPItems.WILLOW_PRESSURE_PLATE),
                Ingredient.of(BOPItems.WILLOW_SIGN), Ingredient.of(BOPItems.WILLOW_SHELF),
                Ingredient.of(BOPItems.WILLOW_BOAT), Ingredient.of(BOPItems.WILLOW_CHEST_BOAT),
                false, "willow");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.DEAD_PLANKS),
                tag(ModTags.Items.DEAD_LOGS), Ingredient.of(BOPItems.DEAD_FENCE),
                Ingredient.of(BOPItems.DEAD_FENCE_GATE), Ingredient.of(BOPItems.DEAD_DOOR),
                Ingredient.of(BOPItems.DEAD_TRAPDOOR), Ingredient.of(BOPItems.DEAD_PRESSURE_PLATE),
                Ingredient.of(BOPItems.DEAD_SIGN), Ingredient.of(BOPItems.DEAD_SHELF),
                Ingredient.of(BOPItems.DEAD_BOAT), Ingredient.of(BOPItems.DEAD_CHEST_BOAT),
                false, "dead");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.MAGIC_PLANKS),
                tag(ModTags.Items.MAGIC_LOGS), Ingredient.of(BOPItems.MAGIC_FENCE),
                Ingredient.of(BOPItems.MAGIC_FENCE_GATE), Ingredient.of(BOPItems.MAGIC_DOOR),
                Ingredient.of(BOPItems.MAGIC_TRAPDOOR), Ingredient.of(BOPItems.MAGIC_PRESSURE_PLATE),
                Ingredient.of(BOPItems.MAGIC_SIGN), Ingredient.of(BOPItems.MAGIC_SHELF),
                Ingredient.of(BOPItems.MAGIC_BOAT), Ingredient.of(BOPItems.MAGIC_CHEST_BOAT),
                false, "magic");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.UMBRAN_PLANKS),
                tag(ModTags.Items.UMBRAN_LOGS), Ingredient.of(BOPItems.UMBRAN_FENCE),
                Ingredient.of(BOPItems.UMBRAN_FENCE_GATE), Ingredient.of(BOPItems.UMBRAN_DOOR),
                Ingredient.of(BOPItems.UMBRAN_TRAPDOOR), Ingredient.of(BOPItems.UMBRAN_PRESSURE_PLATE),
                Ingredient.of(BOPItems.UMBRAN_SIGN), Ingredient.of(BOPItems.UMBRAN_SHELF),
                Ingredient.of(BOPItems.UMBRAN_BOAT), Ingredient.of(BOPItems.UMBRAN_CHEST_BOAT),
                false, "umbran");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.HELLBARK_PLANKS),
                tag(ModTags.Items.HELLBARK_LOGS), Ingredient.of(BOPItems.HELLBARK_FENCE),
                Ingredient.of(BOPItems.HELLBARK_FENCE_GATE), Ingredient.of(BOPItems.HELLBARK_DOOR),
                Ingredient.of(BOPItems.HELLBARK_TRAPDOOR), Ingredient.of(BOPItems.HELLBARK_PRESSURE_PLATE),
                Ingredient.of(BOPItems.HELLBARK_SIGN), Ingredient.of(BOPItems.HELLBARK_SHELF),
                Ingredient.of(BOPItems.HELLBARK_BOAT), Ingredient.of(BOPItems.HELLBARK_CHEST_BOAT),
                false, "hellbark");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.EMPYREAL_PLANKS),
                tag(ModTags.Items.EMPYREAL_LOGS), Ingredient.of(BOPItems.EMPYREAL_FENCE),
                Ingredient.of(BOPItems.EMPYREAL_FENCE_GATE), Ingredient.of(BOPItems.EMPYREAL_DOOR),
                Ingredient.of(BOPItems.EMPYREAL_TRAPDOOR), Ingredient.of(BOPItems.EMPYREAL_PRESSURE_PLATE),
                Ingredient.of(BOPItems.EMPYREAL_SIGN), Ingredient.of(BOPItems.EMPYREAL_SHELF),
                Ingredient.of(BOPItems.EMPYREAL_BOAT), Ingredient.of(BOPItems.EMPYREAL_CHEST_BOAT),
                false, "empyreal");
    }

    private void buildPlantGrowthChamberRecipes() {
        addBasicFlowerGrowingRecipe(BOPItems.MARIGOLD, "marigold");
        addBasicFlowerGrowingRecipe(BOPItems.VIOLET, "violet");
        addBasicFlowerGrowingRecipe(BOPItems.LAVENDER, "lavender");
        addBasicFlowerGrowingRecipe(BOPItems.WHITE_LAVENDER, "white_lavender");
        addBasicFlowerGrowingRecipe(BOPItems.ORANGE_COSMOS, "orange_cosmos");
        addBasicFlowerGrowingRecipe(BOPItems.PINK_DAFFODIL, "pink_daffodil");
        addBasicFlowerGrowingRecipe(BOPItems.PINK_HIBISCUS, "pink_hibiscus");

        addBasicFlowerGrowingRecipe(BOPItems.ORIGIN_ROSE, "origin_rose");

        addBasicFlowerGrowingRecipe(BOPItems.TALL_LAVENDER, "tall_lavender");
        addBasicFlowerGrowingRecipe(BOPItems.TALL_WHITE_LAVENDER, "tall_white_lavender");
        addBasicFlowerGrowingRecipe(BOPItems.BLUE_HYDRANGEA, "blue_hydrangea");
        addBasicFlowerGrowingRecipe(BOPItems.GOLDENROD, "goldenrod");
        addBasicFlowerGrowingRecipe(BOPItems.ICY_IRIS, "icy_iris");
        addBasicFlowerGrowingRecipe(BOPItems.GLOWFLOWER, "glowflower");
        addBasicFlowerGrowingRecipe(BOPItems.WILTED_LILY, "wilted_liliy");

        addBasicMushroomsGrowingRecipe(BOPItems.TOADSTOOL, "toadstool");

        addPlantGrowthChamberRecipe(Ingredient.of(BOPItems.PURPLE_WILDFLOWERS), new OutputItemStackTemplateWithPercentages[] {
                new OutputItemStackTemplateWithPercentages(new ItemStackTemplate(BOPItems.PURPLE_WILDFLOWERS), new double[] {
                        1., 1., 1., .67, .33, .33, .15
                })
        }, EPSoilTypeTags.FLOWERS, Fluids.WATER, 0.0625, 4000,  "purple_wildflower", "purple_wildflower");

        addPlantGrowthChamberRecipe(Ingredient.of(BOPItems.WHITE_PETALS), new OutputItemStackTemplateWithPercentages[] {
                new OutputItemStackTemplateWithPercentages(new ItemStackTemplate(BOPItems.WHITE_PETALS), new double[] {
                        1., 1., 1., .67, .33, .33, .15
                })
        }, EPSoilTypeTags.FLOWERS, Fluids.WATER, 0.0625, 4000,  "white_petals", "white_petals");
    }

    private void buildCrystalGrowthChamberRecipes() {
        addCrystalGrowthChamberRecipe(Ingredient.of(BOPItems.ROSE_QUARTZ_CHUNK),
                new OutputItemStackTemplateWithPercentages(new ItemStackTemplate(BOPItems.ROSE_QUARTZ_CHUNK), new double[] {
                        1., 1., .67, .5, .25, .125
                }), 16000);
    }

    private void addCrusherRecipe(Ingredient input, ItemStackTemplate output,
                                  String recipeIngredientName) {
        Identifier recipeId = Identifier.fromNamespaceAndPath(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "crusher/" +
                getItemName(output.item().value()) + "_from_crushing_" + recipeIngredientName);

        CrusherRecipe recipe = new CrusherRecipe(output, input);
        this.output.accept(getKey(recipeId), recipe, null);
    }

    private void addBasicWoodSawmillRecipe(ItemStackTemplate planksItem,
                                           Ingredient logsInput, Ingredient fenceInput, Ingredient fenceGateInput,
                                           Ingredient doorInput, Ingredient trapdoorInput, Ingredient pressurePlateInput,
                                           Ingredient signInput, Ingredient shelfInput, Ingredient boatInput,
                                           Ingredient chestBoatInput, boolean isRaft, String woodName) {
        addSawmillRecipe(logsInput, planksItem.withCount(6), 1, getItemName(planksItem.item().value()),
                woodName + "_logs");

        addBasicWoodWithoutLogsSawmillRecipe(planksItem, fenceInput, fenceGateInput, doorInput, trapdoorInput,
                pressurePlateInput, signInput, shelfInput, boatInput, chestBoatInput, isRaft, woodName);
    }
    private void addBasicWoodWithoutLogsSawmillRecipe(ItemStackTemplate planksItem,
                                                      Ingredient fenceInput, Ingredient fenceGateInput,
                                                      Ingredient doorInput, Ingredient trapdoorInput, Ingredient pressurePlateInput,
                                                      Ingredient signInput, Ingredient shelfInput, Ingredient boatInput,
                                                      Ingredient chestBoatInput, boolean isRaft, String woodName) {
        addBasicWoodWithoutLogsAndBoatsSawmillRecipe(planksItem, fenceInput, fenceGateInput, doorInput,
                trapdoorInput, pressurePlateInput, signInput, shelfInput, woodName);

        addSawmillRecipe(boatInput, planksItem.withCount(4), 3, getItemName(planksItem.item().value()),
                woodName + (isRaft?"_raft":"_boat"));
        addSawmillRecipe(chestBoatInput, planksItem.withCount(5), 7, getItemName(planksItem.item().value()),
                woodName + (isRaft?"_chest_raft":"_chest_boat"));
    }
    private void addBasicWoodWithoutLogsAndBoatsSawmillRecipe(ItemStackTemplate planksItem,
                                                              Ingredient fenceInput, Ingredient fenceGateInput,
                                                              Ingredient doorInput, Ingredient trapdoorInput, Ingredient pressurePlateInput,
                                                              Ingredient signInput, Ingredient shelfInput, String woodName) {
        addSawmillRecipe(fenceInput, planksItem, 2, getItemName(planksItem.item().value()),
                woodName + "_fence");
        addSawmillRecipe(fenceGateInput, planksItem.withCount(2), 3, getItemName(planksItem.item().value()),
                woodName + "_fence_gate");
        addSawmillRecipe(doorInput, planksItem, 3, getItemName(planksItem.item().value()),
                woodName + "_door");
        addSawmillRecipe(trapdoorInput, planksItem.withCount(2), 3, getItemName(planksItem.item().value()),
                woodName + "_trapdoor");
        addSawmillRecipe(pressurePlateInput, planksItem, 2, getItemName(planksItem.item().value()),
                woodName + "_pressure_plate");
        addSawmillRecipe(signInput, planksItem.withCount(2), 1, getItemName(planksItem.item().value()),
                woodName + "_sign");
        addSawmillRecipe(shelfInput, planksItem.withCount(3), 1, getItemName(planksItem.item().value()),
                woodName + "_shelf");
    }
    private void addSawmillRecipe(Ingredient input, ItemStackTemplate output,
                                  int sawdustAmount, String outputName, String recipeIngredientName) {
        Identifier recipeId = Identifier.fromNamespaceAndPath(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "sawmill/" +
                outputName + "_from_sawing_" + recipeIngredientName);

        SawmillRecipe recipe = new SawmillRecipe(output, input, sawdustAmount);
        this.output.accept(getKey(recipeId), recipe, null);
    }

    private void addBasicFlowerGrowingRecipe(ItemLike flowerItem, String outputName) {
        addPlantGrowthChamberRecipe(Ingredient.of(flowerItem), new OutputItemStackTemplateWithPercentages[] {
                new OutputItemStackTemplateWithPercentages(new ItemStackTemplate(flowerItem.asItem()), new double[] {
                        1., 1., .33
                })
        }, EPSoilTypeTags.FLOWERS, Fluids.WATER, 0.0625, 4000, outputName, getItemName(flowerItem));
    }
    private void addBasicMushroomsGrowingRecipe(ItemLike mushroomItem,
                                                String outputName) {
        addPlantGrowthChamberRecipe(ingredientOf(mushroomItem), new OutputItemStackTemplateWithPercentages[] {
                new OutputItemStackTemplateWithPercentages(new ItemStackTemplate(mushroomItem.asItem()), new double[] {
                        1., 1., .5, .25
                })
        }, EPSoilTypeTags.MUSHROOMS, Fluids.WATER, 0.0625, 4000, outputName, getItemName(mushroomItem));
    }
    private void addPlantGrowthChamberRecipe(Ingredient input,
                                             OutputItemStackTemplateWithPercentages[] outputs,
                                             TagKey<SoilType> soilType,
                                             Fluid fluid, double fluidConsumption, int ticks,
                                             String outputName, String recipeIngredientName) {
        addPlantGrowthChamberRecipe(input, outputs, soilType, new Fluid[] {fluid}, fluidConsumption, ticks, outputName, recipeIngredientName);
    }
    private void addPlantGrowthChamberRecipe(Ingredient input,
                                             OutputItemStackTemplateWithPercentages[] outputs,
                                             TagKey<SoilType> soilType,
                                             Fluid[] fluid, double fluidConsumption, int ticks,
                                             String outputName, String recipeIngredientName) {
        Identifier recipeId = Identifier.fromNamespaceAndPath(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "growing/" +
                outputName + "_from_growing_" + recipeIngredientName);

        PlantGrowthChamberRecipe recipe = new PlantGrowthChamberRecipe(outputs, input, soilType, fluid, fluidConsumption, ticks);
        this.output.accept(getKey(recipeId), recipe, null);
    }

    private void addCrystalGrowthChamberRecipe(Ingredient input, OutputItemStackTemplateWithPercentages output,
                                               int ticks) {
        addCrystalGrowthChamberRecipe(new IngredientWithCount(input), output, ticks);
    }
    private void addCrystalGrowthChamberRecipe(IngredientWithCount input, OutputItemStackTemplateWithPercentages output,
                                               int ticks) {
        Identifier recipeId = Identifier.fromNamespaceAndPath(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "crystal_growing/" +
                getItemName(output.output().item().value()));

        CrystalGrowthChamberRecipe recipe = new CrystalGrowthChamberRecipe(output, input, ticks);
        this.output.accept(getKey(recipeId), recipe, null);
    }

    private Ingredient ingredientOf(ItemLike item) {
        return Ingredient.of(item);
    }

    private Ingredient ingredientOf(ItemLike... items) {
        return Ingredient.of(items);
    }

    private Ingredient ingredientOf(TagKey<Item> tagKey) {
        return Ingredient.of(registries.lookupOrThrow(Registries.ITEM).getOrThrow(tagKey));
    }

    private static ResourceKey<Recipe<?>> getKey(Identifier recipeId) {
        return ResourceKey.create(Registries.RECIPE, recipeId);
    }
}

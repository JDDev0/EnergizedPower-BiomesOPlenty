package me.jddev0.epbop.datagen.recipe;

import biomesoplenty.api.BOPAPI;
import biomesoplenty.api.item.BOPItems;
import biomesoplenty.init.ModTags;
import me.jddev0.ep.recipe.*;
import me.jddev0.ep.soil.EPSoilTypeTags;
import me.jddev0.ep.soil.EPSoilTypes;
import me.jddev0.ep.soil.SoilType;
import me.jddev0.epbop.EnergizedPowerBOPMod;
import me.jddev0.epbop.soil.EPBOPSoilTypeTags;
import me.jddev0.epbop.soil.EPBOPSoilTypes;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.neoforge.common.conditions.NeoForgeConditions;

public class ModRecipeGenerator extends RecipeProvider {
    private static final String BIOMES_O_PLENTY_MOD_ID = BOPAPI.MOD_ID;
    private static final String PATH_PREFIX = "compat/" + BIOMES_O_PLENTY_MOD_ID + "/";

    public ModRecipeGenerator(HolderLookup.Provider registries, RecipeOutput recipeOutput) {
        super(registries, recipeOutput);
    }

    @Override
    public void buildRecipes() {
        buildCrusherRecipes();
        buildSawmillRecipes();
        buildPlantGrowthChamberRecipes();
        buildPlantGrowthChamberSoilRecipes();
        buildCrystalGrowthChamberRecipes();
    }

    private void buildCrusherRecipes() {
        addCrusherRecipe(ingredientOf(BOPItems.WHITE_SANDSTONE), new ItemStackTemplate(BOPItems.WHITE_SAND),
                "white_sandstone");
        addCrusherRecipe(ingredientOf(BOPItems.SMOOTH_WHITE_SANDSTONE, BOPItems.CUT_WHITE_SANDSTONE,
                        BOPItems.CHISELED_WHITE_SANDSTONE), new ItemStackTemplate(BOPItems.WHITE_SAND),
                "white_sandstone_variants");

        addCrusherRecipe(ingredientOf(BOPItems.ORANGE_SANDSTONE), new ItemStackTemplate(BOPItems.ORANGE_SAND),
                "orange_sandstone");
        addCrusherRecipe(ingredientOf(BOPItems.SMOOTH_ORANGE_SANDSTONE, BOPItems.CUT_ORANGE_SANDSTONE,
                        BOPItems.CHISELED_ORANGE_SANDSTONE), new ItemStackTemplate(BOPItems.ORANGE_SAND),
                "orange_sandstone_variants");

        addCrusherRecipe(ingredientOf(BOPItems.BLACK_SANDSTONE), new ItemStackTemplate(BOPItems.BLACK_SAND),
                "black_sandstone");
        addCrusherRecipe(ingredientOf(BOPItems.SMOOTH_BLACK_SANDSTONE, BOPItems.CUT_BLACK_SANDSTONE,
                        BOPItems.CHISELED_BLACK_SANDSTONE), new ItemStackTemplate(BOPItems.BLACK_SAND),
                "black_sandstone_variants");

        addCrusherRecipe(Ingredient.of(BOPItems.ORPIMENT_BRICKS, BOPItems.POLISHED_ORPIMENT, BOPItems.CHISELED_ORPIMENT),
                new ItemStackTemplate(BOPItems.ORPIMENT),
                "orpiment_variants");

        addCrusherRecipe(Ingredient.of(BOPItems.SPHALERITE_BRICKS, BOPItems.POLISHED_SPHALERITE, BOPItems.CHISELED_SPHALERITE),
                new ItemStackTemplate(BOPItems.SPHALERITE),
                "sphalerite_variants");
    }

    private void buildSawmillRecipes() {
        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.ORIGIN_OAK_PLANKS),
                ingredientOf(ModTags.Items.ORIGIN_OAK_LOGS), ingredientOf(BOPItems.ORIGIN_OAK_FENCE),
                ingredientOf(BOPItems.ORIGIN_OAK_FENCE_GATE), ingredientOf(BOPItems.ORIGIN_OAK_DOOR),
                ingredientOf(BOPItems.ORIGIN_OAK_TRAPDOOR), ingredientOf(BOPItems.ORIGIN_OAK_PRESSURE_PLATE),
                ingredientOf(BOPItems.ORIGIN_OAK_SIGN), ingredientOf(BOPItems.ORIGIN_OAK_SHELF),
                ingredientOf(BOPItems.ORIGIN_OAK_BOAT), ingredientOf(BOPItems.ORIGIN_OAK_CHEST_BOAT),
                false, "origin_oak");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.FIR_PLANKS),
                ingredientOf(ModTags.Items.FIR_LOGS), ingredientOf(BOPItems.FIR_FENCE),
                ingredientOf(BOPItems.FIR_FENCE_GATE), ingredientOf(BOPItems.FIR_DOOR),
                ingredientOf(BOPItems.FIR_TRAPDOOR), ingredientOf(BOPItems.FIR_PRESSURE_PLATE),
                ingredientOf(BOPItems.FIR_SIGN), ingredientOf(BOPItems.FIR_SHELF),
                ingredientOf(BOPItems.FIR_BOAT), ingredientOf(BOPItems.FIR_CHEST_BOAT),
                false, "fir");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.PINE_PLANKS),
                ingredientOf(ModTags.Items.PINE_LOGS), ingredientOf(BOPItems.PINE_FENCE),
                ingredientOf(BOPItems.PINE_FENCE_GATE), ingredientOf(BOPItems.PINE_DOOR),
                ingredientOf(BOPItems.PINE_TRAPDOOR), ingredientOf(BOPItems.PINE_PRESSURE_PLATE),
                ingredientOf(BOPItems.PINE_SIGN), ingredientOf(BOPItems.PINE_SHELF),
                ingredientOf(BOPItems.PINE_BOAT), ingredientOf(BOPItems.PINE_CHEST_BOAT),
                false, "pine");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.MAPLE_PLANKS),
                ingredientOf(ModTags.Items.MAPLE_LOGS), ingredientOf(BOPItems.MAPLE_FENCE),
                ingredientOf(BOPItems.MAPLE_FENCE_GATE), ingredientOf(BOPItems.MAPLE_DOOR),
                ingredientOf(BOPItems.MAPLE_TRAPDOOR), ingredientOf(BOPItems.MAPLE_PRESSURE_PLATE),
                ingredientOf(BOPItems.MAPLE_SIGN), ingredientOf(BOPItems.MAPLE_SHELF),
                ingredientOf(BOPItems.MAPLE_BOAT), ingredientOf(BOPItems.MAPLE_CHEST_BOAT),
                false, "maple");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.REDWOOD_PLANKS),
                ingredientOf(ModTags.Items.REDWOOD_LOGS), ingredientOf(BOPItems.REDWOOD_FENCE),
                ingredientOf(BOPItems.REDWOOD_FENCE_GATE), ingredientOf(BOPItems.REDWOOD_DOOR),
                ingredientOf(BOPItems.REDWOOD_TRAPDOOR), ingredientOf(BOPItems.REDWOOD_PRESSURE_PLATE),
                ingredientOf(BOPItems.REDWOOD_SIGN), ingredientOf(BOPItems.REDWOOD_SHELF),
                ingredientOf(BOPItems.REDWOOD_BOAT), ingredientOf(BOPItems.REDWOOD_CHEST_BOAT),
                false, "redwood");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.MAHOGANY_PLANKS),
                ingredientOf(ModTags.Items.MAHOGANY_LOGS), ingredientOf(BOPItems.MAHOGANY_FENCE),
                ingredientOf(BOPItems.MAHOGANY_FENCE_GATE), ingredientOf(BOPItems.MAHOGANY_DOOR),
                ingredientOf(BOPItems.MAHOGANY_TRAPDOOR), ingredientOf(BOPItems.MAHOGANY_PRESSURE_PLATE),
                ingredientOf(BOPItems.MAHOGANY_SIGN), ingredientOf(BOPItems.MAHOGANY_SHELF),
                ingredientOf(BOPItems.MAHOGANY_BOAT), ingredientOf(BOPItems.MAHOGANY_CHEST_BOAT),
                false, "mahogany");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.JACARANDA_PLANKS),
                ingredientOf(ModTags.Items.JACARANDA_LOGS), ingredientOf(BOPItems.JACARANDA_FENCE),
                ingredientOf(BOPItems.JACARANDA_FENCE_GATE), ingredientOf(BOPItems.JACARANDA_DOOR),
                ingredientOf(BOPItems.JACARANDA_TRAPDOOR), ingredientOf(BOPItems.JACARANDA_PRESSURE_PLATE),
                ingredientOf(BOPItems.JACARANDA_SIGN), ingredientOf(BOPItems.JACARANDA_SHELF),
                ingredientOf(BOPItems.JACARANDA_BOAT), ingredientOf(BOPItems.JACARANDA_CHEST_BOAT),
                false, "jacaranda");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.PALM_PLANKS),
                ingredientOf(ModTags.Items.PALM_LOGS), ingredientOf(BOPItems.PALM_FENCE),
                ingredientOf(BOPItems.PALM_FENCE_GATE), ingredientOf(BOPItems.PALM_DOOR),
                ingredientOf(BOPItems.PALM_TRAPDOOR), ingredientOf(BOPItems.PALM_PRESSURE_PLATE),
                ingredientOf(BOPItems.PALM_SIGN), ingredientOf(BOPItems.PALM_SHELF),
                ingredientOf(BOPItems.PALM_BOAT), ingredientOf(BOPItems.PALM_CHEST_BOAT),
                false, "palm");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.WILLOW_PLANKS),
                ingredientOf(ModTags.Items.WILLOW_LOGS), ingredientOf(BOPItems.WILLOW_FENCE),
                ingredientOf(BOPItems.WILLOW_FENCE_GATE), ingredientOf(BOPItems.WILLOW_DOOR),
                ingredientOf(BOPItems.WILLOW_TRAPDOOR), ingredientOf(BOPItems.WILLOW_PRESSURE_PLATE),
                ingredientOf(BOPItems.WILLOW_SIGN), ingredientOf(BOPItems.WILLOW_SHELF),
                ingredientOf(BOPItems.WILLOW_BOAT), ingredientOf(BOPItems.WILLOW_CHEST_BOAT),
                false, "willow");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.DEAD_PLANKS),
                ingredientOf(ModTags.Items.DEAD_LOGS), ingredientOf(BOPItems.DEAD_FENCE),
                ingredientOf(BOPItems.DEAD_FENCE_GATE), ingredientOf(BOPItems.DEAD_DOOR),
                ingredientOf(BOPItems.DEAD_TRAPDOOR), ingredientOf(BOPItems.DEAD_PRESSURE_PLATE),
                ingredientOf(BOPItems.DEAD_SIGN), ingredientOf(BOPItems.DEAD_SHELF),
                ingredientOf(BOPItems.DEAD_BOAT), ingredientOf(BOPItems.DEAD_CHEST_BOAT),
                false, "dead");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.MAGIC_PLANKS),
                ingredientOf(ModTags.Items.MAGIC_LOGS), ingredientOf(BOPItems.MAGIC_FENCE),
                ingredientOf(BOPItems.MAGIC_FENCE_GATE), ingredientOf(BOPItems.MAGIC_DOOR),
                ingredientOf(BOPItems.MAGIC_TRAPDOOR), ingredientOf(BOPItems.MAGIC_PRESSURE_PLATE),
                ingredientOf(BOPItems.MAGIC_SIGN), ingredientOf(BOPItems.MAGIC_SHELF),
                ingredientOf(BOPItems.MAGIC_BOAT), ingredientOf(BOPItems.MAGIC_CHEST_BOAT),
                false, "magic");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.UMBRAN_PLANKS),
                ingredientOf(ModTags.Items.UMBRAN_LOGS), ingredientOf(BOPItems.UMBRAN_FENCE),
                ingredientOf(BOPItems.UMBRAN_FENCE_GATE), ingredientOf(BOPItems.UMBRAN_DOOR),
                ingredientOf(BOPItems.UMBRAN_TRAPDOOR), ingredientOf(BOPItems.UMBRAN_PRESSURE_PLATE),
                ingredientOf(BOPItems.UMBRAN_SIGN), ingredientOf(BOPItems.UMBRAN_SHELF),
                ingredientOf(BOPItems.UMBRAN_BOAT), ingredientOf(BOPItems.UMBRAN_CHEST_BOAT),
                false, "umbran");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.HELLBARK_PLANKS),
                ingredientOf(ModTags.Items.HELLBARK_LOGS), ingredientOf(BOPItems.HELLBARK_FENCE),
                ingredientOf(BOPItems.HELLBARK_FENCE_GATE), ingredientOf(BOPItems.HELLBARK_DOOR),
                ingredientOf(BOPItems.HELLBARK_TRAPDOOR), ingredientOf(BOPItems.HELLBARK_PRESSURE_PLATE),
                ingredientOf(BOPItems.HELLBARK_SIGN), ingredientOf(BOPItems.HELLBARK_SHELF),
                ingredientOf(BOPItems.HELLBARK_BOAT), ingredientOf(BOPItems.HELLBARK_CHEST_BOAT),
                false, "hellbark");

        addBasicWoodSawmillRecipe(new ItemStackTemplate(BOPItems.EMPYREAL_PLANKS),
                ingredientOf(ModTags.Items.EMPYREAL_LOGS), ingredientOf(BOPItems.EMPYREAL_FENCE),
                ingredientOf(BOPItems.EMPYREAL_FENCE_GATE), ingredientOf(BOPItems.EMPYREAL_DOOR),
                ingredientOf(BOPItems.EMPYREAL_TRAPDOOR), ingredientOf(BOPItems.EMPYREAL_PRESSURE_PLATE),
                ingredientOf(BOPItems.EMPYREAL_SIGN), ingredientOf(BOPItems.EMPYREAL_SHELF),
                ingredientOf(BOPItems.EMPYREAL_BOAT), ingredientOf(BOPItems.EMPYREAL_CHEST_BOAT),
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

        addPlantGrowthChamberRecipe(ingredientOf(BOPItems.PURPLE_WILDFLOWERS), new OutputItemStackTemplateWithPercentages[] {
                new OutputItemStackTemplateWithPercentages(new ItemStackTemplate(BOPItems.PURPLE_WILDFLOWERS), new double[] {
                        1., 1., 1., .67, .33, .33, .15
                })
        }, EPSoilTypeTags.FLOWERS, Fluids.WATER, 0.0625, 4000,  "purple_wildflower", "purple_wildflower");

        addPlantGrowthChamberRecipe(ingredientOf(BOPItems.WHITE_PETALS), new OutputItemStackTemplateWithPercentages[] {
                new OutputItemStackTemplateWithPercentages(new ItemStackTemplate(BOPItems.WHITE_PETALS), new double[] {
                        1., 1., 1., .67, .33, .33, .15
                })
        }, EPSoilTypeTags.FLOWERS, Fluids.WATER, 0.0625, 4000,  "white_petals", "white_petals");

        addPlantGrowthChamberRecipe(ingredientOf(BOPItems.BARLEY), new OutputItemStackTemplateWithPercentages[] {
                new OutputItemStackTemplateWithPercentages(new ItemStackTemplate(BOPItems.BARLEY), new double[] {
                        1., .75, .25
                })
        }, EPSoilTypeTags.CROPS, Fluids.WATER, 0.0625, 4000, "barley", "barley");

        addPlantGrowthChamberRecipe(ingredientOf(BOPItems.WATERLILY), new OutputItemStackTemplateWithPercentages[] {
                new OutputItemStackTemplateWithPercentages(new ItemStackTemplate(BOPItems.WATERLILY), new double[] {
                        1., .75, .25, .25
                })
        }, EPSoilTypeTags.WATER_CROPS, Fluids.WATER, 0.125, 4000, "waterlilies", "waterlily");

        addPlantGrowthChamberRecipe(ingredientOf(BOPItems.TINY_CACTUS), new OutputItemStackTemplateWithPercentages[] {
                new OutputItemStackTemplateWithPercentages(new ItemStackTemplate(BOPItems.TINY_CACTUS), new double[] {
                        1., 1., .33
                })
        }, EPSoilTypeTags.DESERT_CROPS, Fluids.WATER, 0.001, 4000, "tiny_cactus", "tiny_cactus");

        addNetherFlowerGrowingRecipe(BOPItems.BURNING_BLOSSOM, "burning_blossom");

        addPlantGrowthChamberRecipe(ingredientOf(BOPItems.BRAMBLE), new OutputItemStackTemplateWithPercentages[] {
                new OutputItemStackTemplateWithPercentages(new ItemStackTemplate(BOPItems.BRAMBLE), new double[] {
                        1., 1., .67, .67, .33, .17, .17
                })
        }, EPSoilTypeTags.NETHER_FLOWERS, Fluids.LAVA, 0.001, 4000, "bramble", "bramble");

        addPlantGrowthChamberRecipe(ingredientOf(BOPItems.LUMALOOP), new OutputItemStackTemplateWithPercentages[] {
                new OutputItemStackTemplateWithPercentages(new ItemStackTemplate(BOPItems.LUMALOOP), new double[] {
                        1., 1., .67, .67, .33, .17, .17
                })
        }, EPBOPSoilTypeTags.END_FLOWERS, Fluids.WATER, 0.00000001, 4000, "lumaloops", "lumaloop");
    }

    private void buildPlantGrowthChamberSoilRecipes() {
        addPlantGrowthChamberSoilRecipe(ingredientOf(BOPItems.WHITE_SAND, BOPItems.ORANGE_SAND, BOPItems.BLACK_SAND),
                EPSoilTypes.SAND, 1.0, 1.0, 1.0, "sand");

        addPlantGrowthChamberSoilRecipe(ingredientOf(BOPItems.ORIGIN_GRASS_BLOCK),
                EPSoilTypes.GRASS, 1.1, 1.0, 1.0, "origin_grass");

        addPlantGrowthChamberSoilRecipe(ingredientOf(BOPItems.FLESH),
                EPSoilTypes.NETHERRACK, 1.1, 0.5, 1.0, "flesh");

        addPlantGrowthChamberSoilRecipe(ingredientOf(BOPItems.ALGAL_END_STONE),
                EPBOPSoilTypes.ALGAL_END_STONE, 1.25, 0.75, 1.0, "algal_end_stone");
    }

    private void buildCrystalGrowthChamberRecipes() {
        addCrystalGrowthChamberRecipe(ingredientOf(BOPItems.ROSE_QUARTZ_CHUNK),
                new OutputItemStackTemplateWithPercentages(new ItemStackTemplate(BOPItems.ROSE_QUARTZ_CHUNK), new double[] {
                        1., 1., .67, .5, .25, .125
                }), 16000);
    }

    private void addCrusherRecipe(Ingredient input, ItemStackTemplate output, String recipeIngredientName) {
        Identifier recipeId = Identifier.fromNamespaceAndPath(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "crusher/" +
                getItemName(output.item().value()) + "_from_crushing_" + recipeIngredientName);

        CrusherRecipe recipe = new CrusherRecipe(output, input);
        this.output.accept(getKey(recipeId), recipe, null, NeoForgeConditions.modLoaded(BIOMES_O_PLENTY_MOD_ID));
    }

    private void addBasicWoodSawmillRecipe(ItemStackTemplate planksItem,
                                           Ingredient logsInput, Ingredient fenceInput, Ingredient fenceGateInput,
                                           Ingredient doorInput, Ingredient trapdoorInput, Ingredient pressurePlateInput,
                                           Ingredient signInput, Ingredient shelfInput,
                                           Ingredient boatInput, Ingredient chestBoatInput, boolean isRaft, String woodName) {
        addSawmillRecipe(logsInput, planksItem.withCount(6), 1, getItemName(planksItem.item().value()),
                woodName + "_logs");

        addBasicWoodWithoutLogsSawmillRecipe(planksItem, fenceInput, fenceGateInput, doorInput, trapdoorInput,
                pressurePlateInput, signInput, shelfInput, boatInput, chestBoatInput, isRaft, woodName);
    }
    private void addBasicWoodWithoutLogsSawmillRecipe(ItemStackTemplate planksItem,
                                                      Ingredient fenceInput, Ingredient fenceGateInput,
                                                      Ingredient doorInput, Ingredient trapdoorInput, Ingredient pressurePlateInput,
                                                      Ingredient signInput, Ingredient shelfInput,
                                                      Ingredient boatInput, Ingredient chestBoatInput, boolean isRaft, String woodName) {
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
        this.output.accept(getKey(recipeId), recipe, null, NeoForgeConditions.modLoaded(BIOMES_O_PLENTY_MOD_ID));
    }

    private void addNetherFlowerGrowingRecipe(ItemLike flowerItem, String outputName) {
        addPlantGrowthChamberRecipe(Ingredient.of(flowerItem), new OutputItemStackTemplateWithPercentages[] {
                new OutputItemStackTemplateWithPercentages(new ItemStackTemplate(flowerItem.asItem()), new double[] {
                        1., 1., .33
                })
        }, EPSoilTypeTags.NETHER_FLOWERS, Fluids.LAVA, 0.001, 4000, outputName, getItemName(flowerItem));
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

    private void addPlantGrowthChamberSoilRecipe(Ingredient input,
                                                 ResourceKey<SoilType> soilType,
                                                 double speedMultiplier,
                                                 double fluidConsumptionMultiplier, double energyConsumptionMultiplier,
                                                 String recipeIngredientName) {
        Identifier recipeId = Identifier.fromNamespaceAndPath(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "growing/soil/" +
                recipeIngredientName);

        PlantGrowthChamberSoilRecipe recipe = new PlantGrowthChamberSoilRecipe(input, soilType,
                speedMultiplier, fluidConsumptionMultiplier, energyConsumptionMultiplier);
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
        this.output.accept(getKey(recipeId), recipe, null, NeoForgeConditions.modLoaded(BIOMES_O_PLENTY_MOD_ID));
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

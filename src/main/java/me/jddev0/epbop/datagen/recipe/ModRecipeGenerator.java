package me.jddev0.epbop.datagen.recipe;

import biomesoplenty.api.BOPAPI;
import biomesoplenty.api.item.BOPItems;
import biomesoplenty.init.ModTags;
import me.jddev0.ep.recipe.*;
import me.jddev0.epbop.EnergizedPowerBOPMod;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

public class ModRecipeGenerator extends RecipeGenerator {
    private static final String BIOMES_O_PLENTY_MOD_ID = BOPAPI.MOD_ID;
    private static final String PATH_PREFIX = "compat/" + BIOMES_O_PLENTY_MOD_ID + "/";

    public ModRecipeGenerator(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {
        super(registries, exporter);
    }

    @Override
    public void generate() {
        buildCrusherRecipes();
        buildSawmillRecipes();
        buildPlantGrowthChamberRecipes();
        buildCrystalGrowthChamberRecipes();
    }

    private void buildCrusherRecipes() {
        addCrusherRecipe(Ingredient.ofItems(BOPItems.WHITE_SANDSTONE), new ItemStack(BOPItems.WHITE_SAND),
                "white_sandstone");
        addCrusherRecipe(Ingredient.ofItems(BOPItems.SMOOTH_WHITE_SANDSTONE, BOPItems.CUT_WHITE_SANDSTONE,
                        BOPItems.CHISELED_WHITE_SANDSTONE), new ItemStack(BOPItems.WHITE_SAND),
                "white_sandstone_variants");

        addCrusherRecipe(Ingredient.ofItems(BOPItems.ORANGE_SANDSTONE), new ItemStack(BOPItems.ORANGE_SAND),
                "orange_sandstone");
        addCrusherRecipe(Ingredient.ofItems(BOPItems.SMOOTH_ORANGE_SANDSTONE, BOPItems.CUT_ORANGE_SANDSTONE,
                        BOPItems.CHISELED_ORANGE_SANDSTONE), new ItemStack(BOPItems.ORANGE_SAND),
                "orange_sandstone_variants");

        addCrusherRecipe(Ingredient.ofItems(BOPItems.BLACK_SANDSTONE), new ItemStack(BOPItems.BLACK_SAND),
                "black_sandstone");
        addCrusherRecipe(Ingredient.ofItems(BOPItems.SMOOTH_BLACK_SANDSTONE, BOPItems.CUT_BLACK_SANDSTONE,
                        BOPItems.CHISELED_BLACK_SANDSTONE), new ItemStack(BOPItems.BLACK_SAND),
                "black_sandstone_variants");

        addCrusherRecipe(Ingredient.ofItems(BOPItems.BRIMSTONE_BRICKS, BOPItems.CHISELED_BRIMSTONE_BRICKS),
                new ItemStack(BOPItems.BRIMSTONE),
                "brimstone_variants");
    }

    private void buildSawmillRecipes() {
        addBasicWoodSawmillRecipe(new ItemStack(BOPItems.FIR_PLANKS),
                ingredientFromTag(ModTags.Items.FIR_LOGS), Ingredient.ofItems(BOPItems.FIR_FENCE),
                Ingredient.ofItems(BOPItems.FIR_FENCE_GATE), Ingredient.ofItems(BOPItems.FIR_DOOR),
                Ingredient.ofItems(BOPItems.FIR_TRAPDOOR), Ingredient.ofItems(BOPItems.FIR_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.FIR_SIGN), Ingredient.ofItems(BOPItems.FIR_BOAT), Ingredient.ofItems(BOPItems.FIR_CHEST_BOAT),
                false, "fir");

        addBasicWoodSawmillRecipe(new ItemStack(BOPItems.PINE_PLANKS),
                ingredientFromTag(ModTags.Items.PINE_LOGS), Ingredient.ofItems(BOPItems.PINE_FENCE),
                Ingredient.ofItems(BOPItems.PINE_FENCE_GATE), Ingredient.ofItems(BOPItems.PINE_DOOR),
                Ingredient.ofItems(BOPItems.PINE_TRAPDOOR), Ingredient.ofItems(BOPItems.PINE_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.PINE_SIGN), Ingredient.ofItems(BOPItems.PINE_BOAT), Ingredient.ofItems(BOPItems.PINE_CHEST_BOAT),
                false, "pine");

        addBasicWoodSawmillRecipe(new ItemStack(BOPItems.MAPLE_PLANKS),
                ingredientFromTag(ModTags.Items.MAPLE_LOGS), Ingredient.ofItems(BOPItems.MAPLE_FENCE),
                Ingredient.ofItems(BOPItems.MAPLE_FENCE_GATE), Ingredient.ofItems(BOPItems.MAPLE_DOOR),
                Ingredient.ofItems(BOPItems.MAPLE_TRAPDOOR), Ingredient.ofItems(BOPItems.MAPLE_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.MAPLE_SIGN), Ingredient.ofItems(BOPItems.MAPLE_BOAT), Ingredient.ofItems(BOPItems.MAPLE_CHEST_BOAT),
                false, "maple");

        addBasicWoodSawmillRecipe(new ItemStack(BOPItems.REDWOOD_PLANKS),
                ingredientFromTag(ModTags.Items.REDWOOD_LOGS), Ingredient.ofItems(BOPItems.REDWOOD_FENCE),
                Ingredient.ofItems(BOPItems.REDWOOD_FENCE_GATE), Ingredient.ofItems(BOPItems.REDWOOD_DOOR),
                Ingredient.ofItems(BOPItems.REDWOOD_TRAPDOOR), Ingredient.ofItems(BOPItems.REDWOOD_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.REDWOOD_SIGN), Ingredient.ofItems(BOPItems.REDWOOD_BOAT), Ingredient.ofItems(BOPItems.REDWOOD_CHEST_BOAT),
                false, "redwood");

        addBasicWoodSawmillRecipe(new ItemStack(BOPItems.MAHOGANY_PLANKS),
                ingredientFromTag(ModTags.Items.MAHOGANY_LOGS), Ingredient.ofItems(BOPItems.MAHOGANY_FENCE),
                Ingredient.ofItems(BOPItems.MAHOGANY_FENCE_GATE), Ingredient.ofItems(BOPItems.MAHOGANY_DOOR),
                Ingredient.ofItems(BOPItems.MAHOGANY_TRAPDOOR), Ingredient.ofItems(BOPItems.MAHOGANY_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.MAHOGANY_SIGN), Ingredient.ofItems(BOPItems.MAHOGANY_BOAT), Ingredient.ofItems(BOPItems.MAHOGANY_CHEST_BOAT),
                false, "mahogany");

        addBasicWoodSawmillRecipe(new ItemStack(BOPItems.JACARANDA_PLANKS),
                ingredientFromTag(ModTags.Items.JACARANDA_LOGS), Ingredient.ofItems(BOPItems.JACARANDA_FENCE),
                Ingredient.ofItems(BOPItems.JACARANDA_FENCE_GATE), Ingredient.ofItems(BOPItems.JACARANDA_DOOR),
                Ingredient.ofItems(BOPItems.JACARANDA_TRAPDOOR), Ingredient.ofItems(BOPItems.JACARANDA_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.JACARANDA_SIGN), Ingredient.ofItems(BOPItems.JACARANDA_BOAT), Ingredient.ofItems(BOPItems.JACARANDA_CHEST_BOAT),
                false, "jacaranda");

        addBasicWoodSawmillRecipe(new ItemStack(BOPItems.PALM_PLANKS),
                ingredientFromTag(ModTags.Items.PALM_LOGS), Ingredient.ofItems(BOPItems.PALM_FENCE),
                Ingredient.ofItems(BOPItems.PALM_FENCE_GATE), Ingredient.ofItems(BOPItems.PALM_DOOR),
                Ingredient.ofItems(BOPItems.PALM_TRAPDOOR), Ingredient.ofItems(BOPItems.PALM_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.PALM_SIGN), Ingredient.ofItems(BOPItems.PALM_BOAT), Ingredient.ofItems(BOPItems.PALM_CHEST_BOAT),
                false, "palm");

        addBasicWoodSawmillRecipe(new ItemStack(BOPItems.WILLOW_PLANKS),
                ingredientFromTag(ModTags.Items.WILLOW_LOGS), Ingredient.ofItems(BOPItems.WILLOW_FENCE),
                Ingredient.ofItems(BOPItems.WILLOW_FENCE_GATE), Ingredient.ofItems(BOPItems.WILLOW_DOOR),
                Ingredient.ofItems(BOPItems.WILLOW_TRAPDOOR), Ingredient.ofItems(BOPItems.WILLOW_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.WILLOW_SIGN), Ingredient.ofItems(BOPItems.WILLOW_BOAT), Ingredient.ofItems(BOPItems.WILLOW_CHEST_BOAT),
                false, "willow");

        addBasicWoodSawmillRecipe(new ItemStack(BOPItems.DEAD_PLANKS),
                ingredientFromTag(ModTags.Items.DEAD_LOGS), Ingredient.ofItems(BOPItems.DEAD_FENCE),
                Ingredient.ofItems(BOPItems.DEAD_FENCE_GATE), Ingredient.ofItems(BOPItems.DEAD_DOOR),
                Ingredient.ofItems(BOPItems.DEAD_TRAPDOOR), Ingredient.ofItems(BOPItems.DEAD_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.DEAD_SIGN), Ingredient.ofItems(BOPItems.DEAD_BOAT), Ingredient.ofItems(BOPItems.DEAD_CHEST_BOAT),
                false, "dead");

        addBasicWoodSawmillRecipe(new ItemStack(BOPItems.MAGIC_PLANKS),
                ingredientFromTag(ModTags.Items.MAGIC_LOGS), Ingredient.ofItems(BOPItems.MAGIC_FENCE),
                Ingredient.ofItems(BOPItems.MAGIC_FENCE_GATE), Ingredient.ofItems(BOPItems.MAGIC_DOOR),
                Ingredient.ofItems(BOPItems.MAGIC_TRAPDOOR), Ingredient.ofItems(BOPItems.MAGIC_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.MAGIC_SIGN), Ingredient.ofItems(BOPItems.MAGIC_BOAT), Ingredient.ofItems(BOPItems.MAGIC_CHEST_BOAT),
                false, "magic");

        addBasicWoodSawmillRecipe(new ItemStack(BOPItems.UMBRAN_PLANKS),
                ingredientFromTag(ModTags.Items.UMBRAN_LOGS), Ingredient.ofItems(BOPItems.UMBRAN_FENCE),
                Ingredient.ofItems(BOPItems.UMBRAN_FENCE_GATE), Ingredient.ofItems(BOPItems.UMBRAN_DOOR),
                Ingredient.ofItems(BOPItems.UMBRAN_TRAPDOOR), Ingredient.ofItems(BOPItems.UMBRAN_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.UMBRAN_SIGN), Ingredient.ofItems(BOPItems.UMBRAN_BOAT), Ingredient.ofItems(BOPItems.UMBRAN_CHEST_BOAT),
                false, "umbran");

        addBasicWoodSawmillRecipe(new ItemStack(BOPItems.HELLBARK_PLANKS),
                ingredientFromTag(ModTags.Items.HELLBARK_LOGS), Ingredient.ofItems(BOPItems.HELLBARK_FENCE),
                Ingredient.ofItems(BOPItems.HELLBARK_FENCE_GATE), Ingredient.ofItems(BOPItems.HELLBARK_DOOR),
                Ingredient.ofItems(BOPItems.HELLBARK_TRAPDOOR), Ingredient.ofItems(BOPItems.HELLBARK_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.HELLBARK_SIGN), Ingredient.ofItems(BOPItems.HELLBARK_BOAT), Ingredient.ofItems(BOPItems.HELLBARK_CHEST_BOAT),
                false, "hellbark");

        addBasicWoodSawmillRecipe(new ItemStack(BOPItems.EMPYREAL_PLANKS),
                ingredientFromTag(ModTags.Items.EMPYREAL_LOGS), Ingredient.ofItems(BOPItems.EMPYREAL_FENCE),
                Ingredient.ofItems(BOPItems.EMPYREAL_FENCE_GATE), Ingredient.ofItems(BOPItems.EMPYREAL_DOOR),
                Ingredient.ofItems(BOPItems.EMPYREAL_TRAPDOOR), Ingredient.ofItems(BOPItems.EMPYREAL_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.EMPYREAL_SIGN), Ingredient.ofItems(BOPItems.EMPYREAL_BOAT), Ingredient.ofItems(BOPItems.EMPYREAL_CHEST_BOAT),
                false, "empyreal");
    }

    private void buildPlantGrowthChamberRecipes() {
        addBasicFlowerGrowingRecipe(BOPItems.VIOLET, "violet");
        addBasicFlowerGrowingRecipe(BOPItems.LAVENDER, "lavender");
        addBasicFlowerGrowingRecipe(BOPItems.WHITE_LAVENDER, "white_lavender");
        addBasicFlowerGrowingRecipe(BOPItems.ORANGE_COSMOS, "orange_cosmos");
        addBasicFlowerGrowingRecipe(BOPItems.PINK_DAFFODIL, "pink_daffodil");
        addBasicFlowerGrowingRecipe(BOPItems.PINK_HIBISCUS, "pink_hibiscus");

        addBasicFlowerGrowingRecipe(BOPItems.ROSE, "rose");

        addBasicFlowerGrowingRecipe(BOPItems.TALL_LAVENDER, "tall_lavender");
        addBasicFlowerGrowingRecipe(BOPItems.TALL_WHITE_LAVENDER, "tall_white_lavender");
        addBasicFlowerGrowingRecipe(BOPItems.BLUE_HYDRANGEA, "blue_hydrangea");
        addBasicFlowerGrowingRecipe(BOPItems.GOLDENROD, "goldenrod");
        addBasicFlowerGrowingRecipe(BOPItems.ICY_IRIS, "icy_iris");
        addBasicFlowerGrowingRecipe(BOPItems.GLOWFLOWER, "glowflower");
        addBasicFlowerGrowingRecipe(BOPItems.WILTED_LILY, "wilted_liliy");

        addBasicMushroomsGrowingRecipe(BOPItems.TOADSTOOL, "toadstool");

        addPlantGrowthChamberRecipe(Ingredient.ofItems(BOPItems.WILDFLOWER), new OutputItemStackWithPercentages[] {
                new OutputItemStackWithPercentages(new ItemStack(BOPItems.WILDFLOWER), new double[] {
                        1., 1., 1., .67, .33, .33, .15
                })
        }, 16000, "wildflower", "wildflower");

        addPlantGrowthChamberRecipe(Ingredient.ofItems(BOPItems.WHITE_PETALS), new OutputItemStackWithPercentages[] {
                new OutputItemStackWithPercentages(new ItemStack(BOPItems.WHITE_PETALS), new double[] {
                        1., 1., 1., .67, .33, .33, .15
                })
        }, 16000, "white_petals", "white_petals");
    }

    private void buildCrystalGrowthChamberRecipes() {
        addCrystalGrowthChamberRecipe(Ingredient.ofItems(BOPItems.ROSE_QUARTZ_CHUNK),
                new OutputItemStackWithPercentages(new ItemStack(BOPItems.ROSE_QUARTZ_CHUNK), new double[] {
                        1., 1., .67, .5, .25, .125
                }), 16000);
    }

    private void addCrusherRecipe(Ingredient input, ItemStack output,
                                  String recipeIngredientName) {
        Identifier recipeId = Identifier.of(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "crusher/" +
                getItemPath(output.getItem()) + "_from_crushing_" + recipeIngredientName);

        CrusherRecipe recipe = new CrusherRecipe(output, input);
        exporter.accept(getKey(recipeId), recipe, null);
    }

    private void addBasicWoodSawmillRecipe(ItemStack planksItem,
                                           Ingredient logsInput, Ingredient fenceInput, Ingredient fenceGateInput,
                                           Ingredient doorInput, Ingredient trapdoorInput, Ingredient pressurePlateInput,
                                           Ingredient signInput, Ingredient boatInput, Ingredient chestBoatInput,
                                           boolean isRaft, String woodName) {
        addSawmillRecipe(logsInput, planksItem.copyWithCount(6), 1, getItemPath(planksItem.getItem()),
                woodName + "_logs");

        addBasicWoodWithoutLogsSawmillRecipe(planksItem, fenceInput, fenceGateInput, doorInput, trapdoorInput,
                pressurePlateInput, signInput, boatInput, chestBoatInput, isRaft, woodName);
    }
    private void addBasicWoodWithoutLogsSawmillRecipe(ItemStack planksItem,
                                                      Ingredient fenceInput, Ingredient fenceGateInput,
                                                      Ingredient doorInput, Ingredient trapdoorInput, Ingredient pressurePlateInput,
                                                      Ingredient signInput, Ingredient boatInput, Ingredient chestBoatInput,
                                                      boolean isRaft, String woodName) {
        addBasicWoodWithoutLogsAndBoatsSawmillRecipe(planksItem, fenceInput, fenceGateInput, doorInput,
                trapdoorInput, pressurePlateInput, signInput, woodName);

        addSawmillRecipe(boatInput, planksItem.copyWithCount(4), 3, getItemPath(planksItem.getItem()),
                woodName + (isRaft?"_raft":"_boat"));
        addSawmillRecipe(chestBoatInput, planksItem.copyWithCount(5), 7, getItemPath(planksItem.getItem()),
                woodName + (isRaft?"_chest_raft":"_chest_boat"));
    }
    private void addBasicWoodWithoutLogsAndBoatsSawmillRecipe(ItemStack planksItem,
                                                              Ingredient fenceInput, Ingredient fenceGateInput,
                                                              Ingredient doorInput, Ingredient trapdoorInput, Ingredient pressurePlateInput,
                                                              Ingredient signInput, String woodName) {
        addSawmillRecipe(fenceInput, planksItem, 2, getItemPath(planksItem.getItem()),
                woodName + "_fence");
        addSawmillRecipe(fenceGateInput, planksItem.copyWithCount(2), 3, getItemPath(planksItem.getItem()),
                woodName + "_fence_gate");
        addSawmillRecipe(doorInput, planksItem, 3, getItemPath(planksItem.getItem()),
                woodName + "_door");
        addSawmillRecipe(trapdoorInput, planksItem.copyWithCount(2), 3, getItemPath(planksItem.getItem()),
                woodName + "_trapdoor");
        addSawmillRecipe(pressurePlateInput, planksItem, 2, getItemPath(planksItem.getItem()),
                woodName + "_pressure_plate");
        addSawmillRecipe(signInput, planksItem.copyWithCount(2), 1, getItemPath(planksItem.getItem()),
                woodName + "_sign");
    }
    private void addSawmillRecipe(Ingredient input, ItemStack output,
                                  int sawdustAmount, String outputName, String recipeIngredientName) {
        Identifier recipeId = Identifier.of(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "sawmill/" +
                outputName + "_from_sawing_" + recipeIngredientName);

        SawmillRecipe recipe = new SawmillRecipe(output, input, sawdustAmount);
        exporter.accept(getKey(recipeId), recipe, null);
    }

    private void addBasicFlowerGrowingRecipe(ItemConvertible flowerItem,
                                             String outputName) {
        addPlantGrowthChamberRecipe(Ingredient.ofItems(flowerItem), new OutputItemStackWithPercentages[] {
                new OutputItemStackWithPercentages(new ItemStack(flowerItem), new double[] {
                        1., 1., .33
                })
        }, 16000, outputName, getItemPath(flowerItem));
    }
    private void addBasicMushroomsGrowingRecipe(ItemConvertible mushroomItem,
                                                String outputName) {
        addPlantGrowthChamberRecipe(Ingredient.ofItems(mushroomItem), new OutputItemStackWithPercentages[] {
                new OutputItemStackWithPercentages(new ItemStack(mushroomItem), new double[] {
                        1., 1., .5, .25
                })
        }, 16000, outputName, getItemPath(mushroomItem));
    }
    private void addPlantGrowthChamberRecipe(Ingredient input,
                                             OutputItemStackWithPercentages[] outputs, int ticks,
                                             String outputName, String recipeIngredientName) {
        Identifier recipeId = Identifier.of(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "growing/" +
                outputName + "_from_growing_" + recipeIngredientName);

        PlantGrowthChamberRecipe recipe = new PlantGrowthChamberRecipe(outputs, input, ticks);
        exporter.accept(getKey(recipeId), recipe, null);
    }

    private void addCrystalGrowthChamberRecipe(Ingredient input, OutputItemStackWithPercentages output,
                                               int ticks) {
        addCrystalGrowthChamberRecipe(new IngredientWithCount(input), output, ticks);
    }
    private void addCrystalGrowthChamberRecipe(IngredientWithCount input, OutputItemStackWithPercentages output,
                                               int ticks) {
        Identifier recipeId = Identifier.of(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "crystal_growing/" +
                getItemPath(output.output().getItem()));

        CrystalGrowthChamberRecipe recipe = new CrystalGrowthChamberRecipe(output, input, ticks);
        exporter.accept(getKey(recipeId), recipe, null);
    }

    private static RegistryKey<Recipe<?>> getKey(Identifier recipeId) {
        return RegistryKey.of(RegistryKeys.RECIPE, recipeId);
    }
}

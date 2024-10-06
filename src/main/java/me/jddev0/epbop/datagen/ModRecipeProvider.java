package me.jddev0.epbop.datagen;

import biomesoplenty.api.BOPAPI;
import biomesoplenty.api.item.BOPItems;
import biomesoplenty.init.ModTags;
import me.jddev0.ep.datagen.recipe.CrusherFinishedRecipe;
import me.jddev0.ep.datagen.recipe.CrystalGrowthChamberFinishedRecipe;
import me.jddev0.ep.datagen.recipe.PlantGrowthChamberFinishedRecipe;
import me.jddev0.ep.datagen.recipe.SawmillFinishedRecipe;
import me.jddev0.ep.recipe.*;
import me.jddev0.epbop.EnergizedPowerBOPMod;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final String BIOMES_O_PLENTY_MOD_ID = BOPAPI.MOD_ID;
    private static final String PATH_PREFIX = "compat/" + BIOMES_O_PLENTY_MOD_ID + "/";

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> output) {
        buildCrusherRecipes(output);
        buildSawmillRecipes(output);
        buildPlantGrowthChamberRecipes(output);
        buildCrystalGrowthChamberRecipes(output);
    }

    private void buildCrusherRecipes(Consumer<RecipeJsonProvider> output) {
        addCrusherRecipe(output, Ingredient.ofItems(BOPItems.WHITE_SANDSTONE), new ItemStack(BOPItems.WHITE_SAND),
                "white_sandstone");
        addCrusherRecipe(output, Ingredient.ofItems(BOPItems.SMOOTH_WHITE_SANDSTONE, BOPItems.CUT_WHITE_SANDSTONE,
                        BOPItems.CHISELED_WHITE_SANDSTONE), new ItemStack(BOPItems.WHITE_SAND),
                "white_sandstone_variants");

        addCrusherRecipe(output, Ingredient.ofItems(BOPItems.ORANGE_SANDSTONE), new ItemStack(BOPItems.ORANGE_SAND),
                "orange_sandstone");
        addCrusherRecipe(output, Ingredient.ofItems(BOPItems.SMOOTH_ORANGE_SANDSTONE, BOPItems.CUT_ORANGE_SANDSTONE,
                        BOPItems.CHISELED_ORANGE_SANDSTONE), new ItemStack(BOPItems.ORANGE_SAND),
                "orange_sandstone_variants");

        addCrusherRecipe(output, Ingredient.ofItems(BOPItems.BLACK_SANDSTONE), new ItemStack(BOPItems.BLACK_SAND),
                "black_sandstone");
        addCrusherRecipe(output, Ingredient.ofItems(BOPItems.SMOOTH_BLACK_SANDSTONE, BOPItems.CUT_BLACK_SANDSTONE,
                        BOPItems.CHISELED_BLACK_SANDSTONE), new ItemStack(BOPItems.BLACK_SAND),
                "black_sandstone_variants");

        addCrusherRecipe(output, Ingredient.ofItems(BOPItems.BRIMSTONE_BRICKS, BOPItems.CHISELED_BRIMSTONE_BRICKS),
                new ItemStack(BOPItems.BRIMSTONE),
                "brimstone_variants");
    }

    private void buildSawmillRecipes(Consumer<RecipeJsonProvider> output) {
        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.FIR_PLANKS),
                Ingredient.fromTag(ModTags.Items.FIR_LOGS), Ingredient.ofItems(BOPItems.FIR_FENCE),
                Ingredient.ofItems(BOPItems.FIR_FENCE_GATE), Ingredient.ofItems(BOPItems.FIR_DOOR),
                Ingredient.ofItems(BOPItems.FIR_TRAPDOOR), Ingredient.ofItems(BOPItems.FIR_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.FIR_SIGN), Ingredient.ofItems(BOPItems.FIR_BOAT), Ingredient.ofItems(BOPItems.FIR_CHEST_BOAT),
                false, "fir");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.PINE_PLANKS),
                Ingredient.fromTag(ModTags.Items.PINE_LOGS), Ingredient.ofItems(BOPItems.PINE_FENCE),
                Ingredient.ofItems(BOPItems.PINE_FENCE_GATE), Ingredient.ofItems(BOPItems.PINE_DOOR),
                Ingredient.ofItems(BOPItems.PINE_TRAPDOOR), Ingredient.ofItems(BOPItems.PINE_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.PINE_SIGN), Ingredient.ofItems(BOPItems.PINE_BOAT), Ingredient.ofItems(BOPItems.PINE_CHEST_BOAT),
                false, "pine");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.MAPLE_PLANKS),
                Ingredient.fromTag(ModTags.Items.MAPLE_LOGS), Ingredient.ofItems(BOPItems.MAPLE_FENCE),
                Ingredient.ofItems(BOPItems.MAPLE_FENCE_GATE), Ingredient.ofItems(BOPItems.MAPLE_DOOR),
                Ingredient.ofItems(BOPItems.MAPLE_TRAPDOOR), Ingredient.ofItems(BOPItems.MAPLE_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.MAPLE_SIGN), Ingredient.ofItems(BOPItems.MAPLE_BOAT), Ingredient.ofItems(BOPItems.MAPLE_CHEST_BOAT),
                false, "maple");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.REDWOOD_PLANKS),
                Ingredient.fromTag(ModTags.Items.REDWOOD_LOGS), Ingredient.ofItems(BOPItems.REDWOOD_FENCE),
                Ingredient.ofItems(BOPItems.REDWOOD_FENCE_GATE), Ingredient.ofItems(BOPItems.REDWOOD_DOOR),
                Ingredient.ofItems(BOPItems.REDWOOD_TRAPDOOR), Ingredient.ofItems(BOPItems.REDWOOD_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.REDWOOD_SIGN), Ingredient.ofItems(BOPItems.REDWOOD_BOAT), Ingredient.ofItems(BOPItems.REDWOOD_CHEST_BOAT),
                false, "redwood");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.MAHOGANY_PLANKS),
                Ingredient.fromTag(ModTags.Items.MAHOGANY_LOGS), Ingredient.ofItems(BOPItems.MAHOGANY_FENCE),
                Ingredient.ofItems(BOPItems.MAHOGANY_FENCE_GATE), Ingredient.ofItems(BOPItems.MAHOGANY_DOOR),
                Ingredient.ofItems(BOPItems.MAHOGANY_TRAPDOOR), Ingredient.ofItems(BOPItems.MAHOGANY_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.MAHOGANY_SIGN), Ingredient.ofItems(BOPItems.MAHOGANY_BOAT), Ingredient.ofItems(BOPItems.MAHOGANY_CHEST_BOAT),
                false, "mahogany");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.JACARANDA_PLANKS),
                Ingredient.fromTag(ModTags.Items.JACARANDA_LOGS), Ingredient.ofItems(BOPItems.JACARANDA_FENCE),
                Ingredient.ofItems(BOPItems.JACARANDA_FENCE_GATE), Ingredient.ofItems(BOPItems.JACARANDA_DOOR),
                Ingredient.ofItems(BOPItems.JACARANDA_TRAPDOOR), Ingredient.ofItems(BOPItems.JACARANDA_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.JACARANDA_SIGN), Ingredient.ofItems(BOPItems.JACARANDA_BOAT), Ingredient.ofItems(BOPItems.JACARANDA_CHEST_BOAT),
                false, "jacaranda");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.PALM_PLANKS),
                Ingredient.fromTag(ModTags.Items.PALM_LOGS), Ingredient.ofItems(BOPItems.PALM_FENCE),
                Ingredient.ofItems(BOPItems.PALM_FENCE_GATE), Ingredient.ofItems(BOPItems.PALM_DOOR),
                Ingredient.ofItems(BOPItems.PALM_TRAPDOOR), Ingredient.ofItems(BOPItems.PALM_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.PALM_SIGN), Ingredient.ofItems(BOPItems.PALM_BOAT), Ingredient.ofItems(BOPItems.PALM_CHEST_BOAT),
                false, "palm");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.WILLOW_PLANKS),
                Ingredient.fromTag(ModTags.Items.WILLOW_LOGS), Ingredient.ofItems(BOPItems.WILLOW_FENCE),
                Ingredient.ofItems(BOPItems.WILLOW_FENCE_GATE), Ingredient.ofItems(BOPItems.WILLOW_DOOR),
                Ingredient.ofItems(BOPItems.WILLOW_TRAPDOOR), Ingredient.ofItems(BOPItems.WILLOW_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.WILLOW_SIGN), Ingredient.ofItems(BOPItems.WILLOW_BOAT), Ingredient.ofItems(BOPItems.WILLOW_CHEST_BOAT),
                false, "willow");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.DEAD_PLANKS),
                Ingredient.fromTag(ModTags.Items.DEAD_LOGS), Ingredient.ofItems(BOPItems.DEAD_FENCE),
                Ingredient.ofItems(BOPItems.DEAD_FENCE_GATE), Ingredient.ofItems(BOPItems.DEAD_DOOR),
                Ingredient.ofItems(BOPItems.DEAD_TRAPDOOR), Ingredient.ofItems(BOPItems.DEAD_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.DEAD_SIGN), Ingredient.ofItems(BOPItems.DEAD_BOAT), Ingredient.ofItems(BOPItems.DEAD_CHEST_BOAT),
                false, "dead");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.MAGIC_PLANKS),
                Ingredient.fromTag(ModTags.Items.MAGIC_LOGS), Ingredient.ofItems(BOPItems.MAGIC_FENCE),
                Ingredient.ofItems(BOPItems.MAGIC_FENCE_GATE), Ingredient.ofItems(BOPItems.MAGIC_DOOR),
                Ingredient.ofItems(BOPItems.MAGIC_TRAPDOOR), Ingredient.ofItems(BOPItems.MAGIC_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.MAGIC_SIGN), Ingredient.ofItems(BOPItems.MAGIC_BOAT), Ingredient.ofItems(BOPItems.MAGIC_CHEST_BOAT),
                false, "magic");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.UMBRAN_PLANKS),
                Ingredient.fromTag(ModTags.Items.UMBRAN_LOGS), Ingredient.ofItems(BOPItems.UMBRAN_FENCE),
                Ingredient.ofItems(BOPItems.UMBRAN_FENCE_GATE), Ingredient.ofItems(BOPItems.UMBRAN_DOOR),
                Ingredient.ofItems(BOPItems.UMBRAN_TRAPDOOR), Ingredient.ofItems(BOPItems.UMBRAN_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.UMBRAN_SIGN), Ingredient.ofItems(BOPItems.UMBRAN_BOAT), Ingredient.ofItems(BOPItems.UMBRAN_CHEST_BOAT),
                false, "umbran");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.HELLBARK_PLANKS),
                Ingredient.fromTag(ModTags.Items.HELLBARK_LOGS), Ingredient.ofItems(BOPItems.HELLBARK_FENCE),
                Ingredient.ofItems(BOPItems.HELLBARK_FENCE_GATE), Ingredient.ofItems(BOPItems.HELLBARK_DOOR),
                Ingredient.ofItems(BOPItems.HELLBARK_TRAPDOOR), Ingredient.ofItems(BOPItems.HELLBARK_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.HELLBARK_SIGN), Ingredient.ofItems(BOPItems.HELLBARK_BOAT), Ingredient.ofItems(BOPItems.HELLBARK_CHEST_BOAT),
                false, "hellbark");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.EMPYREAL_PLANKS),
                Ingredient.fromTag(ModTags.Items.EMPYREAL_LOGS), Ingredient.ofItems(BOPItems.EMPYREAL_FENCE),
                Ingredient.ofItems(BOPItems.EMPYREAL_FENCE_GATE), Ingredient.ofItems(BOPItems.EMPYREAL_DOOR),
                Ingredient.ofItems(BOPItems.EMPYREAL_TRAPDOOR), Ingredient.ofItems(BOPItems.EMPYREAL_PRESSURE_PLATE),
                Ingredient.ofItems(BOPItems.EMPYREAL_SIGN), Ingredient.ofItems(BOPItems.EMPYREAL_BOAT), Ingredient.ofItems(BOPItems.EMPYREAL_CHEST_BOAT),
                false, "empyreal");
    }

    private void buildPlantGrowthChamberRecipes(Consumer<RecipeJsonProvider> output) {
        addBasicFlowerGrowingRecipe(output, BOPItems.VIOLET, "violet");
        addBasicFlowerGrowingRecipe(output, BOPItems.LAVENDER, "lavender");
        addBasicFlowerGrowingRecipe(output, BOPItems.WHITE_LAVENDER, "white_lavender");
        addBasicFlowerGrowingRecipe(output, BOPItems.ORANGE_COSMOS, "orange_cosmos");
        addBasicFlowerGrowingRecipe(output, BOPItems.PINK_DAFFODIL, "pink_daffodil");
        addBasicFlowerGrowingRecipe(output, BOPItems.PINK_HIBISCUS, "pink_hibiscus");

        addBasicFlowerGrowingRecipe(output, BOPItems.ROSE, "rose");

        addBasicFlowerGrowingRecipe(output, BOPItems.TALL_LAVENDER, "tall_lavender");
        addBasicFlowerGrowingRecipe(output, BOPItems.TALL_WHITE_LAVENDER, "tall_white_lavender");
        addBasicFlowerGrowingRecipe(output, BOPItems.BLUE_HYDRANGEA, "blue_hydrangea");
        addBasicFlowerGrowingRecipe(output, BOPItems.GOLDENROD, "goldenrod");
        addBasicFlowerGrowingRecipe(output, BOPItems.ICY_IRIS, "icy_iris");
        addBasicFlowerGrowingRecipe(output, BOPItems.GLOWFLOWER, "glowflower");
        addBasicFlowerGrowingRecipe(output, BOPItems.WILTED_LILY, "wilted_liliy");

        addBasicMushroomsGrowingRecipe(output, BOPItems.TOADSTOOL, "toadstool");

        addPlantGrowthChamberRecipe(output, Ingredient.ofItems(BOPItems.WILDFLOWER), new OutputItemStackWithPercentages[] {
                new OutputItemStackWithPercentages(new ItemStack(BOPItems.WILDFLOWER), new double[] {
                        1., 1., 1., .67, .33, .33, .15
                })
        }, 16000, "wildflower", "wildflower");

        addPlantGrowthChamberRecipe(output, Ingredient.ofItems(BOPItems.WHITE_PETALS), new OutputItemStackWithPercentages[] {
                new OutputItemStackWithPercentages(new ItemStack(BOPItems.WHITE_PETALS), new double[] {
                        1., 1., 1., .67, .33, .33, .15
                })
        }, 16000, "white_petals", "white_petals");
    }

    private void buildCrystalGrowthChamberRecipes(Consumer<RecipeJsonProvider> output) {
        addCrystalGrowthChamberRecipe(output, Ingredient.ofItems(BOPItems.ROSE_QUARTZ_CHUNK),
                new OutputItemStackWithPercentages(new ItemStack(BOPItems.ROSE_QUARTZ_CHUNK), new double[] {
                        1., 1., .67, .5, .25, .125
                }), 16000);
    }

    private void addCrusherRecipe(Consumer<RecipeJsonProvider> recipeExporter, Ingredient input, ItemStack output,
                                  String recipeIngredientName) {
        Identifier recipeId = Identifier.of(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "crusher/" +
                getItemPath(output.getItem()) + "_from_crushing_" + recipeIngredientName);

        CrusherFinishedRecipe recipe = new CrusherFinishedRecipe(
                recipeId,
                output, input
        );
        recipeExporter.accept(recipe);
    }

    private void addBasicWoodSawmillRecipe(Consumer<RecipeJsonProvider> recipeExporter, ItemStack planksItem,
                                           Ingredient logsInput, Ingredient fenceInput, Ingredient fenceGateInput,
                                           Ingredient doorInput, Ingredient trapdoorInput, Ingredient pressurePlateInput,
                                           Ingredient signInput, Ingredient boatInput, Ingredient chestBoatInput,
                                           boolean isRaft, String woodName) {
        addSawmillRecipe(recipeExporter, logsInput, planksItem.copyWithCount(6), 1, getItemPath(planksItem.getItem()),
                woodName + "_logs");

        addBasicWoodWithoutLogsSawmillRecipe(recipeExporter, planksItem, fenceInput, fenceGateInput, doorInput, trapdoorInput,
                pressurePlateInput, signInput, boatInput, chestBoatInput, isRaft, woodName);
    }
    private void addBasicWoodWithoutLogsSawmillRecipe(Consumer<RecipeJsonProvider> recipeExporter, ItemStack planksItem,
                                                      Ingredient fenceInput, Ingredient fenceGateInput,
                                                      Ingredient doorInput, Ingredient trapdoorInput, Ingredient pressurePlateInput,
                                                      Ingredient signInput, Ingredient boatInput, Ingredient chestBoatInput,
                                                      boolean isRaft, String woodName) {
        addBasicWoodWithoutLogsAndBoatsSawmillRecipe(recipeExporter, planksItem, fenceInput, fenceGateInput, doorInput,
                trapdoorInput, pressurePlateInput, signInput, woodName);

        addSawmillRecipe(recipeExporter, boatInput, planksItem.copyWithCount(4), 3, getItemPath(planksItem.getItem()),
                woodName + (isRaft?"_raft":"_boat"));
        addSawmillRecipe(recipeExporter, chestBoatInput, planksItem.copyWithCount(5), 7, getItemPath(planksItem.getItem()),
                woodName + (isRaft?"_chest_raft":"_chest_boat"));
    }
    private void addBasicWoodWithoutLogsAndBoatsSawmillRecipe(Consumer<RecipeJsonProvider> recipeExporter, ItemStack planksItem,
                                                              Ingredient fenceInput, Ingredient fenceGateInput,
                                                              Ingredient doorInput, Ingredient trapdoorInput, Ingredient pressurePlateInput,
                                                              Ingredient signInput, String woodName) {
        addSawmillRecipe(recipeExporter, fenceInput, planksItem, 2, getItemPath(planksItem.getItem()),
                woodName + "_fence");
        addSawmillRecipe(recipeExporter, fenceGateInput, planksItem.copyWithCount(2), 3, getItemPath(planksItem.getItem()),
                woodName + "_fence_gate");
        addSawmillRecipe(recipeExporter, doorInput, planksItem, 3, getItemPath(planksItem.getItem()),
                woodName + "_door");
        addSawmillRecipe(recipeExporter, trapdoorInput, planksItem.copyWithCount(2), 3, getItemPath(planksItem.getItem()),
                woodName + "_trapdoor");
        addSawmillRecipe(recipeExporter, pressurePlateInput, planksItem, 2, getItemPath(planksItem.getItem()),
                woodName + "_pressure_plate");
        addSawmillRecipe(recipeExporter, signInput, planksItem.copyWithCount(2), 1, getItemPath(planksItem.getItem()),
                woodName + "_sign");
    }
    private void addSawmillRecipe(Consumer<RecipeJsonProvider> recipeExporter, Ingredient input, ItemStack output,
                                  int sawdustAmount, String outputName, String recipeIngredientName) {
        Identifier recipeId = Identifier.of(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "sawmill/" +
                outputName + "_from_sawing_" + recipeIngredientName);

        SawmillFinishedRecipe recipe = new SawmillFinishedRecipe(
                recipeId,
                output, input, sawdustAmount
        );
        recipeExporter.accept(recipe);
    }

    private void addBasicFlowerGrowingRecipe(Consumer<RecipeJsonProvider> recipeExporter, ItemConvertible flowerItem,
                                             String outputName) {
        addPlantGrowthChamberRecipe(recipeExporter, Ingredient.ofItems(flowerItem), new OutputItemStackWithPercentages[] {
                new OutputItemStackWithPercentages(new ItemStack(flowerItem), new double[] {
                        1., 1., .33
                })
        }, 16000, outputName, getItemPath(flowerItem));
    }
    private void addBasicMushroomsGrowingRecipe(Consumer<RecipeJsonProvider> recipeExporter, ItemConvertible mushroomItem,
                                                String outputName) {
        addPlantGrowthChamberRecipe(recipeExporter, Ingredient.ofItems(mushroomItem), new OutputItemStackWithPercentages[] {
                new OutputItemStackWithPercentages(new ItemStack(mushroomItem), new double[] {
                        1., 1., .5, .25
                })
        }, 16000, outputName, getItemPath(mushroomItem));
    }
    private void addPlantGrowthChamberRecipe(Consumer<RecipeJsonProvider> recipeExporter, Ingredient input,
                                             OutputItemStackWithPercentages[] outputs, int ticks,
                                             String outputName, String recipeIngredientName) {
        Identifier recipeId = Identifier.of(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "growing/" +
                outputName + "_from_growing_" + recipeIngredientName);

        PlantGrowthChamberFinishedRecipe recipe = new PlantGrowthChamberFinishedRecipe(
                recipeId,
                outputs, input, ticks
        );
        recipeExporter.accept(recipe);
    }

    private void addCrystalGrowthChamberRecipe(Consumer<RecipeJsonProvider> recipeExporter, Ingredient input, OutputItemStackWithPercentages output,
                                               int ticks) {
        addCrystalGrowthChamberRecipe(recipeExporter, input, output, 1, ticks);
    }
    private void addCrystalGrowthChamberRecipe(Consumer<RecipeJsonProvider> recipeExporter, Ingredient input, OutputItemStackWithPercentages output,
                                               int inputCount, int ticks) {
        Identifier recipeId = Identifier.of(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "crystal_growing/" +
                getItemPath(output.output().getItem()));

        CrystalGrowthChamberFinishedRecipe recipe = new CrystalGrowthChamberFinishedRecipe(
                recipeId,
                output, input, inputCount, ticks
        );
        recipeExporter.accept(recipe);
    }
}

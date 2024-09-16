package me.jddev0.epbop.datagen;

import biomesoplenty.api.BOPAPI;
import biomesoplenty.api.item.BOPItems;
import biomesoplenty.init.ModTags;
import me.jddev0.epbop.EnergizedPowerBOPMod;
import me.jddev0.ep.recipe.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final String BIOMES_O_PLENTY_MOD_ID = BOPAPI.MOD_ID;
    private static final String PATH_PREFIX = "compat/" + BIOMES_O_PLENTY_MOD_ID + "/";

    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {
        buildCrusherRecipes(output);
        buildSawmillRecipes(output);
        buildPlantGrowthChamberRecipes(output);
        buildCrystalGrowthChamberRecipes(output);
    }

    private void buildCrusherRecipes(RecipeOutput output) {
        addCrusherRecipe(output, Ingredient.of(BOPItems.WHITE_SANDSTONE), new ItemStack(BOPItems.WHITE_SAND),
                "white_sandstone");
        addCrusherRecipe(output, Ingredient.of(BOPItems.SMOOTH_WHITE_SANDSTONE, BOPItems.CUT_WHITE_SANDSTONE,
                        BOPItems.CHISELED_WHITE_SANDSTONE), new ItemStack(BOPItems.WHITE_SAND),
                "white_sandstone_variants");

        addCrusherRecipe(output, Ingredient.of(BOPItems.ORANGE_SANDSTONE), new ItemStack(BOPItems.ORANGE_SAND),
                "orange_sandstone");
        addCrusherRecipe(output, Ingredient.of(BOPItems.SMOOTH_ORANGE_SANDSTONE, BOPItems.CUT_ORANGE_SANDSTONE,
                        BOPItems.CHISELED_ORANGE_SANDSTONE), new ItemStack(BOPItems.ORANGE_SAND),
                "orange_sandstone_variants");

        addCrusherRecipe(output, Ingredient.of(BOPItems.BLACK_SANDSTONE), new ItemStack(BOPItems.BLACK_SAND),
                "black_sandstone");
        addCrusherRecipe(output, Ingredient.of(BOPItems.SMOOTH_BLACK_SANDSTONE, BOPItems.CUT_BLACK_SANDSTONE,
                        BOPItems.CHISELED_BLACK_SANDSTONE), new ItemStack(BOPItems.BLACK_SAND),
                "black_sandstone_variants");

        addCrusherRecipe(output, Ingredient.of(BOPItems.BRIMSTONE_BRICKS, BOPItems.CHISELED_BRIMSTONE_BRICKS),
                new ItemStack(BOPItems.BRIMSTONE),
                "brimstone_variants");
    }

    private void buildSawmillRecipes(RecipeOutput output) {
        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.FIR_PLANKS),
                Ingredient.of(ModTags.Items.FIR_LOGS), Ingredient.of(BOPItems.FIR_FENCE),
                Ingredient.of(BOPItems.FIR_FENCE_GATE), Ingredient.of(BOPItems.FIR_DOOR),
                Ingredient.of(BOPItems.FIR_TRAPDOOR), Ingredient.of(BOPItems.FIR_PRESSURE_PLATE),
                Ingredient.of(BOPItems.FIR_SIGN), Ingredient.of(BOPItems.FIR_BOAT), Ingredient.of(BOPItems.FIR_CHEST_BOAT),
                false, "fir");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.PINE_PLANKS),
                Ingredient.of(ModTags.Items.PINE_LOGS), Ingredient.of(BOPItems.PINE_FENCE),
                Ingredient.of(BOPItems.PINE_FENCE_GATE), Ingredient.of(BOPItems.PINE_DOOR),
                Ingredient.of(BOPItems.PINE_TRAPDOOR), Ingredient.of(BOPItems.PINE_PRESSURE_PLATE),
                Ingredient.of(BOPItems.PINE_SIGN), Ingredient.of(BOPItems.PINE_BOAT), Ingredient.of(BOPItems.PINE_CHEST_BOAT),
                false, "pine");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.MAPLE_PLANKS),
                Ingredient.of(ModTags.Items.MAPLE_LOGS), Ingredient.of(BOPItems.MAPLE_FENCE),
                Ingredient.of(BOPItems.MAPLE_FENCE_GATE), Ingredient.of(BOPItems.MAPLE_DOOR),
                Ingredient.of(BOPItems.MAPLE_TRAPDOOR), Ingredient.of(BOPItems.MAPLE_PRESSURE_PLATE),
                Ingredient.of(BOPItems.MAPLE_SIGN), Ingredient.of(BOPItems.MAPLE_BOAT), Ingredient.of(BOPItems.MAPLE_CHEST_BOAT),
                false, "maple");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.REDWOOD_PLANKS),
                Ingredient.of(ModTags.Items.REDWOOD_LOGS), Ingredient.of(BOPItems.REDWOOD_FENCE),
                Ingredient.of(BOPItems.REDWOOD_FENCE_GATE), Ingredient.of(BOPItems.REDWOOD_DOOR),
                Ingredient.of(BOPItems.REDWOOD_TRAPDOOR), Ingredient.of(BOPItems.REDWOOD_PRESSURE_PLATE),
                Ingredient.of(BOPItems.REDWOOD_SIGN), Ingredient.of(BOPItems.REDWOOD_BOAT), Ingredient.of(BOPItems.REDWOOD_CHEST_BOAT),
                false, "redwood");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.MAHOGANY_PLANKS),
                Ingredient.of(ModTags.Items.MAHOGANY_LOGS), Ingredient.of(BOPItems.MAHOGANY_FENCE),
                Ingredient.of(BOPItems.MAHOGANY_FENCE_GATE), Ingredient.of(BOPItems.MAHOGANY_DOOR),
                Ingredient.of(BOPItems.MAHOGANY_TRAPDOOR), Ingredient.of(BOPItems.MAHOGANY_PRESSURE_PLATE),
                Ingredient.of(BOPItems.MAHOGANY_SIGN), Ingredient.of(BOPItems.MAHOGANY_BOAT), Ingredient.of(BOPItems.MAHOGANY_CHEST_BOAT),
                false, "mahogany");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.JACARANDA_PLANKS),
                Ingredient.of(ModTags.Items.JACARANDA_LOGS), Ingredient.of(BOPItems.JACARANDA_FENCE),
                Ingredient.of(BOPItems.JACARANDA_FENCE_GATE), Ingredient.of(BOPItems.JACARANDA_DOOR),
                Ingredient.of(BOPItems.JACARANDA_TRAPDOOR), Ingredient.of(BOPItems.JACARANDA_PRESSURE_PLATE),
                Ingredient.of(BOPItems.JACARANDA_SIGN), Ingredient.of(BOPItems.JACARANDA_BOAT), Ingredient.of(BOPItems.JACARANDA_CHEST_BOAT),
                false, "jacaranda");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.PALM_PLANKS),
                Ingredient.of(ModTags.Items.PALM_LOGS), Ingredient.of(BOPItems.PALM_FENCE),
                Ingredient.of(BOPItems.PALM_FENCE_GATE), Ingredient.of(BOPItems.PALM_DOOR),
                Ingredient.of(BOPItems.PALM_TRAPDOOR), Ingredient.of(BOPItems.PALM_PRESSURE_PLATE),
                Ingredient.of(BOPItems.PALM_SIGN), Ingredient.of(BOPItems.PALM_BOAT), Ingredient.of(BOPItems.PALM_CHEST_BOAT),
                false, "palm");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.WILLOW_PLANKS),
                Ingredient.of(ModTags.Items.WILLOW_LOGS), Ingredient.of(BOPItems.WILLOW_FENCE),
                Ingredient.of(BOPItems.WILLOW_FENCE_GATE), Ingredient.of(BOPItems.WILLOW_DOOR),
                Ingredient.of(BOPItems.WILLOW_TRAPDOOR), Ingredient.of(BOPItems.WILLOW_PRESSURE_PLATE),
                Ingredient.of(BOPItems.WILLOW_SIGN), Ingredient.of(BOPItems.WILLOW_BOAT), Ingredient.of(BOPItems.WILLOW_CHEST_BOAT),
                false, "willow");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.DEAD_PLANKS),
                Ingredient.of(ModTags.Items.DEAD_LOGS), Ingredient.of(BOPItems.DEAD_FENCE),
                Ingredient.of(BOPItems.DEAD_FENCE_GATE), Ingredient.of(BOPItems.DEAD_DOOR),
                Ingredient.of(BOPItems.DEAD_TRAPDOOR), Ingredient.of(BOPItems.DEAD_PRESSURE_PLATE),
                Ingredient.of(BOPItems.DEAD_SIGN), Ingredient.of(BOPItems.DEAD_BOAT), Ingredient.of(BOPItems.DEAD_CHEST_BOAT),
                false, "dead");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.MAGIC_PLANKS),
                Ingredient.of(ModTags.Items.MAGIC_LOGS), Ingredient.of(BOPItems.MAGIC_FENCE),
                Ingredient.of(BOPItems.MAGIC_FENCE_GATE), Ingredient.of(BOPItems.MAGIC_DOOR),
                Ingredient.of(BOPItems.MAGIC_TRAPDOOR), Ingredient.of(BOPItems.MAGIC_PRESSURE_PLATE),
                Ingredient.of(BOPItems.MAGIC_SIGN), Ingredient.of(BOPItems.MAGIC_BOAT), Ingredient.of(BOPItems.MAGIC_CHEST_BOAT),
                false, "magic");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.UMBRAN_PLANKS),
                Ingredient.of(ModTags.Items.UMBRAN_LOGS), Ingredient.of(BOPItems.UMBRAN_FENCE),
                Ingredient.of(BOPItems.UMBRAN_FENCE_GATE), Ingredient.of(BOPItems.UMBRAN_DOOR),
                Ingredient.of(BOPItems.UMBRAN_TRAPDOOR), Ingredient.of(BOPItems.UMBRAN_PRESSURE_PLATE),
                Ingredient.of(BOPItems.UMBRAN_SIGN), Ingredient.of(BOPItems.UMBRAN_BOAT), Ingredient.of(BOPItems.UMBRAN_CHEST_BOAT),
                false, "umbran");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.HELLBARK_PLANKS),
                Ingredient.of(ModTags.Items.HELLBARK_LOGS), Ingredient.of(BOPItems.HELLBARK_FENCE),
                Ingredient.of(BOPItems.HELLBARK_FENCE_GATE), Ingredient.of(BOPItems.HELLBARK_DOOR),
                Ingredient.of(BOPItems.HELLBARK_TRAPDOOR), Ingredient.of(BOPItems.HELLBARK_PRESSURE_PLATE),
                Ingredient.of(BOPItems.HELLBARK_SIGN), Ingredient.of(BOPItems.HELLBARK_BOAT), Ingredient.of(BOPItems.HELLBARK_CHEST_BOAT),
                false, "hellbark");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.EMPYREAL_PLANKS),
                Ingredient.of(ModTags.Items.EMPYREAL_LOGS), Ingredient.of(BOPItems.EMPYREAL_FENCE),
                Ingredient.of(BOPItems.EMPYREAL_FENCE_GATE), Ingredient.of(BOPItems.EMPYREAL_DOOR),
                Ingredient.of(BOPItems.EMPYREAL_TRAPDOOR), Ingredient.of(BOPItems.EMPYREAL_PRESSURE_PLATE),
                Ingredient.of(BOPItems.EMPYREAL_SIGN), Ingredient.of(BOPItems.EMPYREAL_BOAT), Ingredient.of(BOPItems.EMPYREAL_CHEST_BOAT),
                false, "empyreal");
    }

    private void buildPlantGrowthChamberRecipes(RecipeOutput output) {
        addBasicFlowerGrowingRecipe(output, BOPItems.VIOLET, "violet");
        addBasicFlowerGrowingRecipe(output, BOPItems.LAVENDER, "lavender");
        addBasicFlowerGrowingRecipe(output, BOPItems.WHITE_LAVENDER, "white_lavender");
        addBasicFlowerGrowingRecipe(output, BOPItems.ORANGE_COSMOS, "orange_cosmos");
        addBasicFlowerGrowingRecipe(output, BOPItems.PINK_DAFFODIL, "pink_daffodil");
        addBasicFlowerGrowingRecipe(output, BOPItems.PINK_HIBISCUS, "pink_hibiscus");

        addBasicFlowerGrowingRecipe(output, BOPItems.TALL_LAVENDER, "tall_lavender");
        addBasicFlowerGrowingRecipe(output, BOPItems.TALL_WHITE_LAVENDER, "tall_white_lavender");
        addBasicFlowerGrowingRecipe(output, BOPItems.BLUE_HYDRANGEA, "blue_hydrangea");
        addBasicFlowerGrowingRecipe(output, BOPItems.GOLDENROD, "goldenrod");
        addBasicFlowerGrowingRecipe(output, BOPItems.ICY_IRIS, "icy_iris");
        addBasicFlowerGrowingRecipe(output, BOPItems.GLOWFLOWER, "glowflower");
        addBasicFlowerGrowingRecipe(output, BOPItems.WILTED_LILY, "wilted_liliy");

        addBasicMushroomsGrowingRecipe(output, BOPItems.TOADSTOOL, "toadstool");

        addPlantGrowthChamberRecipe(output, Ingredient.of(BOPItems.WILDFLOWER), new PlantGrowthChamberRecipe.OutputItemStackWithPercentages[] {
                new PlantGrowthChamberRecipe.OutputItemStackWithPercentages(new ItemStack(BOPItems.WILDFLOWER), new double[] {
                        1., 1., 1., .67, .33, .33, .15
                })
        }, 16000, "wildflower", "wildflower");

        addPlantGrowthChamberRecipe(output, Ingredient.of(BOPItems.WHITE_PETALS), new PlantGrowthChamberRecipe.OutputItemStackWithPercentages[] {
                new PlantGrowthChamberRecipe.OutputItemStackWithPercentages(new ItemStack(BOPItems.WHITE_PETALS), new double[] {
                        1., 1., 1., .67, .33, .33, .15
                })
        }, 16000, "white_petals", "white_petals");
    }

    private void buildCrystalGrowthChamberRecipes(RecipeOutput output) {
        addCrystalGrowthChamberRecipe(output, Ingredient.of(BOPItems.ROSE_QUARTZ_CHUNK),
                new CrystalGrowthChamberRecipe.OutputItemStackWithPercentages(new ItemStack(BOPItems.ROSE_QUARTZ_CHUNK), new double[] {
                        1., 1., .67, .5, .25, .125
                }), 16000);
    }

    private void addCrusherRecipe(RecipeOutput recipeOutput, Ingredient input, ItemStack output, String recipeIngredientName) {
        ResourceLocation recipeId = ResourceLocation.fromNamespaceAndPath(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "crusher/" +
                getItemName(output.getItem()) + "_from_crushing_" + recipeIngredientName);

        CrusherRecipe recipe = new CrusherRecipe(output, input);
        recipeOutput.accept(recipeId, recipe, null, modLoaded(BIOMES_O_PLENTY_MOD_ID));
    }

    private void addBasicWoodSawmillRecipe(RecipeOutput recipeOutput, ItemStack planksItem,
                                                  Ingredient logsInput, Ingredient fenceInput, Ingredient fenceGateInput,
                                                  Ingredient doorInput, Ingredient trapdoorInput, Ingredient pressurePlateInput,
                                                  Ingredient signInput, Ingredient boatInput, Ingredient chestBoatInput,
                                                  boolean isRaft, String woodName) {
        addSawmillRecipe(recipeOutput, logsInput, planksItem.copyWithCount(6), 1, getItemName(planksItem.getItem()),
                woodName + "_logs");

        addBasicWoodWithoutLogsSawmillRecipe(recipeOutput, planksItem, fenceInput, fenceGateInput, doorInput, trapdoorInput,
                pressurePlateInput, signInput, boatInput, chestBoatInput, isRaft, woodName);
    }
    private void addBasicWoodWithoutLogsSawmillRecipe(RecipeOutput recipeOutput, ItemStack planksItem,
                                                             Ingredient fenceInput, Ingredient fenceGateInput,
                                                             Ingredient doorInput, Ingredient trapdoorInput, Ingredient pressurePlateInput,
                                                             Ingredient signInput, Ingredient boatInput, Ingredient chestBoatInput,
                                                             boolean isRaft, String woodName) {
        addBasicWoodWithoutLogsAndBoatsSawmillRecipe(recipeOutput, planksItem, fenceInput, fenceGateInput, doorInput,
                trapdoorInput, pressurePlateInput, signInput, woodName);

        addSawmillRecipe(recipeOutput, boatInput, planksItem.copyWithCount(4), 3, getItemName(planksItem.getItem()),
                woodName + (isRaft?"_raft":"_boat"));
        addSawmillRecipe(recipeOutput, chestBoatInput, planksItem.copyWithCount(5), 7, getItemName(planksItem.getItem()),
                woodName + (isRaft?"_chest_raft":"_chest_boat"));
    }
    private void addBasicWoodWithoutLogsAndBoatsSawmillRecipe(RecipeOutput recipeOutput, ItemStack planksItem,
                                                                     Ingredient fenceInput, Ingredient fenceGateInput,
                                                                     Ingredient doorInput, Ingredient trapdoorInput, Ingredient pressurePlateInput,
                                                                     Ingredient signInput, String woodName) {
        addSawmillRecipe(recipeOutput, fenceInput, planksItem, 2, getItemName(planksItem.getItem()),
                woodName + "_fence");
        addSawmillRecipe(recipeOutput, fenceGateInput, planksItem.copyWithCount(2), 3, getItemName(planksItem.getItem()),
                woodName + "_fence_gate");
        addSawmillRecipe(recipeOutput, doorInput, planksItem, 3, getItemName(planksItem.getItem()),
                woodName + "_door");
        addSawmillRecipe(recipeOutput, trapdoorInput, planksItem.copyWithCount(2), 3, getItemName(planksItem.getItem()),
                woodName + "_trapdoor");
        addSawmillRecipe(recipeOutput, pressurePlateInput, planksItem, 2, getItemName(planksItem.getItem()),
                woodName + "_pressure_plate");
        addSawmillRecipe(recipeOutput, signInput, planksItem.copyWithCount(2), 1, getItemName(planksItem.getItem()),
                woodName + "_sign");
    }
    private void addSawmillRecipe(RecipeOutput recipeOutput, Ingredient input, ItemStack output,
                                         int sawdustAmount, String outputName, String recipeIngredientName) {
        ResourceLocation recipeId = ResourceLocation.fromNamespaceAndPath(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "sawmill/" +
                outputName + "_from_sawing_" + recipeIngredientName);

        SawmillRecipe recipe = new SawmillRecipe(output, input, sawdustAmount);
        recipeOutput.accept(recipeId, recipe, null, modLoaded(BIOMES_O_PLENTY_MOD_ID));
    }

    private void addBasicFlowerGrowingRecipe(RecipeOutput recipeOutput, ItemLike flowerItem,
                                                    String outputName) {
        addPlantGrowthChamberRecipe(recipeOutput, Ingredient.of(flowerItem), new PlantGrowthChamberRecipe.OutputItemStackWithPercentages[] {
                new PlantGrowthChamberRecipe.OutputItemStackWithPercentages(new ItemStack(flowerItem), new double[] {
                        1., 1., .33
                })
        }, 16000, outputName, getItemName(flowerItem));
    }
    private void addBasicMushroomsGrowingRecipe(RecipeOutput recipeOutput, ItemLike mushroomItem,
                                                       String outputName) {
        addPlantGrowthChamberRecipe(recipeOutput, Ingredient.of(mushroomItem), new PlantGrowthChamberRecipe.OutputItemStackWithPercentages[] {
                new PlantGrowthChamberRecipe.OutputItemStackWithPercentages(new ItemStack(mushroomItem), new double[] {
                        1., 1., .5, .25
                })
        }, 16000, outputName, getItemName(mushroomItem));
    }
    private void addPlantGrowthChamberRecipe(RecipeOutput recipeOutput, Ingredient input,
                                             PlantGrowthChamberRecipe.OutputItemStackWithPercentages[] outputs, int ticks,
                                             String outputName, String recipeIngredientName) {
        ResourceLocation recipeId = ResourceLocation.fromNamespaceAndPath(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "growing/" +
                outputName + "_from_growing_" + recipeIngredientName);

        PlantGrowthChamberRecipe recipe = new PlantGrowthChamberRecipe(outputs, input, ticks);
        recipeOutput.accept(recipeId, recipe, null, modLoaded(BIOMES_O_PLENTY_MOD_ID));
    }

    private void addCrystalGrowthChamberRecipe(RecipeOutput recipeOutput, Ingredient input, CrystalGrowthChamberRecipe.OutputItemStackWithPercentages output,
                                                      int ticks) {
        addCrystalGrowthChamberRecipe(recipeOutput, input, output, 1, ticks);
    }
    private void addCrystalGrowthChamberRecipe(RecipeOutput recipeOutput, Ingredient input, CrystalGrowthChamberRecipe.OutputItemStackWithPercentages output,
                                                      int inputCount, int ticks) {
        ResourceLocation recipeId = ResourceLocation.fromNamespaceAndPath(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "crystal_growing/" +
                getItemName(output.output().getItem()));

        CrystalGrowthChamberRecipe recipe = new CrystalGrowthChamberRecipe(output, input, inputCount, ticks);
        recipeOutput.accept(recipeId, recipe, null, modLoaded(BIOMES_O_PLENTY_MOD_ID));
    }
}

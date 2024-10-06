package me.jddev0.epbop.datagen;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.api.item.BOPItems;
import biomesoplenty.core.BiomesOPlenty;
import me.jddev0.ep.datagen.recipe.CrusherFinishedRecipe;
import me.jddev0.ep.datagen.recipe.CrystalGrowthChamberFinishedRecipe;
import me.jddev0.ep.datagen.recipe.PlantGrowthChamberFinishedRecipe;
import me.jddev0.ep.datagen.recipe.SawmillFinishedRecipe;
import me.jddev0.epbop.EnergizedPowerBOPMod;
import me.jddev0.ep.recipe.*;
import me.jddev0.epbop.registry.tags.CompatibilityItemTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final String BIOMES_O_PLENTY_MOD_ID = BiomesOPlenty.MOD_ID;
    private static final String PATH_PREFIX = "compat/" + BIOMES_O_PLENTY_MOD_ID + "/";

    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> output) {
        buildCrusherRecipes(output);
        buildSawmillRecipes(output);
        buildPlantGrowthChamberRecipes(output);
        buildCrystalGrowthChamberRecipes(output);
    }

    private void buildCrusherRecipes(Consumer<FinishedRecipe> output) {
        addCrusherRecipe(output, Ingredient.of(BOPBlocks.WHITE_SANDSTONE), new ItemStack(BOPBlocks.WHITE_SAND),
                "white_sandstone");
        addCrusherRecipe(output, Ingredient.of(BOPBlocks.SMOOTH_WHITE_SANDSTONE, BOPBlocks.CUT_WHITE_SANDSTONE,
                        BOPBlocks.CHISELED_WHITE_SANDSTONE), new ItemStack(BOPBlocks.WHITE_SAND),
                "white_sandstone_variants");

        addCrusherRecipe(output, Ingredient.of(BOPBlocks.ORANGE_SANDSTONE), new ItemStack(BOPBlocks.ORANGE_SAND),
                "orange_sandstone");
        addCrusherRecipe(output, Ingredient.of(BOPBlocks.SMOOTH_ORANGE_SANDSTONE, BOPBlocks.CUT_ORANGE_SANDSTONE,
                        BOPBlocks.CHISELED_ORANGE_SANDSTONE), new ItemStack(BOPBlocks.ORANGE_SAND),
                "orange_sandstone_variants");

        addCrusherRecipe(output, Ingredient.of(BOPBlocks.BLACK_SANDSTONE), new ItemStack(BOPBlocks.BLACK_SAND),
                "black_sandstone");
        addCrusherRecipe(output, Ingredient.of(BOPBlocks.SMOOTH_BLACK_SANDSTONE, BOPBlocks.CUT_BLACK_SANDSTONE,
                        BOPBlocks.CHISELED_BLACK_SANDSTONE), new ItemStack(BOPBlocks.BLACK_SAND),
                "black_sandstone_variants");

        addCrusherRecipe(output, Ingredient.of(BOPBlocks.BRIMSTONE_BRICKS, BOPBlocks.CHISELED_BRIMSTONE_BRICKS),
                new ItemStack(BOPBlocks.BRIMSTONE),
                "brimstone_variants");
    }

    private void buildSawmillRecipes(Consumer<FinishedRecipe> output) {
        addBasicWoodSawmillRecipe(output, new ItemStack(BOPBlocks.FIR_PLANKS),
                Ingredient.of(CompatibilityItemTags.FIR_LOGS), Ingredient.of(BOPBlocks.FIR_FENCE),
                Ingredient.of(BOPBlocks.FIR_FENCE_GATE), Ingredient.of(BOPBlocks.FIR_DOOR),
                Ingredient.of(BOPBlocks.FIR_TRAPDOOR), Ingredient.of(BOPBlocks.FIR_PRESSURE_PLATE),
                Ingredient.of(BOPItems.FIR_SIGN), Ingredient.of(BOPItems.FIR_BOAT), Ingredient.of(BOPItems.FIR_CHEST_BOAT),
                false, "fir");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPBlocks.REDWOOD_PLANKS),
                Ingredient.of(CompatibilityItemTags.REDWOOD_LOGS), Ingredient.of(BOPBlocks.REDWOOD_FENCE),
                Ingredient.of(BOPBlocks.REDWOOD_FENCE_GATE), Ingredient.of(BOPBlocks.REDWOOD_DOOR),
                Ingredient.of(BOPBlocks.REDWOOD_TRAPDOOR), Ingredient.of(BOPBlocks.REDWOOD_PRESSURE_PLATE),
                Ingredient.of(BOPItems.REDWOOD_SIGN), Ingredient.of(BOPItems.REDWOOD_BOAT), Ingredient.of(BOPItems.REDWOOD_CHEST_BOAT),
                false, "redwood");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPBlocks.MAHOGANY_PLANKS),
                Ingredient.of(CompatibilityItemTags.MAHOGANY_LOGS), Ingredient.of(BOPBlocks.MAHOGANY_FENCE),
                Ingredient.of(BOPBlocks.MAHOGANY_FENCE_GATE), Ingredient.of(BOPBlocks.MAHOGANY_DOOR),
                Ingredient.of(BOPBlocks.MAHOGANY_TRAPDOOR), Ingredient.of(BOPBlocks.MAHOGANY_PRESSURE_PLATE),
                Ingredient.of(BOPItems.MAHOGANY_SIGN), Ingredient.of(BOPItems.MAHOGANY_BOAT), Ingredient.of(BOPItems.MAHOGANY_CHEST_BOAT),
                false, "mahogany");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPBlocks.JACARANDA_PLANKS),
                Ingredient.of(CompatibilityItemTags.JACARANDA_LOGS), Ingredient.of(BOPBlocks.JACARANDA_FENCE),
                Ingredient.of(BOPBlocks.JACARANDA_FENCE_GATE), Ingredient.of(BOPBlocks.JACARANDA_DOOR),
                Ingredient.of(BOPBlocks.JACARANDA_TRAPDOOR), Ingredient.of(BOPBlocks.JACARANDA_PRESSURE_PLATE),
                Ingredient.of(BOPItems.JACARANDA_SIGN), Ingredient.of(BOPItems.JACARANDA_BOAT), Ingredient.of(BOPItems.JACARANDA_CHEST_BOAT),
                false, "jacaranda");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPBlocks.PALM_PLANKS),
                Ingredient.of(CompatibilityItemTags.PALM_LOGS), Ingredient.of(BOPBlocks.PALM_FENCE),
                Ingredient.of(BOPBlocks.PALM_FENCE_GATE), Ingredient.of(BOPBlocks.PALM_DOOR),
                Ingredient.of(BOPBlocks.PALM_TRAPDOOR), Ingredient.of(BOPBlocks.PALM_PRESSURE_PLATE),
                Ingredient.of(BOPItems.PALM_SIGN), Ingredient.of(BOPItems.PALM_BOAT), Ingredient.of(BOPItems.PALM_CHEST_BOAT),
                false, "palm");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPBlocks.WILLOW_PLANKS),
                Ingredient.of(CompatibilityItemTags.WILLOW_LOGS), Ingredient.of(BOPBlocks.WILLOW_FENCE),
                Ingredient.of(BOPBlocks.WILLOW_FENCE_GATE), Ingredient.of(BOPBlocks.WILLOW_DOOR),
                Ingredient.of(BOPBlocks.WILLOW_TRAPDOOR), Ingredient.of(BOPBlocks.WILLOW_PRESSURE_PLATE),
                Ingredient.of(BOPItems.WILLOW_SIGN), Ingredient.of(BOPItems.WILLOW_BOAT), Ingredient.of(BOPItems.WILLOW_CHEST_BOAT),
                false, "willow");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPBlocks.DEAD_PLANKS),
                Ingredient.of(CompatibilityItemTags.DEAD_LOGS), Ingredient.of(BOPBlocks.DEAD_FENCE),
                Ingredient.of(BOPBlocks.DEAD_FENCE_GATE), Ingredient.of(BOPBlocks.DEAD_DOOR),
                Ingredient.of(BOPBlocks.DEAD_TRAPDOOR), Ingredient.of(BOPBlocks.DEAD_PRESSURE_PLATE),
                Ingredient.of(BOPItems.DEAD_SIGN), Ingredient.of(BOPItems.DEAD_BOAT), Ingredient.of(BOPItems.DEAD_CHEST_BOAT),
                false, "dead");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPBlocks.MAGIC_PLANKS),
                Ingredient.of(CompatibilityItemTags.MAGIC_LOGS), Ingredient.of(BOPBlocks.MAGIC_FENCE),
                Ingredient.of(BOPBlocks.MAGIC_FENCE_GATE), Ingredient.of(BOPBlocks.MAGIC_DOOR),
                Ingredient.of(BOPBlocks.MAGIC_TRAPDOOR), Ingredient.of(BOPBlocks.MAGIC_PRESSURE_PLATE),
                Ingredient.of(BOPItems.MAGIC_SIGN), Ingredient.of(BOPItems.MAGIC_BOAT), Ingredient.of(BOPItems.MAGIC_CHEST_BOAT),
                false, "magic");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPBlocks.UMBRAN_PLANKS),
                Ingredient.of(CompatibilityItemTags.UMBRAN_LOGS), Ingredient.of(BOPBlocks.UMBRAN_FENCE),
                Ingredient.of(BOPBlocks.UMBRAN_FENCE_GATE), Ingredient.of(BOPBlocks.UMBRAN_DOOR),
                Ingredient.of(BOPBlocks.UMBRAN_TRAPDOOR), Ingredient.of(BOPBlocks.UMBRAN_PRESSURE_PLATE),
                Ingredient.of(BOPItems.UMBRAN_SIGN), Ingredient.of(BOPItems.UMBRAN_BOAT), Ingredient.of(BOPItems.UMBRAN_CHEST_BOAT),
                false, "umbran");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPBlocks.HELLBARK_PLANKS),
                Ingredient.of(CompatibilityItemTags.HELLBARK_LOGS), Ingredient.of(BOPBlocks.HELLBARK_FENCE),
                Ingredient.of(BOPBlocks.HELLBARK_FENCE_GATE), Ingredient.of(BOPBlocks.HELLBARK_DOOR),
                Ingredient.of(BOPBlocks.HELLBARK_TRAPDOOR), Ingredient.of(BOPBlocks.HELLBARK_PRESSURE_PLATE),
                Ingredient.of(BOPItems.HELLBARK_SIGN), Ingredient.of(BOPItems.HELLBARK_BOAT), Ingredient.of(BOPItems.HELLBARK_CHEST_BOAT),
                false, "hellbark");
    }

    private void buildPlantGrowthChamberRecipes(Consumer<FinishedRecipe> output) {
        addBasicFlowerGrowingRecipe(output, BOPBlocks.VIOLET, "violet");
        addBasicFlowerGrowingRecipe(output, BOPBlocks.LAVENDER, "lavender");
        addBasicFlowerGrowingRecipe(output, BOPBlocks.ORANGE_COSMOS, "orange_cosmos");
        addBasicFlowerGrowingRecipe(output, BOPBlocks.PINK_DAFFODIL, "pink_daffodil");
        addBasicFlowerGrowingRecipe(output, BOPBlocks.PINK_HIBISCUS, "pink_hibiscus");

        addBasicFlowerGrowingRecipe(output, BOPBlocks.ROSE, "rose");

        addBasicFlowerGrowingRecipe(output, BOPBlocks.TALL_LAVENDER, "tall_lavender");
        addBasicFlowerGrowingRecipe(output, BOPBlocks.BLUE_HYDRANGEA, "blue_hydrangea");
        addBasicFlowerGrowingRecipe(output, BOPBlocks.GOLDENROD, "goldenrod");
        addBasicFlowerGrowingRecipe(output, BOPBlocks.ICY_IRIS, "icy_iris");
        addBasicFlowerGrowingRecipe(output, BOPBlocks.GLOWFLOWER, "glowflower");
        addBasicFlowerGrowingRecipe(output, BOPBlocks.WILTED_LILY, "wilted_liliy");

        addBasicMushroomsGrowingRecipe(output, BOPBlocks.TOADSTOOL, "toadstool");

        addPlantGrowthChamberRecipe(output, Ingredient.of(BOPBlocks.WILDFLOWER), new OutputItemStackWithPercentages[] {
                new OutputItemStackWithPercentages(new ItemStack(BOPBlocks.WILDFLOWER), new double[] {
                        1., 1., 1., .67, .33, .33, .15
                })
        }, 16000, "wildflower", "wildflower");

        addPlantGrowthChamberRecipe(output, Ingredient.of(BOPBlocks.WHITE_PETALS), new OutputItemStackWithPercentages[] {
                new OutputItemStackWithPercentages(new ItemStack(BOPBlocks.WHITE_PETALS), new double[] {
                        1., 1., 1., .67, .33, .33, .15
                })
        }, 16000, "white_petals", "white_petals");
    }

    private void buildCrystalGrowthChamberRecipes(Consumer<FinishedRecipe> output) {
        addCrystalGrowthChamberRecipe(output, Ingredient.of(BOPItems.ROSE_QUARTZ_CHUNK),
                new OutputItemStackWithPercentages(new ItemStack(BOPItems.ROSE_QUARTZ_CHUNK), new double[] {
                        1., 1., .67, .5, .25, .125
                }), 16000);
    }

    private void addCrusherRecipe(Consumer<FinishedRecipe> recipeOutput, Ingredient input, ItemStack output, String recipeIngredientName) {
        ResourceLocation recipeId = new ResourceLocation(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "crusher/" +
                getItemName(output.getItem()) + "_from_crushing_" + recipeIngredientName);

        CrusherFinishedRecipe recipe = new CrusherFinishedRecipe(
                recipeId,
                output, input
        );
        recipeOutput.accept(recipe);
    }

    private void addBasicWoodSawmillRecipe(Consumer<FinishedRecipe> recipeOutput, ItemStack planksItem,
                                                  Ingredient logsInput, Ingredient fenceInput, Ingredient fenceGateInput,
                                                  Ingredient doorInput, Ingredient trapdoorInput, Ingredient pressurePlateInput,
                                                  Ingredient signInput, Ingredient boatInput, Ingredient chestBoatInput,
                                                  boolean isRaft, String woodName) {
        addSawmillRecipe(recipeOutput, logsInput, planksItem.copyWithCount(6), 1, getItemName(planksItem.getItem()),
                woodName + "_logs");

        addBasicWoodWithoutLogsSawmillRecipe(recipeOutput, planksItem, fenceInput, fenceGateInput, doorInput, trapdoorInput,
                pressurePlateInput, signInput, boatInput, chestBoatInput, isRaft, woodName);
    }
    private void addBasicWoodWithoutLogsSawmillRecipe(Consumer<FinishedRecipe> recipeOutput, ItemStack planksItem,
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
    private void addBasicWoodWithoutLogsAndBoatsSawmillRecipe(Consumer<FinishedRecipe> recipeOutput, ItemStack planksItem,
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
    private void addSawmillRecipe(Consumer<FinishedRecipe> recipeOutput, Ingredient input, ItemStack output,
                                         int sawdustAmount, String outputName, String recipeIngredientName) {
        ResourceLocation recipeId = new ResourceLocation(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "sawmill/" +
                outputName + "_from_sawing_" + recipeIngredientName);

        SawmillFinishedRecipe recipe = new SawmillFinishedRecipe(
                recipeId,
                output, input, sawdustAmount
        );
        recipeOutput.accept(recipe);
    }

    private void addBasicFlowerGrowingRecipe(Consumer<FinishedRecipe> recipeOutput, ItemLike flowerItem,
                                                    String outputName) {
        addPlantGrowthChamberRecipe(recipeOutput, Ingredient.of(flowerItem), new OutputItemStackWithPercentages[] {
                new OutputItemStackWithPercentages(new ItemStack(flowerItem), new double[] {
                        1., 1., .33
                })
        }, 16000, outputName, getItemName(flowerItem));
    }
    private void addBasicMushroomsGrowingRecipe(Consumer<FinishedRecipe> recipeOutput, ItemLike mushroomItem,
                                                       String outputName) {
        addPlantGrowthChamberRecipe(recipeOutput, Ingredient.of(mushroomItem), new OutputItemStackWithPercentages[] {
                new OutputItemStackWithPercentages(new ItemStack(mushroomItem), new double[] {
                        1., 1., .5, .25
                })
        }, 16000, outputName, getItemName(mushroomItem));
    }
    private void addPlantGrowthChamberRecipe(Consumer<FinishedRecipe> recipeOutput, Ingredient input,
                                             OutputItemStackWithPercentages[] outputs, int ticks,
                                             String outputName, String recipeIngredientName) {
        ResourceLocation recipeId = new ResourceLocation(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "growing/" +
                outputName + "_from_growing_" + recipeIngredientName);

        PlantGrowthChamberFinishedRecipe recipe = new PlantGrowthChamberFinishedRecipe(
                recipeId,
                outputs, input, ticks
        );
        recipeOutput.accept(recipe);
    }

    private void addCrystalGrowthChamberRecipe(Consumer<FinishedRecipe> recipeOutput, Ingredient input, OutputItemStackWithPercentages output,
                                                      int ticks) {
        addCrystalGrowthChamberRecipe(recipeOutput, input, output, 1, ticks);
    }
    private void addCrystalGrowthChamberRecipe(Consumer<FinishedRecipe> recipeOutput, Ingredient input, OutputItemStackWithPercentages output,
                                                      int inputCount, int ticks) {
        ResourceLocation recipeId = new ResourceLocation(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "crystal_growing/" +
                getItemName(output.output().getItem()));

        CrystalGrowthChamberFinishedRecipe recipe = new CrystalGrowthChamberFinishedRecipe(
                recipeId,
                output, input, inputCount, ticks
        );
        recipeOutput.accept(recipe);
    }
}

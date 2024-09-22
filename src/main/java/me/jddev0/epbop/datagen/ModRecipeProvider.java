package me.jddev0.epbop.datagen;

import biomesoplenty.api.BOPAPI;
import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.api.item.BOPItems;
import me.jddev0.ep.datagen.recipe.CrusherFinishedRecipe;
import me.jddev0.ep.datagen.recipe.CrystalGrowthChamberFinishedRecipe;
import me.jddev0.ep.datagen.recipe.PlantGrowthChamberFinishedRecipe;
import me.jddev0.ep.datagen.recipe.SawmillFinishedRecipe;
import me.jddev0.epbop.EnergizedPowerBOPMod;
import me.jddev0.ep.recipe.*;
import me.jddev0.epbop.registry.tags.CompatibilityItemTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final String BIOMES_O_PLENTY_MOD_ID = BOPAPI.MOD_ID;
    private static final String PATH_PREFIX = "compat/" + BIOMES_O_PLENTY_MOD_ID + "/";

    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {
        buildCrusherRecipes(output);
        buildSawmillRecipes(output);
        buildPlantGrowthChamberRecipes(output);
        buildCrystalGrowthChamberRecipes(output);
    }

    private void buildCrusherRecipes(RecipeOutput output) {
        addCrusherRecipe(output, Ingredient.of(BOPBlocks.WHITE_SANDSTONE.get()), new ItemStack(BOPBlocks.WHITE_SAND.get()),
                "white_sandstone");
        addCrusherRecipe(output, Ingredient.of(BOPBlocks.SMOOTH_WHITE_SANDSTONE.get(), BOPBlocks.CUT_WHITE_SANDSTONE.get(),
                        BOPBlocks.CHISELED_WHITE_SANDSTONE.get()), new ItemStack(BOPBlocks.WHITE_SAND.get()),
                "white_sandstone_variants");

        addCrusherRecipe(output, Ingredient.of(BOPBlocks.ORANGE_SANDSTONE.get()), new ItemStack(BOPBlocks.ORANGE_SAND.get()),
                "orange_sandstone");
        addCrusherRecipe(output, Ingredient.of(BOPBlocks.SMOOTH_ORANGE_SANDSTONE.get(), BOPBlocks.CUT_ORANGE_SANDSTONE.get(),
                        BOPBlocks.CHISELED_ORANGE_SANDSTONE.get()), new ItemStack(BOPBlocks.ORANGE_SAND.get()),
                "orange_sandstone_variants");

        addCrusherRecipe(output, Ingredient.of(BOPBlocks.BLACK_SANDSTONE.get()), new ItemStack(BOPBlocks.BLACK_SAND.get()),
                "black_sandstone");
        addCrusherRecipe(output, Ingredient.of(BOPBlocks.SMOOTH_BLACK_SANDSTONE.get(), BOPBlocks.CUT_BLACK_SANDSTONE.get(),
                        BOPBlocks.CHISELED_BLACK_SANDSTONE.get()), new ItemStack(BOPBlocks.BLACK_SAND.get()),
                "black_sandstone_variants");

        addCrusherRecipe(output, Ingredient.of(BOPBlocks.BRIMSTONE_BRICKS.get(), BOPBlocks.CHISELED_BRIMSTONE_BRICKS.get()),
                new ItemStack(BOPBlocks.BRIMSTONE.get()),
                "brimstone_variants");
    }

    private void buildSawmillRecipes(RecipeOutput output) {
        addBasicWoodSawmillRecipe(output, new ItemStack(BOPBlocks.FIR_PLANKS.get()),
                Ingredient.of(CompatibilityItemTags.FIR_LOGS), Ingredient.of(BOPBlocks.FIR_FENCE.get()),
                Ingredient.of(BOPBlocks.FIR_FENCE_GATE.get()), Ingredient.of(BOPBlocks.FIR_DOOR.get()),
                Ingredient.of(BOPBlocks.FIR_TRAPDOOR.get()), Ingredient.of(BOPBlocks.FIR_PRESSURE_PLATE.get()),
                Ingredient.of(BOPItems.FIR_SIGN.get()), Ingredient.of(BOPItems.FIR_BOAT.get()), Ingredient.of(BOPItems.FIR_CHEST_BOAT.get()),
                false, "fir");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPBlocks.PINE_PLANKS.get()),
                Ingredient.of(CompatibilityItemTags.PINE_LOGS), Ingredient.of(BOPBlocks.PINE_FENCE.get()),
                Ingredient.of(BOPBlocks.PINE_FENCE_GATE.get()), Ingredient.of(BOPBlocks.PINE_DOOR.get()),
                Ingredient.of(BOPBlocks.PINE_TRAPDOOR.get()), Ingredient.of(BOPBlocks.PINE_PRESSURE_PLATE.get()),
                Ingredient.of(BOPItems.PINE_SIGN.get()), Ingredient.of(BOPItems.PINE_BOAT.get()), Ingredient.of(BOPItems.PINE_CHEST_BOAT.get()),
                false, "pine");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPBlocks.MAPLE_PLANKS.get()),
                Ingredient.of(CompatibilityItemTags.MAPLE_LOGS), Ingredient.of(BOPBlocks.MAPLE_FENCE.get()),
                Ingredient.of(BOPBlocks.MAPLE_FENCE_GATE.get()), Ingredient.of(BOPBlocks.MAPLE_DOOR.get()),
                Ingredient.of(BOPBlocks.MAPLE_TRAPDOOR.get()), Ingredient.of(BOPBlocks.MAPLE_PRESSURE_PLATE.get()),
                Ingredient.of(BOPItems.MAPLE_SIGN.get()), Ingredient.of(BOPItems.MAPLE_BOAT.get()), Ingredient.of(BOPItems.MAPLE_CHEST_BOAT.get()),
                false, "maple");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPBlocks.REDWOOD_PLANKS.get()),
                Ingredient.of(CompatibilityItemTags.REDWOOD_LOGS), Ingredient.of(BOPBlocks.REDWOOD_FENCE.get()),
                Ingredient.of(BOPBlocks.REDWOOD_FENCE_GATE.get()), Ingredient.of(BOPBlocks.REDWOOD_DOOR.get()),
                Ingredient.of(BOPBlocks.REDWOOD_TRAPDOOR.get()), Ingredient.of(BOPBlocks.REDWOOD_PRESSURE_PLATE.get()),
                Ingredient.of(BOPItems.REDWOOD_SIGN.get()), Ingredient.of(BOPItems.REDWOOD_BOAT.get()), Ingredient.of(BOPItems.REDWOOD_CHEST_BOAT.get()),
                false, "redwood");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPBlocks.MAHOGANY_PLANKS.get()),
                Ingredient.of(CompatibilityItemTags.MAHOGANY_LOGS), Ingredient.of(BOPBlocks.MAHOGANY_FENCE.get()),
                Ingredient.of(BOPBlocks.MAHOGANY_FENCE_GATE.get()), Ingredient.of(BOPBlocks.MAHOGANY_DOOR.get()),
                Ingredient.of(BOPBlocks.MAHOGANY_TRAPDOOR.get()), Ingredient.of(BOPBlocks.MAHOGANY_PRESSURE_PLATE.get()),
                Ingredient.of(BOPItems.MAHOGANY_SIGN.get()), Ingredient.of(BOPItems.MAHOGANY_BOAT.get()), Ingredient.of(BOPItems.MAHOGANY_CHEST_BOAT.get()),
                false, "mahogany");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPBlocks.JACARANDA_PLANKS.get()),
                Ingredient.of(CompatibilityItemTags.JACARANDA_LOGS), Ingredient.of(BOPBlocks.JACARANDA_FENCE.get()),
                Ingredient.of(BOPBlocks.JACARANDA_FENCE_GATE.get()), Ingredient.of(BOPBlocks.JACARANDA_DOOR.get()),
                Ingredient.of(BOPBlocks.JACARANDA_TRAPDOOR.get()), Ingredient.of(BOPBlocks.JACARANDA_PRESSURE_PLATE.get()),
                Ingredient.of(BOPItems.JACARANDA_SIGN.get()), Ingredient.of(BOPItems.JACARANDA_BOAT.get()), Ingredient.of(BOPItems.JACARANDA_CHEST_BOAT.get()),
                false, "jacaranda");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPBlocks.PALM_PLANKS.get()),
                Ingredient.of(CompatibilityItemTags.PALM_LOGS), Ingredient.of(BOPBlocks.PALM_FENCE.get()),
                Ingredient.of(BOPBlocks.PALM_FENCE_GATE.get()), Ingredient.of(BOPBlocks.PALM_DOOR.get()),
                Ingredient.of(BOPBlocks.PALM_TRAPDOOR.get()), Ingredient.of(BOPBlocks.PALM_PRESSURE_PLATE.get()),
                Ingredient.of(BOPItems.PALM_SIGN.get()), Ingredient.of(BOPItems.PALM_BOAT.get()), Ingredient.of(BOPItems.PALM_CHEST_BOAT.get()),
                false, "palm");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPBlocks.WILLOW_PLANKS.get()),
                Ingredient.of(CompatibilityItemTags.WILLOW_LOGS), Ingredient.of(BOPBlocks.WILLOW_FENCE.get()),
                Ingredient.of(BOPBlocks.WILLOW_FENCE_GATE.get()), Ingredient.of(BOPBlocks.WILLOW_DOOR.get()),
                Ingredient.of(BOPBlocks.WILLOW_TRAPDOOR.get()), Ingredient.of(BOPBlocks.WILLOW_PRESSURE_PLATE.get()),
                Ingredient.of(BOPItems.WILLOW_SIGN.get()), Ingredient.of(BOPItems.WILLOW_BOAT.get()), Ingredient.of(BOPItems.WILLOW_CHEST_BOAT.get()),
                false, "willow");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPBlocks.DEAD_PLANKS.get()),
                Ingredient.of(CompatibilityItemTags.DEAD_LOGS), Ingredient.of(BOPBlocks.DEAD_FENCE.get()),
                Ingredient.of(BOPBlocks.DEAD_FENCE_GATE.get()), Ingredient.of(BOPBlocks.DEAD_DOOR.get()),
                Ingredient.of(BOPBlocks.DEAD_TRAPDOOR.get()), Ingredient.of(BOPBlocks.DEAD_PRESSURE_PLATE.get()),
                Ingredient.of(BOPItems.DEAD_SIGN.get()), Ingredient.of(BOPItems.DEAD_BOAT.get()), Ingredient.of(BOPItems.DEAD_CHEST_BOAT.get()),
                false, "dead");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPBlocks.MAGIC_PLANKS.get()),
                Ingredient.of(CompatibilityItemTags.MAGIC_LOGS), Ingredient.of(BOPBlocks.MAGIC_FENCE.get()),
                Ingredient.of(BOPBlocks.MAGIC_FENCE_GATE.get()), Ingredient.of(BOPBlocks.MAGIC_DOOR.get()),
                Ingredient.of(BOPBlocks.MAGIC_TRAPDOOR.get()), Ingredient.of(BOPBlocks.MAGIC_PRESSURE_PLATE.get()),
                Ingredient.of(BOPItems.MAGIC_SIGN.get()), Ingredient.of(BOPItems.MAGIC_BOAT.get()), Ingredient.of(BOPItems.MAGIC_CHEST_BOAT.get()),
                false, "magic");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPBlocks.UMBRAN_PLANKS.get()),
                Ingredient.of(CompatibilityItemTags.UMBRAN_LOGS), Ingredient.of(BOPBlocks.UMBRAN_FENCE.get()),
                Ingredient.of(BOPBlocks.UMBRAN_FENCE_GATE.get()), Ingredient.of(BOPBlocks.UMBRAN_DOOR.get()),
                Ingredient.of(BOPBlocks.UMBRAN_TRAPDOOR.get()), Ingredient.of(BOPBlocks.UMBRAN_PRESSURE_PLATE.get()),
                Ingredient.of(BOPItems.UMBRAN_SIGN.get()), Ingredient.of(BOPItems.UMBRAN_BOAT.get()), Ingredient.of(BOPItems.UMBRAN_CHEST_BOAT.get()),
                false, "umbran");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPBlocks.HELLBARK_PLANKS.get()),
                Ingredient.of(CompatibilityItemTags.HELLBARK_LOGS), Ingredient.of(BOPBlocks.HELLBARK_FENCE.get()),
                Ingredient.of(BOPBlocks.HELLBARK_FENCE_GATE.get()), Ingredient.of(BOPBlocks.HELLBARK_DOOR.get()),
                Ingredient.of(BOPBlocks.HELLBARK_TRAPDOOR.get()), Ingredient.of(BOPBlocks.HELLBARK_PRESSURE_PLATE.get()),
                Ingredient.of(BOPItems.HELLBARK_SIGN.get()), Ingredient.of(BOPItems.HELLBARK_BOAT.get()), Ingredient.of(BOPItems.HELLBARK_CHEST_BOAT.get()),
                false, "hellbark");
    }

    private void buildPlantGrowthChamberRecipes(RecipeOutput output) {
        addBasicFlowerGrowingRecipe(output, BOPBlocks.VIOLET.get(), "violet");
        addBasicFlowerGrowingRecipe(output, BOPBlocks.LAVENDER.get(), "lavender");
        addBasicFlowerGrowingRecipe(output, BOPBlocks.ORANGE_COSMOS.get(), "orange_cosmos");
        addBasicFlowerGrowingRecipe(output, BOPBlocks.PINK_DAFFODIL.get(), "pink_daffodil");
        addBasicFlowerGrowingRecipe(output, BOPBlocks.PINK_HIBISCUS.get(), "pink_hibiscus");

        addBasicFlowerGrowingRecipe(output, BOPBlocks.TALL_LAVENDER.get(), "tall_lavender");
        addBasicFlowerGrowingRecipe(output, BOPBlocks.BLUE_HYDRANGEA.get(), "blue_hydrangea");
        addBasicFlowerGrowingRecipe(output, BOPBlocks.GOLDENROD.get(), "goldenrod");
        addBasicFlowerGrowingRecipe(output, BOPBlocks.ICY_IRIS.get(), "icy_iris");
        addBasicFlowerGrowingRecipe(output, BOPBlocks.GLOWFLOWER.get(), "glowflower");
        addBasicFlowerGrowingRecipe(output, BOPBlocks.WILTED_LILY.get(), "wilted_liliy");

        addBasicMushroomsGrowingRecipe(output, BOPBlocks.TOADSTOOL.get(), "toadstool");

        addPlantGrowthChamberRecipe(output, Ingredient.of(BOPBlocks.WILDFLOWER.get()), new OutputItemStackWithPercentages[] {
                new OutputItemStackWithPercentages(new ItemStack(BOPBlocks.WILDFLOWER.get()), new double[] {
                        1., 1., 1., .67, .33, .33, .15
                })
        }, 16000, "wildflower", "wildflower");

        addPlantGrowthChamberRecipe(output, Ingredient.of(BOPBlocks.WHITE_PETALS.get()), new OutputItemStackWithPercentages[] {
                new OutputItemStackWithPercentages(new ItemStack(BOPBlocks.WHITE_PETALS.get()), new double[] {
                        1., 1., 1., .67, .33, .33, .15
                })
        }, 16000, "white_petals", "white_petals");
    }

    private void buildCrystalGrowthChamberRecipes(RecipeOutput output) {
        addCrystalGrowthChamberRecipe(output, Ingredient.of(BOPItems.ROSE_QUARTZ_CHUNK.get()),
                new OutputItemStackWithPercentages(new ItemStack(BOPItems.ROSE_QUARTZ_CHUNK.get()), new double[] {
                        1., 1., .67, .5, .25, .125
                }), 16000);
    }

    private void addCrusherRecipe(RecipeOutput recipeOutput, Ingredient input, ItemStack output, String recipeIngredientName) {
        ResourceLocation recipeId = new ResourceLocation(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "crusher/" +
                getItemName(output.getItem()) + "_from_crushing_" + recipeIngredientName);

        CrusherFinishedRecipe recipe = new CrusherFinishedRecipe(
                recipeId,
                output, input
        );
        recipeOutput.accept(recipe);
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
        ResourceLocation recipeId = new ResourceLocation(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "sawmill/" +
                outputName + "_from_sawing_" + recipeIngredientName);

        SawmillFinishedRecipe recipe = new SawmillFinishedRecipe(
                recipeId,
                output, input, sawdustAmount
        );
        recipeOutput.accept(recipe);
    }

    private void addBasicFlowerGrowingRecipe(RecipeOutput recipeOutput, ItemLike flowerItem,
                                                    String outputName) {
        addPlantGrowthChamberRecipe(recipeOutput, Ingredient.of(flowerItem), new OutputItemStackWithPercentages[] {
                new OutputItemStackWithPercentages(new ItemStack(flowerItem), new double[] {
                        1., 1., .33
                })
        }, 16000, outputName, getItemName(flowerItem));
    }
    private void addBasicMushroomsGrowingRecipe(RecipeOutput recipeOutput, ItemLike mushroomItem,
                                                       String outputName) {
        addPlantGrowthChamberRecipe(recipeOutput, Ingredient.of(mushroomItem), new OutputItemStackWithPercentages[] {
                new OutputItemStackWithPercentages(new ItemStack(mushroomItem), new double[] {
                        1., 1., .5, .25
                })
        }, 16000, outputName, getItemName(mushroomItem));
    }
    private void addPlantGrowthChamberRecipe(RecipeOutput recipeOutput, Ingredient input,
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

    private void addCrystalGrowthChamberRecipe(RecipeOutput recipeOutput, Ingredient input, OutputItemStackWithPercentages output,
                                                      int ticks) {
        addCrystalGrowthChamberRecipe(recipeOutput, input, output, 1, ticks);
    }
    private void addCrystalGrowthChamberRecipe(RecipeOutput recipeOutput, Ingredient input, OutputItemStackWithPercentages output,
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

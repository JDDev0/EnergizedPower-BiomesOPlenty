package me.jddev0.epbop.datagen.recipe;

import biomesoplenty.api.BOPAPI;
import biomesoplenty.api.item.BOPItems;
import biomesoplenty.init.ModTags;
import me.jddev0.ep.recipe.*;
import me.jddev0.epbop.EnergizedPowerBOPMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.NeoForgeConditions;

public class ModRecipeGenerator extends RecipeProvider {
    private static final String BIOMES_O_PLENTY_MOD_ID = BOPAPI.MOD_ID;
    private static final String PATH_PREFIX = "compat/" + BIOMES_O_PLENTY_MOD_ID + "/";

    public ModRecipeGenerator(HolderLookup.Provider registries, RecipeOutput recipeOutput) {
        super(registries, recipeOutput);
    }

    @Override
    protected void buildRecipes() {
        buildCrusherRecipes(output);
        buildSawmillRecipes(output);
        buildPlantGrowthChamberRecipes(output);
        buildCrystalGrowthChamberRecipes(output);
    }

    private void buildCrusherRecipes(RecipeOutput output) {
        addCrusherRecipe(output, ingredientOf(BOPItems.WHITE_SANDSTONE), new ItemStack(BOPItems.WHITE_SAND),
                "white_sandstone");
        addCrusherRecipe(output, ingredientOf(BOPItems.SMOOTH_WHITE_SANDSTONE, BOPItems.CUT_WHITE_SANDSTONE,
                        BOPItems.CHISELED_WHITE_SANDSTONE), new ItemStack(BOPItems.WHITE_SAND),
                "white_sandstone_variants");

        addCrusherRecipe(output, ingredientOf(BOPItems.ORANGE_SANDSTONE), new ItemStack(BOPItems.ORANGE_SAND),
                "orange_sandstone");
        addCrusherRecipe(output, ingredientOf(BOPItems.SMOOTH_ORANGE_SANDSTONE, BOPItems.CUT_ORANGE_SANDSTONE,
                        BOPItems.CHISELED_ORANGE_SANDSTONE), new ItemStack(BOPItems.ORANGE_SAND),
                "orange_sandstone_variants");

        addCrusherRecipe(output, ingredientOf(BOPItems.BLACK_SANDSTONE), new ItemStack(BOPItems.BLACK_SAND),
                "black_sandstone");
        addCrusherRecipe(output, ingredientOf(BOPItems.SMOOTH_BLACK_SANDSTONE, BOPItems.CUT_BLACK_SANDSTONE,
                        BOPItems.CHISELED_BLACK_SANDSTONE), new ItemStack(BOPItems.BLACK_SAND),
                "black_sandstone_variants");

        addCrusherRecipe(output, ingredientOf(BOPItems.BRIMSTONE_BRICKS, BOPItems.CHISELED_BRIMSTONE_BRICKS),
                new ItemStack(BOPItems.BRIMSTONE),
                "brimstone_variants");
    }

    private void buildSawmillRecipes(RecipeOutput output) {
        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.ORIGIN_OAK_PLANKS),
                ingredientOf(ModTags.Items.ORIGIN_OAK_LOGS), ingredientOf(BOPItems.ORIGIN_OAK_FENCE),
                ingredientOf(BOPItems.ORIGIN_OAK_FENCE_GATE), ingredientOf(BOPItems.ORIGIN_OAK_DOOR),
                ingredientOf(BOPItems.ORIGIN_OAK_TRAPDOOR), ingredientOf(BOPItems.ORIGIN_OAK_PRESSURE_PLATE),
                ingredientOf(BOPItems.ORIGIN_OAK_SIGN), ingredientOf(BOPItems.ORIGIN_OAK_SHELF),
                ingredientOf(BOPItems.ORIGIN_OAK_BOAT), ingredientOf(BOPItems.ORIGIN_OAK_CHEST_BOAT),
                false, "origin_oak");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.FIR_PLANKS),
                ingredientOf(ModTags.Items.FIR_LOGS), ingredientOf(BOPItems.FIR_FENCE),
                ingredientOf(BOPItems.FIR_FENCE_GATE), ingredientOf(BOPItems.FIR_DOOR),
                ingredientOf(BOPItems.FIR_TRAPDOOR), ingredientOf(BOPItems.FIR_PRESSURE_PLATE),
                ingredientOf(BOPItems.FIR_SIGN), ingredientOf(BOPItems.FIR_SHELF),
                ingredientOf(BOPItems.FIR_BOAT), ingredientOf(BOPItems.FIR_CHEST_BOAT),
                false, "fir");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.PINE_PLANKS),
                ingredientOf(ModTags.Items.PINE_LOGS), ingredientOf(BOPItems.PINE_FENCE),
                ingredientOf(BOPItems.PINE_FENCE_GATE), ingredientOf(BOPItems.PINE_DOOR),
                ingredientOf(BOPItems.PINE_TRAPDOOR), ingredientOf(BOPItems.PINE_PRESSURE_PLATE),
                ingredientOf(BOPItems.PINE_SIGN), ingredientOf(BOPItems.PINE_SHELF),
                ingredientOf(BOPItems.PINE_BOAT), ingredientOf(BOPItems.PINE_CHEST_BOAT),
                false, "pine");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.MAPLE_PLANKS),
                ingredientOf(ModTags.Items.MAPLE_LOGS), ingredientOf(BOPItems.MAPLE_FENCE),
                ingredientOf(BOPItems.MAPLE_FENCE_GATE), ingredientOf(BOPItems.MAPLE_DOOR),
                ingredientOf(BOPItems.MAPLE_TRAPDOOR), ingredientOf(BOPItems.MAPLE_PRESSURE_PLATE),
                ingredientOf(BOPItems.MAPLE_SIGN), ingredientOf(BOPItems.MAPLE_SHELF),
                ingredientOf(BOPItems.MAPLE_BOAT), ingredientOf(BOPItems.MAPLE_CHEST_BOAT),
                false, "maple");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.REDWOOD_PLANKS),
                ingredientOf(ModTags.Items.REDWOOD_LOGS), ingredientOf(BOPItems.REDWOOD_FENCE),
                ingredientOf(BOPItems.REDWOOD_FENCE_GATE), ingredientOf(BOPItems.REDWOOD_DOOR),
                ingredientOf(BOPItems.REDWOOD_TRAPDOOR), ingredientOf(BOPItems.REDWOOD_PRESSURE_PLATE),
                ingredientOf(BOPItems.REDWOOD_SIGN), ingredientOf(BOPItems.REDWOOD_SHELF),
                ingredientOf(BOPItems.REDWOOD_BOAT), ingredientOf(BOPItems.REDWOOD_CHEST_BOAT),
                false, "redwood");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.MAHOGANY_PLANKS),
                ingredientOf(ModTags.Items.MAHOGANY_LOGS), ingredientOf(BOPItems.MAHOGANY_FENCE),
                ingredientOf(BOPItems.MAHOGANY_FENCE_GATE), ingredientOf(BOPItems.MAHOGANY_DOOR),
                ingredientOf(BOPItems.MAHOGANY_TRAPDOOR), ingredientOf(BOPItems.MAHOGANY_PRESSURE_PLATE),
                ingredientOf(BOPItems.MAHOGANY_SIGN), ingredientOf(BOPItems.MAHOGANY_SHELF),
                ingredientOf(BOPItems.MAHOGANY_BOAT), ingredientOf(BOPItems.MAHOGANY_CHEST_BOAT),
                false, "mahogany");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.JACARANDA_PLANKS),
                ingredientOf(ModTags.Items.JACARANDA_LOGS), ingredientOf(BOPItems.JACARANDA_FENCE),
                ingredientOf(BOPItems.JACARANDA_FENCE_GATE), ingredientOf(BOPItems.JACARANDA_DOOR),
                ingredientOf(BOPItems.JACARANDA_TRAPDOOR), ingredientOf(BOPItems.JACARANDA_PRESSURE_PLATE),
                ingredientOf(BOPItems.JACARANDA_SIGN), ingredientOf(BOPItems.JACARANDA_SHELF),
                ingredientOf(BOPItems.JACARANDA_BOAT), ingredientOf(BOPItems.JACARANDA_CHEST_BOAT),
                false, "jacaranda");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.PALM_PLANKS),
                ingredientOf(ModTags.Items.PALM_LOGS), ingredientOf(BOPItems.PALM_FENCE),
                ingredientOf(BOPItems.PALM_FENCE_GATE), ingredientOf(BOPItems.PALM_DOOR),
                ingredientOf(BOPItems.PALM_TRAPDOOR), ingredientOf(BOPItems.PALM_PRESSURE_PLATE),
                ingredientOf(BOPItems.PALM_SIGN), ingredientOf(BOPItems.PALM_SHELF),
                ingredientOf(BOPItems.PALM_BOAT), ingredientOf(BOPItems.PALM_CHEST_BOAT),
                false, "palm");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.WILLOW_PLANKS),
                ingredientOf(ModTags.Items.WILLOW_LOGS), ingredientOf(BOPItems.WILLOW_FENCE),
                ingredientOf(BOPItems.WILLOW_FENCE_GATE), ingredientOf(BOPItems.WILLOW_DOOR),
                ingredientOf(BOPItems.WILLOW_TRAPDOOR), ingredientOf(BOPItems.WILLOW_PRESSURE_PLATE),
                ingredientOf(BOPItems.WILLOW_SIGN), ingredientOf(BOPItems.WILLOW_SHELF),
                ingredientOf(BOPItems.WILLOW_BOAT), ingredientOf(BOPItems.WILLOW_CHEST_BOAT),
                false, "willow");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.DEAD_PLANKS),
                ingredientOf(ModTags.Items.DEAD_LOGS), ingredientOf(BOPItems.DEAD_FENCE),
                ingredientOf(BOPItems.DEAD_FENCE_GATE), ingredientOf(BOPItems.DEAD_DOOR),
                ingredientOf(BOPItems.DEAD_TRAPDOOR), ingredientOf(BOPItems.DEAD_PRESSURE_PLATE),
                ingredientOf(BOPItems.DEAD_SIGN), ingredientOf(BOPItems.DEAD_SHELF),
                ingredientOf(BOPItems.DEAD_BOAT), ingredientOf(BOPItems.DEAD_CHEST_BOAT),
                false, "dead");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.MAGIC_PLANKS),
                ingredientOf(ModTags.Items.MAGIC_LOGS), ingredientOf(BOPItems.MAGIC_FENCE),
                ingredientOf(BOPItems.MAGIC_FENCE_GATE), ingredientOf(BOPItems.MAGIC_DOOR),
                ingredientOf(BOPItems.MAGIC_TRAPDOOR), ingredientOf(BOPItems.MAGIC_PRESSURE_PLATE),
                ingredientOf(BOPItems.MAGIC_SIGN), ingredientOf(BOPItems.MAGIC_SHELF),
                ingredientOf(BOPItems.MAGIC_BOAT), ingredientOf(BOPItems.MAGIC_CHEST_BOAT),
                false, "magic");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.UMBRAN_PLANKS),
                ingredientOf(ModTags.Items.UMBRAN_LOGS), ingredientOf(BOPItems.UMBRAN_FENCE),
                ingredientOf(BOPItems.UMBRAN_FENCE_GATE), ingredientOf(BOPItems.UMBRAN_DOOR),
                ingredientOf(BOPItems.UMBRAN_TRAPDOOR), ingredientOf(BOPItems.UMBRAN_PRESSURE_PLATE),
                ingredientOf(BOPItems.UMBRAN_SIGN), ingredientOf(BOPItems.UMBRAN_SHELF),
                ingredientOf(BOPItems.UMBRAN_BOAT), ingredientOf(BOPItems.UMBRAN_CHEST_BOAT),
                false, "umbran");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.HELLBARK_PLANKS),
                ingredientOf(ModTags.Items.HELLBARK_LOGS), ingredientOf(BOPItems.HELLBARK_FENCE),
                ingredientOf(BOPItems.HELLBARK_FENCE_GATE), ingredientOf(BOPItems.HELLBARK_DOOR),
                ingredientOf(BOPItems.HELLBARK_TRAPDOOR), ingredientOf(BOPItems.HELLBARK_PRESSURE_PLATE),
                ingredientOf(BOPItems.HELLBARK_SIGN), ingredientOf(BOPItems.HELLBARK_SHELF),
                ingredientOf(BOPItems.HELLBARK_BOAT), ingredientOf(BOPItems.HELLBARK_CHEST_BOAT),
                false, "hellbark");

        addBasicWoodSawmillRecipe(output, new ItemStack(BOPItems.EMPYREAL_PLANKS),
                ingredientOf(ModTags.Items.EMPYREAL_LOGS), ingredientOf(BOPItems.EMPYREAL_FENCE),
                ingredientOf(BOPItems.EMPYREAL_FENCE_GATE), ingredientOf(BOPItems.EMPYREAL_DOOR),
                ingredientOf(BOPItems.EMPYREAL_TRAPDOOR), ingredientOf(BOPItems.EMPYREAL_PRESSURE_PLATE),
                ingredientOf(BOPItems.EMPYREAL_SIGN), ingredientOf(BOPItems.EMPYREAL_SHELF),
                ingredientOf(BOPItems.EMPYREAL_BOAT), ingredientOf(BOPItems.EMPYREAL_CHEST_BOAT),
                false, "empyreal");
    }

    private void buildPlantGrowthChamberRecipes(RecipeOutput output) {
        addBasicFlowerGrowingRecipe(output, BOPItems.MARIGOLD, "marigold");
        addBasicFlowerGrowingRecipe(output, BOPItems.VIOLET, "violet");
        addBasicFlowerGrowingRecipe(output, BOPItems.LAVENDER, "lavender");
        addBasicFlowerGrowingRecipe(output, BOPItems.WHITE_LAVENDER, "white_lavender");
        addBasicFlowerGrowingRecipe(output, BOPItems.ORANGE_COSMOS, "orange_cosmos");
        addBasicFlowerGrowingRecipe(output, BOPItems.PINK_DAFFODIL, "pink_daffodil");
        addBasicFlowerGrowingRecipe(output, BOPItems.PINK_HIBISCUS, "pink_hibiscus");

        addBasicFlowerGrowingRecipe(output, BOPItems.ORIGIN_ROSE, "origin_rose");

        addBasicFlowerGrowingRecipe(output, BOPItems.TALL_LAVENDER, "tall_lavender");
        addBasicFlowerGrowingRecipe(output, BOPItems.TALL_WHITE_LAVENDER, "tall_white_lavender");
        addBasicFlowerGrowingRecipe(output, BOPItems.BLUE_HYDRANGEA, "blue_hydrangea");
        addBasicFlowerGrowingRecipe(output, BOPItems.GOLDENROD, "goldenrod");
        addBasicFlowerGrowingRecipe(output, BOPItems.ICY_IRIS, "icy_iris");
        addBasicFlowerGrowingRecipe(output, BOPItems.GLOWFLOWER, "glowflower");
        addBasicFlowerGrowingRecipe(output, BOPItems.WILTED_LILY, "wilted_liliy");

        addBasicMushroomsGrowingRecipe(output, BOPItems.TOADSTOOL, "toadstool");

        addPlantGrowthChamberRecipe(output, ingredientOf(BOPItems.PURPLE_WILDFLOWERS), new OutputItemStackWithPercentages[] {
                new OutputItemStackWithPercentages(new ItemStack(BOPItems.PURPLE_WILDFLOWERS), new double[] {
                        1., 1., 1., .67, .33, .33, .15
                })
        }, 16000, "purple_wildflower", "purple_wildflower");

        addPlantGrowthChamberRecipe(output, ingredientOf(BOPItems.WHITE_PETALS), new OutputItemStackWithPercentages[] {
                new OutputItemStackWithPercentages(new ItemStack(BOPItems.WHITE_PETALS), new double[] {
                        1., 1., 1., .67, .33, .33, .15
                })
        }, 16000, "white_petals", "white_petals");
    }

    private void buildCrystalGrowthChamberRecipes(RecipeOutput output) {
        addCrystalGrowthChamberRecipe(output, ingredientOf(BOPItems.ROSE_QUARTZ_CHUNK),
                new OutputItemStackWithPercentages(new ItemStack(BOPItems.ROSE_QUARTZ_CHUNK), new double[] {
                        1., 1., .67, .5, .25, .125
                }), 16000);
    }

    private void addCrusherRecipe(RecipeOutput recipeOutput, Ingredient input, ItemStack output, String recipeIngredientName) {
        Identifier recipeId = Identifier.fromNamespaceAndPath(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "crusher/" +
                getItemName(output.getItem()) + "_from_crushing_" + recipeIngredientName);

        CrusherRecipe recipe = new CrusherRecipe(output, input);
        recipeOutput.accept(getKey(recipeId), recipe, null, NeoForgeConditions.modLoaded(BIOMES_O_PLENTY_MOD_ID));
    }

    private void addBasicWoodSawmillRecipe(RecipeOutput recipeOutput, ItemStack planksItem,
                                           Ingredient logsInput, Ingredient fenceInput, Ingredient fenceGateInput,
                                           Ingredient doorInput, Ingredient trapdoorInput, Ingredient pressurePlateInput,
                                           Ingredient signInput, Ingredient shelfInput,
                                           Ingredient boatInput, Ingredient chestBoatInput, boolean isRaft, String woodName) {
        addSawmillRecipe(recipeOutput, logsInput, planksItem.copyWithCount(6), 1, getItemName(planksItem.getItem()),
                woodName + "_logs");

        addBasicWoodWithoutLogsSawmillRecipe(recipeOutput, planksItem, fenceInput, fenceGateInput, doorInput, trapdoorInput,
                pressurePlateInput, signInput, shelfInput, boatInput, chestBoatInput, isRaft, woodName);
    }
    private void addBasicWoodWithoutLogsSawmillRecipe(RecipeOutput recipeOutput, ItemStack planksItem,
                                                      Ingredient fenceInput, Ingredient fenceGateInput,
                                                      Ingredient doorInput, Ingredient trapdoorInput, Ingredient pressurePlateInput,
                                                      Ingredient signInput, Ingredient shelfInput,
                                                      Ingredient boatInput, Ingredient chestBoatInput, boolean isRaft, String woodName) {
        addBasicWoodWithoutLogsAndBoatsSawmillRecipe(recipeOutput, planksItem, fenceInput, fenceGateInput, doorInput,
                trapdoorInput, pressurePlateInput, signInput, shelfInput, woodName);

        addSawmillRecipe(recipeOutput, boatInput, planksItem.copyWithCount(4), 3, getItemName(planksItem.getItem()),
                woodName + (isRaft?"_raft":"_boat"));
        addSawmillRecipe(recipeOutput, chestBoatInput, planksItem.copyWithCount(5), 7, getItemName(planksItem.getItem()),
                woodName + (isRaft?"_chest_raft":"_chest_boat"));
    }
    private void addBasicWoodWithoutLogsAndBoatsSawmillRecipe(RecipeOutput recipeOutput, ItemStack planksItem,
                                                                     Ingredient fenceInput, Ingredient fenceGateInput,
                                                                     Ingredient doorInput, Ingredient trapdoorInput, Ingredient pressurePlateInput,
                                                                     Ingredient signInput, Ingredient shelfInput, String woodName) {
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
        addSawmillRecipe(recipeOutput, shelfInput, planksItem.copyWithCount(3), 1, getItemName(planksItem.getItem()),
                woodName + "_shelf");
    }
    private void addSawmillRecipe(RecipeOutput recipeOutput, Ingredient input, ItemStack output,
                                         int sawdustAmount, String outputName, String recipeIngredientName) {
        Identifier recipeId = Identifier.fromNamespaceAndPath(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "sawmill/" +
                outputName + "_from_sawing_" + recipeIngredientName);

        SawmillRecipe recipe = new SawmillRecipe(output, input, sawdustAmount);
        recipeOutput.accept(getKey(recipeId), recipe, null, NeoForgeConditions.modLoaded(BIOMES_O_PLENTY_MOD_ID));
    }

    private void addBasicFlowerGrowingRecipe(RecipeOutput recipeOutput, ItemLike flowerItem,
                                                    String outputName) {
        addPlantGrowthChamberRecipe(recipeOutput, ingredientOf(flowerItem), new OutputItemStackWithPercentages[] {
                new OutputItemStackWithPercentages(new ItemStack(flowerItem), new double[] {
                        1., 1., .33
                })
        }, 16000, outputName, getItemName(flowerItem));
    }
    private void addBasicMushroomsGrowingRecipe(RecipeOutput recipeOutput, ItemLike mushroomItem,
                                                       String outputName) {
        addPlantGrowthChamberRecipe(recipeOutput, ingredientOf(mushroomItem), new OutputItemStackWithPercentages[] {
                new OutputItemStackWithPercentages(new ItemStack(mushroomItem), new double[] {
                        1., 1., .5, .25
                })
        }, 16000, outputName, getItemName(mushroomItem));
    }
    private void addPlantGrowthChamberRecipe(RecipeOutput recipeOutput, Ingredient input,
                                             OutputItemStackWithPercentages[] outputs, int ticks,
                                             String outputName, String recipeIngredientName) {
        Identifier recipeId = Identifier.fromNamespaceAndPath(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "growing/" +
                outputName + "_from_growing_" + recipeIngredientName);

        PlantGrowthChamberRecipe recipe = new PlantGrowthChamberRecipe(outputs, input, ticks);
        recipeOutput.accept(getKey(recipeId), recipe, null, NeoForgeConditions.modLoaded(BIOMES_O_PLENTY_MOD_ID));
    }

    private void addCrystalGrowthChamberRecipe(RecipeOutput recipeOutput, Ingredient input, OutputItemStackWithPercentages output,
                                                      int ticks) {
        addCrystalGrowthChamberRecipe(recipeOutput, new IngredientWithCount(input), output,ticks);
    }
    private void addCrystalGrowthChamberRecipe(RecipeOutput recipeOutput, IngredientWithCount input, OutputItemStackWithPercentages output,
                                                      int ticks) {
        Identifier recipeId = Identifier.fromNamespaceAndPath(EnergizedPowerBOPMod.MODID, PATH_PREFIX + "crystal_growing/" +
                getItemName(output.output().getItem()));

        CrystalGrowthChamberRecipe recipe = new CrystalGrowthChamberRecipe(output, input, ticks);
        recipeOutput.accept(getKey(recipeId), recipe, null, NeoForgeConditions.modLoaded(BIOMES_O_PLENTY_MOD_ID));
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

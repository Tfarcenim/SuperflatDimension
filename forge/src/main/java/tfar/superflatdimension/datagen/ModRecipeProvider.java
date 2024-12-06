package tfar.superflatdimension.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import tfar.superflatdimension.Init;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Init.SUPERFLAT_PORTAL)
                .define('s', Blocks.SLIME_BLOCK)
                .define('f', Items.FLINT_AND_STEEL)
                .pattern("sss")
                .pattern("sfs")
                .pattern("sss")
                .unlockedBy("has_slime_block",has(Blocks.SLIME_BLOCK))
                .save(pWriter);
    }
}

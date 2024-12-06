package tfar.superflatdimension.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import tfar.superflatdimension.SuperflatDimension;

public class ModBlockstateProvider extends BlockStateProvider {
    public ModBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SuperflatDimension.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
    }
}

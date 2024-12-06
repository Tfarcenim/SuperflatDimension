package tfar.superflatdimension.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import tfar.superflatdimension.Init;
import tfar.superflatdimension.SuperflatDimension;

public class ModLangProvider extends LanguageProvider {
    public ModLangProvider(PackOutput output) {
        super(output, SuperflatDimension.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(Init.SUPERFLAT_PORTAL,"Superflat Portal");
    }
}

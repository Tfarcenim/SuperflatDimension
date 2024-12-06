package tfar.superflatdimension;

import net.minecraft.core.registries.Registries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegisterEvent;
import tfar.superflatdimension.datagen.ModDatagen;

@Mod(SuperflatDimension.MOD_ID)
public class SuperflatDimensionForge {
    
    public SuperflatDimensionForge() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(ModDatagen::gather);
        bus.addListener(this::register);
        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.
    
        // Use Forge to bootstrap the Common mod.
        SuperflatDimension.init();
        
    }

    void register(RegisterEvent event) {
        event.register(Registries.BLOCK,SuperflatDimension.id("superflat_portal"),() -> Init.SUPERFLAT_PORTAL);
    }

}
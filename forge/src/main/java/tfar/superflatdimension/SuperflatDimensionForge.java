package tfar.superflatdimension;

import net.minecraftforge.fml.common.Mod;

@Mod(SuperflatDimension.MOD_ID)
public class SuperflatDimensionForge {
    
    public SuperflatDimensionForge() {
    
        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.
    
        // Use Forge to bootstrap the Common mod.
        SuperflatDimension.init();
        
    }
}
package tfar.superflatdimension.mixin;

import tfar.superflatdimension.SuperflatDimension;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MixinMinecraft {
    
    @Inject(at = @At("TAIL"), method = "<init>")
    private void init(CallbackInfo info) {
        
        SuperflatDimension.LOG.info("This line is printed by an example mod common mixin!");
        SuperflatDimension.LOG.info("MC Version: {}", Minecraft.getInstance().getVersionType());
    }
}
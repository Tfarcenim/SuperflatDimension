package tfar.superflatdimension.mixin;

import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseFireBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import tfar.superflatdimension.SuperflatDimension;

@Mixin(BaseFireBlock.class)
//@Debug(export = true)
public class BaseFireBlockMixin {

    @Inject(method = "inPortalDimension",at = @At("RETURN"),cancellable = true)
    private static void forcePortal(Level level, CallbackInfoReturnable<Boolean> cir) {
        if (!cir.getReturnValue() && level.dimension() == SuperflatDimension.SUPERFLAT_DIM) {
            cir.setReturnValue(true);
        }
    }
}

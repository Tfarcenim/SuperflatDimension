package tfar.superflatdimension.mixin;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import javax.annotation.Nullable;

@Mixin(Entity.class)
public abstract class EntityMixin {
    @Shadow public abstract Level level();

    @Shadow public abstract int getPortalWaitTime();

    @Shadow protected boolean isInsidePortal;

    @Shadow protected int portalTime;

    @Shadow public abstract void setPortalCooldown();

    @Shadow public abstract boolean isPassenger();

    @Shadow @Nullable public abstract Entity changeDimension(ServerLevel pDestination);

    @Shadow protected abstract void processPortalCooldown();

  /*  @Inject(method = "handleNetherPortal",at = @At("HEAD"),cancellable = true)
    private void handleSlimePortal(CallbackInfo ci) {
        if (level() instanceof ServerLevel serverLevel && serverLevel.dimension() == SuperflatDimension.SUPERFLAT_DIM) {
            int i = this.getPortalWaitTime();
            ServerLevel serverlevel = (ServerLevel)this.level();
            if (this.isInsidePortal) {
                MinecraftServer minecraftserver = serverlevel.getServer();
                ResourceKey<Level> resourcekey = this.level().dimension() == SuperflatDimension.SUPERFLAT_DIM ? Level.OVERWORLD : SuperflatDimension.SUPERFLAT_DIM;
                ServerLevel serverlevel1 = minecraftserver.getLevel(resourcekey);
                if (serverlevel1 != null && !this.isPassenger() && this.portalTime++ >= i) {
                    this.level().getProfiler().push("portal");
                    this.portalTime = i;
                    this.setPortalCooldown();
                    this.changeDimension(serverlevel1);
                    this.level().getProfiler().pop();
                }

                this.isInsidePortal = false;
            } else {
                if (this.portalTime > 0) {
                    this.portalTime -= 4;
                }

                if (this.portalTime < 0) {
                    this.portalTime = 0;
                }
            }

            this.processPortalCooldown();
            ci.cancel();
        }
    }*/
}

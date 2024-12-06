package tfar.superflatdimension;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.portal.PortalInfo;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.util.ITeleporter;
import org.jetbrains.annotations.Nullable;

import java.util.function.Function;

public class Teleporter implements ITeleporter {

    private final BlockPos pos;

    public Teleporter(BlockPos pos) {
        this.pos = pos;
    }

    @Override
    public @Nullable PortalInfo getPortalInfo(Entity entity, ServerLevel destWorld, Function<ServerLevel, PortalInfo> defaultPortalInfo) {
        return new PortalInfo(new Vec3(pos.getX(),pos.getY(),pos.getZ()),Vec3.ZERO, entity.getYRot(), entity.getXRot());
    }

    @Override
    public Entity placeEntity(Entity entity, ServerLevel currentWorld, ServerLevel destWorld, float yaw, Function<Boolean, Entity> repositionEntity) {
        if (destWorld.dimension() == SuperflatDimension.SUPERFLAT_DIM)
        destWorld.setBlock(new BlockPos(0,-61,0),Init.SUPERFLAT_PORTAL.defaultBlockState(),3);
        return repositionEntity.apply(false);
    }
}

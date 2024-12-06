package tfar.superflatdimension;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.phys.BlockHitResult;
import tfar.superflatdimension.platform.Services;

public class SuperflatPortalBlock extends Block {
    public SuperflatPortalBlock(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState $$0, Level level, BlockPos $$2, Player player, InteractionHand $$4, BlockHitResult $$5) {
        if (level.isClientSide || !player.canChangeDimensions()) return InteractionResult.SUCCESS;
        ServerLevel serverLevel = (ServerLevel) level;
        ResourceKey<Level> dim = level.dimension();
        ServerLevel superflat = serverLevel.getServer().getLevel(SuperflatDimension.SUPERFLAT_DIM);
        if (dim != SuperflatDimension.SUPERFLAT_DIM) {
            Services.PLATFORM.handleSuperflatDimensionChange($$0,level,superflat , new BlockPos(0,-60,0), player);
        } else {
            ServerLevel overworld = serverLevel.getServer().overworld();
            BlockPos blockpos = overworld.getHeightmapPos(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, overworld.getSharedSpawnPos());
            Services.PLATFORM.handleSuperflatDimensionChange($$0,superflat,overworld,blockpos, player);
        }
        return InteractionResult.SUCCESS;
    }
}

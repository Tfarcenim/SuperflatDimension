package tfar.superflatdimension.platform;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.util.ITeleporter;
import tfar.superflatdimension.Teleporter;
import tfar.superflatdimension.platform.services.IPlatformHelper;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLLoader;

public class ForgePlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {

        return "Forge";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return !FMLLoader.isProduction();
    }

    @Override
    public void handleSuperflatDimensionChange(BlockState state, Level level, ServerLevel to, BlockPos pos, Entity entity) {
        if (!level.isClientSide) {
            ITeleporter teleporter = new Teleporter(pos);
            entity.changeDimension(to, teleporter);
        }
    }
}
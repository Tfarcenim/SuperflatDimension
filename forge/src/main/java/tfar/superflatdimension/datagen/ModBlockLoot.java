package tfar.superflatdimension.datagen;

import net.minecraft.data.loot.packs.VanillaBlockLoot;
import net.minecraft.world.level.block.Block;
import tfar.superflatdimension.Init;

import java.util.List;

public class ModBlockLoot extends VanillaBlockLoot {

    @Override
    protected void generate() {
        dropSelf(Init.SUPERFLAT_PORTAL);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return List.of(Init.SUPERFLAT_PORTAL);
    }
}

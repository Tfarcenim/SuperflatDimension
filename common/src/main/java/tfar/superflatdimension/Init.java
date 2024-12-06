package tfar.superflatdimension;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;

public class Init {

    public static final Block SUPERFLAT_PORTAL = new SuperflatPortalBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().strength(-1.0F).sound(SoundType.GLASS).lightLevel((p_50872_) -> 11).pushReaction(PushReaction.BLOCK));

}

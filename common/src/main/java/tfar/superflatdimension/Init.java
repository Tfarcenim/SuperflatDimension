package tfar.superflatdimension;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;

public class Init {

    public static final SuperflatPortalBlock SUPERFLAT_PORTAL = new SuperflatPortalBlock(BlockBehaviour.Properties.of().strength(5,1200)
            .sound(SoundType.GLASS).lightLevel(state -> 11).pushReaction(PushReaction.BLOCK));

    public static final BlockItem SUPERFLAT_PORTAL_ITEM = new BlockItem(SUPERFLAT_PORTAL,new Item.Properties());

}

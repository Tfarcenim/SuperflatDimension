package tfar.superflatdimension;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.NetherPortalBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class SuperflatPortalBlock extends NetherPortalBlock {
    public SuperflatPortalBlock(Properties properties) {
        super(properties);
    }

    protected final BlockBehaviour.StatePredicate FRAME = (state, p_77721_, p_77722_) -> {
        return state.is(Blocks.SLIME_BLOCK);
    };


    protected final CustomPortalShaper shaper = new CustomPortalShaper(FRAME,this);


}

package tfar.superflatdimension;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.portal.PortalShape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

// This class is part of the common project meaning it is shared between all supported loaders. Code written here can only
// import and access the vanilla codebase, libraries used by vanilla, and optionally third party libraries that provide
// common compatible binaries. This means common code can not directly use loader specific concepts such as Forge events
// however it will be compatible with all supported mod loaders.
public class SuperflatDimension {

    public static final String MOD_ID = "superflatdimension";
    public static final String MOD_NAME = "Superflat Dimension";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

  //  public static final ResourceKey<DimensionType> DEATH_DIM_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE,id("death"));
    public static final ResourceKey<Level> SUPERFLAT_DIM = ResourceKey.create(Registries.DIMENSION,id("superflat"));


    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID,path);
    }

    // The loader specific projects are able to import and use any code from the common project. This allows you to
    // write the majority of your code here and load it from your loader specific projects. This example has some
    // code that gets invoked by the entry point of the loader specific projects.
    public static void init() {

        // It is common for all supported loaders to provide a similar feature that can not be used directly in the
        // common code. A popular way to get around this is using Java's built-in service loader feature to create
        // your own abstraction layer. You can learn more about this in our provided services class. In this example
        // we have an interface in the common code and use a loader specific implementation to delegate our call to
        // the platform specific approach.

    }
}
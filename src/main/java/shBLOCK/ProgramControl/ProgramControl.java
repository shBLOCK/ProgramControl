package shBLOCK.ProgramControl;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import shBLOCK.ProgramControl.proxy.CommonProxy;

@Mod(modid = ProgramControl.MODID, name = ProgramControl.NAME, version = ProgramControl.VERSION)
public class ProgramControl
{
    public static final String MODID = "program_control";
    public static final String NAME = "Program Control";
    public static final String VERSION = "1.0.0";

    @Mod.Instance
    public static ProgramControl instance;

    @SidedProxy(clientSide = "shBLOCK.ProgramControl.proxy.ClientProxy", serverSide = "shBLOCK.ProgramControl.proxy.CommonProxy")
    public static CommonProxy proxy;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}

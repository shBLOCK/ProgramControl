package shBLOCK.ProgramControl.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import shBLOCK.ProgramControl.ModBlocks;
import shBLOCK.ProgramControl.common.block.BlockCable;
import shBLOCK.ProgramControl.common.tileentity.TileEntityCable;

@Mod.EventBusSubscriber
public class CommonProxy {
    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(new BlockCable());

        GameRegistry.registerTileEntity(TileEntityCable.class, BlockCable.REGISTRY_NAME);
    }

    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(new ItemBlock(ModBlocks.CABLE).setRegistryName(BlockCable.REGISTRY_NAME));
    }
}

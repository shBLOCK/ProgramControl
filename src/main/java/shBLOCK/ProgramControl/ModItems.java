package shBLOCK.ProgramControl;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import shBLOCK.ProgramControl.common.block.BlockCable;

public class ModItems {
    @GameRegistry.ObjectHolder(BlockCable.REGISTRY_NAME)
    public static Item BLOCK_CABLE;
}

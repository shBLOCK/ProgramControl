package shBLOCK.ProgramControl.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import shBLOCK.ProgramControl.ProgramControl;
import shBLOCK.ProgramControl.common.tileentity.TileEntityCable;
import shBLOCK.ProgramControl.proxy.ClientProxy;

public class BlockCable extends Block implements ITileEntityProvider {
    public static final String NAME = "cable";
    public static final String REGISTRY_NAME = ProgramControl.MODID + ":" + NAME;

    public BlockCable() {
        super(Material.ROCK);
        setRegistryName(REGISTRY_NAME);
        setUnlocalizedName(ProgramControl.MODID + "." + NAME);
        setCreativeTab(ClientProxy.CREATIVE_TAB);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityCable();
    }
}

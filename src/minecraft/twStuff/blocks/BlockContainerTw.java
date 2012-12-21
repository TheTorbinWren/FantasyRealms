package twStuff.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import twStuff.CommonProxy;

public class BlockContainerTw extends BlockContainer {
	public BlockContainerTw(int id, int texture, Material material){
		super(id, texture, material);
	}
	
    @Override
    public TileEntity createNewTileEntity(World world) {
            return new TileEntity();
    }

	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}
}

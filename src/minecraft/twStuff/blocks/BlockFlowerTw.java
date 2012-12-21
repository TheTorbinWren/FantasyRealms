package twStuff.blocks;

import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import twStuff.CommonProxy;

public class BlockFlowerTw extends BlockFlower{
	public BlockFlowerTw (int id, int texture, Material material) {
		super (id, texture, material);
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}
	

}

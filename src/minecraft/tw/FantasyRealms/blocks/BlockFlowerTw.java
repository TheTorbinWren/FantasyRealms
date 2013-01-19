package tw.FantasyRealms.blocks;

import tw.FantasyRealms.CommonProxy;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;

public class BlockFlowerTw extends BlockFlower{
	public BlockFlowerTw (int id, int texture, Material material) {
		super (id, texture, material);
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}
	

}

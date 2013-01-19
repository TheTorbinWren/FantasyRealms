package tw.FantasyRealms.blocks;

import tw.FantasyRealms.CommonProxy;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;

public class BlockLeavesBaseTw extends BlockLeavesBase{
	public BlockLeavesBaseTw(int id, int texture, Material material, boolean gfxLevel){
		super(id, texture, material, gfxLevel);
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}

}

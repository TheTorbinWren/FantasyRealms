package twStuff.blocks;

import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import twStuff.CommonProxy;

public class BlockLeavesBaseTw extends BlockLeavesBase{
	public BlockLeavesBaseTw(int id, int texture, Material material, boolean gfxLevel){
		super(id, texture, material, gfxLevel);
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}

}

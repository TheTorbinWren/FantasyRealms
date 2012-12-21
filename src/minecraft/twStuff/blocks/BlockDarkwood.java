package twStuff.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


public class BlockDarkwood extends BlockTw {
	public BlockDarkwood(int id, int texture){
		super(id, texture, Material.wood);
		
		this.setBlockName("twDarkwood");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(2.0f);
		this.setStepSound(soundWoodFootstep);
		this.setRequiresSelfNotify();
		
		GameRegistry.registerBlock(this);
		LanguageRegistry.addName(this, "Darkwood");
	}
	
    public int getBlockTextureFromSide(int side)
    {
    	switch (side){
    	case 1: return 7;
    	case 0: return 7;
        default: return this.blockIndexInTexture;
    	}
    }

    @Override
    public boolean canSustainLeaves(World world, int x, int y, int z)
    {
        return true;
    }
    
    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        byte var7 = 4;
        int var8 = var7 + 1;

        if (par1World.checkChunksExist(par2 - var8, par3 - var8, par4 - var8, par2 + var8, par3 + var8, par4 + var8))
        {
            for (int var9 = -var7; var9 <= var7; ++var9)
            {
                for (int var10 = -var7; var10 <= var7; ++var10)
                {
                    for (int var11 = -var7; var11 <= var7; ++var11)
                    {
                        int var12 = par1World.getBlockId(par2 + var9, par3 + var10, par4 + var11);

                        if (Block.blocksList[var12] != null)
                        {
                            Block.blocksList[var12].beginLeavesDecay(par1World, par2 + var9, par3 + var10, par4 + var11);
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public boolean isWood(World world, int x, int y, int z){
    	return true;
    }
}

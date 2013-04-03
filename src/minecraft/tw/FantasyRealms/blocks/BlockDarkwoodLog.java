package tw.FantasyRealms.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class BlockDarkwoodLog extends BlockCore {
	private Icon[] iconArray = new Icon[2];
	
	public BlockDarkwoodLog(int id, String name, String icon){
		super(id, Material.wood, name, icon);
		
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(2.0f);
		this.setStepSound(soundWoodFootstep);
	}
	
    public Icon getBlockTextureFromSideAndMetadata(int side, int meta)
    {
    	switch (side){
    	case 1: return this.iconArray[1];
    	case 0: return this.iconArray[1];
        default: return this.iconArray[0];
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
    
    @Override
    @SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister IconRegister){
    	this.iconArray[0] = IconRegister.registerIcon("FantasyRealms:DarkwoodLogSide");
    	this.iconArray[1] = IconRegister.registerIcon("FantasyRealms:DarkwoodLogTop");
    }
}

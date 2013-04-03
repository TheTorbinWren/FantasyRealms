package tw.FantasyRealms.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class BlockOreBlock extends BlockCoreMultiblock{
	private Icon[] iconArray = new Icon[12];

	public BlockOreBlock(int id, Material material, int numBlocks, String name, String icon) {
		super(id, material, numBlocks, name, icon);
	}

    public Icon getBlockTextureFromSideAndMetadata(int side, int meta)
    {
    	if (meta>=0 && meta<=11)
    		return this.iconArray[meta];
    	else
    		return this.iconArray[0];
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister IconRegister){
    	this.iconArray[0] = IconRegister.registerIcon("FantasyRealms:OreBlockQuartz");
    	this.iconArray[1] = IconRegister.registerIcon("FantasyRealms:OreBlockCopper");
    	this.iconArray[2] = IconRegister.registerIcon("FantasyRealms:OreBlockSilver");
    	this.iconArray[3] = IconRegister.registerIcon("FantasyRealms:OreBlockPlatinum");
    	this.iconArray[4] = IconRegister.registerIcon("FantasyRealms:OreBlockColdiron");
    	this.iconArray[5] = IconRegister.registerIcon("FantasyRealms:OreBlockMithral");
    	this.iconArray[6] = IconRegister.registerIcon("FantasyRealms:OreBlockAdamantine");
    	this.iconArray[7] = IconRegister.registerIcon("FantasyRealms:OreBlockRuby");
    	this.iconArray[8] = IconRegister.registerIcon("FantasyRealms:OreBlockSapphire");
    	this.iconArray[9] = IconRegister.registerIcon("FantasyRealms:OreBlockTopaz");
    	this.iconArray[10] = IconRegister.registerIcon("FantasyRealms:OreBlockAmethyst");
    	this.iconArray[11] = IconRegister.registerIcon("FantasyRealms:OreBlockElectrum");
	}
}

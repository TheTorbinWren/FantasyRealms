package tw.FantasyRealms.blocks;

import java.util.List;
import java.util.Random;

import tw.FantasyRealms.items.ItemCore;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockOres extends BlockCoreMultiblock {
	private Icon[] iconArray = new Icon[11];
	
	public BlockOres(int id, Material material, int numBlocks, String name, String icon){
		super(id, material, numBlocks, name, icon);
	}
	
	@Override
	public int idDropped(int metadata, Random random, int par2){
		switch (metadata){
		case 0: return ItemCore.quartz.itemID;
		case 7: return ItemCore.ruby.itemID;
		case 8: return ItemCore.sapphire.itemID;
		case 9: return ItemCore.topaz.itemID;
		case 10: return ItemCore.amethyst.itemID;
		default: return this.blockID;
		}
	}
	
	@Override
	public int quantityDropped(int metadata, int fortune, Random random){
		switch (metadata){
		case 0: return 1 + random.nextInt(2); 
		default: return 1;
		}
	}
	
    public Icon getBlockTextureFromSideAndMetadata(int side, int meta)
    {
    	if (meta>=0 && meta<=10)
    		return this.iconArray[meta];
    	else
    		return this.iconArray[0];
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister IconRegister){
    	this.iconArray[0] = IconRegister.registerIcon("FantasyRealms:OreQuartz");
    	this.iconArray[1] = IconRegister.registerIcon("FantasyRealms:OreCopper");
    	this.iconArray[2] = IconRegister.registerIcon("FantasyRealms:OreSilver");
    	this.iconArray[3] = IconRegister.registerIcon("FantasyRealms:OrePlatinum");
    	this.iconArray[4] = IconRegister.registerIcon("FantasyRealms:OreColdiron");
    	this.iconArray[5] = IconRegister.registerIcon("FantasyRealms:OreMithral");
    	this.iconArray[6] = IconRegister.registerIcon("FantasyRealms:OreAdamantine");
    	this.iconArray[7] = IconRegister.registerIcon("FantasyRealms:OreRuby");
    	this.iconArray[8] = IconRegister.registerIcon("FantasyRealms:OreSapphire");
    	this.iconArray[9] = IconRegister.registerIcon("FantasyRealms:OreTopaz");
    	this.iconArray[10] = IconRegister.registerIcon("FantasyRealms:OreAmethyst");
	}

}

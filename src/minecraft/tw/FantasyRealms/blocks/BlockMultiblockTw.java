package tw.FantasyRealms.blocks;

import java.util.List;
import java.util.Random;

import tw.FantasyRealms.CommonProxy;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMultiblockTw extends Block {
	private int baseTexture;
	private int numSubBlocks;
	
	public BlockMultiblockTw(int id, int texture, Material material, int numBlocks){
		super(id, texture, Material.rock);
		this.baseTexture = texture;
		this.numSubBlocks = numBlocks;
		this.setRequiresSelfNotify();
	}
	
	@Override
	public int idDropped(int metadata, Random random, int par2){
		return this.blockID;
	}
	
	@Override
	public int damageDropped(int metadata){
		return metadata;
	}
	
	@Override
	public int quantityDropped(int metadata, int fortune, Random random){
		return 1;
	}
	
	@Override
	public int getBlockTextureFromSideAndMetadata(int side, int metadata){
		return this.baseTexture + metadata;
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List itemList){
		for (int i=0;i<this.numSubBlocks;i++){
			itemList.add(new ItemStack(this, 1, i));
		}
	}

	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}
}

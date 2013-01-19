package tw.FantasyRealms.blocks;

import java.util.List;
import java.util.Random;

import tw.FantasyRealms.items.ItemTw;

import net.minecraft.block.material.Material;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockOreTw extends BlockMultiblockTw {
	public BlockOreTw(int id, int texture, Material material, int numBlocks){
		super(id, texture, material, numBlocks);
	}
	
	@Override
	public int idDropped(int metadata, Random random, int par2){
		switch (metadata){
		case 0: return ItemTw.quartz.itemID;
		case 7: return ItemTw.ruby.itemID;
		case 8: return ItemTw.sapphire.itemID;
		case 9: return ItemTw.topaz.itemID;
		case 10: return ItemTw.amethyst.itemID;
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
}

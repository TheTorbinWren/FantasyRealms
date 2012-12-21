package twStuff.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockTw extends ItemBlock {

	private String[] subName;
	
	public ItemBlockTw(int id, Block block, String[] subNames){
		super(id);
		this.setHasSubtypes(true);
		this.setItemName(block.getBlockName());
		this.subName = subNames;
	}
	
	@Override
	public String getItemNameIS(ItemStack item){
		return this.getItemName() + "." + this.subName[item.getItemDamage()];
	}
	
	@Override
	public int getMetadata(int damage){
		return damage;
	}
}

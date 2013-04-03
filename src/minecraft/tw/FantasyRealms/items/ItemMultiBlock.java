package tw.FantasyRealms.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemMultiBlock extends ItemBlock {

	private String[] subName;
	
	public ItemMultiBlock(int id, Block block, String[] subNames){
		super(id);
		this.setHasSubtypes(true);
		this.setUnlocalizedName(block.getUnlocalizedName());
		this.subName = subNames;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack item){
		return this.subName[item.getItemDamage()];
	}
	
	@Override
	public int getMetadata(int damage){
		return damage;
	}
}

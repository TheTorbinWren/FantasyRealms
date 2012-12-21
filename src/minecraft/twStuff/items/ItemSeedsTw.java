package twStuff.items;

import net.minecraft.item.ItemSeeds;
import twStuff.CommonProxy;

public class ItemSeedsTw extends ItemSeeds {
	
	public ItemSeedsTw(int id, int blockType, int soilId){
		super(id, blockType, soilId);
	}
	
	public String getTextureFile(){
		return CommonProxy.ITEMS_PNG;
	}

}

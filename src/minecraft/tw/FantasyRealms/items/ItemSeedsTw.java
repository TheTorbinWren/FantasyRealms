package tw.FantasyRealms.items;

import tw.FantasyRealms.CommonProxy;
import net.minecraft.item.ItemSeeds;

public class ItemSeedsTw extends ItemSeeds {
	
	public ItemSeedsTw(int id, int blockType, int soilId){
		super(id, blockType, soilId);
	}
	
	public String getTextureFile(){
		return CommonProxy.ITEMS_PNG;
	}

}

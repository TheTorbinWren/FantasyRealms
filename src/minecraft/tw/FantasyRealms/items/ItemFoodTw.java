package tw.FantasyRealms.items;

import tw.FantasyRealms.CommonProxy;
import net.minecraft.item.ItemFood;

public class ItemFoodTw extends ItemFood {

	public ItemFoodTw(int id, int healAmount, float saturationMod, boolean isWolfMeat){
		super(id, healAmount, saturationMod, isWolfMeat);
	}
	
	public String getTextureFile(){
		return CommonProxy.ITEMS_PNG;
	}


}

package twStuff.items;

import net.minecraft.item.ItemFood;
import twStuff.CommonProxy;

public class ItemFoodTw extends ItemFood {

	public ItemFoodTw(int id, int healAmount, float saturationMod, boolean isWolfMeat){
		super(id, healAmount, saturationMod, isWolfMeat);
	}
	
	public String getTextureFile(){
		return CommonProxy.ITEMS_PNG;
	}


}

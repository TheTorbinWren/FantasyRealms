package tw.FantasyRealms.items;

import tw.FantasyRealms.CommonProxy;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemQuartzHoe extends ItemHoe {
	public ItemQuartzHoe(int id, EnumToolMaterial material){
		super (id, material);
		setIconIndex(6);
		setItemName("itemQuartzHoe");
		setMaxDamage(650);

		LanguageRegistry.addName(this, "Quartz Hoe");

	}
	
	@Override
	public String getTextureFile(){
		return CommonProxy.ITEMS_PNG;
	}

}

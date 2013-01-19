package tw.FantasyRealms.items;

import tw.FantasyRealms.CommonProxy;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemQuartzAxe extends ItemAxe {
	public ItemQuartzAxe(int id, EnumToolMaterial material){
		super (id, material);
		setIconIndex(5);
		setItemName("itemQuartzAxe");
		setMaxDamage(650);
		
		LanguageRegistry.addName(this, "Quartz Axe");
	}
	
	@Override
	public String getTextureFile(){
		return CommonProxy.ITEMS_PNG;
	}

}

package twStuff.items;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;
import twStuff.CommonProxy;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemQuartzShovel extends ItemSpade {
	public ItemQuartzShovel(int id, EnumToolMaterial material){
		super(id, material);
		setIconIndex(4);
		setItemName("itemQuartzShovel");
		setMaxDamage(650);

		LanguageRegistry.addName(this, "Quartz Shovel");

	}
	
	@Override
	public String getTextureFile(){
		return CommonProxy.ITEMS_PNG;
	}

}

package twStuff.items;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;
import twStuff.CommonProxy;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemQuartzSword extends ItemSword {
	public ItemQuartzSword(int id, EnumToolMaterial material){
		super (id, material);
		setIconIndex(7);
		setItemName("itemQuartzSword");
		setMaxDamage(650);

		LanguageRegistry.addName(this, "Quartz Sword");

	}

	@Override
	public String getTextureFile(){
		return CommonProxy.ITEMS_PNG;
	}

}

package twStuff.items;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import twStuff.CommonProxy;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemQuartzPick extends ItemPickaxe {
	public ItemQuartzPick(int id, EnumToolMaterial material){
		super(id, material);
		setIconIndex(3);
		setItemName("itemQuartzPick");
		setMaxDamage(650);

		LanguageRegistry.addName(this, "Quartz Pickaxe");
	}
	
	@Override
	public String getTextureFile(){
		return CommonProxy.ITEMS_PNG;
	}

}

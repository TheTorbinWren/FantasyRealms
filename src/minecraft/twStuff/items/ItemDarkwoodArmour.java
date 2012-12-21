package twStuff.items;

import twStuff.CommonProxy;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class ItemDarkwoodArmour extends ItemArmor
implements IArmorTextureProvider {
	public ItemDarkwoodArmour(int id, EnumArmorMaterial material, int icon, int piece){
		super(id, material, 2, piece);
		setIconIndex(icon);
		switch (piece){
		case 0:{
			setItemName("itemDarkwoodHelm");
			LanguageRegistry.addName(this, "Darkwood Helm");
			break;
		}
		case 1:{
			setItemName("itemDarkwoodArmour");
			LanguageRegistry.addName(this, "Darkwood Armour");
			break;
		}
		case 2:{
			setItemName("itemDarkwoodGreaves");
			LanguageRegistry.addName(this, "Darkwood Greaves");
			break;
		}
		case 3:{
			setItemName("itemDarkwoodBoots");
			LanguageRegistry.addName(this, "Darkwood Boots");
			break;
		}
		}
	}
	
	@Override
	public String getTextureFile(){
		return CommonProxy.ITEMS_PNG;
	}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		if (itemstack.getItemName() == ItemTw.darkwoodGreaves.getItemName()){
			return "/twStuff/gfx/DarkwoodArmour_2.png";
		}
		return "/twStuff/gfx/DarkwoodArmour_1.png";
	}
}

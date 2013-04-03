package tw.FantasyRealms.items;

import tw.FantasyRealms.CommonProxy;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class ItemDarkwoodArmour extends ItemArmor
implements IArmorTextureProvider {
	private String iconName;
	
	public ItemDarkwoodArmour(int id, EnumArmorMaterial material, int piece, String icon){
		super(id, material, 2, piece);
		iconName = "FantasyRealms:" + icon;
		switch (piece){
		case 0:{
			setUnlocalizedName("itemDarkwoodHelm");
			LanguageRegistry.addName(this, "Darkwood Helm");
			break;
		}
		case 1:{
			setUnlocalizedName("itemDarkwoodArmour");
			LanguageRegistry.addName(this, "Darkwood Armour");
			break;
		}
		case 2:{
			setUnlocalizedName("itemDarkwoodGreaves");
			LanguageRegistry.addName(this, "Darkwood Greaves");
			break;
		}
		case 3:{
			setUnlocalizedName("itemDarkwoodBoots");
			LanguageRegistry.addName(this, "Darkwood Boots");
			break;
		}
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister iconRegister)
	{
		iconIndex = iconRegister.registerIcon(iconName);
	}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		if (itemstack.getItemName() == ItemCore.darkwoodGreaves.getUnlocalizedName()){
			return "/tw/FantasyRealms/gfx/DarkwoodArmour_2.png";
		}
		return "/tw/FantasyRealms/gfx/DarkwoodArmour_1.png";
	}
}

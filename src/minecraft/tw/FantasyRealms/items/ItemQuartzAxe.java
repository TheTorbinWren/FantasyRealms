package tw.FantasyRealms.items;

import tw.FantasyRealms.CommonProxy;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemQuartzAxe extends ItemAxe {
	private String iconName;
	
	public ItemQuartzAxe(int id, EnumToolMaterial material, String icon){
		super (id, material);
		iconName = "FantasyRealms:" + icon;
		setUnlocalizedName("itemQuartzAxe");
		setMaxDamage(650);
		
		LanguageRegistry.addName(this, "Quartz Axe");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister iconRegister)
	{
		iconIndex = iconRegister.registerIcon(iconName);
	}
}

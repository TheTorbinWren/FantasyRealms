package tw.FantasyRealms.items;

import tw.FantasyRealms.CommonProxy;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemQuartzHoe extends ItemHoe {
	private String iconName;
	
	public ItemQuartzHoe(int id, EnumToolMaterial material, String icon){
		super (id, material);
		iconName = "FantasyRealms:" + icon;
		setUnlocalizedName("itemQuartzHoe");
		setMaxDamage(650);

		LanguageRegistry.addName(this, "Quartz Hoe");

	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister iconRegister)
	{
		iconIndex = iconRegister.registerIcon(iconName);
	}
}

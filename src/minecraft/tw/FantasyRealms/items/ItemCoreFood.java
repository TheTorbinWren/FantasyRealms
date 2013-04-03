package tw.FantasyRealms.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import tw.FantasyRealms.CommonProxy;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class ItemCoreFood extends ItemFood {
	private String iconName;

	public ItemCoreFood(int id, int healAmount, float saturationMod, boolean isWolfMeat, String icon){
		super(id, healAmount, saturationMod, isWolfMeat);
		iconName = "FantasyRealms:" + icon;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister iconRegister)
	{
	         iconIndex = iconRegister.registerIcon(iconName);
	}
}

package tw.FantasyRealms.items;

import tw.FantasyRealms.CommonProxy;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemQuartzShovel extends ItemSpade {
	private String iconName;
	
	public ItemQuartzShovel(int id, EnumToolMaterial material, String icon){
		super(id, material);
		iconName = "FantasyRealms:" + icon;
		setUnlocalizedName("itemQuartzShovel");
		setMaxDamage(650);

		LanguageRegistry.addName(this, "Quartz Shovel");

	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister iconRegister)
	{
		iconIndex = iconRegister.registerIcon(iconName);
	}
}

package tw.FantasyRealms.items;

import tw.FantasyRealms.CommonProxy;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemQuartzPick extends ItemPickaxe {
	private String iconName;
	
	public ItemQuartzPick(int id, EnumToolMaterial material, String icon){
		super(id, material);
		iconName = "FantasyRealms:" + icon;
		setUnlocalizedName("itemQuartzPick");
		setMaxDamage(650);

		LanguageRegistry.addName(this, "Quartz Pickaxe");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister iconRegister)
	{
		iconIndex = iconRegister.registerIcon(iconName);
	}
}

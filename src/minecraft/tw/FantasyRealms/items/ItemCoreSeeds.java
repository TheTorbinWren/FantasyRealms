package tw.FantasyRealms.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import tw.FantasyRealms.CommonProxy;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemSeeds;

public class ItemCoreSeeds extends ItemSeeds {
	private String iconName;
	
	public ItemCoreSeeds(int id, int blockType, int soilId, String icon){
		super(id, blockType, soilId);
		iconName = "FantasyRealms:" + icon;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister iconRegister)
	{
		iconIndex = iconRegister.registerIcon(iconName);
	}
}

package tw.FantasyRealms.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import tw.FantasyRealms.CommonProxy;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemBlock;

public class BlockCoreFlower extends BlockFlower{
	private String iconName;
	
	public BlockCoreFlower (int id, Material material, String name, String icon) {
		super (id, material);
		iconName = "FantasyRealms:" + icon;
		GameRegistry.registerBlock(this, ItemBlock.class, name, "FantasyRealms");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister IconRegister){
		this.blockIcon = IconRegister.registerIcon(iconName);
	}
}

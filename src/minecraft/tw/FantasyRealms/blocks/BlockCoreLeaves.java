package tw.FantasyRealms.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import tw.FantasyRealms.CommonProxy;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockCoreLeaves extends BlockLeavesBase{
	private String iconName;
	
	public BlockCoreLeaves(int id, Material material, boolean gfxLevel, String icon){
		super(id, material, gfxLevel);
		iconName = "FantasyRealms:" + icon;
		GameRegistry.registerBlock(this, "FantasyRealms");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister IconRegister){
		this.blockIcon = IconRegister.registerIcon(iconName);
	}
}

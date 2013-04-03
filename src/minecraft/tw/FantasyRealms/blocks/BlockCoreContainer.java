package tw.FantasyRealms.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import tw.FantasyRealms.CommonProxy;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCoreContainer extends BlockContainer {
	private String iconName;
	
	public BlockCoreContainer(int id, Material material, String name, String icon){
		super(id, material);
		iconName = "FantasyRealms:" + icon;
		setUnlocalizedName(name);
		GameRegistry.registerBlock(this, ItemBlock.class, name, "FantasyRealms");
	}
	
    @Override
    public TileEntity createNewTileEntity(World world) {
            return new TileEntity();
    }

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister IconRegister){
		this.blockIcon = IconRegister.registerIcon(iconName);
	}
}

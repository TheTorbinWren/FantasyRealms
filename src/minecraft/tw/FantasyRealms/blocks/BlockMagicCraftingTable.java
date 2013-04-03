package tw.FantasyRealms.blocks;

import tw.FantasyRealms.FantasyRealms;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMagicCraftingTable extends BlockCoreContainer {
	private Icon[] iconArray = new Icon[2];
	
	protected BlockMagicCraftingTable(int id, Material material, String name, String icon){
		super(id, material, name, icon);
	}

	public Icon getBlockTextureFromSideAndMetadata(int side, int meta)
    {
    	switch (side){
    	case 1: return this.iconArray[1];
    	case 0: return this.iconArray[1];
        default: return this.iconArray[0];
    	}
    }
        
    @Override
    public TileEntity createNewTileEntity(World world)
    {
    	return new TileEntityMagicCraftingTable();
    }
    
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9){
    	if (player.isSneaking()){
    		return false;
    	}
    	player.openGui(FantasyRealms.instance, 0, world, x, y, z);
    	return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister IconRegister){
    	this.iconArray[0] = IconRegister.registerIcon("FantasyRealms:MCTableSide");
    	this.iconArray[1] = IconRegister.registerIcon("FantasyRealms:MCTableTop");
    }
}

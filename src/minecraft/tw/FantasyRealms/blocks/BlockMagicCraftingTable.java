package tw.FantasyRealms.blocks;

import tw.FantasyRealms.FantasyRealms;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockMagicCraftingTable extends BlockContainerTw {
	protected BlockMagicCraftingTable(int id, int texture, Material material){
		super(id, texture, material);
		
		GameRegistry.registerBlock(this);
	}

    public int getBlockTextureFromSide(int side)
    {
    	switch (side){
    	case 1: return 4;
    	case 0: return 4;
        default: return this.blockIndexInTexture;
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
}

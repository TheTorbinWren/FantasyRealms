package tw.FantasyRealms;

import tw.FantasyRealms.blocks.ContainerMagicCraftingTable;
import tw.FantasyRealms.blocks.TileEntityMagicCraftingTable;
import tw.FantasyRealms.client.GuiMagicCraftingTable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxy 
implements IGuiHandler {
	public static String ITEMS_PNG = "/tw/FantasyRealms/gfx/items.png";
	public static String BLOCK_PNG = "/tw/FantasyRealms/gfx/block.png";
	public static String WANDS_PNG = "/tw/FantasyRealms/gfx/wands.png";
	public static String STAFFS_PNG = "/tw/FantasyRealms/gfx/staffs.png";
	
	// Client stuff
	public void registerRenderers () {
		// Nothing here as this is the server side proxy
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntityMagicCraftingTable te = (TileEntityMagicCraftingTable)world.getBlockTileEntity(x, y, z);
		return new ContainerMagicCraftingTable(player.inventory, te);
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntityMagicCraftingTable te = (TileEntityMagicCraftingTable)world.getBlockTileEntity(x, y, z);
		return new GuiMagicCraftingTable(player.inventory, te);
	}
}
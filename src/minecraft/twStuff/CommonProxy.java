package twStuff;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import twStuff.blocks.ContainerMagicCraftingTable;
import twStuff.blocks.TileEntityMagicCraftingTable;
import twStuff.client.GuiMagicCraftingTable;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxy 
implements IGuiHandler {
	public static String ITEMS_PNG = "/twStuff/gfx/items.png";
	public static String BLOCK_PNG = "/twStuff/gfx/block.png";
	public static String WANDS_PNG = "/twStuff/gfx/wands.png";
	public static String STAFFS_PNG = "/twStuff/gfx/staffs.png";
	
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
package twStuff;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import twStuff.items.ItemTw;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemWand extends ItemTw {
	
	public static Item zombie = new ItemWand(twConfig.itemIdWandZombieFlesh, 0, "twWandZombie", "Wand of Zombie Flesh");
	public static Item feather = new ItemWand(twConfig.itemIdWandFeather, 1, "twWandFeather", "Wand of Feathers");
	public static Item creeper = new ItemWand(twConfig.itemIdWandCreeper, 2, "twWandCreeper", "Boomstick Wand");
	public static Item slime = new ItemWand(twConfig.itemIdWandSlime, 3, "twWandSlime", "Wand of Slime");
	public static Item skeleton = new ItemWand(twConfig.itemIdWandSkeleton, 4, "twWandSkeleton", "Skeletal Wand");
	
	public ItemWand(int id, int icon, String iName, String name){
		super(id);
		this.setIconIndex(icon);
		this.setItemName(iName);
		LanguageRegistry.addName(this, name);
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.WANDS_PNG;
	}
	
	@Override
	public int getItemEnchantability(){
		return 30;
	}
	
	public boolean onItemUse(ItemStack item, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10){
		if (item.isItemEnchanted())
		{
			System.out.println("enchanted");
			return true;
		}
		else
		{
			return super.onItemUse(item, par2EntityPlayer, par3World, par4, par5, par6, par7, par8, par9, par10);
		}
	}
	
}

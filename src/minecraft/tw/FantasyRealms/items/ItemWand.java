package tw.FantasyRealms.items;

import tw.FantasyRealms.CommonProxy;
import tw.FantasyRealms.core.twConfig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemWand extends ItemCore {
	
	public static Item zombie = new ItemWand(twConfig.itemIdWandZombieFlesh, "twWandZombie", "Wand of Zombie Flesh", "WandRottenFlesh");
	public static Item feather = new ItemWand(twConfig.itemIdWandFeather, "twWandFeather", "Wand of Feathers", "WandFeather");
	public static Item creeper = new ItemWand(twConfig.itemIdWandCreeper, "twWandCreeper", "Boomstick Wand", "WandGunpowder");
	public static Item slime = new ItemWand(twConfig.itemIdWandSlime, "twWandSlime", "Wand of Slime", "WandSlime");
	public static Item skeleton = new ItemWand(twConfig.itemIdWandSkeleton, "twWandSkeleton", "Skeletal Wand", "WandBone");
	
	public ItemWand(int id, String iName, String name, String icon){
		super(id, icon);
		this.setUnlocalizedName(iName);
		LanguageRegistry.addName(this, name);
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

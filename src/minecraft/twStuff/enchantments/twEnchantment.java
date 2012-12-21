package twStuff.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.item.ItemStack;

public class twEnchantment extends Enchantment {
	public static Enchantment baseWand = new twEnchantment(99, 5, EnumEnchantmentType.all, "wand").setName("twEnchWandBase");
	
	private String twType; 
	
	public twEnchantment(int id, int weight, EnumEnchantmentType enchantmentType, String typename){
		super(id, weight, enchantmentType);
		this.twType = typename;
		
	}
	
	public boolean canEnchantItem(ItemStack item) 
    {
		if ((item.getItemName().toLowerCase().contains("wand") && this.twType == "wand") || (item.getItemName().toLowerCase().contains("staff") && this.twType == "staff")){
			return true;
		}
		else
		{
			return type.canEnchantItem(item.getItem());
		}
    }

}

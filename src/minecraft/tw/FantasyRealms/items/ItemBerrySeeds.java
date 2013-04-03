package tw.FantasyRealms.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;

public class ItemBerrySeeds extends ItemCoreSeeds{
	public ItemBerrySeeds(int id, int blockType, int soilId, String icon){
		super(id, blockType, soilId, icon);
		
		maxStackSize = 64;
		setCreativeTab(CreativeTabs.tabMisc);
		//setIconIndex(1);
		setUnlocalizedName("itemBerrySeeds");
	}
	
    @Override
    public EnumPlantType getPlantType(World world, int x, int y, int z)
    {
        return EnumPlantType.Plains;
    }
	
}

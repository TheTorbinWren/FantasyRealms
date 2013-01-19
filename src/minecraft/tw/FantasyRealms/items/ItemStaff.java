package tw.FantasyRealms.items;

import tw.FantasyRealms.CommonProxy;
import tw.FantasyRealms.core.twConfig;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemStaff extends ItemTw {
	public static Item quartz = new ItemStaff(twConfig.itemIdStaffQuartz, 0, "twQuartzStaff", "Staff of Quartz");
	public static Item quartzGolden = new ItemStaff(twConfig.itemIdStaffQuartzGolden, 1, "twQuartzStaffGolden", "Golden Staff of Quartz");
	public static Item diamond = new ItemStaff(twConfig.itemIdStaffDiamond, 2, "twStaffDiamond", "Staff of Diamond");
	public static Item diamondGolden = new ItemStaff(twConfig.itemIdStaffDiamondGolden, 3, "twStaffDiamondGolden", "Golden Staff of Diamond");
	public static Item emerald = new ItemStaff(twConfig.itemIdStaffEmerald, 4, "twEmeraldStaff", "Staff of Emerald");
	public static Item emeraldGolden = new ItemStaff(twConfig.itemIdStaffEmeraldGolden, 5, "twEmertaldStaffGolden", "Golden Staff of Emerald");
	
	public ItemStaff(int id, int icon, String itemName, String displayName){
		super(id);
		this.setIconIndex(icon);
		this.setItemName(itemName);
		
		LanguageRegistry.addName(this, displayName);
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.STAFFS_PNG;
	}
}

package tw.FantasyRealms.items;

import tw.FantasyRealms.CommonProxy;
import tw.FantasyRealms.core.twConfig;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemStaff extends ItemCore {
	public static Item quartz = new ItemStaff(twConfig.itemIdStaffQuartz, "twQuartzStaff", "Staff of Quartz", "StaffQuartz");
	public static Item quartzGolden = new ItemStaff(twConfig.itemIdStaffQuartzGolden, "twQuartzStaffGolden", "Golden Staff of Quartz", "StaffQuartzGolden");
	public static Item diamond = new ItemStaff(twConfig.itemIdStaffDiamond, "twStaffDiamond", "Staff of Diamond", "StaffDiamond");
	public static Item diamondGolden = new ItemStaff(twConfig.itemIdStaffDiamondGolden, "twStaffDiamondGolden", "Golden Staff of Diamond", "StaffDiamondGolden");
	public static Item emerald = new ItemStaff(twConfig.itemIdStaffEmerald, "twEmeraldStaff", "Staff of Emerald", "StaffEmerald");
	public static Item emeraldGolden = new ItemStaff(twConfig.itemIdStaffEmeraldGolden, "twEmertaldStaffGolden", "Golden Staff of Emerald", "StaffEmeraldGolden");
	
	public ItemStaff(int id, String itemName, String displayName, String icon){
		super(id, icon);
		this.setUnlocalizedName(itemName);
		LanguageRegistry.addName(this, displayName);
	}
	
}

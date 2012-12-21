package twStuff;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class twConfig {
	private static Configuration configFile;
	
	private static int baseWands = 23100;
	private static int baseStaffs = 23300;
	
	public int[] blockIds;

	public static int blockIdBush;
	public static int blockIdOre;
	public static int blockIdOreBlock;
	public static int blockIdDarkwoodSapling;
	public static int blockIdDarkwood = 2605;
	public static int blockIdDarkwoodLeaves;
	public static int blockIdDarkwoodPlanks;
	public static int blockIdMagicCraftingTable = 2608;
	
	public static int itemIdBerries;
	public static int itemIdBerrySeeds;
	public static int itemIdQuartz;
	public static int itemIdQuartzPick;
	public static int itemIdQuartzShovel;
	public static int itemIdQuartzAxe;
	public static int itemIdQuartzHoe;
	public static int itemIdQuartzSword;
	public static int itemIdDarkwoodArmour;
	public static int itemIdDarkwoodHelm;
	public static int itemIdDarkwoodGreaves;
	public static int itemIdDarkwoodBoots;
	public static int itemIdDarkwoodSticks;
	public static int itemIdIngotCopper;
	public static int itemIdIngotSilver;
	public static int itemIdIngotPlatinum;
	public static int itemIdIngotColdiron = 23017;
	public static int itemIdIngotMithral;
	public static int itemIdIngotAdamantine;
	public static int itemIdIngotElectrum;
	public static int itemIdRuby;
	public static int itemIdSapphire;
	public static int itemIdTopaz;
	public static int itemIdAmethyst;
	public static int itemIdNuggetCopper = 23025;
	public static int itemIdNuggetSilver = 23026;
	public static int itemIdNuggetPlatinum = 23027;
	public static int itemIdNuggetColdiron = 23028;
	public static int itemIdNuggetMithral = 23029;
	public static int itemIdNuggetAdamantine = 23030;
	public static int itemIdNuggetElectrum = 23031;
	
	//wands
	public static int itemIdWandCreeper;
	public static int itemIdWandZombieFlesh;
	public static int itemIdWandFeather;
	public static int itemIdWandSlime;
	public static int itemIdWandSkeleton;
	public static int itemIdStaffQuartz;
	public static int itemIdStaffQuartzGolden;
	public static int itemIdStaffDiamond;
	public static int itemIdStaffDiamondGolden;
	public static int itemIdStaffEmerald;
	public static int itemIdStaffEmeraldGolden;
	
	public static boolean genQuartz = true;
	public static boolean genCopper = true;
	public static boolean genSilver = true;
	public static boolean genPlatinum = true;
	public static boolean genColdiron = true;
	public static boolean genMithral = true;
	public static boolean genAdamantine = true;
	public static boolean genRuby = true;
	public static boolean genSapphire = true;
	public static boolean genTopaz = true;
	public static boolean genAmethyst = true;
	
	public static int biomeIdDarkwood = 90;

	
	public static void load(FMLPreInitializationEvent event){
		configFile = new Configuration(event.getSuggestedConfigurationFile());
		configFile.load();
		
		blockIdBush = configFile.get(Configuration.CATEGORY_BLOCK, "blockIdBush", 2601).getInt();
		blockIdOre = configFile.get(Configuration.CATEGORY_BLOCK, "blockIdOre", 2602).getInt();
		blockIdOreBlock = configFile.get(Configuration.CATEGORY_BLOCK, "blockIdOreBlock", 2603).getInt();
		blockIdDarkwoodSapling = configFile.get(Configuration.CATEGORY_BLOCK, "blockIdDarkwoodSapling", 2604).getInt();
		blockIdDarkwood = configFile.get(Configuration.CATEGORY_BLOCK, "blockIdDarkwood", blockIdDarkwood).getInt();
		blockIdDarkwoodLeaves = configFile.get(Configuration.CATEGORY_BLOCK, "blockIdDarkwoodLeaves", 2606).getInt();
		blockIdDarkwoodPlanks = configFile.get(Configuration.CATEGORY_BLOCK, "blockIdDarkwoodPlanks", 2607).getInt();
		blockIdMagicCraftingTable = configFile.getBlock("blockIdMagicCraftingTable", blockIdMagicCraftingTable).getInt();

		itemIdBerries = configFile.get(Configuration.CATEGORY_ITEM, "itemIdBerries", 23001).getInt();
		itemIdBerrySeeds = configFile.get(Configuration.CATEGORY_ITEM, "itemIdBerrySeeds", 23002).getInt();
		itemIdQuartz = configFile.get(Configuration.CATEGORY_ITEM, "itemIdQuartz", 23003).getInt();
		itemIdQuartzAxe = configFile.get(Configuration.CATEGORY_ITEM, "itemIdQuartzAxe", 23004).getInt();
		itemIdQuartzPick = configFile.get(Configuration.CATEGORY_ITEM, "itemIdQuartzPick", 23005).getInt();
		itemIdQuartzShovel = configFile.get(Configuration.CATEGORY_ITEM, "itemIQuartzShovel", 23006).getInt();
		itemIdQuartzHoe = configFile.get(Configuration.CATEGORY_ITEM, "itemIdQuartzHoe", 23007).getInt();
		itemIdQuartzSword = configFile.get(Configuration.CATEGORY_ITEM, "itemIdQuartzSword", 23008).getInt();
		itemIdDarkwoodArmour = configFile.get(Configuration.CATEGORY_ITEM, "itemIdDarkwoodArmour", 23009).getInt();
		itemIdDarkwoodHelm = configFile.get(Configuration.CATEGORY_ITEM, "itemIdDarkwoodHelm", 23010).getInt();
		itemIdDarkwoodGreaves = configFile.get(Configuration.CATEGORY_ITEM, "itemIdDarkwoodGreavews", 23011).getInt();
		itemIdDarkwoodBoots = configFile.get(Configuration.CATEGORY_ITEM, "itemIdDarkwoodBoots", 23012).getInt();
		itemIdDarkwoodSticks = configFile.get(Configuration.CATEGORY_ITEM, "itemIdDarkwoodSticks", 23013).getInt();
		itemIdIngotCopper = configFile.get(Configuration.CATEGORY_ITEM, "itemIdCopperIngot", 23014).getInt();
		itemIdIngotSilver = configFile.get(Configuration.CATEGORY_ITEM, "itemIdSilverIngot", 23015).getInt();
		itemIdIngotPlatinum = configFile.get(Configuration.CATEGORY_ITEM, "itemIdPlatinumIngot", 23016).getInt();
		itemIdIngotColdiron = configFile.getItem("itemIdColdironIngot", itemIdIngotColdiron).getInt();
		itemIdIngotMithral = configFile.get(Configuration.CATEGORY_ITEM, "itemIdMithralIngot", 23018).getInt();
		itemIdIngotAdamantine = configFile.get(Configuration.CATEGORY_ITEM, "itemIdAdamantineIngot", 23019).getInt();
		itemIdIngotElectrum = configFile.get(Configuration.CATEGORY_ITEM, "itemIdIngotElectrum", 23020).getInt();
		itemIdRuby = configFile.get(Configuration.CATEGORY_ITEM, "itemIdRuby", 23021).getInt();
		itemIdSapphire = configFile.get(Configuration.CATEGORY_ITEM, "itemIdSapphire", 23022).getInt();
		itemIdTopaz = configFile.get(Configuration.CATEGORY_ITEM, "itemIdTopaz", 23023).getInt();
		itemIdAmethyst = configFile.get(Configuration.CATEGORY_ITEM, "itemIdAmethyst", 23024).getInt();
		itemIdNuggetCopper = configFile.getItem("itemIdNuggetCopper", itemIdNuggetCopper).getInt();
		itemIdNuggetSilver = configFile.getItem("itemIdNuggetSilver", itemIdNuggetSilver).getInt();
		itemIdNuggetPlatinum = configFile.getItem("itemIdNuggetPlatinum", itemIdNuggetPlatinum).getInt();
		itemIdNuggetColdiron = configFile.getItem("itemIdNuggetColdiron", itemIdNuggetColdiron).getInt();
		itemIdNuggetMithral = configFile.getItem("itemIdNuggetMithral", itemIdNuggetMithral).getInt();
		itemIdNuggetAdamantine = configFile.getItem("itemIdNuggetAdamantine", itemIdNuggetAdamantine).getInt();
		itemIdNuggetElectrum = configFile.getItem("itemIdNuggetElectrum", itemIdNuggetElectrum).getInt();
		
		itemIdWandZombieFlesh = configFile.get(Configuration.CATEGORY_ITEM, "itemIdZombieFleshWand", baseWands++).getInt();
		itemIdWandFeather = configFile.get(Configuration.CATEGORY_ITEM, "itemIdWandFeather", baseWands++).getInt();
		itemIdWandCreeper = configFile.get(Configuration.CATEGORY_ITEM, "itemIdWandCreeper", baseWands++).getInt();
		itemIdWandSlime = configFile.get(Configuration.CATEGORY_ITEM, "itemIdWandSlime", baseWands++).getInt();
		itemIdWandSkeleton = configFile.get(Configuration.CATEGORY_ITEM, "itemIdWandSkeleton", baseWands++).getInt();
		
		itemIdStaffQuartz = configFile.get(Configuration.CATEGORY_ITEM, "itemIdStaffQuartz", baseStaffs++).getInt();
		itemIdStaffQuartzGolden = configFile.get(Configuration.CATEGORY_ITEM, "itemIdStaffQartzGolden", baseStaffs++).getInt();
		itemIdStaffDiamond = configFile.get(Configuration.CATEGORY_ITEM, "itemIdStaffDiamond", baseStaffs++).getInt();
		itemIdStaffDiamondGolden = configFile.get(Configuration.CATEGORY_ITEM, "itemIdStaffDiamondGolden", baseStaffs++).getInt();
		itemIdStaffEmerald = configFile.get(Configuration.CATEGORY_ITEM, "itemIdStaffEmerald", baseStaffs++).getInt();
		itemIdStaffEmeraldGolden = configFile.get(Configuration.CATEGORY_ITEM, "itemIdStaffEmeraldGolden", baseStaffs++).getInt();
		
		Property gQuartz = configFile.get(Configuration.CATEGORY_GENERAL, "genQuartz", genQuartz);
		gQuartz.comment = "set to false to disable quartz generation";
		genQuartz = Boolean.parseBoolean(gQuartz.value);
		
		Property gCopper = configFile.get(Configuration.CATEGORY_GENERAL, "genCopper", genCopper);
		gCopper.comment = "set to false to disable copper generation";
		genCopper = Boolean.parseBoolean(gCopper.value);
		
		Property gSilver = configFile.get(Configuration.CATEGORY_GENERAL, "genSilver", genSilver);
		gSilver.comment = "set to false to disable silver generation";
		genSilver = Boolean.parseBoolean(gSilver.value);
		
		Property gPlatinum = configFile.get(Configuration.CATEGORY_GENERAL, "genPlatinum", genPlatinum);
		gPlatinum.comment = "set to false to disable platinum generation";
		genPlatinum = Boolean.parseBoolean(gPlatinum.value);
		
		Property gColdiron = configFile.get(Configuration.CATEGORY_GENERAL, "genColdiron", genColdiron);
		gColdiron.comment = "set to false to disable Coldiron generation";
		genColdiron = Boolean.parseBoolean(gColdiron.value);
		
		Property gMithral = configFile.get(Configuration.CATEGORY_GENERAL, "genMithral", genMithral);
		gMithral.comment = "set to false to disable Mithral generation";
		genMithral = Boolean.parseBoolean(gMithral.value);
		
		Property gAdamantine = configFile.get(Configuration.CATEGORY_GENERAL, "genAdamantine", genAdamantine);
		gAdamantine.comment = "set to false to disable Adamantine generation";
		genAdamantine = Boolean.parseBoolean(gAdamantine.value);
		
		Property gRuby = configFile.get(Configuration.CATEGORY_GENERAL, "genRuby", genRuby);
		gRuby.comment = "set to false to disable Ruby generation";
		genRuby = Boolean.parseBoolean(gRuby.value);
		
		Property gSapphire = configFile.get(Configuration.CATEGORY_GENERAL, "genSapphire", genSapphire);
		gSapphire.comment = "set to false to disable Sapphire generation";
		genSapphire = Boolean.parseBoolean(gSapphire.value);
		
		Property gTopaz = configFile.get(Configuration.CATEGORY_GENERAL, "genTopaz", genTopaz);
		gTopaz.comment = "set to false to disable Topaz generation";
		genTopaz = Boolean.parseBoolean(gTopaz.value);
		
		Property gAmethyst = configFile.get(Configuration.CATEGORY_GENERAL, "genAmethyst", genAmethyst);
		gAmethyst.comment = "set to false to disable Amethyst generation";
		genAmethyst = Boolean.parseBoolean(gAmethyst.value);
		
		Property IdDarkwood = configFile.get(Configuration.CATEGORY_GENERAL, "biomeIdDarkwood", biomeIdDarkwood);
		IdDarkwood.comment = "ID for Daarkwood biome";
		biomeIdDarkwood = Integer.parseInt(IdDarkwood.value);
				
		configFile.save();
	}
}

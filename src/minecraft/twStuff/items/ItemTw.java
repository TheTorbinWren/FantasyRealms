package twStuff.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import twStuff.CommonProxy;
import twStuff.twStuff;
import twStuff.blocks.BlockTw;
import twStuff.twConfig;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;

public class ItemTw extends Item {
	public static EnumArmorMaterial ARMOUR_DARKWOOD = EnumHelper.addArmorMaterial("Darkwood", 6, new int[]{2, 6, 5, 2}, 25);
	public static EnumToolMaterial TOOL_QUARTZ = EnumHelper.addToolMaterial("Quartz", 0, 450, 7.5F, 1, 12);
	
	public static Item berries = new ItemFoodTw(twConfig.itemIdBerries, 1, 0.2f, false).setCreativeTab(CreativeTabs.tabFood).setIconIndex(0).setItemName("itemBerries");
	public static Item berrySeeds = new ItemBerrySeeds(twConfig.itemIdBerrySeeds, BlockTw.bush.blockID, Block.grass.blockID);
	public static Item darkwoodArmour = new ItemDarkwoodArmour(twConfig.itemIdDarkwoodArmour, ARMOUR_DARKWOOD, 9, 1);
	public static Item darkwoodHelm = new ItemDarkwoodArmour(twConfig.itemIdDarkwoodHelm, ARMOUR_DARKWOOD, 8, 0);
	public static Item darkwoodGreaves = new ItemDarkwoodArmour(twConfig.itemIdDarkwoodGreaves, ARMOUR_DARKWOOD, 10, 2);
	public static Item darkwoodBoots = new ItemDarkwoodArmour(twConfig.itemIdDarkwoodBoots, ARMOUR_DARKWOOD, 11, 3);
	public static Item darkwoodSticks = new ItemTw(twConfig.itemIdDarkwoodSticks).setIconIndex(12).setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMaterials).setItemName("itemDarkwoodSticks");
	public static Item quartz = new ItemTw(twConfig.itemIdQuartz).setIconIndex(2).setItemName("twQuartz").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item quartzPick = new ItemQuartzPick(twConfig.itemIdQuartzPick, TOOL_QUARTZ);
	public static Item quartzShovel = new ItemQuartzShovel(twConfig.itemIdQuartzShovel, TOOL_QUARTZ);
	public static Item quartzAxe = new ItemQuartzAxe(twConfig.itemIdQuartzAxe, TOOL_QUARTZ);
	public static Item quartzHoe = new ItemQuartzHoe(twConfig.itemIdQuartzHoe, TOOL_QUARTZ);
	public static Item quartzSword = new ItemQuartzSword(twConfig.itemIdQuartzSword, TOOL_QUARTZ);	
	public static Item ingotCopper = new ItemTw(twConfig.itemIdIngotCopper).setIconIndex(13).setItemName("twIngotCopper").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item ingotSilver = new ItemTw(twConfig.itemIdIngotSilver).setIconIndex(14).setItemName("twIngotSilver").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item ingotPlatinum = new ItemTw(twConfig.itemIdIngotPlatinum).setIconIndex(15).setItemName("twIngotPlatinum").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item ingotColdiron = new ItemTw(twConfig.itemIdIngotColdiron).setIconIndex(16).setItemName("twIngotColdiron").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item ingotMithral = new ItemTw(twConfig.itemIdIngotMithral).setIconIndex(17).setItemName("twIngotMithral").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item ingotAdamantine = new ItemTw(twConfig.itemIdIngotAdamantine).setIconIndex(18).setItemName("twIngotAdamantine").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item ingotElectrum = new ItemTw(twConfig.itemIdIngotElectrum).setIconIndex(19).setItemName("twIngotElectrum").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item ruby = new ItemTw(twConfig.itemIdRuby).setIconIndex(20).setItemName("twRuby").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item sapphire = new ItemTw(twConfig.itemIdSapphire).setIconIndex(21).setItemName("twSapphire").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item topaz = new ItemTw(twConfig.itemIdTopaz).setIconIndex(22).setItemName("twTopaz").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item amethyst = new ItemTw(twConfig.itemIdAmethyst).setIconIndex(23).setItemName("twAmethyst").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item nuggetCopper = new ItemTw(twConfig.itemIdNuggetCopper).setIconIndex(24).setItemName("twNuggetCopper").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item nuggetSilver = new ItemTw(twConfig.itemIdNuggetSilver).setIconIndex(25).setItemName("twNuggetSilver").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item nuggetPlatinum = new ItemTw(twConfig.itemIdNuggetPlatinum).setIconIndex(26).setItemName("twNuggetPlatinum").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item nuggetColdiron = new ItemTw(twConfig.itemIdNuggetColdiron).setIconIndex(27).setItemName("twNuggetColdiron").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item nuggetMithral = new ItemTw(twConfig.itemIdNuggetMithral).setIconIndex(28).setItemName("twNuggetMithral").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item nuggetAdamantine = new ItemTw(twConfig.itemIdNuggetAdamantine).setIconIndex(29).setItemName("twNuggetAdamantine").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item nuggetElectrum = new ItemTw(twConfig.itemIdNuggetElectrum).setIconIndex(30).setItemName("twNuggetElectrum").setCreativeTab(CreativeTabs.tabMaterials);
	
	public ItemTw(int id){
		super(id);
	}
	
	public static void initItems(){
		LanguageRegistry.addName(berries, "Berries");
		LanguageRegistry.addName(berrySeeds, "Berry Seeds");
		LanguageRegistry.addName(darkwoodSticks, "Darkwood Sticks");
		LanguageRegistry.addName(quartz, "Quartz");
		LanguageRegistry.addName(nuggetCopper, "Copper Nugget");
		LanguageRegistry.addName(nuggetSilver, "Silver Nugget");
		LanguageRegistry.addName(nuggetPlatinum, "Platinum Nugget");
		LanguageRegistry.addName(nuggetColdiron, "Cold Iron Nugget");
		LanguageRegistry.addName(nuggetMithral, "Mithral Nugget");
		LanguageRegistry.addName(nuggetAdamantine, "Adamantine Nugget");
		LanguageRegistry.addName(nuggetElectrum, "Electrum Nugget");
		LanguageRegistry.addName(ingotCopper, "Copper Ingot");
		LanguageRegistry.addName(ingotSilver, "Silver Ingot");
		LanguageRegistry.addName(ingotPlatinum, "Platinum Ingot");
		LanguageRegistry.addName(ingotColdiron, "Cold Iron Ingot");
		LanguageRegistry.addName(ingotMithral, "Mithral Ingot");
		LanguageRegistry.addName(ingotAdamantine, "Adamantine Ingot");
		LanguageRegistry.addName(ingotElectrum,  "Electrum Ingot");
		LanguageRegistry.addName(ruby, "Ruby");
		LanguageRegistry.addName(sapphire, "Sapphire");
		LanguageRegistry.addName(topaz, "Topaz");
		LanguageRegistry.addName(amethyst, "Amethyst");
}
	
	@Override
	public String getTextureFile(){
		return CommonProxy.ITEMS_PNG;
	}

}

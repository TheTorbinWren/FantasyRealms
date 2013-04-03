package tw.FantasyRealms.items;

import tw.FantasyRealms.CommonProxy;
import tw.FantasyRealms.blocks.BlockCore;
import tw.FantasyRealms.core.twConfig;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;

public class ItemCore extends Item {
	private String iconName;
	
	public static EnumArmorMaterial ARMOUR_DARKWOOD = EnumHelper.addArmorMaterial("Darkwood", 6, new int[]{2, 6, 5, 2}, 25);
	public static EnumToolMaterial TOOL_QUARTZ = EnumHelper.addToolMaterial("Quartz", 0, 450, 7.5F, 1, 12);
	
	public static Item berries = new ItemCoreFood(twConfig.itemIdBerries, 1, 0.2f, false, "Berries").setCreativeTab(CreativeTabs.tabFood).setUnlocalizedName("itemBerries");
	public static Item berrySeeds = new ItemBerrySeeds(twConfig.itemIdBerrySeeds, BlockCore.bush.blockID, Block.grass.blockID, "BerrySeeds");
	public static Item darkwoodArmour = new ItemDarkwoodArmour(twConfig.itemIdDarkwoodArmour, ARMOUR_DARKWOOD, 1, "DarkwoodArmour");
	public static Item darkwoodHelm = new ItemDarkwoodArmour(twConfig.itemIdDarkwoodHelm, ARMOUR_DARKWOOD, 0, "DarkwoodHelm");
	public static Item darkwoodGreaves = new ItemDarkwoodArmour(twConfig.itemIdDarkwoodGreaves, ARMOUR_DARKWOOD, 2, "DarkwoodLeggings");
	public static Item darkwoodBoots = new ItemDarkwoodArmour(twConfig.itemIdDarkwoodBoots, ARMOUR_DARKWOOD, 3, "DarkwoodBoots");
	public static Item darkwoodSticks = new ItemCore(twConfig.itemIdDarkwoodSticks, "DarkwoodSticks").setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("itemDarkwoodSticks");
	public static Item quartz = new ItemCore(twConfig.itemIdQuartz, "Quartz").setUnlocalizedName("twQuartz").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item quartzPick = new ItemQuartzPick(twConfig.itemIdQuartzPick, TOOL_QUARTZ, "QuartzPick");
	public static Item quartzShovel = new ItemQuartzShovel(twConfig.itemIdQuartzShovel, TOOL_QUARTZ, "QuartzShovel");
	public static Item quartzAxe = new ItemQuartzAxe(twConfig.itemIdQuartzAxe, TOOL_QUARTZ, "QuartzAxe");
	public static Item quartzHoe = new ItemQuartzHoe(twConfig.itemIdQuartzHoe, TOOL_QUARTZ, "QuartzHoe");
	public static Item quartzSword = new ItemQuartzSword(twConfig.itemIdQuartzSword, TOOL_QUARTZ, "QuartzSword");	
	public static Item ingotCopper = new ItemCore(twConfig.itemIdIngotCopper, "IngotCopper").setUnlocalizedName("twIngotCopper").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item ingotSilver = new ItemCore(twConfig.itemIdIngotSilver, "IngotSilver").setUnlocalizedName("twIngotSilver").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item ingotPlatinum = new ItemCore(twConfig.itemIdIngotPlatinum, "IngotPlatinum").setUnlocalizedName("twIngotPlatinum").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item ingotColdiron = new ItemCore(twConfig.itemIdIngotColdiron, "IngotColdiron").setUnlocalizedName("twIngotColdiron").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item ingotMithral = new ItemCore(twConfig.itemIdIngotMithral, "IngotMithral").setUnlocalizedName("twIngotMithral").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item ingotAdamantine = new ItemCore(twConfig.itemIdIngotAdamantine, "IngotAdamantine").setUnlocalizedName("twIngotAdamantine").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item ingotElectrum = new ItemCore(twConfig.itemIdIngotElectrum, "IngotElectrum").setUnlocalizedName("twIngotElectrum").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item ruby = new ItemCore(twConfig.itemIdRuby, "Ruby").setUnlocalizedName("twRuby").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item sapphire = new ItemCore(twConfig.itemIdSapphire, "Sapphire").setUnlocalizedName("twSapphire").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item topaz = new ItemCore(twConfig.itemIdTopaz, "Topaz").setUnlocalizedName("twTopaz").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item amethyst = new ItemCore(twConfig.itemIdAmethyst, "Amethyst").setUnlocalizedName("twAmethyst").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item nuggetCopper = new ItemCore(twConfig.itemIdNuggetCopper, "NuggetCopper").setUnlocalizedName("twNuggetCopper").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item nuggetSilver = new ItemCore(twConfig.itemIdNuggetSilver, "NuggetSilver").setUnlocalizedName("twNuggetSilver").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item nuggetPlatinum = new ItemCore(twConfig.itemIdNuggetPlatinum, "NuggetPlatinum").setUnlocalizedName("twNuggetPlatinum").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item nuggetColdiron = new ItemCore(twConfig.itemIdNuggetColdiron, "NuggetColdiron").setUnlocalizedName("twNuggetColdiron").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item nuggetMithral = new ItemCore(twConfig.itemIdNuggetMithral, "NuggetMithral").setUnlocalizedName("twNuggetMithral").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item nuggetAdamantine = new ItemCore(twConfig.itemIdNuggetAdamantine, "NuggetAdamantine").setUnlocalizedName("twNuggetAdamantine").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item nuggetElectrum = new ItemCore(twConfig.itemIdNuggetElectrum, "NuggetElectrum").setUnlocalizedName("twNuggetElectrum").setCreativeTab(CreativeTabs.tabMaterials);
	
	public ItemCore(int id, String icon){
		super(id);
		iconName = "FantasyRealms:" + icon;
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
	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister iconRegister)
	{
		iconIndex = iconRegister.registerIcon(iconName);
	}
}

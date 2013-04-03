package tw.FantasyRealms.blocks;

import tw.FantasyRealms.CommonProxy;
import tw.FantasyRealms.core.twConfig;
import tw.FantasyRealms.items.ItemMultiBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCore extends Block {
	public static Block bush = new BlockBerryBush(twConfig.blockIdBush, Material.plants, "twBush", "");
	public static Block ore = new BlockOres(twConfig.blockIdOre, Material.rock, 11, "twOre", "").setHardness(3.0f).setStepSound(Block.soundStoneFootstep).setCreativeTab(CreativeTabs.tabBlock);
	public static Block oreBlock = new BlockOreBlock(twConfig.blockIdOreBlock, Material.iron, 12, "twOreBlock", "").setHardness(3.0f).setStepSound(Block.soundMetalFootstep).setCreativeTab(CreativeTabs.tabBlock);
	public static Block darkwoodSapling = new BlockDarkwoodSapling(twConfig.blockIdDarkwoodSapling, "twDarkWoodSapling", "DarkwoodSapling");
	public static Block darkwoodLog = new BlockDarkwoodLog(twConfig.blockIdDarkwood, "twDarkwood", "");
	public static Block darkwoodPlanks = new BlockCore(twConfig.blockIdDarkwoodPlanks, Material.wood, "twBlockDarkwoodPlanks", "DarkwoodPlanks").setCreativeTab(CreativeTabs.tabBlock).setHardness(2.0f).setStepSound(soundWoodFootstep).setResistance(5.0F);
	public static Block darkwoodLeaves = new BlockDarkwoodLeaves(twConfig.blockIdDarkwoodLeaves, "DarkwoodLeaves");
	public static Block magicCraftingTable = new BlockMagicCraftingTable(twConfig.blockIdMagicCraftingTable, Material.wood, "twMagicCraftingTable", "").setHardness(5.0F).setResistance(2000.0F).setCreativeTab(CreativeTabs.tabDecorations);
	
	private String iconName;
	
	protected BlockCore(int id, Material material, String name, String icon){
		super(id, material);
		setUnlocalizedName(name);
		iconName = "FantasyRealms:" + icon;
		GameRegistry.registerBlock(this, ItemBlock.class, name, "FantasyRealms");
	}
	
	public static void initBlocks(){
		//net.minecraft.src.Item.itemsList[twBlock.ore.blockID] = null;
		net.minecraft.item.Item.itemsList[BlockCore.ore.blockID] = new ItemMultiBlock(twConfig.blockIdOre-256, BlockCore.ore, new String[]{
			"quartz", "copper", "silver", "platinum", "coldiron", "mithral", "adamantine", "ruby", "sapphire", "topaz", "amethyst"});
		
		//net.minecraft.src.Item.itemsList[twBlock.oreBlock.blockID] = null;
		net.minecraft.item.Item.itemsList[BlockCore.oreBlock.blockID] = new ItemMultiBlock(twConfig.blockIdOreBlock-256, BlockCore.oreBlock, new String[]{
			"quartzBlock", "copperBlock", "silverBlock", "platinumBlock", "coldironBlock", "mithralBlock", "adamantineBlock", "rubyBlock", "sapphireBlock", "topazBlock", "amethystBlock", "electrumBlock"});
		
		LanguageRegistry.addName(new ItemStack(ore, 1, 0), "Quartz Ore");
		LanguageRegistry.addName(new ItemStack(ore, 1, 1), "Copper Ore");
		LanguageRegistry.addName(new ItemStack(ore, 1, 2), "Silver Ore");
		LanguageRegistry.addName(new ItemStack(ore, 1, 3), "Platinum Ore");
		LanguageRegistry.addName(new ItemStack(ore, 1, 4), "Cold Iron Ore");
		LanguageRegistry.addName(new ItemStack(ore, 1, 5), "Mithral Ore");
		LanguageRegistry.addName(new ItemStack(ore, 1, 6), "Adamantine Ore");
		LanguageRegistry.addName(new ItemStack(ore, 1, 7), "Ruby Ore");
		LanguageRegistry.addName(new ItemStack(ore, 1, 8), "Sapphire Ore");
		LanguageRegistry.addName(new ItemStack(ore, 1, 9), "Topaz Ore");
		LanguageRegistry.addName(new ItemStack(ore, 1, 10), "Amethyst Ore");
		
		LanguageRegistry.addName(new ItemStack(oreBlock, 1, 0), "Block of Quartz");
		LanguageRegistry.addName(new ItemStack(oreBlock, 1, 1), "Block of Copper");
		LanguageRegistry.addName(new ItemStack(oreBlock, 1, 2), "Block of Silver");
		LanguageRegistry.addName(new ItemStack(oreBlock, 1, 3), "Block of Platinum");
		LanguageRegistry.addName(new ItemStack(oreBlock, 1, 4), "Block of Cold Iron");
		LanguageRegistry.addName(new ItemStack(oreBlock, 1, 5), "Block of Mithral");
		LanguageRegistry.addName(new ItemStack(oreBlock, 1, 6), "Block of Adamantine");
		LanguageRegistry.addName(new ItemStack(oreBlock, 1, 7), "Block of Ruby");
		LanguageRegistry.addName(new ItemStack(oreBlock, 1, 8), "Block of Sapphire");
		LanguageRegistry.addName(new ItemStack(oreBlock, 1, 9), "Block of Topaz");
		LanguageRegistry.addName(new ItemStack(oreBlock, 1, 10), "Block of Amethyst");
		LanguageRegistry.addName(new ItemStack(oreBlock, 1, 11), "Block of Electrum");
		
		LanguageRegistry.addName(new ItemStack(bush), "Berry Bush");
		LanguageRegistry.addName(new ItemStack(darkwoodLog), "Darkwood");
		LanguageRegistry.addName(new ItemStack(darkwoodPlanks), "Darkwood Planks");
		LanguageRegistry.addName(new ItemStack(darkwoodSapling), "Darkwood Sapling");
		LanguageRegistry.addName(new ItemStack(darkwoodLeaves), "Darkwood Leaves");
		LanguageRegistry.addName(new ItemStack(magicCraftingTable), "Magic Crafting Table");
	}
	
	public static void initOreDictionary(){
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister IconRegister){
		this.blockIcon = IconRegister.registerIcon(iconName);
	}
}

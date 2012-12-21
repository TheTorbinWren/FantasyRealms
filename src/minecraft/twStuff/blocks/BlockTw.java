package twStuff.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import twStuff.CommonProxy;
import twStuff.twStuff;
import twStuff.twConfig;

public class BlockTw extends Block {
	public static Block bush = new BlockBushTw(twConfig.blockIdBush, 1, Material.plants);
	public static Block ore = new BlockOreTw(twConfig.blockIdOre, 16, Material.rock, 11).setBlockName("twOre").setHardness(3.0f).setStepSound(Block.soundStoneFootstep).setCreativeTab(CreativeTabs.tabBlock);
	public static Block oreBlock = new BlockMultiblockTw(twConfig.blockIdOreBlock, 32, Material.iron, 12).setBlockName("twOreBlock").setHardness(3.0f).setStepSound(Block.soundMetalFootstep).setCreativeTab(CreativeTabs.tabBlock);
	public static Block darkwoodSapling = new BlockDarkwoodSapling(twConfig.blockIdDarkwoodSapling, 5);
	public static Block darkwood = new BlockDarkwood(twConfig.blockIdDarkwood, 6);
	public static Block darkwoodPlanks = new BlockTw(twConfig.blockIdDarkwoodPlanks, 9, Material.wood).setBlockName("twBlockDarkwoodPlanks").setCreativeTab(CreativeTabs.tabBlock).setHardness(2.0f).setStepSound(soundWoodFootstep).setResistance(5.0F).setRequiresSelfNotify();
	public static Block darkwoodLeaves = new BlockDarkwoodLeaves(twConfig.blockIdDarkwoodLeaves, 8);
	public static Block magicCraftingTable = new BlockMagicCraftingTable(twConfig.blockIdMagicCraftingTable, 3, Material.wood).setBlockName("twMagicCraftingTable").setHardness(5.0F).setResistance(2000.0F).setCreativeTab(CreativeTabs.tabDecorations);
	
	protected BlockTw(int id, int texture, Material material){
		super(id, texture, material);
		GameRegistry.registerBlock(this);
	}
	
	public static void initBlocks(){
		//net.minecraft.src.Item.itemsList[twBlock.ore.blockID] = null;
		net.minecraft.item.Item.itemsList[BlockTw.ore.blockID] = new ItemBlockTw(twConfig.blockIdOre-256, BlockTw.ore, new String[]{
			"quartz", "copper", "silver", "platinum", "coldiron", "mithral", "adamantine", "ruby", "sapphire", "topaz", "amethyst"});
		
		//net.minecraft.src.Item.itemsList[twBlock.oreBlock.blockID] = null;
		net.minecraft.item.Item.itemsList[BlockTw.oreBlock.blockID] = new ItemBlockTw(twConfig.blockIdOreBlock-256, BlockTw.oreBlock, new String[]{
			"quartz", "copper", "silver", "platinum", "coldiron", "mithral", "adamantine", "ruby", "sapphire", "topaz", "amethyst", "electrum"});
		
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
		
		LanguageRegistry.addName(new ItemStack(darkwoodPlanks), "Darkwood Planks");
		LanguageRegistry.addName(new ItemStack(magicCraftingTable), "Magic Crafting Table");
	}
	
	public static void initOreDictionary(){
		
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}
}

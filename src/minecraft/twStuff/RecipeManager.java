package twStuff;

import twStuff.blocks.BlockTw;
import twStuff.items.ItemTw;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class RecipeManager {
	private static ItemStack darkwoodLog = new ItemStack(BlockTw.darkwood);
	private static ItemStack darkwoodStick = new ItemStack(ItemTw.darkwoodSticks);
	private static ItemStack ingotCopper = new ItemStack(ItemTw.ingotCopper);
	private static ItemStack ingotElectrum = new ItemStack(ItemTw.ingotElectrum);
	private static ItemStack ingotGold = new ItemStack(Item.ingotGold);
	private static ItemStack ingotSilver = new ItemStack(ItemTw.ingotSilver);
	private static ItemStack nuggetCopper = new ItemStack(ItemTw.nuggetCopper);
	private static ItemStack nuggetSilver = new ItemStack(ItemTw.nuggetSilver);
	private static ItemStack oreBlockAdamantine = new ItemStack(BlockTw.oreBlock, 1, 6);
	private static ItemStack oreBlockAmethyst = new ItemStack(BlockTw.oreBlock, 1, 10);
	private static ItemStack oreBlockColdiron = new ItemStack(BlockTw.oreBlock, 1, 4);
	private static ItemStack oreBlockCopper = new ItemStack(BlockTw.oreBlock, 1, 1);
	private static ItemStack oreBlockElectrum = new ItemStack(BlockTw.oreBlock, 1, 11);
	private static ItemStack oreBlockMithral = new ItemStack(BlockTw.oreBlock, 1, 5);
	private static ItemStack oreBlockPlatinum = new ItemStack(BlockTw.oreBlock, 1, 3);
	private static ItemStack oreBlockRuby = new ItemStack(BlockTw.oreBlock, 1, 7);
	private static ItemStack oreBlockQuartz = new ItemStack(BlockTw.oreBlock, 1, 0);
	private static ItemStack oreBlockSapphire = new ItemStack(BlockTw.oreBlock, 1, 8);
	private static ItemStack oreBlockSilver = new ItemStack(BlockTw.oreBlock, 1, 2);
	private static ItemStack oreBlockTopaz = new ItemStack(BlockTw.oreBlock, 1, 9);
	private static ItemStack quartz = new ItemStack(ItemTw.quartz);
	private static ItemStack goldNugget = new ItemStack(Item.goldNugget);
	private static ItemStack rottenFlesh = new ItemStack(Item.rottenFlesh);
	private static ItemStack darkwood = new ItemStack(BlockTw.darkwoodPlanks);
	private static ItemStack stick = new ItemStack(Item.stick);
	private static ItemStack feather = new ItemStack(Item.feather);
	private static ItemStack gunpowder = new ItemStack(Item.gunpowder);
	private static ItemStack diamond = new ItemStack(Item.diamond);
	private static ItemStack slimeBall = new ItemStack(Item.slimeBall);
	private static ItemStack bone = new ItemStack(Item.bone);
	private static ItemStack emerald = new ItemStack(Item.emerald);
	private static ItemStack enchantmentTable = new ItemStack(Block.enchantmentTable);
	private static ItemStack craftingTable = new ItemStack(Block.workbench);
	
	public static void InitRecipes(){
		// Berry Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(ItemTw.berrySeeds, 2), new ItemStack(ItemTw.berries));
		
		// Quartz Recipes
		FurnaceRecipes.smelting().addSmelting(BlockTw.ore.blockID, 0, new ItemStack(ItemTw.quartz, 4), 0.0f);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemTw.quartz, 9), oreBlockQuartz);
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(BlockTw.oreBlock, 1, 0), new Object[]{
			"QQQ", "QQQ", "QQQ", Character.valueOf('Q'), "oreQuartz"}));
		
		// Copper Recipes
		FurnaceRecipes.smelting().addSmelting(BlockTw.ore.blockID, 1, ingotCopper, 0.0f);
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ItemTw.ingotCopper), new Object[]{
			"nnn", "nnn", "nnn", Character.valueOf('n'), "nuggetCopper"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(BlockTw.oreBlock, 1, 1), new Object[]{
			"ccc", "ccc", "ccc", Character.valueOf('c'), "ingotCopper"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemTw.ingotCopper, 9), new Object[]{
			oreBlockCopper}));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemTw.nuggetCopper, 9), new Object[]{
			"ingotCopper"}));
		
		// Silver Recipes
		FurnaceRecipes.smelting().addSmelting(BlockTw.ore.blockID, 2, ingotSilver, 0.0f);
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ItemTw.ingotSilver), new Object[]{
			"nnn", "nnn", "nnn", Character.valueOf('n'), "nuggetSilver"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(BlockTw.oreBlock, 1, 2), new Object[]{
			"sss", "sss", "sss", Character.valueOf('s'), "ingotSilver"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemTw.ingotSilver, 9), new Object[]{
			oreBlockSilver}));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemTw.nuggetSilver, 9), new Object[]{
			"ingotSilver"}));
		
		// Platinum Recipes
		FurnaceRecipes.smelting().addSmelting(BlockTw.ore.blockID, 3, new ItemStack(ItemTw.ingotPlatinum), 0.0f);
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ItemTw.ingotPlatinum), new Object[]{
			"nnn", "nnn", "nnn", Character.valueOf('n'), "nuggetPlatinum"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(BlockTw.oreBlock, 1, 3), new Object[]{
			"ppp", "ppp", "ppp", Character.valueOf('p'), "ingotPlatinum"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemTw.ingotPlatinum, 9), new Object[]{
			oreBlockPlatinum}));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemTw.nuggetPlatinum, 9), new Object[]{
			"ingotPlatinum"}));
		
		// Cold Iron Recipes
		FurnaceRecipes.smelting().addSmelting(BlockTw.ore.blockID, 4, new ItemStack(ItemTw.ingotColdiron), 0.0f);
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ItemTw.ingotColdiron), new Object[]{
			"nnn", "nnn", "nnn", Character.valueOf('n'), "nuggetColdiron"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(BlockTw.oreBlock, 1, 4), new Object[]{
			"ccc", "ccc", "ccc", Character.valueOf('c'), "ingotColdiron"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemTw.ingotColdiron, 9), new Object[]{
			oreBlockColdiron}));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemTw.nuggetColdiron, 9), new Object[]{
			"ingotColdiron"}));
		
		// Mithral Recipes
		FurnaceRecipes.smelting().addSmelting(BlockTw.ore.blockID, 5, new ItemStack(ItemTw.ingotMithral), 0.0f);
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ItemTw.ingotMithral), new Object[]{
			"nnn", "nnn", "nnn", Character.valueOf('n'), "nuggetMithral"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(BlockTw.oreBlock, 1, 5), new Object[]{
			"mmm", "mmm", "mmm", Character.valueOf('m'), "ingotMithral"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemTw.ingotMithral, 9), new Object[]{
			oreBlockMithral}));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemTw.nuggetMithral, 9), new Object[]{
			"ingotMithral"}));

		// Adamantine Recipes
		FurnaceRecipes.smelting().addSmelting(BlockTw.ore.blockID, 6, new ItemStack(ItemTw.ingotAdamantine), 0.0f);
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ItemTw.ingotAdamantine), new Object[]{
			"nnn", "nnn", "nnn", Character.valueOf('n'), "nuggetAdamantine"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(BlockTw.oreBlock, 1, 6), new Object[]{
			"aaa", "aaa", "aaa", Character.valueOf('a'), "ingotAdamantine"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemTw.ingotAdamantine, 9), new Object[]{
			oreBlockAdamantine}));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemTw.nuggetAdamantine, 9), new Object[]{
			"ingotAdamantine"}));
		
		// Ruby Recipes
		FurnaceRecipes.smelting().addSmelting(BlockTw.ore.blockID, 7, new ItemStack(ItemTw.ruby, 2), 0.0f);
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(oreBlockRuby, new Object[]{
			"rrr", "rrr", "rrr", Character.valueOf('r'), "oreRuby"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemTw.ruby, 9), new Object[]{
			oreBlockRuby}));
		
		// Sapphire Recipes
		FurnaceRecipes.smelting().addSmelting(BlockTw.ore.blockID, 8, new ItemStack(ItemTw.sapphire, 2), 0.0f);
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(oreBlockSapphire, new Object[]{
			"sss", "sss", "sss", Character.valueOf('s'), "oreSapphire"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemTw.sapphire, 9), new Object[]{
			oreBlockSapphire}));
		
		// Topaz Recipes
		FurnaceRecipes.smelting().addSmelting(BlockTw.ore.blockID, 9, new ItemStack(ItemTw.topaz, 2), 0.0f);
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(oreBlockTopaz, new Object[]{
			"ttt", "ttt", "ttt", Character.valueOf('t'), "oreTopaz"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemTw.topaz, 9), new Object[]{
			oreBlockTopaz}));
		
		// Amethyst Recipes
		FurnaceRecipes.smelting().addSmelting(BlockTw.ore.blockID, 10, new ItemStack(ItemTw.amethyst, 2), 0.0f);
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(oreBlockAmethyst, new Object[]{
			"aaa", "aaa", "aaa", Character.valueOf('a'), "oreAmethyst"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemTw.amethyst, 9), new Object[]{
			oreBlockAmethyst}));

		// Electrum Recipes
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ItemTw.ingotElectrum, 1), new Object[]{
			"gg", "gs", Character.valueOf('g'), ingotGold, Character.valueOf('s'), "ingotSilver"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ingotElectrum, new Object[]{
			"nnn", "nnn", "nnn", Character.valueOf('n'), "nuggetElectrum"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(oreBlockElectrum, new Object[]{
			"eee", "eee", "eee", Character.valueOf('e'), "ingotElectrum"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemTw.ingotElectrum, 9), new Object[]{
			oreBlockElectrum}));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemTw.nuggetElectrum, 9), new Object[]{
			"ingotElectrum"}));
		
		// Darkwood Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(BlockTw.darkwoodPlanks, 4), darkwoodLog);
		GameRegistry.addRecipe(new ItemStack(ItemTw.darkwoodSticks, 4), "d ", " d",
				'd', darkwood);
		GameRegistry.addRecipe(new ItemStack(ItemTw.darkwoodSticks, 4), " d", "d ",
				'd', darkwood);
		
		// Quartz Tool Recipes
		GameRegistry.addRecipe(new ItemStack(ItemTw.quartzPick), "QQQ", " s ", " s ",
				'Q', quartz, 's', stick);
		GameRegistry.addRecipe(new ItemStack(ItemTw.quartzShovel), " Q ", " s ", " s ",
				'Q', quartz, 's', stick);
		GameRegistry.addRecipe(new ItemStack(ItemTw.quartzAxe), " QQ", " sQ", " s ",
				'Q', quartz, 's', stick);
		GameRegistry.addRecipe(new ItemStack(ItemTw.quartzAxe), "QQ ", "Qs ", " s ",
				'Q', quartz, 's', stick);
		GameRegistry.addRecipe(new ItemStack(ItemTw.quartzHoe), " QQ", " s ", " s ",
				'Q', quartz, 's', stick);
		GameRegistry.addRecipe(new ItemStack(ItemTw.quartzHoe), "QQ ", " s ", " s ",
				'Q', quartz, 's', stick);
		GameRegistry.addRecipe(new ItemStack(ItemTw.quartzSword), " Q ", " Q ", " s ",
				'Q', quartz, 's', stick);
		
		//Darkwood Armour Recipes
		GameRegistry.addRecipe(new ItemStack(ItemTw.darkwoodArmour), "d d", "ddd", "ddd",
				'd', darkwood);
		GameRegistry.addRecipe(new ItemStack(ItemTw.darkwoodHelm), "ddd", "d d",
				'd', darkwood);
		GameRegistry.addRecipe(new ItemStack(ItemTw.darkwoodGreaves), "ddd", "d d", "d d",
				'd', darkwood);
		GameRegistry.addRecipe(new ItemStack(ItemTw.darkwoodBoots), "d d", "d d",
				'd', darkwood);
		
		// Misc Recipes
		GameRegistry.addRecipe(new ItemStack(BlockTw.magicCraftingTable), "ddd", "ded", "dcd",
				'd', darkwood, 'e', enchantmentTable, 'c', craftingTable);
		
		// Wand Recipes
		GameRegistry.addRecipe(new ItemStack(ItemWand.zombie), " s ", " s ", "szs",
				's', darkwoodStick, 'z', rottenFlesh);
		GameRegistry.addRecipe(new ItemStack(ItemWand.feather), " s ", " s ", "sfs",
				's', darkwoodStick, 'f', feather);
		GameRegistry.addRecipe(new ItemStack(ItemWand.creeper), " s ", " s ", "sgs",
				's', darkwoodStick, 'g', gunpowder);
		GameRegistry.addRecipe(new ItemStack(ItemWand.slime), " d ", " d ", "dsd",
				'd', darkwoodStick, 's', slimeBall);
		GameRegistry.addRecipe(new ItemStack(ItemWand.skeleton), " d ", " d ", "dbd",
				'd', darkwoodStick, 'b', bone);
		
		//Staff Recipes
		GameRegistry.addRecipe(new ItemStack(ItemStaff.quartz), "q", "s", "s",
				'q', quartz, 's', darkwoodStick);
		GameRegistry.addRecipe(new ItemStack(ItemStaff.quartzGolden), " q ", "gdg", "gdg",
				'q', quartz, 'g', goldNugget, 'd', darkwoodStick);
		GameRegistry.addRecipe(new ItemStack(ItemStaff.diamond), " D ", " d ", " d ",
				'd', darkwoodStick, 'D', diamond);
		GameRegistry.addRecipe(new ItemStack(ItemStaff.diamondGolden), " D ", "gdg", "gdg",
				'd', darkwoodStick, 'D', diamond, 'g', goldNugget);
		GameRegistry.addRecipe(new ItemStack(ItemStaff.emerald), " e ", " d ", " d ",
				'd', darkwoodStick, 'e', emerald);
		GameRegistry.addRecipe(new ItemStack(ItemStaff.emeraldGolden), " e ", "gdg", "gdg",
				'd', darkwoodStick, 'e', emerald, 'g', goldNugget);
	}
}

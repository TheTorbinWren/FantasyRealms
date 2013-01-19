package tw.FantasyRealms;

import java.io.File;
import java.util.Random;

import tw.FantasyRealms.blocks.BlockBushTw;
import tw.FantasyRealms.blocks.BlockTw;
import tw.FantasyRealms.blocks.TileEntityMagicCraftingTable;
import tw.FantasyRealms.core.LogTw;
import tw.FantasyRealms.core.twConfig;
import tw.FantasyRealms.items.ItemTw;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.EventPriority;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="twStuff", name="twStuff", version="0.2.12")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class FantasyRealms
implements IFuelHandler
{
	public static WorldGenCore worldGen = new WorldGenCore();
	
    // The instance of your mod that Forge uses.
	@Instance("twStuff")
	public static FantasyRealms instance;
	
	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide="twStuff.client.ClientProxy", serverSide="twStuff.CommonProxy")
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		LogTw.configureLogging();
		
		LogTw.fine("Loading Configurations");
		twConfig.load(event);
	}
	
	@Init
	public void load(FMLInitializationEvent event) {
		LogTw.fine("Initializing Blocks");
		BlockTw.initBlocks();
		
		LogTw.fine("Initializing Items");
		ItemTw.initItems();
		
		MinecraftForge.setBlockHarvestLevel(BlockTw.ore, 0, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockTw.ore, 1, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(BlockTw.ore, 2, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(BlockTw.ore, 3, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockTw.ore, 4, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockTw.ore, 5, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockTw.ore, 6, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockTw.ore, 7, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(BlockTw.ore, 8, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(BlockTw.ore, 9, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(BlockTw.ore, 10, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(BlockTw.oreBlock, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(BlockTw.bush, "axe", 0);
		MinecraftForge.setBlockHarvestLevel(BlockTw.darkwood, "axe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockTw.darkwoodPlanks, "axe", 2);
		
		OreDictionary.registerOre("logWood", new ItemStack(BlockTw.darkwood));
		OreDictionary.registerOre("plankWood", new ItemStack(BlockTw.darkwoodPlanks));
		OreDictionary.registerOre("stickWood", new ItemStack(ItemTw.darkwoodSticks));
		OreDictionary.registerOre("treeSapling", new ItemStack(BlockTw.darkwoodSapling));
		OreDictionary.registerOre("treeLeaves", new ItemStack(BlockTw.darkwoodLeaves));
		OreDictionary.registerOre("oreQuartz", new ItemStack(ItemTw.quartz));
		OreDictionary.registerOre("oreCopper", new ItemStack(BlockTw.ore, 1, 1));
		OreDictionary.registerOre("oreSilver", new ItemStack(BlockTw.ore, 1, 2));
		OreDictionary.registerOre("orePlatinum", new ItemStack(BlockTw.ore, 1, 3));
		OreDictionary.registerOre("oreColdSteel", new ItemStack(BlockTw.ore, 1, 4));
		OreDictionary.registerOre("oreMithral", new ItemStack(BlockTw.ore, 1, 5));
		OreDictionary.registerOre("oreAdamantine", new ItemStack(BlockTw.ore, 1, 6));
		OreDictionary.registerOre("oreRuby", new ItemStack(ItemTw.ruby));
		OreDictionary.registerOre("oreSapphire", new ItemStack(ItemTw.sapphire));
		OreDictionary.registerOre("oreTopaz", new ItemStack(ItemTw.topaz));
		OreDictionary.registerOre("oreAmethyst", new ItemStack(ItemTw.amethyst));
		OreDictionary.registerOre("ingotCopper", new ItemStack(ItemTw.ingotCopper));
		OreDictionary.registerOre("ingotSilver", new ItemStack(ItemTw.ingotSilver));
		OreDictionary.registerOre("ingotPlatinum", new ItemStack(ItemTw.ingotPlatinum));
		OreDictionary.registerOre("ingotColdiron", new ItemStack(ItemTw.ingotColdiron));
		OreDictionary.registerOre("ingotMithral", new ItemStack(ItemTw.ingotMithral));
		OreDictionary.registerOre("ingotAdamantine", new ItemStack(ItemTw.ingotAdamantine));
		OreDictionary.registerOre("ingotElectrum", new ItemStack(ItemTw.ingotElectrum));
		OreDictionary.registerOre("nuggetCopper", new ItemStack(ItemTw.nuggetCopper));
		OreDictionary.registerOre("nuggetSilver", new ItemStack(ItemTw.nuggetSilver));
		OreDictionary.registerOre("nuggetPlatinum", new ItemStack(ItemTw.nuggetPlatinum));
		OreDictionary.registerOre("nuggetColdiron", new ItemStack(ItemTw.nuggetColdiron));
		OreDictionary.registerOre("nuggetMithral", new ItemStack(ItemTw.nuggetMithral));
		OreDictionary.registerOre("nuggetAdamantine", new ItemStack(ItemTw.nuggetAdamantine));
		OreDictionary.registerOre("nuggetElectrum", new ItemStack(ItemTw.nuggetElectrum));
		
		RecipeManager.InitRecipes();
		
		//EnumHelper.addEnchantmentType("wand");
		//EnumHelper.addEnchantmentType("staff");
		
		GameRegistry.registerWorldGenerator(worldGen);
		GameRegistry.registerFuelHandler(this);
		
		proxy.registerRenderers();
		
		MinecraftForge.EVENT_BUS.register(this);
		
		NetworkRegistry.instance().registerGuiHandler(instance, proxy);
		
		GameRegistry.registerTileEntity(TileEntityMagicCraftingTable.class, "Magic Crafting Table");
		GameRegistry.addBiome(BiomeTw.darkwood);
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
	}
	
	
	@ForgeSubscribe
	public void onUseBonemeal(BonemealEvent event){
		int blockID = event.world.getBlockId(event.X, event.Y, event.Z);
		if (blockID == BlockTw.bush.blockID){
			((BlockBushTw)BlockTw.bush).fertalize(event.world, event.X, event.Y, event.Z);
			event.setResult(Result.ALLOW);
		} else if (blockID == BlockTw.darkwoodSapling.blockID){
			if (new WorldGenDarkwood().grow(event.world, event.world.rand, event.X, event.Y, event.Z))
				event.setResult(Result.ALLOW);
		}
	}

	@Override
	public int getBurnTime(ItemStack fuel) {
		//System.out.println("test");
		if (fuel.itemID == BlockTw.darkwoodSapling.blockID)
			return 100;
		else if (fuel.itemID == ItemTw.darkwoodSticks.itemID)
			return 100;
		else
			return 0;
	}
	
}
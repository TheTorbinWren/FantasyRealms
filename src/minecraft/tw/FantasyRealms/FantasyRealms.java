package tw.FantasyRealms;

import java.io.File;
import java.util.Random;

import tw.FantasyRealms.blocks.BlockBerryBush;
import tw.FantasyRealms.blocks.BlockCore;
import tw.FantasyRealms.blocks.TileEntityMagicCraftingTable;
import tw.FantasyRealms.core.LogTw;
import tw.FantasyRealms.core.twConfig;
import tw.FantasyRealms.items.ItemCore;
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

@Mod(modid="FantasyRealms", name="TheTorbinWren's Fantasy Realms", version="0.3.0.3")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class FantasyRealms
implements IFuelHandler
{
	public static WorldGenCore worldGen = new WorldGenCore();
	
    // The instance of your mod that Forge uses.
	@Instance("FantasyRealms")
	public static FantasyRealms instance;
	
	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide="tw.FantasyRealms.client.ClientProxy", serverSide="tw.FantasyRealms.CommonProxy")
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
		BlockCore.initBlocks();
		
		LogTw.fine("Initializing Items");
		ItemCore.initItems();
		
		MinecraftForge.setBlockHarvestLevel(BlockCore.ore, 0, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockCore.ore, 1, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(BlockCore.ore, 2, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(BlockCore.ore, 3, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockCore.ore, 4, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockCore.ore, 5, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockCore.ore, 6, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockCore.ore, 7, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(BlockCore.ore, 8, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(BlockCore.ore, 9, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(BlockCore.ore, 10, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(BlockCore.oreBlock, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(BlockCore.bush, "axe", 0);
		MinecraftForge.setBlockHarvestLevel(BlockCore.darkwoodLog, "axe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockCore.darkwoodPlanks, "axe", 2);
		
		OreDictionary.registerOre("logWood", new ItemStack(BlockCore.darkwoodLog));
		OreDictionary.registerOre("plankWood", new ItemStack(BlockCore.darkwoodPlanks));
		OreDictionary.registerOre("stickWood", new ItemStack(ItemCore.darkwoodSticks));
		OreDictionary.registerOre("treeSapling", new ItemStack(BlockCore.darkwoodSapling));
		OreDictionary.registerOre("treeLeaves", new ItemStack(BlockCore.darkwoodLeaves));
		OreDictionary.registerOre("oreQuartz", new ItemStack(ItemCore.quartz));
		OreDictionary.registerOre("oreCopper", new ItemStack(BlockCore.ore, 1, 1));
		OreDictionary.registerOre("oreSilver", new ItemStack(BlockCore.ore, 1, 2));
		OreDictionary.registerOre("orePlatinum", new ItemStack(BlockCore.ore, 1, 3));
		OreDictionary.registerOre("oreColdSteel", new ItemStack(BlockCore.ore, 1, 4));
		OreDictionary.registerOre("oreMithral", new ItemStack(BlockCore.ore, 1, 5));
		OreDictionary.registerOre("oreAdamantine", new ItemStack(BlockCore.ore, 1, 6));
		OreDictionary.registerOre("oreRuby", new ItemStack(ItemCore.ruby));
		OreDictionary.registerOre("oreSapphire", new ItemStack(ItemCore.sapphire));
		OreDictionary.registerOre("oreTopaz", new ItemStack(ItemCore.topaz));
		OreDictionary.registerOre("oreAmethyst", new ItemStack(ItemCore.amethyst));
		OreDictionary.registerOre("ingotCopper", new ItemStack(ItemCore.ingotCopper));
		OreDictionary.registerOre("ingotSilver", new ItemStack(ItemCore.ingotSilver));
		OreDictionary.registerOre("ingotPlatinum", new ItemStack(ItemCore.ingotPlatinum));
		OreDictionary.registerOre("ingotColdiron", new ItemStack(ItemCore.ingotColdiron));
		OreDictionary.registerOre("ingotMithral", new ItemStack(ItemCore.ingotMithral));
		OreDictionary.registerOre("ingotAdamantine", new ItemStack(ItemCore.ingotAdamantine));
		OreDictionary.registerOre("ingotElectrum", new ItemStack(ItemCore.ingotElectrum));
		OreDictionary.registerOre("nuggetCopper", new ItemStack(ItemCore.nuggetCopper));
		OreDictionary.registerOre("nuggetSilver", new ItemStack(ItemCore.nuggetSilver));
		OreDictionary.registerOre("nuggetPlatinum", new ItemStack(ItemCore.nuggetPlatinum));
		OreDictionary.registerOre("nuggetColdiron", new ItemStack(ItemCore.nuggetColdiron));
		OreDictionary.registerOre("nuggetMithral", new ItemStack(ItemCore.nuggetMithral));
		OreDictionary.registerOre("nuggetAdamantine", new ItemStack(ItemCore.nuggetAdamantine));
		OreDictionary.registerOre("nuggetElectrum", new ItemStack(ItemCore.nuggetElectrum));
		
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
		if (blockID == BlockCore.bush.blockID){
			((BlockBerryBush)BlockCore.bush).fertalize(event.world, event.X, event.Y, event.Z);
			event.setResult(Result.ALLOW);
		} else if (blockID == BlockCore.darkwoodSapling.blockID){
			if (new WorldGenDarkwood().grow(event.world, event.world.rand, event.X, event.Y, event.Z))
				event.setResult(Result.ALLOW);
		}
	}

	@Override
	public int getBurnTime(ItemStack fuel) {
		//System.out.println("test");
		if (fuel.itemID == BlockCore.darkwoodSapling.blockID)
			return 100;
		else if (fuel.itemID == ItemCore.darkwoodSticks.itemID)
			return 100;
		else
			return 0;
	}
	
}
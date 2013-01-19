package tw.FantasyRealms;

import java.util.Random;

import tw.FantasyRealms.blocks.BlockTw;
import tw.FantasyRealms.core.twConfig;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;

import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenCore 
implements IWorldGenerator {
	protected WorldGenCore(){
		
	}

	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
		switch (world.getWorldInfo().getDimension()){
		case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
		}
	}
	
	public void generateSurface(World world, Random random, int blockX, int blockZ){
		int a;
		int x;
		int y;
		int z;
		int numBushes = 0;
		int numDarkwoodTrees = 0;
		
		WorldGenOre quartzGen = new WorldGenOre(twConfig.genQuartz, BlockTw.ore.blockID, 0, random.nextInt(8), 4, 0, 60);
		WorldGenOre copperGen = new WorldGenOre(twConfig.genCopper, BlockTw.ore.blockID, 1, random.nextInt(10)+10, 6, 0, 60);
		WorldGenOre silverGen = new WorldGenOre(twConfig.genSilver, BlockTw.ore.blockID, 2, random.nextInt(5)+10, 4, 0, 40);
		WorldGenOre platinumGen = new WorldGenOre(twConfig.genPlatinum, BlockTw.ore.blockID, 3, random.nextInt(4), 8, 0, 20);
		WorldGenOre coldironGen = new WorldGenOre(twConfig.genColdiron, BlockTw.ore.blockID, 4, 0, 6, 0, 25);
		WorldGenOre mithralGen = new WorldGenOre(twConfig.genMithral, BlockTw.ore.blockID, 5, 0, 2, 0, 15);
		WorldGenOre adamantineGen = new WorldGenOre(twConfig.genAdamantine, BlockTw.ore.blockID, 6, 0, 1, 0, 15);
		WorldGenOre rubyGen = new WorldGenOre(twConfig.genRuby, BlockTw.ore.blockID, 7, random.nextInt(3)+3, 2, 0, 40);
		WorldGenOre sapphireGen = new WorldGenOre(twConfig.genSapphire, BlockTw.ore.blockID, 8, random.nextInt(3)+3, 2, 0, 40);
		WorldGenOre topazGen = new WorldGenOre(twConfig.genTopaz, BlockTw.ore.blockID, 9, random.nextInt(3)+3, 2, 0, 40);
		WorldGenOre amethystGen = new WorldGenOre(twConfig.genAmethyst, BlockTw.ore.blockID, 10, random.nextInt(5)+5, 4, 0, 60);
		
		BiomeGenBase biome = world.getBiomeGenForCoords(blockX, blockZ);
		switch (biome.biomeID){
		case 0: // ocean
		{
			break;
		}
		case 1: // plains
		{
			break;
		}
		case 2: // desert
		{
			break;
		}
		case 3: // extreme hills
		{
			platinumGen.setNumVeins(random.nextInt(8));
			mithralGen.setNumVeins(random.nextInt(5));
			break;
		}
		case 4: // forest
		{
			numBushes = random.nextInt(10)-2;
			numDarkwoodTrees = random.nextInt(250)<2 ? 1 : 0;
			//System.out.println(numDarkwoodTrees);
			break;
		}
		case 5: // taiga
		{
			coldironGen.setNumVeins(random.nextInt(5));
			break;
		}
		case 6: // swampland
		{
			break;
		}
		case 7: // river
		{
			break;
		}
		case 8: // hell
		{
			break;
		}
		case 9: // sky
		{
			break;
		}
		case 10: // frozen ocean
		{
			coldironGen.setNumVeins(random.nextInt(5));
			break;
		}
		case 11: // frozen river
		{
			coldironGen.setNumVeins(random.nextInt(5));
			break;
		}
		case 12: // ice plains
		{
			coldironGen.setNumVeins(random.nextInt(5));
			break;
		}
		case 13: // ice mountains
		{
			platinumGen.setNumVeins(random.nextInt(8));
			coldironGen.setNumVeins(random.nextInt(5));
			break;
		}
		case 14: // mushroom island
		{
			break;
		}
		case 15: // mushroom island shore
		{
			break;
		}
		case 16: // beach
		{
			break;
		}
		case 17: // desert hills
		{
			break;
		}
		case 18: // forest hills
		{
			numBushes = random.nextInt(10)-2;
			numDarkwoodTrees = random.nextInt(250)<2 ? 1 : 0;
			//System.out.println(numDarkwoodTrees);
			break;
		}
		case 19: // taiga hills
		{
			break;
		}
		case 20: // extreme hills edge
		{
			break;
		}
		case 21: // jungle
		{
			break;
		}
		case 22: // jungle hills
		{
			break;
		}
		// todo: add ExtraBiomesXL suuport
		case 32: // Alpine
		{
			coldironGen.setNumVeins(random.nextInt(5));
			break;
		}
		case 33: // AutumnWoods
		{
			numBushes = random.nextInt(10)-2;
			break;
		}
		case 34: // BirchForest
		{
			numBushes = random.nextInt(10)-2;
			break;
		}
		case 35: // ExtremeJungle
		{
			platinumGen.setNumVeins(random.nextInt(8));
			mithralGen.setNumVeins(random.nextInt(5));
			break;
		}
		case 36: // ForestedHills
		{
			numBushes = random.nextInt(10)-2;
			numDarkwoodTrees = random.nextInt(250)<2 ? 1 : 0;
			break;
		}
		case 37: // ForestedIsland
		{
			numBushes = random.nextInt(10)-2;
			numDarkwoodTrees = random.nextInt(250)<2 ? 1 : 0;
			break;
		}
		case 38: // Glacier
		{
			coldironGen.setNumVeins(random.nextInt(10));
			break;
		}
		case 39: // GreenHills
		{
			break;
		}
		case 40: // GreenSwamp
		{
			break;
		}
		case 41: // IceWasteland
		{
			coldironGen.setNumVeins(random.nextInt(5));
			break;
		}
		case 42: // Marsh
		{
			break;
		}
		case 43: // Meadow
		{
			break;
		}
		case 44: // MiniJungle
		{
			break;
		}
		case 45: // MountainDesert
		{
			platinumGen.setNumVeins(random.nextInt(8));
			mithralGen.setNumVeins(random.nextInt(5));
			break;
		}
		case 46: // MountainRidge
		{
			platinumGen.setNumVeins(random.nextInt(8));
			mithralGen.setNumVeins(random.nextInt(5));
			break;
		}
		case 47: // MountainTaiga
		{
			platinumGen.setNumVeins(random.nextInt(8));
			mithralGen.setNumVeins(random.nextInt(5));
			coldironGen.setNumVeins(random.nextInt(5));
			break;
		}
		case 48: // PineForest
		{
			numBushes = random.nextInt(10)-2;
			break;
		}
		case 49: // RaintForest
		{
			break;
		}
		case 50: // RedwoodForest
		{
			break;
		}
		case 51: // RedwoodLush
		{
			break;
		}
		case 52: // Savannah
		{
			break;
		}
		case 53: // Shruband
		{
			break;
		}
		case 54: // SnoweyForest
		{
			coldironGen.setNumVeins(random.nextInt(5));
			break;
		}
		case 55: // SnoweyRainFoerst
		{
			coldironGen.setNumVeins(random.nextInt(5));
			break;
		}
		case 56: // TemporateRainForest
		{
			break;
		}
		case 57: // Tundra
		{
			coldironGen.setNumVeins(random.nextInt(5));
			break;
		}
		case 58: // Wasteland
		{
			adamantineGen.setNumVeins(random.nextInt(5)+5);
			break;
		}
		case 59: // Woodlands
		{
			numBushes = random.nextInt(10)-2;
			numDarkwoodTrees = random.nextInt(250)<2 ? 1 : 0;
			break;
		}
		// TODO add twilight forest support, ids 70-87
		}
		
		// Generate quartz
		quartzGen.generate(world, random, blockX, blockZ, 0);
		//Generate copper
		copperGen.generate(world, random, blockX, blockZ, 0);
		//Generate silver
		silverGen.generate(world, random, blockX, blockZ, 0);
		//Generate platinum
		platinumGen.generate(world, random, blockX, blockZ, 0);
		//Generate cold iron
		coldironGen.generate(world, random, blockX, blockZ, 0);
		//Generate mithral
		mithralGen.generate(world, random, blockX, blockZ, 0);
		//Generate adamantine
		adamantineGen.generate(world, random, blockX, blockZ, 0);
		//Generate ruby
		rubyGen.generate(world, random, blockX, blockZ, 0);
		//Generate sapphire
		sapphireGen.generate(world, random, blockX, blockZ, 0);
		//Generate topaz
		topazGen.generate(world, random, blockX, blockZ, 0);
		//Generate amethyst
		amethystGen.generate(world, random, blockX, blockZ, 0);

		// Generate Darkwood Trees
		for (a=0; a<numDarkwoodTrees; ++a){
			x = blockX + random.nextInt(16) + 8;
			z = blockZ + random.nextInt(16) + 8;
			y = world.getHeightValue(x, z);
			new WorldGenDarkwood().generate(world, random, x, y, z);
		}
		
		// Generate bushes
		for (a=0; a<numBushes; a++){
			x = blockX + random.nextInt(16) + 8;
			z = blockZ + random.nextInt(16) + 8;
			y = world.getHeightValue(x, z);
			new WorldGenBush(BlockTw.bush.blockID, 1).generate(world, random, x, y, z);
		}
		
	}

}

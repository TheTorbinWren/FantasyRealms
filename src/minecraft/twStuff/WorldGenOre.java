package twStuff;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenOre 
extends WorldGenerator {
	boolean enabled;	// generation of ore enabled
	int id;				// block id to generate
	int meta;			// metadata of block to generate
	int veins;			// number of veins to generate
	int size;			// size of the vein to generate
	int minY;			// lowest height to generate at
	int maxY;			// highest height to generate at
	
	public WorldGenOre(boolean genEnabled, int blockId, int metadata, int numVeins, int veinSize, int minimumY, int maximumY){
		enabled = genEnabled;
		id = blockId;
		meta = metadata;
		veins = numVeins;
		size = veinSize;
		minY = minimumY;
		maxY = maximumY;
	}
	
	public boolean generate(World world, Random random, int chunkX, int chunkZ, int zzz){
		if (this.enabled){
			for (int a=0; a<this.veins; a++){
				int x = chunkX + random.nextInt(16);
				int y = random.nextInt(this.maxY - this.minY) + minY;
				int z = chunkZ + random.nextInt(16);
				new WorldGenMinable(this.id, this.meta, this.size).generate(world, random, x, y, z);
			}
			return true;
		} else
			return false;
	}
	
	public void setNumVeins(int numVeins){
		veins = numVeins;
	}
}

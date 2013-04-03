package tw.FantasyRealms;

import java.util.Random;

import tw.FantasyRealms.blocks.BlockCore;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeDecoratorTw extends BiomeDecorator {
	protected StructureDarkwoodHut hut;
	protected WorldGenerator bushGen;
	protected int bushesPerchunk;
	
	protected BiomeDecoratorTw(BiomeGenBase par1BiomeGenBase){
		super(par1BiomeGenBase);
		bushGen = new WorldGenBush(BlockCore.bush.blockID, 1);
		this.bushesPerchunk = 0;
	}

	@Override
    public void decorate(World world, Random random, int blockX, int blockZ){
        if (this.currentWorld != null)
        {
            throw new RuntimeException("Already decorating!!");
        }
        else
        {
            this.currentWorld = world;
            this.randomGenerator = random;
            this.chunk_X = blockX;
            this.chunk_Z = blockZ;
            //this.hut = new StructureDarkwoodHut(world, random, blockX, blockZ);
            //this.hut.generateStructure(world, randomGenerator, 32768);
            this.decorate();
            this.decorateTw();
            this.currentWorld = null;
            this.randomGenerator = null;
        }
   }
    
	private void decorateTw() {
		int n;
		int x;
		int y;
		int z;
		
		for (n=0;n<this.bushesPerchunk;++n){
			x=this.chunk_X+this.randomGenerator.nextInt(16)+8;
			z=this.chunk_Z+this.randomGenerator.nextInt(16)+8;
			y=this.currentWorld.getTopSolidOrLiquidBlock(x, z);
			this.bushGen.generate(this.currentWorld, this.randomGenerator, x, y, z);
		}
	}

	public void setTreesPerChunk(int numTrees){
		this.treesPerChunk = numTrees;
	}
	
	public void setGrassPerChunk(int numGrass){
		this.grassPerChunk = numGrass;
	}
	
	public void setMushroomsPerChunk(int numMushrooms){
		this.mushroomsPerChunk = numMushrooms;
	}
	
	public void setFlowersPerChunk(int numFlowers){
		this.flowersPerChunk = numFlowers;
	}
	
	public void setDeadBushPerChunk(int numDeadBush){
		this.deadBushPerChunk = numDeadBush;
	}
	
	public void setBushesPerChunk(int numBushes){
		this.bushesPerchunk = numBushes;
	}
}

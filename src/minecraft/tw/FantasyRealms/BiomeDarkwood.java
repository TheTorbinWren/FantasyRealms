package tw.FantasyRealms;

import java.util.Random;


import net.minecraft.block.Block;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeDarkwood extends BiomeTw {
	public BiomeDarkwood(int id){
		super(id);
		((BiomeDecoratorTw)theBiomeDecorator).setTreesPerChunk(20);
		((BiomeDecoratorTw)theBiomeDecorator).setGrassPerChunk(4);
		((BiomeDecoratorTw)theBiomeDecorator).setMushroomsPerChunk(16);
		((BiomeDecoratorTw)theBiomeDecorator).setFlowersPerChunk(0);
		((BiomeDecoratorTw)theBiomeDecorator).setBushesPerChunk(35);
	}
	
    public WorldGenerator getRandomWorldGenForGrass(Random par1Random)
    {
        return new WorldGenTallGrass(Block.tallGrass.blockID, 0);
    }

	public WorldGenerator getRandomWorldGenForTrees(Random random){
		return random.nextInt(5) > 1 ? this.worldGenDarkwood : new WorldGenShrub(0, 0);
	}
	
	
}

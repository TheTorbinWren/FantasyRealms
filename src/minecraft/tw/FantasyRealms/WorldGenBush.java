package tw.FantasyRealms;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenBush extends WorldGenerator {
	private int blockID;
	private int meta;
	
	public WorldGenBush(int bushBlockID, int bushMeta){
		this.blockID = bushBlockID;
		this.meta = bushMeta;
	}
	
	@Override
	public boolean generate(World world, Random random, int baseX, int baseY, int baseZ) {
		//System.out.println("bush");
		int sizeX = random.nextInt(3)+1;
		int sizeZ = random.nextInt(3)+1;
		for (int atX=0; atX<sizeX; atX++){
			for (int atZ=0; atZ<sizeZ; atZ++){
				int x = baseX + atX;
				int z = baseZ + atZ;
				int y = world.getHeightValue(x, z);
				if (baseY - y <2 && y - baseY < 2){
					if ((world.isAirBlock(x, y, z)) && ((world.getBlockId(x, y-1, z) == Block.dirt.blockID) || (world.getBlockId(x, y-1, z) == Block.grass.blockID))){
						this.setBlockAndMetadata(world, x, y, z, this.blockID, this.meta);
					}
				}
				
			}
		}
		return true;
	}

}

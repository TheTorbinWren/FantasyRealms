package tw.FantasyRealms;

import java.util.Random;

import tw.FantasyRealms.blocks.BlockCore;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenDarkwood extends WorldGenerator{
	public WorldGenDarkwood(){
		super();
	}
	
	public boolean generate(World world, Random random, int x, int y, int z){
		int realY = world.getTopSolidOrLiquidBlock(x, z);
		y = realY < y ? realY : y;
		return this.grow(world, random, x, y, z);
	}
	
	public boolean grow(World world, Random random, int x, int y, int z){
		if (world.getBlockId(x, y-1, z) != Block.dirt.blockID  && world.getBlockId(x, y-1, z) != Block.grass.blockID){
			return false;
		}
		for (int a=-1;a<=1;a++){
			for (int b=-1;b<=1;b++){
				int blockID = world.getBlockId(x+a, y, z+b);
				if (blockID == Block.wood.blockID ||
						blockID == BlockCore.darkwoodLog.blockID){
					return false;
				}
			}
		}
		int maxHeight = getMaxHeight(world, x, y, z);
		int height = 16 + random.nextInt(6);
		height = height > maxHeight ? maxHeight : height;
		if (y >= 1 && y + maxHeight + 1 <= 256 && height >= 16){
			// generate trunk
			for (int h = 0; h < height; h++)
				this.setBlock(world, x, y+h, z, BlockCore.darkwoodLog.blockID);
			
			// generate foliage
			int r = random.nextInt(4) + 3;
			int fh = random.nextInt(2) + 2;
			int fc = height - (fh / 2);
			// following not working
			if (world.isAirBlock(x-1, y+fc-fh-1, z))
				this.setBlock(world, x-1, fc-fh-1, z, BlockCore.darkwoodLeaves.blockID);
			if (world.isAirBlock(x, y+fc-fh-1, z-1))
				this.setBlock(world, x, fc-fh-1, z-1, BlockCore.darkwoodLeaves.blockID);
			if (world.isAirBlock(x+1, y+fc-fh-1, z))
				this.setBlock(world, x+1, fc-fh-1, z, BlockCore.darkwoodLeaves.blockID);
			if (world.isAirBlock(x, y+fc-fh-1, z+1))
				this.setBlock(world, x, fc-fh-1, z+1, BlockCore.darkwoodLeaves.blockID);
			for (int h=fc-fh;h<=fc+fh;h++){
				for (int a=-r;a<=r;a++){
					for (int b=-r;b<=r;b++){
						boolean gf = true;
						if (h==fc-fh||h==fc+fh){
							if (a==-r || a==r || b==-r || b==r){
								gf = false;
							} else if ((a==-r+1&&b==-r+1) ||
									(a==-r+1&&b==r-1) ||
									(a==r-1&&b==-r+1) ||
									(a==r-1&&b==r-1)){
								gf = false;
							}
						}
						else {
							if (a==-r||a==r){
								if (b==-r||b==-r+1||b==r||b==r-1){
									gf = false;
								}
							} else if (a==-r+1||a==r-1){
								if (b==-r||b==r){
									gf = false;
								}
							}
						}
						if (world.isAirBlock(x+a, y+h, z+b) && gf)
							this.setBlock(world, x+a, y+h, z+b, BlockCore.darkwoodLeaves.blockID);
					}
				}
			}
		}
		return true;
	}
	
	private int getMaxHeight(World world, int x, int y, int z){
		int h = 0;
		int blockID = world.getBlockId(x, y-1, z);;
		Block block;
		if (blockID == Block.dirt.blockID || blockID == Block.grass.blockID){
			do{
				h++;
				blockID = world.getBlockId(x, y+h-1, z);
				block = Block.blocksList[blockID];
			} while ((blockID == 0 || 
					block.isLeaves(world, x, y+h-1, z) || 
					blockID == BlockCore.darkwoodSapling.blockID) &&
					h <= 20);
		}
		return h;
	}

}

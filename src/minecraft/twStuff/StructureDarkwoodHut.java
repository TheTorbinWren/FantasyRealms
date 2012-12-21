package twStuff;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.structure.ComponentScatteredFeatureSwampHut;
import net.minecraft.world.gen.structure.StructureStart;

public class StructureDarkwoodHut extends StructureStart{
	public StructureDarkwoodHut(World world, Random random, int blockX, int blockZ){
		BiomeGenBase biome = world.getBiomeGenForCoords(blockX, blockZ);
		if (biome.biomeName == "Darkwood Forest"){
			ComponentScatteredFeatureSwampHut hut = new ComponentScatteredFeatureSwampHut(random, blockX * 16, blockZ * 16);
			this.components.add(hut);
		}
		this.updateBoundingBox();
	}
}

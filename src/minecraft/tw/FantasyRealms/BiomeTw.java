package tw.FantasyRealms;

import tw.FantasyRealms.core.twConfig;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeTw extends BiomeGenBase {
	public static BiomeGenBase darkwood = new BiomeDarkwood(twConfig.biomeIdDarkwood).setColor(16711935).setBiomeName("Darkwood Forest").setTemperatureRainfall(0.2F, 0.8F);
	
	protected WorldGenerator worldGenDarkwood;
	
	protected BiomeTw(int id){
		super(id);
		
		worldGenDarkwood = new WorldGenDarkwood();
	}

	// @Override
    public BiomeDecorator createBiomeDecorator()
    {
        return new BiomeDecoratorTw(this);
    }
	
}

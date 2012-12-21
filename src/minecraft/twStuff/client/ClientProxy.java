package twStuff.client;

import net.minecraftforge.client.MinecraftForgeClient;
import twStuff.CommonProxy;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(ITEMS_PNG);
		MinecraftForgeClient.preloadTexture(BLOCK_PNG);
		MinecraftForgeClient.preloadTexture(WANDS_PNG);
		MinecraftForgeClient.preloadTexture(STAFFS_PNG);
	}
	
}
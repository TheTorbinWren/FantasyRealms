package twStuff;

import java.util.logging.Level;
import java.util.logging.Logger;

import cpw.mods.fml.common.FMLLog;

public class LogTw {

	private static final String TWSTUFF = "TwStuff";
	
	private static Logger log; 
	
	public static void configureLogging(){
		log = Logger.getLogger(TWSTUFF);
		log.setParent(Logger.getLogger("ForgeModLoader"));
	}
	
	public static void log(Level level, String message){
		log.log(level, message, new Object[0]);
	}
	
	public static void fine(String message) {
		log(Level.FINE, message);
	}

}

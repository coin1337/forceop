package xyz.christallinqq.forceop;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ForceOP implements ModInitializer {
   public static Logger LOGGER = LogManager.getLogger();
   public static final String MOD_ID = "forceop";
   public static final String MOD_NAME = "Force OP exploit";

   public void onInitialize() {
      log(Level.INFO, "Initializing");
   }

   public static void log(Level level, String message) {
      LOGGER.log(level, "[Force OP exploit] " + message);
   }
}

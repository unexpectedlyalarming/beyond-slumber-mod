package unexpectedlyalarming.beyondslumber;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeyondSlumber implements ModInitializer {

	public static final String MOD_ID = "beyondslumber";
    public static final Logger LOGGER = LoggerFactory.getLogger("beyondslumber");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}
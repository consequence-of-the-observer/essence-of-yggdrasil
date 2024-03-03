package net.matt.yggdrasil;

import net.fabricmc.api.ModInitializer;

import net.matt.yggdrasil.block.ModBlocks;
import net.matt.yggdrasil.item.ModItemGroups;
import net.matt.yggdrasil.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Yggdrasil_mod implements ModInitializer {
	public static final String MOD_ID = "yggdrasil";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();

		ModBlocks.registerModBlocks();

		LOGGER.info("Hello Fabric world!");
	}
}
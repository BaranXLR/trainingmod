package com.tutorialmod.tutorialmod;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.tutorialmod.tutorialmod.setup.*;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TutorialMod.MODID)
public class TutorialMod
{
	public static final String MODID = "tutorialmod";
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	public TutorialMod() {
		
		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
	    ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER_CONFIG);

	    Registration.init();

	    // Register the setup method for modloading
	    FMLJavaModLoadingContext.get().getModEventBus().addListener(ModSetup::init);
	    FMLJavaModLoadingContext.get().getModEventBus().addListener(ClientSetup::init);
	}
}

package com.tutorialmod.tutorialmod.setup;

import com.tutorialmod.tutorialmod.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;

@Mod.EventBusSubscriber(modid = TutorialMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModSetup {
	
	public static final ItemGroup ITEM_GROUP = new ItemGroup("tutorialmod") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Registration.FIRSTBLOCK.get());
        }
    };
	
    public static void init(final FMLCommonSetupEvent event) {
    	
    }

    @SubscribeEvent
    public static void serverLoad(FMLServerStartingEvent event) {
    }

}
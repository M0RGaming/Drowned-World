package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
//import net.fabricmc.example.biome.OceanBigWarmBiome;
//import net.fabricmc.fabric.impl.registry.RegistryListener;
import net.minecraft.world.biome.OceanWarmBiome;

public class ExampleMod implements ModInitializer {
	
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		
		//OceanBigWarmBiome extremeWarmOcean = null;
		

		System.out.println("Hello Fabric world!");
		
		//Registry.register(extremeWarmOcean, "extremewarmocean", Biome.Category.OCEAN);
		//Registry.register(Registry.BIOME, "drowned:extremewarmocean", extremeWarmOcean);
		//Registry.register(registry_1, "extremewarmocean", object_1)
		
	}
}

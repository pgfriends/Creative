package net.pgfmc.creative;

import org.bukkit.plugin.java.JavaPlugin;

import net.pgfmc.creative.commands.Plot;
import net.pgfmc.creative.events.InventoryEvents;

public class Main extends JavaPlugin {
	
	public static Main plugin;
	
	@Override
	public void onEnable()
	{
		plugin = this;
		getCommand("plot").setExecutor(new Plot()); // Registers Plot command class
		getServer().getPluginManager().registerEvents(new InventoryEvents(), this);
	}
	
	@Override
	public void onDisable()
	{
		
	}

}

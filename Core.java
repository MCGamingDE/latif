package de.mcg.latif;

import org.bukkit.plugin.java.JavaPlugin;

import de.mcg.latif.cmd.Latif;

public class Core extends JavaPlugin {
	
	public static String prefix = "§4§lLaftif §7>> §f";
	
	public void onEnable() {
		
		getCommand("lafti11").setExecutor(new Latif());
		
		getServer().getConsoleSender().sendMessage("§7");
		getServer().getConsoleSender().sendMessage(Core.prefix + "§3§lDas LoLtif Plugin wurde aktiviert.");
		getServer().getConsoleSender().sendMessage("§7");
		
		getCommand("lafti11").setExecutor(new Latif());
		
	}
	
	public void onDisable() {
		getServer().getConsoleSender().sendMessage("§7");
		getServer().getConsoleSender().sendMessage(Core.prefix + "§3§lDas LoLtif Plugin wurde deaktiviert.");
		getServer().getConsoleSender().sendMessage("§7");
	}

}

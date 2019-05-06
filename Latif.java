package de.mcg.latif.cmd;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import de.mcg.latif.Core;

public class Latif implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player loltif = (Player)sender;
		World w = loltif.getWorld();
		
		if(cmd.getName().equalsIgnoreCase("lafti11")) {
			if(sender instanceof Player) {
				if(args.length == 0) {
					
					loltif.playSound(loltif.getLocation(), Sound.DONKEY_DEATH, 6, 6);
					
					w.playEffect(loltif.getLocation(), Effect.EXPLOSION_LARGE, 1);
					
					loltif.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 9999, 255));
					loltif.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 9999, 255));
					
					loltif.sendMessage(Core.prefix + "§f§lDU HAST DEN LATIF GEFUNDEN! HURAAA");
				
					
					loltif.getInventory().addItem(new ItemStack(Material.COOKIE, 999999));
					loltif.getInventory().addItem(new ItemStack(Material.GOLDEN_CARROT, 1));
					
					loltif.damage(3);
					
					
				} else if(args[0].equalsIgnoreCase("hyperspeed")) {
					
					loltif.setWalkSpeed(1);
					loltif.sendMessage(Core.prefix + "§b§lI'M FAST AS FUCK BOIIIIIIIIIIIIIIIIIIIII");
					loltif.sendMessage(Core.prefix + "§b§lI'M FAST AS FUCK BOIIIIIIIIIIIIIIIIIIIII");
					loltif.sendMessage(Core.prefix + "§b§lI'M FAST AS FUCK BOIIIIIIIIIIIIIIIIIIIII");
					loltif.sendMessage(Core.prefix + "§b§lI'M FAST AS FUCK BOIIIIIIIIIIIIIIIIIIIII");
					loltif.sendMessage(Core.prefix + "§b§lI'M FAST AS FUCK BOIIIIIIIIIIIIIIIIIIIII");
					
				} else if(args[0].equalsIgnoreCase("suicide")) {
					
					loltif.damage(10000);
					loltif.setHealth(0);
					
					loltif.sendMessage("§f§lDu hast dich für den SUICIDE entschieden!");
					
					Bukkit.getOnlinePlayers(); {
						Bukkit.broadcastMessage("§c5lAchtung!§f§l " + loltif.getName() + " §c§lhat sich für den Suicide entschieden!");
					}
					
				} else if(args[0].equalsIgnoreCase("betrunken")) {
					
					loltif.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 9999, 255));
					
					loltif.sendMessage("§f§lDu bist nun BESOFFEN, LOL.");
					
				} else if(args[0].equalsIgnoreCase("gay")) {
					
					Bukkit.getOnlinePlayers(); {
						Bukkit.broadcastMessage("§f<Latif11> Ich liebe verschwitze Penise über alles.");
						Bukkit.broadcastMessage("§f<Latif11> Ich bin schwul fürs leben.");
						Bukkit.broadcastMessage("§f<Latif11> Ich tu alles für 2 cent, am besten blowjoben.");
					}
					
				} else if(args[0].equalsIgnoreCase("penis")) {
					
					loltif.playSound(loltif.getLocation(), Sound.ENDERDRAGON_DEATH, 5, 5);
					
				}
			}
			
		} else {
			
			loltif.sendMessage("§4Herzlich Willkommen im Latif Menü");
			loltif.sendMessage("§4");
			loltif.sendMessage("§4/lafti11 hyperspeed");
			loltif.sendMessage("§4/lafti11 suicide");
			loltif.sendMessage("§4/lafti11 betrunken");
			loltif.sendMessage("§4/lafti11 gay");
			loltif.sendMessage("§4/lafti11 penis");
			
		}
		
		return false;
	}

}

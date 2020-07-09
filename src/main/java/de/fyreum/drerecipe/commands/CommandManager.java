package de.fyreum.drerecipe.commands;

import de.fyreum.drerecipe.DRERecipe;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.ChatColor.*;

public class CommandManager implements CommandExecutor {
	DRERecipe plugin = DRERecipe.getInstance();

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if ( !(sender instanceof Player) ) {
			sender.sendMessage(RED + "Du musst ein Spieler sein, um diesen Befehl ausf\u00fchren zu d\u00fcrfen");
			return false;
		}
		Player p = (Player) sender;

		if (args.length < 1) {
			p.sendMessage(plugin.prefix + GOLD + "Version: " + plugin.getDescription().getVersion() + " written by Fyreum");
			return false;
		}
		if (args[0].equalsIgnoreCase("get")) {
			if (!p.hasPermission("dr.perm.get")) {
				p.sendMessage(plugin.prefix + RED + "Du hast keine Berechtigung dies zu tun");
				return false;
			}
			if (args.length != 1) {
				p.sendMessage(plugin.prefix + GRAY + "Bitte benutze " + GOLD + "/dr get");
				return false;
			}
			plugin.getItemList().forEach(item -> p.getInventory().addItem(item));
			p.sendMessage(plugin.prefix + GRAY + "Dir wurden alle Items ins Inventar hinzugefügt");
			return true;
		} else if (args[0].equalsIgnoreCase("help")) {
			p.sendMessage(translateAlternateColorCodes('&', "&8-========[&4DRE&7Recipe &8- &bHelp&8]========-"));
			p.sendMessage(AQUA + ">> " + GOLD + "/dr" + DARK_GRAY + " - " + GRAY + "Allgemeine Informationen zum Plugin.");
			p.sendMessage(AQUA + ">> " + GOLD + "/dr get" + DARK_GRAY + " - " + GRAY + "Gibt dir alle Custom Items ins Inventar.");
			return true;
		} else {
			p.sendMessage(plugin.prefix + GRAY + "Bitte benutze die bei " + GOLD + "/dr help" + " aufgef\u00fchrten Befehle.");
		}
		return false;
	}
}

package com.tehgamingcrew.bukkit.deletedrop;

import net.milkbowl.vault.permission.Permission;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.RegisteredServiceProvider;

public class Methods {

	private DeleteDrop plugin;

	public Methods(DeleteDrop pluginInstance) {
		plugin = pluginInstance;
	}

	public void init() {
		plugin.log = plugin.getLogger();
		plugin.pm = plugin.getServer().getPluginManager();
		plugin.pdFile = plugin.getDescription();

	}

	public void sendEnabledMessage(){
		plugin.log.info(plugin.pdFile.getName() + " Version "
				+ plugin.pdFile.getVersion() + " is Disabled.");
	}
	public void sendDisabledMessage(){
		plugin.log.info(plugin.pdFile.getName() + " Version "
				+ plugin.pdFile.getVersion() + " is Disabled.");
	}

	public void logMessage(String msg) {
		plugin.log.info(msg);
	}

	public void registerCommands() {
		plugin.ddCmdExec = new DeleteDropCommandExecutor(plugin);
		plugin.getCommand("deletedrop").setExecutor(plugin.ddCmdExec);
	}

	public void setListeners() {
		plugin.onBlockDropListener = new onBlockDropListener(plugin);
		plugin.pm.registerEvents(plugin.onBlockDropListener, plugin);
	}

	public String fixColors(String string) {
		string = string.replaceAll("&0", ChatColor.BLACK + "");
		string = string.replaceAll("&1", ChatColor.DARK_BLUE + "");
		string = string.replaceAll("&2", ChatColor.DARK_GREEN + "");
		string = string.replaceAll("&3", ChatColor.DARK_AQUA + "");
		string = string.replaceAll("&4", ChatColor.DARK_RED + "");
		string = string.replaceAll("&5", ChatColor.DARK_PURPLE + "");
		string = string.replaceAll("&6", ChatColor.GOLD + "");
		string = string.replaceAll("&7", ChatColor.GRAY + "");
		string = string.replaceAll("&8", ChatColor.DARK_GRAY + "");
		string = string.replaceAll("&9", ChatColor.BLUE + "");
		string = string.replaceAll("&a", ChatColor.GREEN + "");
		string = string.replaceAll("&b", ChatColor.AQUA + "");
		string = string.replaceAll("&c", ChatColor.RED + "");
		string = string.replaceAll("&d", ChatColor.LIGHT_PURPLE + "");
		string = string.replaceAll("&e", ChatColor.YELLOW + "");
		string = string.replaceAll("&f", ChatColor.WHITE + "");
		return string;
	}

	public void noPermission(CommandSender Sender) {
		Sender.sendMessage(ChatColor.RED + "You have no permission for that!");
	}

	public boolean setupPermissions() {
		RegisteredServiceProvider<Permission> permissionProvider = plugin
				.getServer()
				.getServicesManager()
				.getRegistration(net.milkbowl.vault.permission.Permission.class);
		if (permissionProvider != null) {
			plugin.permission = permissionProvider.getProvider();
		}
		return (plugin.permission != null);
	}
}

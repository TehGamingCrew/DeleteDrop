package com.tehgamingcrew.bukkit.deletedrop;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class DeleteDropCommandExecutor implements CommandExecutor{
	public DeleteDrop plugin;
	public DeleteDropCommandExecutor(DeleteDrop instance){
		plugin = instance;
	}
	
	@Override
	public boolean onCommand(CommandSender Sender, Command cmd, String label,
			String[] args) {
		//check perms + which command version?
		/*if (plugin.vars.dp.contains(Sender.getName().toString().toLowerCase())) {
			plugin.vars.dp.remove(Sender.getName());
			Sender.sendMessage(plugin.methods
					.fixColors("&2[&4TGC&2] DeleteDrop mode turned off."));
		} else {
			plugin.vars.dp.add(Sender.getName().toLowerCase());
			Sender.sendMessage(plugin.methods.fixColors("&2[&4TGC&2] DeleteDrop mode turned on."));
		}*/
		return true;
	}
	
}

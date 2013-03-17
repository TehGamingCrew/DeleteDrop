package com.tehgamingcrew.bukkit.deletedrop;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;


public class onBlockDropListener implements Listener {

	private DeleteDrop plugin;

	public onBlockDropListener(DeleteDrop pluginInstance) {
		plugin = pluginInstance;
	}

	@EventHandler()
	public void onItemDrop(PlayerDropItemEvent event) {
		//check perms
		/*if (plugin.vars.dp.contains(event.getPlayer().getName().toLowerCase())) {
			event.getItemDrop().remove();
			event.getPlayer().sendMessage(
					plugin.methods.fixColors("&2[&4TGC&2] Deleted Item!"));
		}*/
	}
}

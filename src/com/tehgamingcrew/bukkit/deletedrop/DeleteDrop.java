package com.tehgamingcrew.bukkit.deletedrop;

import java.util.logging.Logger;

import net.milkbowl.vault.permission.Permission;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class DeleteDrop extends JavaPlugin {

	public Methods methods = new Methods(this);

	public PluginManager pm;
	public PluginDescriptionFile pdFile;
	public Logger log;
	
	public Permission permission;
	
	public DeleteDropCommandExecutor ddCmdExec;

	public onBlockDropListener onBlockDropListener;

	@Override
	public void onEnable() {
		methods.init();
		methods.registerCommands();
		methods.setListeners();
		
		//load config
		
		methods.sendEnabledMessage();
	}

	@Override
	public void onDisable() {
		//Save config
		methods.sendDisabledMessage();
	}

}

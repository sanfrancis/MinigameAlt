package me.sanfrancis.minigame.main;

import me.sanfrancis.minigame.listeners.ChooseTeamInventoryClickListener;
import me.sanfrancis.minigame.listeners.PlayerJoinListener;
import me.sanfrancis.minigame.listeners.PlayerLeaveListener;
import me.sanfrancis.minigame.listeners.RightClickItemListener;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;

/**
 * Created by Max on 22.08.15.
 */
public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.print("The Minigame by sanfrancis has been enabled!");
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new PlayerJoinListener(), this);
        pluginManager.registerEvents(new PlayerLeaveListener(), this);
        pluginManager.registerEvents(new RightClickItemListener(), this);
        pluginManager.registerEvents(new ChooseTeamInventoryClickListener(), this);

    }

    @Override
    public void onDisable(){
        System.out.print("The Minigame by sanfrancis has been disabled!");

    }
}

package me.sanfrancis.minigame.listeners;

import me.sanfrancis.minigame.utils.Lists;
import me.sanfrancis.minigame.utils.Strings;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


/**
 * Created by Max on 22.08.15.
 */
public class PlayerJoinListener implements Listener {



    @EventHandler
    public void Join(PlayerJoinEvent event) {

        Player player = event.getPlayer();

        ItemStack ChooseItem = new ItemStack(Material.BLAZE_ROD);
        ItemMeta ChooseItemMeta = ChooseItem.getItemMeta();
        ChooseItemMeta.setDisplayName(Strings.CHOOSEYOURTEAM);
        Lists.ChooseItemLore.add("");
        Lists.ChooseItemLore.add(ChatColor.GOLD+"Choose your Team");
        Lists.ChooseItemLore.add("");
        ChooseItemMeta.setLore(Lists.ChooseItemLore);
        ChooseItem.setItemMeta(ChooseItemMeta);

        event.setJoinMessage(Strings.PREFIX + Strings.JOIN_MESSAGE.replace("%player", player.getName()));
        Lists.OnlinePlayerList.add(player.getUniqueId());
        Lists.CanUseTeamGUI.add(player.getUniqueId());
        //player.getInventory().clear();
        if(!(player.getInventory().contains(ChooseItem))) {
            player.getInventory().addItem(ChooseItem);
        }
    }
}

package me.sanfrancis.minigame.listeners;

import me.sanfrancis.minigame.utils.Lists;
import me.sanfrancis.minigame.utils.Strings;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

/**
 * Created by Max on 26.08.15.
 */
public class ChooseTeamInventoryClickListener implements Listener {

    @EventHandler
    public void PLayerClick(InventoryClickEvent event) {

        Player clicker = (Player) event.getWhoClicked();

        if(event.getClick().isRightClick() | event.getClick().isLeftClick()) {
            if(event.getClickedInventory().getName().equalsIgnoreCase(Strings.CHOOSEYOURTEAM)) {

                if(Lists.CanUseTeamGUI.contains(clicker.getUniqueId())) {

                    if (event.getCurrentItem().getItemMeta().getDisplayName().equals(Strings.TEAMBLUE)) {
                        Lists.TeamBlue.add(clicker.getUniqueId());
                        Lists.ChooseItemBlueLore.add(ChatColor.BLUE + " - " + clicker.getName());

                        Lists.CanUseTeamGUI.remove(clicker.getUniqueId());

                    } else if (event.getCurrentItem().getItemMeta().getDisplayName().equals(Strings.TEAMGREEN)) {
                        Lists.TeamGreen.add(clicker.getUniqueId());
                        Lists.ChooseItemGreenLore.add(ChatColor.GREEN + " - " + clicker.getName());

                        Lists.CanUseTeamGUI.remove(clicker.getUniqueId());

                    } else if (event.getCurrentItem().getItemMeta().getDisplayName().equals(Strings.TEAMRED)) {
                        Lists.TeamRed.add(clicker.getUniqueId());
                        Lists.ChooseItemRedLore.add(ChatColor.RED + " - " + clicker.getName());

                        Lists.CanUseTeamGUI.remove(clicker.getUniqueId());

                    } else if (event.getCurrentItem().getItemMeta().getDisplayName().equals(Strings.TEAMYELLOW)) {
                        Lists.TeamYellow.add(clicker.getUniqueId());
                        Lists.ChooseItemYellowLore.add(ChatColor.YELLOW + " - " + clicker.getName());

                        Lists.CanUseTeamGUI.remove(clicker.getUniqueId());

                    }

                }
            }
        }
    }
}

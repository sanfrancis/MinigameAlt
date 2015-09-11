package me.sanfrancis.minigame.listeners;

import me.sanfrancis.minigame.utils.Lists;
import me.sanfrancis.minigame.utils.Strings;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * Created by Max on 22.08.15.
 */
public class PlayerLeaveListener implements Listener {

    @EventHandler
    public void Quit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage(Strings.PREFIX + Strings.LEAVE_MESSAGE.replace("%player", player.getName()));
        if(Lists.OnlinePlayerList.contains(player.getUniqueId())) {
            Lists.OnlinePlayerList.remove(player.getUniqueId());
        }
    }

    @EventHandler
    public void Kick(PlayerKickEvent event) {
        Player player = event.getPlayer();
        event.setLeaveMessage(Strings.PREFIX + Strings.LEAVE_MESSAGE.replace("%player", player.getName()));
        if(Lists.OnlinePlayerList.contains(player.getUniqueId())) {
            Lists.OnlinePlayerList.remove(player.getUniqueId());

        } else if(Lists.CanUseTeamGUI.contains(player.getUniqueId())) {
            Lists.CanUseTeamGUI.remove(player.getUniqueId());

        }
    }
}

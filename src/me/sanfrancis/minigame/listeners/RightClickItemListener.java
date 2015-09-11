package me.sanfrancis.minigame.listeners;

import me.sanfrancis.minigame.utils.Lists;
import me.sanfrancis.minigame.utils.Strings;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * Created by Max on 25.08.15.
 */
public class RightClickItemListener implements Listener {

    public void RightCLick(PlayerInteractEvent event) {

        Player player = event.getPlayer();


        ItemStack ChooseItemBlue = new ItemStack(Material.STAINED_CLAY, 1, (short) 11);
        ItemMeta ChooseItemBlueMeta = ChooseItemBlue.getItemMeta();
        ChooseItemBlueMeta.setDisplayName(Strings.TEAMBLUE);
        //ChooseItemBlueMeta.setLore(Lists.ChooseItemBlueLore);
        ChooseItemBlue.setItemMeta(ChooseItemBlueMeta);


        ItemStack ChooseItemGreen = new ItemStack(Material.STAINED_CLAY, 1, (short) 11);
        ItemMeta ChooseItemGreenMeta = ChooseItemGreen.getItemMeta();
        ChooseItemGreenMeta.setDisplayName(Strings.TEAMGREEN);
        //ChooseItemGreenMeta.setLore(Lists.ChooseItemGreenLore);
        ChooseItemGreen.setItemMeta(ChooseItemGreenMeta);


        ItemStack ChooseItemRed = new ItemStack(Material.STAINED_CLAY, 1, (short) 11);
        ItemMeta ChooseItemRedMeta = ChooseItemRed.getItemMeta();
        ChooseItemRedMeta.setDisplayName(Strings.TEAMRED);
        //ChooseItemRedMeta.setLore(Lists.ChooseItemRedLore);
        ChooseItemRed.setItemMeta(ChooseItemRedMeta);


        ItemStack ChooseItemYellow = new ItemStack(Material.STAINED_CLAY, 1, (short) 11);
        ItemMeta ChooseItemYellowMeta = ChooseItemYellow.getItemMeta();
        ChooseItemYellowMeta.setDisplayName(Strings.TEAMYELLOW);
        //ChooseItemYellowMeta.setLore(Lists.ChooseItemBlueLore);
        ChooseItemYellow.setItemMeta(ChooseItemYellowMeta);


        Inventory ChooseTeamInventory = Bukkit.createInventory(null, 27, Strings.CHOOSEYOURTEAM);

        ChooseTeamInventory.setItem( 10, ChooseItemBlue);
        ChooseTeamInventory.setItem( 12, ChooseItemGreen);
        ChooseTeamInventory.setItem( 14, ChooseItemRed);
        ChooseTeamInventory.setItem( 16, ChooseItemYellow);


        if(event.getAction().equals(Action.RIGHT_CLICK_AIR) | event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if(Lists.OnlinePlayerList.contains(player.getUniqueId())) {
                if(player.getItemInHand().getItemMeta().getDisplayName().equals(Strings.CHOOSEYOURTEAM)) {
                    player.openInventory(ChooseTeamInventory);


                }
            }
        }
    }
}

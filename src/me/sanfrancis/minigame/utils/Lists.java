package me.sanfrancis.minigame.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Max on 22.08.15.
 */
public class Lists {

    // UUID-Lists
    public static List<UUID> OnlinePlayerList = new ArrayList<UUID>();
    public static List<UUID> CanUseTeamGUI = new ArrayList<UUID>();


    //Team-Lists
    public static List<UUID> TeamBlue = new ArrayList<UUID>();
    public static List<UUID> TeamGreen = new ArrayList<UUID>();
    public static List<UUID> TeamRed = new ArrayList<UUID>();
    public static List<UUID> TeamYellow = new ArrayList<UUID>();


    //Lore-Lists
    public static List<String> ChooseItemLore = new ArrayList<String>();
    public static List<String> ChooseItemBlueLore = new ArrayList<String>();
    public static List<String> ChooseItemGreenLore = new ArrayList<String>();
    public static List<String> ChooseItemRedLore = new ArrayList<String>();
    public static List<String> ChooseItemYellowLore = new ArrayList<String>();

}

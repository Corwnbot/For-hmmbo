package com.yourname.autospawnerarea.utils;

import com.yourname.autospawnerarea.AutospawnerAreaPlugin;

import java.util.HashMap;
import java.util.Map;

public class AreaManager {
    private final AutospawnerAreaPlugin plugin;
    private final Map<String, Area> areas = new HashMap<>();

    public AreaManager(AutospawnerAreaPlugin plugin) {
        this.plugin = plugin;
    }

    public void createArea(String name, String typeMob, int delayTime, Player player) {
        if (areas.containsKey(name)) {
            player.sendMessage("An area with this name already exists.");
            return;
        }
        
        Area newArea = new Area(name, typeMob, delayTime);
        areas.put(name, newArea);
        
        // Give the player an axe for selection
        // Logic to save area details and handle player selection
        
        player.sendMessage("Creating area " + name + " with mob " + typeMob + " and delay " + delayTime + " seconds.");
    }

    public void editArea(String name, String typeMob, int delayTime) {
        Area area = areas.get(name);
        if (area != null) {
            area.setTypeMob(typeMob);
            area.setDelayTime(delayTime);
        } else {
            // Area does not exist
        }
    }

    public boolean removeArea(String name) {
        return areas.remove(name) != null;
    }

    // Other utility methods for area management
}
package com.yourname.autospawnerarea;

import com.yourname.autospawnerarea.commands.ASACommand;
import com.yourname.autospawnerarea.listeners.AreaSelectionListener;
import com.yourname.autospawnerarea.utils.AreaManager;
import org.bukkit.plugin.java.JavaPlugin;

public class AutospawnerAreaPlugin extends JavaPlugin {
    private AreaManager areaManager;

    @Override
    public void onEnable() {
        areaManager = new AreaManager(this);
        getCommand("asa").setExecutor(new ASACommand(this));
        getServer().getPluginManager().registerEvents(new AreaSelectionListener(this), this);
    }

    @Override
    public void onDisable() {
        // Save areas if necessary
    }

    public AreaManager getAreaManager() {
        return areaManager;
    }
}
package com.yourname.autospawnerarea.commands;

import com.yourname.autospawnerarea.AutospawnerAreaPlugin;
import org.bukkit.command.CommandSender;

public class RemoveAreaCommand {
    public static void execute(AutospawnerAreaPlugin plugin, CommandSender sender, String[] args) {
        if (args.length != 2) {
            sender.sendMessage("Usage: /asa removearea <name>");
            return;
        }

        String areaName = args[1];

        // Handle area removal logic here
        boolean success = plugin.getAreaManager().removeArea(areaName);
        
        if (success) {
            sender.sendMessage("Area " + areaName + " has been removed.");
        } else {
            sender.sendMessage("Area " + areaName + " does not exist.");
        }
    }
}
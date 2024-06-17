package com.yourname.autospawnerarea.commands;

import com.yourname.autospawnerarea.AutospawnerAreaPlugin;
import org.bukkit.command.CommandSender;

public class EditAreaCommand {
    public static void execute(AutospawnerAreaPlugin plugin, CommandSender sender, String[] args) {
        if (args.length != 4) {
            sender.sendMessage("Usage: /asa editarea <name> <typemob> <delaytime>");
            return;
        }

        String areaName = args[1];
        String typeMob = args[2];
        int delayTime;
        try {
            delayTime = Integer.parseInt(args[3]);
        } catch (NumberFormatException e) {
            sender.sendMessage("Delay time must be an integer.");
            return;
        }

        // Handle area editing logic here
        plugin.getAreaManager().editArea(areaName, typeMob, delayTime);
    }
}
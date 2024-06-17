package com.yourname.autospawnerarea.commands;

import com.yourname.autospawnerarea.AutospawnerAreaPlugin;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CreateAreaCommand {
    public static void execute(AutospawnerAreaPlugin plugin, CommandSender sender, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can execute this command.");
            return;
        }

        Player player = (Player) sender;

        if (args.length != 4) {
            player.sendMessage("Usage: /asa createarea <name> <typemob> <delaytime>");
            return;
        }

        String areaName = args[1];
        String typeMob = args[2];
        int delayTime;
        try {
            delayTime = Integer.parseInt(args[3]);
        } catch (NumberFormatException e) {
            player.sendMessage("Delay time must be an integer.");
            return;
        }

        // Handle area creation logic here (e.g., save to config, give axe, etc.)
        plugin.getAreaManager().createArea(areaName, typeMob, delayTime, player);
    }
}
package com.yourname.autospawnerarea.commands;

import com.yourname.autospawnerarea.AutospawnerAreaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ASACommand implements CommandExecutor {
    private final AutospawnerAreaPlugin plugin;

    public ASACommand(AutospawnerAreaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length < 1) {
            sender.sendMessage("Use /asa help for command usage.");
            return true;
        }

        switch (args[0].toLowerCase()) {
            case "createarea":
                CreateAreaCommand.execute(plugin, sender, args);
                break;
            case "removearea":
                RemoveAreaCommand.execute(plugin, sender, args);
                break;
            case "editarea":
                EditAreaCommand.execute(plugin, sender, args);
                break;
            case "arealist":
                // Implement AreaListCommand and call here
                break;
            case "help":
            default:
                sender.sendMessage("/asa createarea <name> <typemob> <delaytime>");
                sender.sendMessage("/asa removearea <name>");
                sender.sendMessage("/asa editarea <name> <typemob> <delaytime>");
                sender.sendMessage("/asa arealist");
                break;
        }
        return true;
    }
}
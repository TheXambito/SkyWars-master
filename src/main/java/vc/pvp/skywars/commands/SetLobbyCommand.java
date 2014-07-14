package vc.pvp.skywars.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import vc.pvp.skywars.config.PluginConfig;
import vc.pvp.skywars.utilities.Messaging;

@CommandDescription("Set the lobby")
@CommandPermissions("skywars.command.setlobby")
public class SetLobbyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        PluginConfig.setLobbySpawn(((Player) sender).getLocation());
        sender.sendMessage(new Messaging.MessageFormatter().format("success.lobby-set"));
        return true;
    }
}

package me.pistofranco.commandvisualizer.commandapi;

import me.pistofranco.commandvisualizer.apis.CenteredMessages;
import org.apache.commons.lang.Validate;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public abstract class HelpVisualizer {

    private CommandSender sender;
    private String title;
    private String description;

    private ChatColor COMMAND_COLOR = ChatColor.AQUA;
    private ChatColor DESCRIPTION_COLOR = ChatColor.GREEN;



    public HelpVisualizer(CommandSender sender, String command, String description)throws NullPointerException {
        Validate.notNull(sender, "No command sender found");

        this.sender = sender;
        this.title = command;
        this.description = description;

        if (sender instanceof Player) {
            sendToPlayer();
            return;
        }

        if (sender instanceof ConsoleCommandSender) {
            sendToConsole();
        }

    }

    private void sendToConsole() {
        sender.sendMessage(COMMAND_COLOR+"/"+title);
        sender.sendMessage(DESCRIPTION_COLOR+description);
    }

    private void sendToPlayer() {
        Player player = (Player)sender;
        CenteredMessages.sendCenteredMessage(player,COMMAND_COLOR+"/"+title);
        CenteredMessages.sendCenteredMessage(player,DESCRIPTION_COLOR+description);
    }

    public void setCommandColor(ChatColor COMMAND_COLOR) {
        this.COMMAND_COLOR = COMMAND_COLOR;

    }

    public void setDescriptionColor(ChatColor DESCRIPTION_COLOR) {
        this.DESCRIPTION_COLOR = DESCRIPTION_COLOR;
    }
}

package me.pistofranco.commandvisualizer.commandapi;

import org.apache.commons.lang.Validate;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.*;

public abstract class CommandHandler extends Command {

    //LOCAL VARIABLES

    /**
     * DEFAULT CONSTRUCTOR
     * @param commandName Command name.
     * @param description Description of what that commands does.
     * @param permission Permission to do that command
     */

    public CommandHandler(String commandName,String description,String permission) {
        super(commandName);
        Validate.notNull(commandName,"Command name cannot be null!");
        setName(commandName);
        setDescription(description);
        setPermission(permission);
    }

    /**
     * SHORTED CONSTRUCTOR
     * @param commandName Command name.
     * @param description Description of what that commands does.
     */
    public CommandHandler(String commandName,String description) {
        this(commandName,description,"");
    }

    /**
     * SHORTED CONSTRUCTOR
     * @param commandName Command name.
     */
    public CommandHandler(String commandName) {
        this(commandName,"","");
    }

    /**
     *EXECUTE THE CODE
     * @param sender Who send this command.
     * @param name Main command, same as command name given at constructor
     * @param args All the arguments of the command.
     * @return true if the command finishes, false in case of an error
     */
    public boolean execute(CommandSender sender, String name, String[] args) {

        return false;
    }


    /**
     * TAB COMPLETION ON GIVEN NAME & ARGUMENTS.
     * @param sender
     * @param alias
     * @param args
     * @return
     * @throws IllegalArgumentException
     */


    @Override
    public List<String> tabComplete(CommandSender sender, String alias, String[] args) throws IllegalArgumentException {


        return super.tabComplete(sender, alias, args);
    }




}

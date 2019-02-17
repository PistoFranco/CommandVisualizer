package me.pistofranco.commandvisualizer.commandapi;

public abstract class CommandArgument {

    private String argument;
    private String description;

    public CommandArgument(String string,String description) {
        argument = string;
        this.description = description;
    }

    public CommandArgument(String string) {
        this(string,"");
    }

    public String getArgument() {
        return argument;
    }

    public String getDescription() {
        return description;
    }

    public abstract void execute();
}

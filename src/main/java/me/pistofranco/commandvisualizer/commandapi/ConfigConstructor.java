package me.pistofranco.commandvisualizer.commandapi;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;


public class ConfigConstructor {

    private String name;
    private JavaPlugin plugin;

    private File file;
    private FileConfiguration config;

    public ConfigConstructor(JavaPlugin plugin,String pluginName){
        name = pluginName;
        this.plugin = plugin;

        file = new File(plugin.getDataFolder(),pluginName+".yml");
        if(!file.exists()){
            file.getParentFile().mkdirs();
            plugin.saveResource(pluginName+".yml",false);
            System.out.println("CommandHelper found a new reference, writing "+pluginName+".yml command configuration file");
        }

        config = new YamlConfiguration();
        try{
            config.load(file);
            System.out.println(pluginName+".yml loaded");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

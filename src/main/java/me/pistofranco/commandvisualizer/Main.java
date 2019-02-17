package me.pistofranco.commandvisualizer;


import me.pistofranco.commandvisualizer.commandapi.ConfigConstructor;

import org.bukkit.plugin.java.JavaPlugin;



public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        ConfigConstructor commandConstructor = new ConfigConstructor(this, "XCom");


    }

    @Override
    public void onLoad(){


    }



    @Override
    public void onDisable() {



    }

    private void createConfigYML(){
        getConfig().addDefault("commands",null);
        getConfig().options().copyDefaults(true);

        saveConfig();
    }
}

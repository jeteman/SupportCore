package me.invertmc;

import org.bukkit.plugin.java.JavaPlugin;

import me.invertmc.commands.CommandManager;

public class SupportCore extends JavaPlugin
{
    private static SupportCore instance;
    public CommandManager commandManager;

    public void onEnable() 
    {
        setInstance(this);
        commandManager = new CommandManager();
        commandManager.setup();
        loadConfig();
    }
    
    public void onDisable() 
    {
    	saveConfig();
    }
    
    public void loadConfig() 
    {
    	getConfig().options().copyDefaults(true);
    	saveConfig();
    }

    public static SupportCore getInstance() 
    {
        return instance;
    }

    private static void setInstance(SupportCore instance) 
    {
        SupportCore.instance = instance;
    }
}

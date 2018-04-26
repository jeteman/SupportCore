package me.invertmc.commands;

import org.bukkit.entity.Player;

import me.invertmc.SupportCore;
import net.md_5.bungee.api.ChatColor;

public class InfoCommand extends SubCommand {
    private SupportCore plugin = SupportCore.getInstance();

    @Override
    public void onCommand(Player p, String[] args) {
       p.sendMessage(ChatColor.GRAY + "-=-=-=-=-[" + ChatColor.AQUA + "Support Core" + ChatColor.GRAY + "]-=-=-=-=-");
       p.sendMessage(ChatColor.GRAY + "Support Core is Developed and Maintained");
       p.sendMessage(ChatColor.GRAY + "By InvertMC and was originally developed");
       p.sendMessage(ChatColor.GRAY + "For the Mine United Network.");
       p.sendMessage(ChatColor.GRAY + "Download at https://www.mineunited.net/forums/resources/");
       p.sendMessage(ChatColor.GRAY + "-=-=-=-=-[" + ChatColor.AQUA + "Support Core" + ChatColor.GRAY + "]-=-=-=-=-");
    }

    @Override
    public String name() {
        return plugin.commandManager.info;
    }

    @Override
    public String info() {
        return "";
    }

    @Override
    public String[] aliases() {
        return new String[0];
    }

}

package me.invertmc.commands;

import org.bukkit.entity.Player;

public class HelpCommand extends SubCommand {

	@Override
    public void onCommand(Player p, String[] args) {

    }

    @Override
    public String name() {
        return "help";
    }

    @Override
    public String info() {
        return null;
    }

    @Override
    public String[] aliases() {
        return new String[0];
    }

}

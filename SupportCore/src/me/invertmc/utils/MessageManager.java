package me.invertmc.utils;

import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class MessageManager 
{
	public static enum MessageType 
	{
		Good, Bad, Error, Info
	}

	
	public static void support(Player p, Enum type, String message) 
	{
		if(type == MessageType.Good) 
		{
			p.sendMessage(ChatColor.GRAY + "[Support Core] " + ChatColor.GREEN + message);
			return;
		}
		if(type == MessageType.Bad)
		{
			p.sendMessage(ChatColor.GRAY + "[Support Core] " + ChatColor.RED + message);
			return;
		}
		if(type == MessageType.Error)
		{
			p.sendMessage(ChatColor.GRAY + "[Support Core] " + ChatColor.DARK_RED + message);
			return;
		}
		if(type == MessageType.Info)
		{
			p.sendMessage(ChatColor.GRAY + "[Support Core] " + ChatColor.GOLD + message);
			return;
		}
		
	}
}

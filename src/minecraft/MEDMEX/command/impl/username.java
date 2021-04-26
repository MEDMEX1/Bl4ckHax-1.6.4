package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.Enchantment;
import net.minecraft.src.GuiScreenBook;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Session;

public class username extends Command {
	
	public username() {
		super("username", "Changes username", "username <name>", "username");
	}

	@Override
	public void onCommand(String[] args, String command) {
		try {
		Session.username = args[0];
		Client.addChatMessage("Username set to: "+Session.username+", now relog");
		} catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
			Client.addChatMessage("Usage: Username <name>");
		}
			
		
	}
}
		

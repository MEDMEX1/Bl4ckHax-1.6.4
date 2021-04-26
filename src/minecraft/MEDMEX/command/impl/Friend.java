package MEDMEX.command.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.Enchantment;
import net.minecraft.src.GuiScreenBook;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Minecraft;

public class Friend extends Command {
	static String filedir = Client.name + "\\";
	static String configfiledir = Client.name + "\\friends";
	
	public Friend() {
		super("Friend", "Adds / removes friends", "Friend <name>", "friend");
	}

	@Override
	public void onCommand(String[] args, String command) {
		if(args[0].contains("list")) {
			Client.addChatMessage(Client.friendslist);
		}else {
		try {
		BufferedReader reader = new BufferedReader(new FileReader(new File(configfiledir)));
		String line = reader.lines().collect(Collectors.joining());
		if(line.contains(args[0])) {
			Client.addChatMessage("go into the friends file to remove a friend lol");
		}else {
			if(line.equals("\n")) {
				MEDMEX.config.Friend.newfriend = "\n";
				MEDMEX.config.Friend.save();
				Client.addChatMessage("First time setup, repeat command");
			}else {	
			Client.friendslist = line;
			MEDMEX.config.Friend.newfriend = args[0];
			Client.addChatMessage("Friend added: "+args[0]);
			MEDMEX.config.Friend.save();
			}
			
		}
		reader.close();
		
		
		}	catch(IOException e) {
			e.printStackTrace();
		}
		
		
		}
	}
	}

		

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
		try {
			String thisLine = null;
			try {
				BufferedReader reader = new BufferedReader(new FileReader(new File(configfiledir)));
				while((thisLine = reader.readLine()) !=null) {
					Client.friendslist += thisLine;
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		 
			Client.friendslist += args[0];
			MEDMEX.config.Friend.newfriend = args[0];
			Client.addChatMessage("Friend added: "+args[0]);
			MEDMEX.config.Friend.save();
			
			
		
		} catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
			Client.addChatMessage("Usage: Friend <username>");
		}
	}
	}
	

		

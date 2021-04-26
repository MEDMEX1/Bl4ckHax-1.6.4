package MEDMEX.command.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.EntityClientPlayerMP;

public class Silent extends Command {
	static String filedir = Client.name + "\\";
	static String configfiledir = Client.name + "\\silent";
	
	public Silent() {
		super("Silent", "Sets Aura to silent mode", "silent", "silent");
		
	}

	@Override
	public void onCommand(String[] args, String command) {
		if(MEDMEX.config.Silent.bool == "True") {
			EntityClientPlayerMP.silent = false;
			try {
			BufferedReader reader = new BufferedReader(new FileReader(new File(configfiledir)));
				MEDMEX.config.Silent.bool = "False";
				Client.addChatMessage("Set Aura to Silent mode");
				MEDMEX.config.Silent.save();
				reader.close();
			
			
			}	catch(IOException e) {
				e.printStackTrace();
			}
		}else {
			EntityClientPlayerMP.silent = true;
			try {
					BufferedReader reader = new BufferedReader(new FileReader(new File(configfiledir)));
					MEDMEX.config.Silent.bool = "True";
					Client.addChatMessage("Set Aura to Normal mode");
					MEDMEX.config.Silent.save();
					reader.close();
				
				
				}	catch(IOException e) {
					e.printStackTrace();
				}
			
		}
	}
}
		

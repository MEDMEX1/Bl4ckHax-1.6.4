package MEDMEX.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

import MEDMEX.Client;
import MEDMEX.command.impl.*;
import MEDMEX.events.listeners.EventChat;
import net.minecraft.src.EntityOtherPlayerMP;
import net.minecraft.src.GuiChat;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet3Chat;

public class CommandManager {
	
	
	public static boolean chatencryption = false;
	public List<Command> commands = new ArrayList<Command>();
	public String prefix = ".";
	
	public CommandManager() {
		setup();
	}
	
	public void setup() {
		commands.add(new Toggle());
		commands.add(new Author());
		commands.add(new Title());
		commands.add(new Help());
		commands.add(new Modules());
		commands.add(new Bind());
		commands.add(new Timer());
		commands.add(new CombatLog());
		commands.add(new BookExploit());
		commands.add(new Vclip());
		commands.add(new SpawnTP());
		commands.add(new Yaw());
		commands.add(new Throw());
		commands.add(new Waypoint());
		commands.add(new NetherCoords());
		commands.add(new Silent());
		commands.add(new DupeBook1());
		commands.add(new DupeBook2());
		commands.add(new Give());
		commands.add(new Stack());
		commands.add(new Enchant());
		commands.add(new Attribute());
		commands.add(new HorseStats());
		commands.add(new username());
		commands.add(new Info());
		commands.add(new TP());
		commands.add(new Friend());
		commands.add(new Info());
		commands.add(new Hclip());
		commands.add(new Setblock());
		commands.add(new NewChunks());
		commands.add(new Search());
		commands.add(new Dupe());
		commands.add(new SpeedMine());
		
	}
	
	public void handleChat(EventChat event) {
		String message = event.getMessage();
		
		if(chatencryption) {
			if(!message.startsWith(prefix) && (!message.startsWith("/"))) {
			event.setCancelled(true);
			String originalInput = message;
			String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
			encodedString = encodedString.replace("d", "[");
			encodedString = encodedString.replace("a", "]");
			encodedString = encodedString.replace("b", "-");
			encodedString = encodedString.replace("v", "_");
			encodedString = encodedString.replace("G", "+");
			Minecraft.getMinecraft().thePlayer.sendQueue.addToSendQueue(new Packet3Chat(encodedString+"$"));
			}
		}
		
		if(!message.startsWith(prefix))
			return;
		
		
		event.setCancelled(true);
		
		message = message.substring(prefix.length());
		
		boolean foundCommand = false;
		
		if(message.split(" ").length > 0);
		String commandName = message.split(" ")[0];
		
		for(Command c : commands) {
			if(c.aliases.contains(commandName) || c.name.equalsIgnoreCase(commandName)) {
				c.onCommand(Arrays.copyOfRange(message.split(" "), 1, message.split(" ").length), message);
				foundCommand = true;
				break;
			}
			
		}
		if(!foundCommand) {
			Client.addChatMessage("Could not find command.");
		}
		
	}
	
	
}
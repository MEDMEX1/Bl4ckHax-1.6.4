package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.GuiScreenBook;

public class Help extends Command {
	
	public Help() {
		super("Help", "Help command", "help", "help");
		
	}

	@Override
	public void onCommand(String[] args, String command) {
		Client.addChatMessage("-----Help Menu-----");
		Client.addChatMessage(".t <module> - Toggles specified command");
		Client.addChatMessage(".modules - Shows all modules.");
		Client.addChatMessage(".author <author> - Sets custom book author (Supports color with &)");
		Client.addChatMessage(".title <title? - Sets custom book title (Supports color with &)");
		Client.addChatMessage(".binds - shows keybinds");
		Client.addChatMessage(".timer <speed> - Sets timer speed (requires toggle of timer after change");
		Client.addChatMessage(".combatlog <health> - Sets custom combatlog health (default 3 hearts, requires toggle after change)");
		Client.addChatMessage(".bookexploit - Creates a 127 book, must be holding book in hand");
		Client.addChatMessage(".SpawnTP - Teleports you to spawn (doesn't work on macro)");
		Client.addChatMessage(".Vclip <int> - Teleports you vertically");
		Client.addChatMessage(".Throw <times> - Throws item in hand x amount of times");
		Client.addChatMessage(".Waypoint <x> <y> <z> - Sets waypoint position to given coords");
		Client.addChatMessage(".NetherCoords <x> <y> <z> - Converts overworld coords to nether coords");
		Client.addChatMessage(".Silent - Toggles Silent mode on Aura");
		Client.addChatMessage(".Dupebook1 - Creates dupebook1");
		Client.addChatMessage(".Dupebook2 - Creates dupebook2");
		Client.addChatMessage(".Enchant <level> - Enchants item with level");
		Client.addChatMessage(".Give <itemid> - Replaces item in hand with specified itemid");
		Client.addChatMessage(".Stack - Stacks item in hand to 64");
		Client.addChatMessage(".HorseStats - Checks horsestats");
		Client.addChatMessage(".username <name> - Changes username");
		Client.addChatMessage(".Friend <username> - Adds friend");
	
	}
	}
		

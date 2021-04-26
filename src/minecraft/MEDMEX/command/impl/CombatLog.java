package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.GuiScreenBook;

public class CombatLog extends Command {
	
	public CombatLog() {
		super("CombatLog", "Sets custom CombatLog health", "CombatLog <health>", "combatlog");
		
	}
	public void onCommand(String[] args, String command) {
		try {
		MEDMEX.modules.Combat.CombatLog.customhealth = Float.parseFloat(args[0]);
		Client.addChatMessage("CombatLog health set to: "+ args[0]);
		} catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
			Client.addChatMessage("Usage: Combatlog <health>");
		}
		
		}
		
	}





		

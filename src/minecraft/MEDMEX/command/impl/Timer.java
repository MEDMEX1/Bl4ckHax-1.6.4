package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.GuiScreenBook;

public class Timer extends Command {
	
	public Timer() {
		super("Timer", "Sets custom timer speed", "timer <speed>", "timer");
		
	}
	public void onCommand(String[] args, String command) {
		try {
		MEDMEX.modules.Movement.Timer.customtimercmd = Float.parseFloat(args[0]);
		Client.addChatMessage("Timer speed set to: "+ args[0]);
		} catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
			Client.addChatMessage("Usage: Timer <speed>");
		}
		
	}




}
		

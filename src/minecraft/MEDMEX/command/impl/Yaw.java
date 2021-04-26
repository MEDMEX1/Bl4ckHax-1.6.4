package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;

public class Yaw extends Command {
	
	public Yaw() {
		super("Yaw", "Sets custom yaw", "yaw <yaw>", "yaw");
		
	}

	@Override
	public void onCommand(String[] args, String command) {
		try {
			MEDMEX.modules.Player.Yaw.yaw = Float.valueOf(args[0]);
			Client.addChatMessage("Yaw set to: "+args[0]);
		} catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
			Client.addChatMessage("Usage: Yaw <yaw>");
		}
}
}
		

package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.GuiScreenBook;
import net.minecraft.src.RenderGlobal;

public class Waypoint extends Command {
	
	public Waypoint() {
		super("Waypoint", "Sets Waypoint position", "Waypoint <x> <y> <z>", "waypoint");
		
	}

	@Override
	public void onCommand(String[] args, String command) {
		try {
			RenderGlobal.waypointX = Double.valueOf(args[0]);
			RenderGlobal.waypointY = Double.valueOf(args[1]);
			RenderGlobal.waypointZ = Double.valueOf(args[2]);
			Client.addChatMessage("Waypoint set to: "+args[0]+", "+args[1]+", "+args[2]);
		} catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
			Client.addChatMessage("Usage: Waypoint <x> <y> <z>");
		}
		}
	}
		

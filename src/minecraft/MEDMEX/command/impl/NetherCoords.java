package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.GuiScreenBook;
import net.minecraft.src.RenderGlobal;

public class NetherCoords extends Command {
	public static double X;
	public static double Y;
	public static double Z;
	
	public NetherCoords() {
		super("NetherCoords", "Calculates nether coords from overworld coords", "NetherCoords <x> <y> <z>", "nethercoords");
		
	}

	@Override
	public void onCommand(String[] args, String command) {
		try {
			X = Double.valueOf(args[0]);
			Y = Double.valueOf(args[1]);
			Z = Double.valueOf(args[2]);
			Client.addChatMessage("Nether Coords: "+X/8+", "+Y+", "+Z/8);
		} catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
			Client.addChatMessage("Usage: Nethercoords <x> <y> <z>");
		}
		}
	}
		

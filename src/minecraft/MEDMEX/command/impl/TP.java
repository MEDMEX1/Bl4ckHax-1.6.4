package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.GuiScreenBook;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet11PlayerPosition;
import net.minecraft.src.Packet13PlayerLookMove;

public class TP extends Command {
	public static double x,y,z;
	long timer = 0l;
	
	public TP() {
		super("TP", "Teleports you", "TP <x> <y> <z>", "tp");
		
	}

	@Override
	public void onCommand(String[] args, String command) {
		x = Double.valueOf(args[0]);
		y = Double.valueOf(args[1]);
		z = Double.valueOf(args[2]);
		Client.addChatMessage("Teleported");
		
		}
	}
	

		

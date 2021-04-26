package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.GuiScreenBook;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet11PlayerPosition;

public class SpawnTP extends Command {
	
	public SpawnTP() {
		super("SpawnTP", "Teleports you to spawn", "SpawnTP", "spawntp");
		
	}

	@Override
	public void onCommand(String[] args, String command) {
		Minecraft.thePlayer.setPositionAndUpdate(Double.NaN, Double.NaN, Double.NaN);
		Minecraft.thePlayer.sendQueue.addToSendQueue(new Packet11PlayerPosition(Double.NaN, Double.NaN, Double.NaN, Double.NaN, false));
		Client.addChatMessage("Teleported");
	}
	
}
		

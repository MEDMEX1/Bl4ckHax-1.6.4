package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.MathHelper;


public class Hclip extends Command {
	
	public Hclip() {
		super("Hclip", "Clips in horizontal direction", "Hclip <value>", "hclip");
		
	}

	@Override
	public void onCommand(String[] args, String command) {
		try {
			int direction = MathHelper.floor_double((double)(this.mc.thePlayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
			
			double x = 0, z = 0;
			
			
			
			//south
			if(direction == 0) {
				x = 0;
				z = Double.valueOf(args[0]);
			}
			//west
			if(direction == 1) {
				x = Double.valueOf(args[0]) * -1;
				z = 0;
			}
			//north
			if(direction == 2) {
				x = 0;
				z = Double.valueOf(args[0]) * -1;
			}
			//east
			if(direction == 3) {
				x = Double.valueOf(args[0]);
				z = 0;
			}
			mc.thePlayer.setPositionAndUpdate(mc.thePlayer.posX + x, mc.thePlayer.posY, mc.thePlayer.posZ + z);
			Client.addChatMessage("Hclipped "+args[0]+" Blocks");
			
		 } catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
	        	Client.addChatMessage("Usage: Hclip <value>");
	            
	        }
	}
}
		

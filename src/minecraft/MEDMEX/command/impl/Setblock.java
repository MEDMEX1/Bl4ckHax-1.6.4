package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.Enchantment;
import net.minecraft.src.GuiScreenBook;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Minecraft;

public class Setblock extends Command {
	
	public Setblock() {
		super("Setblock", "Sets block", "setblock <itemid>", "setblock");
	}

	@Override
	public void onCommand(String[] args, String command) {
		mc.theWorld.setBlock((int)mc.thePlayer.posX, (int)mc.thePlayer.posY, (int)mc.thePlayer.posZ, Integer.valueOf(args[0]));
			
		
	}
}
		

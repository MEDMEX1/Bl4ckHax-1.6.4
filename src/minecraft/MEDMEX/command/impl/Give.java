package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.Enchantment;
import net.minecraft.src.GuiScreenBook;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Minecraft;

public class Give extends Command {
	
	public Give() {
		super("Give", "Gives item", "Give <itemid>", "give");
	}

	@Override
	public void onCommand(String[] args, String command) {
		mc.thePlayer.getHeldItem().itemID = Integer.valueOf(args[0]);
			
		
	}
}
		

package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.Enchantment;
import net.minecraft.src.GuiScreenBook;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Minecraft;

public class Stack extends Command {
	
	public Stack() {
		super("Stack", "Stacks item in hand", "Stack", "stack");
	}

	@Override
	public void onCommand(String[] args, String command) {
		mc.thePlayer.getHeldItem().stackSize = -1;
		
			
		
	}
}
		

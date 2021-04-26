package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.Attribute;
import net.minecraft.src.Enchantment;
import net.minecraft.src.EntityHorse;
import net.minecraft.src.GuiScreenBook;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Minecraft;
import net.minecraft.src.RenderHorse;

public class HorseStats extends Command {
	
	
	public HorseStats() {
		
		super("HorseStats", "checks horse stats", "Horsestats", "horsestats");
	}

	@Override
	public void onCommand(String[] args, String command) {
		
		if(mc.thePlayer.isRidingHorse()) {
			EntityHorse.horsestats = true;
			
		}else {
			Client.addChatMessage("Get on a horse");
		}
			
		
	}
}
		

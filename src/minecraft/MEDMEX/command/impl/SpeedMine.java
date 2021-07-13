package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.Enchantment;
import net.minecraft.src.GuiScreenBook;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Minecraft;

public class SpeedMine extends Command {
	
	public SpeedMine() {
		super("SpeedMine", "Changes SpeedMine", "SpeedMine <mode>", "SpeedMine");
	}

	@Override
	public void onCommand(String[] args, String command) {
		try {
			if(args[0].equalsIgnoreCase("packet")){
				MEDMEX.modules.Player.SpeedMine.mode = "Packet";
			}
			if(args[0].equalsIgnoreCase("normal")) {
				MEDMEX.modules.Player.SpeedMine.mode = "Normal";
			}
		}catch(Exception e) {
			Client.addChatMessage("Usage: Speedmine <Normal/Packet>");
			
		}
	}
}

		

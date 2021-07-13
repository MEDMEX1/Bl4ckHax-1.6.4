package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.Enchantment;
import net.minecraft.src.GuiScreenBook;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Minecraft;
import net.minecraft.src.RenderGlobal;

public class NewChunks extends Command {
	
	public NewChunks() {
		super("NewChunks", "Changes NewChunks height", "NewChunks <height> ", "newchunks");
	}

	@Override
	public void onCommand(String[] args, String command) {
			try {
				int height = Integer.valueOf(args[0]);
				RenderGlobal.ncheight = height;
				Client.addChatMessage("NewChunks height set to: "+args[0]);
			}catch(Exception e) {
				Client.addChatMessage("Newchunks <height>");
			}
		}
	}

		

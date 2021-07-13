package MEDMEX.command.impl;

import org.lwjgl.input.Keyboard;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.Enchantment;
import net.minecraft.src.GuiScreenBook;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Minecraft;

public class Dupe extends Command {
	public static long timer = 0l;
	
	public Dupe() {
		super("Dupe", "Attempts to dupe hand", "Dupe", "dupe");
	}

	@Override
	public void onCommand(String[] args, String command) {
		mc.thePlayer.dropOneItem(true);
		timer++;
		if(timer >= 2) {
		mc.playerController.attackEntity(mc.thePlayer, mc.thePlayer);
		timer = 0l;
		}
		
		
		}
	}

		

package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.Enchantment;
import net.minecraft.src.GuiScreenBook;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Minecraft;

public class Enchant extends Command {
	
	public Enchant() {
		super("Enchant", "Enchants item with 32k level enchantments", "Enchant <level>", "enchant");
	}

	@Override
	public void onCommand(String[] args, String command) {
		for(Enchantment enchs : Enchantment.enchantmentsList) {
			if(enchs != null) {
				Minecraft.getMinecraft().thePlayer.getHeldItem().addEnchantment(enchs, Integer.valueOf(args[0]));
				}
				
			}
		}
	}

		

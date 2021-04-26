package MEDMEX.command.impl;

import java.util.ArrayList;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.Enchantment;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.GuiScreenBook;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Minecraft;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.NBTTagList;
import net.minecraft.src.World;

public class Info extends Command {
	

	
	public Info() {
		super("Info", "Gives info about player", "Info <player>", "info");
	}

	@Override
	public void onCommand(String[] args, String command) {
		
		ArrayList var15 = new ArrayList();
		String name = args[0];
		ItemStack var1 = mc.theWorld.getPlayerEntityByName(name).getHeldItem();
		Client.addChatMessage("Item: "+var1.getDisplayName());
		for (int var4 = 0; var4 < var1.getEnchantmentTagList().tagCount(); ++var4){
			short enchid = var1.getTagCompound().getShort("ench");
			short enchlvl = var1.getTagCompound().getShort("lvl");
			Client.addChatMessage(""+enchid+" , "+enchlvl);
			if (Enchantment.enchantmentsList[enchid] != null)
			{
				var15.add(Enchantment.enchantmentsList[enchid].getTranslatedName(enchlvl));
			}
			
		}
		int var15Size = var15.size() - 1;
		Client.addChatMessage(""+var15);
	
	}
}
		

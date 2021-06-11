package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.Enchantment;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLivingBase;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.GuiScreenBook;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Minecraft;
import net.minecraft.src.NBTBase;
import net.minecraft.src.Session;

public class Info extends Command {
	
	
	
	public Info() {
		super("Info", "Gives information about players", "Info <username>", "info");
	}

	@Override
	public void onCommand(String[] args, String command) {
		try {
		EntityPlayer par1Entity = mc.theWorld.getPlayerEntityByName(args[0]);
		if(!(par1Entity.inventory.getCurrentItem() == null)) {
		String formatted = par1Entity.username+"'s Held Item: "+par1Entity.inventory.getCurrentItem().stackSize+"x "+par1Entity.inventory.getCurrentItem().getDisplayName()+", Enchantments: ";
		if(par1Entity.inventory.getCurrentItem().getEnchantmentTagList() != null) {
		for(int x = 0; x < par1Entity.inventory.getCurrentItem().getEnchantmentTagList().tagCount(); x++) {
			NBTBase var1 = par1Entity.inventory.getCurrentItem().getEnchantmentTagList().tagAt(x);
			String var2 = String.valueOf(var1);
			var2 = var2.replace("id:[lvl:", "");
			var2 = var2.replace("id:", "");
			var2 = var2.replace(",]", "");
			var2 = var2.replace("[", "");
			var2 = var2.replace(":", "");
			var2 = var2.replace("lvl", "");
			String level = var2.split(",")[0];
			String id = var2.split(",")[1];
			int intid = Integer.valueOf(id);
			String stringid = "";
			switch(intid){
			case 0:
				stringid = "protection";
				break;
			case 1:
				stringid = "fire_protection";
				break;
			case 2:
				stringid = "feather_falling";
				break;
			case 3:
				stringid = "blast_protection";
				break;
			case 4:
				stringid = "projectile_protection";
				break;
			case 5:
				stringid = "respiration";
				break;
			case 6:
				stringid = "aqua_affinity";
				break;
			case 7:
				stringid = "thorns";
				break;
			case 16:
				stringid = "sharpness";
				break;
			case 17:
				stringid = "smite";
				break;
			case 18:
				stringid = "baneofarthropods";
				break;
			case 19:
				stringid = "knockback";
				break;
			case 20:
				stringid = "fireaspect";
				break;
			case 21: 
				stringid = "looting";
				break;
			case 32:
				stringid = "efficiency";
				break;
			case 33:
				stringid = "silktouch";
				break;
			case 34: 
				stringid = "unbreaking";
				break;
			case 35:
				stringid = "fortune";
				break;
			case 48:
				stringid = "power";
				break;
			case 49:
				stringid = "punch";
				break;
			case 50:
				stringid = "flame";
				break;
			case 51:
				stringid = "infinity";
				break;
			}
			formatted += stringid+" "+level+", ";
		}
		}
		Client.addChatMessage(formatted);
		}
		if(!(par1Entity.inventory.armorInventory[3] == null)) {
		String formattedhelmet = par1Entity.username+"'s Helmet: "+par1Entity.inventory.armorInventory[3].stackSize+"x "+par1Entity.inventory.armorInventory[3].getDisplayName()+", Enchantments: ";
		if(par1Entity.inventory.armorInventory[3].getEnchantmentTagList() != null) {
		for(int x = 0; x < par1Entity.inventory.armorInventory[3].getEnchantmentTagList().tagCount(); x++) {
			
			NBTBase var1 = par1Entity.inventory.armorInventory[3].getEnchantmentTagList().tagAt(x);
			String var2 = String.valueOf(var1);
			var2 = var2.replace("id:[lvl:", "");
			var2 = var2.replace("id:", "");
			var2 = var2.replace(",]", "");
			var2 = var2.replace("[", "");
			var2 = var2.replace(":", "");
			var2 = var2.replace("lvl", "");
			String level = var2.split(",")[0];
			String id = var2.split(",")[1];
			int intid = Integer.valueOf(id);
			String stringid = "";
			switch(intid){
			case 0:
				stringid = "protection";
				break;
			case 1:
				stringid = "fire_protection";
				break;
			case 2:
				stringid = "feather_falling";
				break;
			case 3:
				stringid = "blast_protection";
				break;
			case 4:
				stringid = "projectile_protection";
				break;
			case 5:
				stringid = "respiration";
				break;
			case 6:
				stringid = "aqua_affinity";
				break;
			case 7:
				stringid = "thorns";
				break;
			case 16:
				stringid = "sharpness";
				break;
			case 17:
				stringid = "smite";
				break;
			case 18:
				stringid = "baneofarthropods";
				break;
			case 19:
				stringid = "knockback";
				break;
			case 20:
				stringid = "fireaspect";
				break;
			case 21: 
				stringid = "looting";
				break;
			case 32:
				stringid = "efficiency";
				break;
			case 33:
				stringid = "silktouch";
				break;
			case 34: 
				stringid = "unbreaking";
				break;
			case 35:
				stringid = "fortune";
				break;
			case 48:
				stringid = "power";
				break;
			case 49:
				stringid = "punch";
				break;
			case 50:
				stringid = "flame";
				break;
			case 51:
				stringid = "infinity";
				break;
			}
			formattedhelmet += stringid+" "+level+", ";
		}
		}
		Client.addChatMessage(formattedhelmet);
		
		}
		
		
		if(!(par1Entity.inventory.armorInventory[2] == null)) {
			String formattedchestplate = par1Entity.username+"'s Chestplate: "+par1Entity.inventory.armorInventory[2].stackSize+"x "+par1Entity.inventory.armorInventory[2].getDisplayName()+", Enchantments: ";
			if(par1Entity.inventory.armorInventory[2].getEnchantmentTagList() != null) {
			for(int x = 0; x < par1Entity.inventory.armorInventory[2].getEnchantmentTagList().tagCount(); x++) {
				
				NBTBase var1 = par1Entity.inventory.armorInventory[2].getEnchantmentTagList().tagAt(x);
				String var2 = String.valueOf(var1);
				var2 = var2.replace("id:[lvl:", "");
				var2 = var2.replace("id:", "");
				var2 = var2.replace(",]", "");
				var2 = var2.replace("[", "");
				var2 = var2.replace(":", "");
				var2 = var2.replace("lvl", "");
				String level = var2.split(",")[0];
				String id = var2.split(",")[1];
				int intid = Integer.valueOf(id);
				String stringid = "";
				switch(intid){
				case 0:
					stringid = "protection";
					break;
				case 1:
					stringid = "fire_protection";
					break;
				case 2:
					stringid = "feather_falling";
					break;
				case 3:
					stringid = "blast_protection";
					break;
				case 4:
					stringid = "projectile_protection";
					break;
				case 5:
					stringid = "respiration";
					break;
				case 6:
					stringid = "aqua_affinity";
					break;
				case 7:
					stringid = "thorns";
					break;
				case 16:
					stringid = "sharpness";
					break;
				case 17:
					stringid = "smite";
					break;
				case 18:
					stringid = "baneofarthropods";
					break;
				case 19:
					stringid = "knockback";
					break;
				case 20:
					stringid = "fireaspect";
					break;
				case 21: 
					stringid = "looting";
					break;
				case 32:
					stringid = "efficiency";
					break;
				case 33:
					stringid = "silktouch";
					break;
				case 34: 
					stringid = "unbreaking";
					break;
				case 35:
					stringid = "fortune";
					break;
				case 48:
					stringid = "power";
					break;
				case 49:
					stringid = "punch";
					break;
				case 50:
					stringid = "flame";
					break;
				case 51:
					stringid = "infinity";
					break;
				}
				formattedchestplate += stringid+" "+level+", ";
			}
			}
			Client.addChatMessage(formattedchestplate);
			}
		
		if(!(par1Entity.inventory.armorInventory[1] == null)) {
			String formattedleggings = par1Entity.username+"'s Leggings: "+par1Entity.inventory.armorInventory[1].stackSize+"x "+par1Entity.inventory.armorInventory[1].getDisplayName()+", Enchantments: ";
			if(par1Entity.inventory.armorInventory[2].getEnchantmentTagList() != null) {
			for(int x = 0; x < par1Entity.inventory.armorInventory[1].getEnchantmentTagList().tagCount(); x++) {
				
				NBTBase var1 = par1Entity.inventory.armorInventory[1].getEnchantmentTagList().tagAt(x);
				String var2 = String.valueOf(var1);
				var2 = var2.replace("id:[lvl:", "");
				var2 = var2.replace("id:", "");
				var2 = var2.replace(",]", "");
				var2 = var2.replace("[", "");
				var2 = var2.replace(":", "");
				var2 = var2.replace("lvl", "");
				String level = var2.split(",")[0];
				String id = var2.split(",")[1];
				int intid = Integer.valueOf(id);
				String stringid = "";
				switch(intid){
				case 0:
					stringid = "protection";
					break;
				case 1:
					stringid = "fire_protection";
					break;
				case 2:
					stringid = "feather_falling";
					break;
				case 3:
					stringid = "blast_protection";
					break;
				case 4:
					stringid = "projectile_protection";
					break;
				case 5:
					stringid = "respiration";
					break;
				case 6:
					stringid = "aqua_affinity";
					break;
				case 7:
					stringid = "thorns";
					break;
				case 16:
					stringid = "sharpness";
					break;
				case 17:
					stringid = "smite";
					break;
				case 18:
					stringid = "baneofarthropods";
					break;
				case 19:
					stringid = "knockback";
					break;
				case 20:
					stringid = "fireaspect";
					break;
				case 21: 
					stringid = "looting";
					break;
				case 32:
					stringid = "efficiency";
					break;
				case 33:
					stringid = "silktouch";
					break;
				case 34: 
					stringid = "unbreaking";
					break;
				case 35:
					stringid = "fortune";
					break;
				case 48:
					stringid = "power";
					break;
				case 49:
					stringid = "punch";
					break;
				case 50:
					stringid = "flame";
					break;
				case 51:
					stringid = "infinity";
					break;
				}
				formattedleggings += stringid+" "+level+", ";
			}
			}
			Client.addChatMessage(formattedleggings);
			}
		
		if(!(par1Entity.inventory.armorInventory[0] == null)) {
			String formattedboots = par1Entity.username+"'s Boots: "+par1Entity.inventory.armorInventory[0].stackSize+"x "+par1Entity.inventory.armorInventory[0].getDisplayName()+", Enchantments: ";
			if(par1Entity.inventory.armorInventory[3].getEnchantmentTagList() != null) {
			for(int x = 0; x < par1Entity.inventory.armorInventory[0].getEnchantmentTagList().tagCount(); x++) {
				
				NBTBase var1 = par1Entity.inventory.armorInventory[0].getEnchantmentTagList().tagAt(x);
				String var2 = String.valueOf(var1);
				var2 = var2.replace("id:[lvl:", "");
				var2 = var2.replace("id:", "");
				var2 = var2.replace(",]", "");
				var2 = var2.replace("[", "");
				var2 = var2.replace(":", "");
				var2 = var2.replace("lvl", "");
				String level = var2.split(",")[0];
				String id = var2.split(",")[1];
				int intid = Integer.valueOf(id);
				String stringid = "";
				switch(intid){
				case 0:
					stringid = "protection";
					break;
				case 1:
					stringid = "fire_protection";
					break;
				case 2:
					stringid = "feather_falling";
					break;
				case 3:
					stringid = "blast_protection";
					break;
				case 4:
					stringid = "projectile_protection";
					break;
				case 5:
					stringid = "respiration";
					break;
				case 6:
					stringid = "aqua_affinity";
					break;
				case 7:
					stringid = "thorns";
					break;
				case 16:
					stringid = "sharpness";
					break;
				case 17:
					stringid = "smite";
					break;
				case 18:
					stringid = "baneofarthropods";
					break;
				case 19:
					stringid = "knockback";
					break;
				case 20:
					stringid = "fireaspect";
					break;
				case 21: 
					stringid = "looting";
					break;
				case 32:
					stringid = "efficiency";
					break;
				case 33:
					stringid = "silktouch";
					break;
				case 34: 
					stringid = "unbreaking";
					break;
				case 35:
					stringid = "fortune";
					break;
				case 48:
					stringid = "power";
					break;
				case 49:
					stringid = "punch";
					break;
				case 50:
					stringid = "flame";
					break;
				case 51:
					stringid = "infinity";
					break;
				}
				formattedboots += stringid+" "+level+", ";
			}
			}
			Client.addChatMessage(formattedboots);
			}
					
				
					
				
		}catch(Exception e) {
			Client.addChatMessage("Usage: info <username>");
		}
	}
	
		
		
	
	
	}



		

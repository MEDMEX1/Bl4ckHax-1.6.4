package MEDMEX.command.impl;

import java.util.Collections;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.Enchantment;
import net.minecraft.src.GuiScreenBook;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Minecraft;
import net.minecraft.src.RenderGlobal;

public class Search extends Command {
	
	public Search() {
		super("Search", "Changes Search", "Search <add/del> <blockid>", "search");
	}

	@Override
	public void onCommand(String[] args, String command) {
		try {
			System.out.println(args[0]);
			if(args[0].equals("add")) {
				int blockid = Integer.valueOf(args[1]);
				RenderGlobal.blocks.add(blockid);
				Minecraft.renderGlobal.loadRenderers();
				Client.addChatMessage("Added: "+blockid+" To Search.");
			}
			if(args[0].contains("del")) {
				int blockid = Integer.valueOf(args[1]);
				RenderGlobal.blocks.removeAll(Collections.singleton(blockid));
				Minecraft.renderGlobal.loadRenderers();
				Client.addChatMessage("Removed: "+blockid+" From Search.");
			}
			
			
			
		}catch(Exception e) {
			Client.addChatMessage("Usage: Search <add/del> <blockid>");
		}
			
		}
	}

		

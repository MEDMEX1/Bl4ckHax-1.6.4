package MEDMEX.modules.Player;

import org.lwjgl.input.Keyboard;

import MEDMEX.Client;
import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.ItemFood;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet10Flying;

public class GMBypass extends Module {

	
	public GMBypass() {
		super("GMBypass", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	
	public void onEnable() {
		
	}
	
	public void onDisable() {
		
	}
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate && e.isPre()) {
			mc.thePlayer.invulnerable=true;
            mc.thePlayer.setHealth(30.0f);
            mc.thePlayer.setPlayerSPHealth(30.0f);
		}
	}
			
				
			
				
	}




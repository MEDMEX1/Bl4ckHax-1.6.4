package MEDMEX.modules.Player;

import org.lwjgl.input.Keyboard;

import MEDMEX.Client;
import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.EntityClientPlayerMP;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet10Flying;

public class AntiHunger extends Module {
	
	public AntiHunger() {
		super("AntiHunger", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	public void onEnable() {
		EntityClientPlayerMP.antihunger = true;
	}
	public void onDisable() {
		EntityClientPlayerMP.antihunger = false;
	}
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate && e.isPre()) {
			  if (mc.thePlayer.fallDistance > 0 || mc.playerController.isHittingBlock)
	            {
				  EntityClientPlayerMP.customonground = true;
	            }else {
	            	EntityClientPlayerMP.customonground = false;
	            }
				
			
				
			
		}
	}
		


}

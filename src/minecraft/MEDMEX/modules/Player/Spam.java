package MEDMEX.modules.Player;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet10Flying;

public class Spam extends Module {
	
	public Spam() {
		super("Spam", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	private long timer = 0l;
	
	public void onEnable() {

	}
	
	public void onDisable() {
		
	}
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				timer++;
				if(timer == 23l) {
					int randomnum = (int) Math.floor(Math.random()*(99-0+1)+0);
					mc.thePlayer.sendChatMessage("Get Bl4ckHax at: https://discord.gg/epWxDheBBB ("+randomnum+")");
					timer = 0l;
					
				}
				
			}
		}
	}


}

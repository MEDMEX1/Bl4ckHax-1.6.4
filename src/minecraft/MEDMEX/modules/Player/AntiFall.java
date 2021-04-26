package MEDMEX.modules.Player;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet10Flying;

public class AntiFall extends Module {
	
	public AntiFall() {
		super("AntiFall", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate && e.isPre()) {
			if(mc.thePlayer.fallDistance > 3) {
				Minecraft.thePlayer.motionY = -.125d;
				
			}
				
			
		}
	}
		


}

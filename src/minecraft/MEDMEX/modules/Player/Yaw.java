package MEDMEX.modules.Player;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet10Flying;

public class Yaw extends Module {
	public static float yaw = 0;
	
	public Yaw() {
		super("Yaw", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate && e.isPre()) {
			mc.thePlayer.rotationYaw = yaw;
				
				}
					
		}
}
				
			
		



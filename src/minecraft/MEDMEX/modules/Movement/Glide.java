package MEDMEX.modules.Movement;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.Minecraft;

public class Glide extends Module {
	
	public Glide() {
		super("Glide", Keyboard.KEY_F19, Category.MOVEMENT);
	}
		
	public void onEnable() {
		
		
	}
	
	public void onDisable() {

	}
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
		Minecraft.thePlayer.motionY = -.1;
		Minecraft.thePlayer.jumpMovementFactor *=1.12337f;
			}
		}
	}
	


}

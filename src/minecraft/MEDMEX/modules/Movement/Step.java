package MEDMEX.modules.Movement;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet11PlayerPosition;
import MEDMEX.Wrapper;

public class Step extends Module {
	
	public Step() {
		super("Step", Keyboard.KEY_F19, Category.MOVEMENT);
	}
	
	public void onDisable() {
		mc.thePlayer.stepHeight = 0.05f;
	}
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				mc.thePlayer.stepHeight = 0.5f;
				if(mc.thePlayer.isCollidedHorizontally) {
					if(mc.thePlayer.onGround) {
					mc.thePlayer.motionY = 0.37;
					}
					
					
				}
			}
		}
	}

}

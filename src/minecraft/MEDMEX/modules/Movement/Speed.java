package MEDMEX.modules.Movement;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.EntityPlayer;

public class Speed extends Module {
	
	public Speed() {
		super("Speed" , Keyboard.KEY_V, Category.MOVEMENT);
	}
	
	
		
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				if(mc.gameSettings.keyBindForward.pressed) {
				if(mc.thePlayer.onGround) {
					mc.thePlayer.jump();
				}else {
					mc.thePlayer.motionY -= 5;
				}
				
				
			}
	}
		}
	}
	public void onDisable() {
		
		
	}

	



}

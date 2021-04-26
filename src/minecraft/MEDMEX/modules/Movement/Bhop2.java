package MEDMEX.modules.Movement;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;

public class Bhop2 extends Module {
	
	public Bhop2() {
		super("Bhop2" , Keyboard.KEY_F19, Category.MOVEMENT);
	}
	
	
		
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				if(mc.thePlayer.onGround) {
					if(mc.gameSettings.keyBindForward.pressed) {
					mc.thePlayer.jump();
					}
					mc.timer.timerSpeed = 1.05f;
					mc.thePlayer.motionX *= 1.0708f;
					mc.thePlayer.motionZ *=1.0708f;
					mc.thePlayer.moveStrafing *=10;
				}else {
						mc.thePlayer.jumpMovementFactor = 0.0265F;
					}
					
				}
			}
		}
	public void onDisable() {
		mc.timer.timerSpeed = 1.0f;
		mc.thePlayer.motionX *= 1f;
		mc.thePlayer.motionZ *= 1;
		mc.thePlayer.moveStrafing = 1;
		mc.thePlayer.jumpMovementFactor = 0.02F;
		
	}

	



}

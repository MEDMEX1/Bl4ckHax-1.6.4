package MEDMEX.modules.Movement;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;

public class Bhop extends Module {
	
	public Bhop() {
		super("Bhop" , Keyboard.KEY_M, Category.MOVEMENT);
	}
	
	private long timer = 0l;
	
		
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				timer++;
				if (mc.thePlayer.onGround) {
					if(mc.gameSettings.keyBindForward.pressed) {
					mc.thePlayer.jump();
					}
					
					
					if (timer >= 28L) {
						if(mc.thePlayer.isAirBorne) {
						mc.thePlayer.motionX *= 1;
						mc.thePlayer.motionZ *= 1;
						mc.thePlayer.speedInAir = 0.022f;
						net.minecraft.src.Timer.CustomTimer = 1.22f;
						
						timer = 0l;
						}
					}
					else {
						mc.thePlayer.motionX *= 1.0;
						mc.thePlayer.motionY *= 1.0;
						mc.thePlayer.motionZ *= 1.0;
						mc.thePlayer.speedInAir = 0.02f;
						mc.gameSettings.keyBindJump.pressed = Keyboard.isKeyDown(mc.gameSettings.keyBindJump.keyCode);
						net.minecraft.src.Timer.CustomTimer = 1f;
					}
				}
			}
		}
	}
	public void onDisable() {
		net.minecraft.src.Timer.CustomTimer = 1.00f;
		mc.thePlayer.speedInAir = 0.02f;
		
	}

	



}

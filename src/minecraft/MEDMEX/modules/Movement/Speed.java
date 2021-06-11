package MEDMEX.modules.Movement;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Potion;
import net.minecraft.src.Timer;

public class Speed extends Module {
	
	public Speed() {
		super("Speed" , Keyboard.KEY_V, Category.MOVEMENT);
	}
	
	
		
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				if(mc.thePlayer.onGround) {
					Timer.timerSpeed = 1.9f;	
				}
				mc.thePlayer.motionY = -9999;
				mc.thePlayer.getActivePotionEffect(Potion.moveSpeed);
				if(!mc.thePlayer.onGround) {
					mc.thePlayer.motionY = -9999;
					Timer.timerSpeed = 0.7f;
				}
				if(mc.thePlayer.isSwingInProgress) {
					Timer.timerSpeed = 0.7f;
				}
				if(mc.thePlayer.isSprinting()) {
					mc.thePlayer.motionY = -9999;
					Timer.timerSpeed = 2.7f;
				}
				
	}
		}
	}
	public void onDisable() {
		mc.thePlayer.motionY = 0;
		Timer.timerSpeed = 1;
		
	}

	



}

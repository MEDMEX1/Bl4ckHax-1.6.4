package MEDMEX.modules.Movement;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;

public class Timer extends Module {
	public static Float customtimercmd = 1.00F;
	
	public Timer() {
		super("Timer" , Keyboard.KEY_L, Category.MOVEMENT);
	}
		
	
	public void onEnable() {
		
		
		
	}
	
	public void onDisable() {
		net.minecraft.src.Timer.CustomTimer = 1.0F;
		
	}
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				net.minecraft.src.Timer.CustomTimer = customtimercmd;
				this.attribute = " ["+customtimercmd+"]";
			}

			}
				
			}
	



}

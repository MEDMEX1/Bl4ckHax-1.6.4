package MEDMEX.modules.Movement;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;

public class Sprint extends Module {
	
	public static boolean enabled;
	
	public Sprint() {
		super("Sprint", Keyboard.KEY_K, Category.MOVEMENT);
		
	}
	@Override
	public void onEnable() {

	}
	
	public void onDisable() {
		mc.thePlayer.setSprinting(false);
	}
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				
				if(mc.thePlayer.moveForward > 0 && !mc.thePlayer.isUsingItem() && !mc.thePlayer.isSneaking() && !mc.thePlayer.isCollidedHorizontally)
				mc.thePlayer.setSprinting(true);
				
			}
		}
	}

}

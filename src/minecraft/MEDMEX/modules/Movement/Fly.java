package MEDMEX.modules.Movement;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.Minecraft;

public class Fly extends Module {
	
	public Fly() {
		super("Fly", Keyboard.KEY_F, Category.MOVEMENT);
	}
	
	public void onDisable() {
		mc.thePlayer.capabilities.isFlying = false;
	}
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				mc.thePlayer.capabilities.isFlying = true;
			}
		}
	}

}

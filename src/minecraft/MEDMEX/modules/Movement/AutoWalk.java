package MEDMEX.modules.Movement;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.Minecraft;

public class AutoWalk extends Module {
	
	public AutoWalk() {
		super("AutoWalk", Keyboard.KEY_F19, Category.MOVEMENT);
	}
		

	
	public void onDisable() {
		mc.gameSettings.keyBindForward.pressed = Keyboard.isKeyDown(mc.gameSettings.keyBindForward.keyCode);
	}
	
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				mc.gameSettings.keyBindForward.pressed = true;
			}
		}
	}
}

package MEDMEX.modules.Movement;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.Block;
import net.minecraft.src.Minecraft;

public class Phase extends Module {
	
	public Phase() {
		super("Phase", Keyboard.KEY_F19, Category.MOVEMENT);
	}
		
	public void onEnable() {
		
		
	}
	
	public void onDisable() {
		
	}
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				if(mc.gameSettings.keyBindSneak.pressed || mc.gameSettings.keyBindJump.pressed) {
					Block.phase = true;
				}else {
					Block.phase = false;
				}
			}
		}
	}
	


}

package MEDMEX.modules.Player;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.Packet10Flying;

public class TestFall extends Module {
	
	public TestFall() {
		super("TestFall", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	public void onEnable() {
		
	}
	public void onDisable() {
		
	}
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				if(mc.thePlayer.isCollidedHorizontally && mc.thePlayer.onGround) {
					mc.thePlayer.motionY=0.37f;
					mc.timer.timerSpeed = 2f;
					
				}
				
			}
		}
	}
		


}

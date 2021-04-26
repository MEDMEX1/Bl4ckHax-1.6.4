package MEDMEX.modules.Player;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.Packet10Flying;

public class NoFall extends Module {
	
	public NoFall() {
		super("NoFall", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate && e.isPre()) {
			if(mc.thePlayer.fallDistance > 2)
				mc.thePlayer.sendQueue.addToSendQueue(new Packet10Flying(true));
			
		}
	}
		


}

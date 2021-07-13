package MEDMEX.modules.Player;

import org.lwjgl.input.Keyboard;

import MEDMEX.Client;
import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.Container;
import net.minecraft.src.ContainerChest;

public class ChestSteal extends Module {
	
	long timer = 0l;
	public ChestSteal() {
		super("ChestSteal", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate && e.isPre()) {
			if(mc.thePlayer.openContainer != null && mc.thePlayer.openContainer instanceof ContainerChest) {
				ContainerChest chest = (ContainerChest) mc.thePlayer.openContainer;
				timer++;
				for(int i = 0; i < chest.getLowerChestInventory().getSizeInventory(); i++) {
					if(chest.getLowerChestInventory().getStackInSlot(i) != null) {
						mc.playerController.windowClick(chest.windowId, i, 0, 1, mc.thePlayer);
						
					}
					
				
					
				}
				
				
			}
			
			
			
		}
	}
		


}

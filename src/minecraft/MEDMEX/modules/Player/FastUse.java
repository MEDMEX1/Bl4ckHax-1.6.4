package MEDMEX.modules.Player;

import org.lwjgl.input.Keyboard;

import MEDMEX.Client;
import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.ItemBow;
import net.minecraft.src.ItemFood;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet10Flying;
import net.minecraft.src.Packet15Place;

public class FastUse extends Module {
	
	
	public FastUse() {
		super("FastUse", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	
	public void onEnable() {
		
	}
	
	public void onDisable() {
		
	}
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate && e.isPre()) {
			if(!(mc.thePlayer.inventory.getCurrentItem() == null)) {
			ItemStack stack = mc.thePlayer.inventory.getStackInSlot(mc.thePlayer.inventory.currentItem);
			if(!(stack.getItem() instanceof ItemBow)) {
			if(mc.thePlayer.getItemInUseDuration() > 32) {
				
				for(int i = 0; i < 20; i++) {
				
				mc.thePlayer.sendQueue.addToSendQueue(new Packet10Flying(mc.thePlayer.onGround));
				}
				mc.playerController.onStoppedUsingItem(mc.thePlayer);
				
				
				}
			}
			
		}
			
			
				
			}
	}
				
	}




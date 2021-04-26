package MEDMEX.modules.Player;

import org.lwjgl.input.Keyboard;

import MEDMEX.Client;
import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.ItemFood;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet10Flying;

public class AutoEat extends Module {
	public static int foodlevel;
	public static int oldslot;
	public static long timer = 0l;
	public static boolean done = false;
	public static boolean started = false;
	
	public AutoEat() {
		super("AutoEat", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	
	public void onEnable() {
		
	}
	
	public void onDisable() {
		
	}
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate && e.isPre()) {
			foodlevel = mc.thePlayer.getFoodStats().getFoodLevel();
			if(started == false) {
				oldslot = mc.thePlayer.inventory.currentItem;
			}
			
			if(foodlevel <= 16) {
				started = true;
				int bestSlot = -1;
				for(int i = 0; i < 9; i++) {
					ItemStack stack =
							mc.thePlayer.inventory.getStackInSlot(i);
						if(stack == null || !(stack.getItem() instanceof ItemFood))
							continue;
						bestSlot = i;
						mc.thePlayer.inventory.currentItem = bestSlot;
						mc.gameSettings.keyBindUseItem.pressed = true;
						done = true;
						}
					}
					}
			if(done == true) {
				timer++;
				if(timer == 40) {
					mc.thePlayer.inventory.currentItem = oldslot;
					mc.gameSettings.keyBindUseItem.pressed = false;
					done = false;
					timer = 0;
					started = false;
				}
			}
			
				
			}
				
	}




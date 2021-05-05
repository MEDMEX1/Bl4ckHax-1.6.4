package MEDMEX.modules.Movement;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.BlockFluid;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Packet10Flying;
import net.minecraft.src.Packet11PlayerPosition;
import net.minecraft.src.Packet13PlayerLookMove;


public class Jesus2 extends Module {
	long timer = 0l;
	
	public Jesus2() {
		super("Jesus2" , Keyboard.KEY_F19, Category.MOVEMENT);
	}
	
	
	
		
	public void onEnable() {
		BlockFluid.jesus = true;
	}
	public void onDisable() {
		BlockFluid.jesus = false;

	}

	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				
				
				}
			}
		}
	}




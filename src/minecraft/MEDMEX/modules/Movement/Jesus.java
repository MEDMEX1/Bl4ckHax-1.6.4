package MEDMEX.modules.Movement;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.BlockFluid;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Packet11PlayerPosition;


public class Jesus extends Module {
	
	public Jesus() {
		super("Jesus" , Keyboard.KEY_F19, Category.MOVEMENT);
	}
	
	
	
		
	public void onEnable() {
		BlockFluid.jesus = true;
	}
	public void onDisable() {
		BlockFluid.jesus = false;
		mc.thePlayer.speedInAir = 0.02f;
		net.minecraft.src.Timer.CustomTimer = 1.00f;
	}

	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				if(mc.theWorld.getBlockId((int)mc.thePlayer.posX, (int)mc.thePlayer.posY - 2, (int)mc.thePlayer.posZ) == 9 || mc.theWorld.getBlockId((int)mc.thePlayer.posX, (int)mc.thePlayer.posY - 3, (int)mc.thePlayer.posZ) == 9) {
				if(mc.thePlayer.onGround) {
					mc.thePlayer.jump();
				}
				mc.thePlayer.speedInAir = 0.03f;
				net.minecraft.src.Timer.CustomTimer = 1.08f;
				}else {
					mc.thePlayer.speedInAir = 0.02f;
					net.minecraft.src.Timer.CustomTimer = 1.00f;
					
				}
				
				
				
				}
			}
		}
	}




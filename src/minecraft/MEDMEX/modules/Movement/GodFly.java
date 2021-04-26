package MEDMEX.modules.Movement;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.Minecraft;

public class GodFly extends Module {
	public static long timer = 0l;
	
	public GodFly() {
		super("GodFly", Keyboard.KEY_GRAVE, Category.MOVEMENT);
	}
	
	public void onDisable() {
		mc.thePlayer.speedInAir = 0.02f;
	}
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				if(!mc.thePlayer.onGround) {
				timer++;
				Minecraft.thePlayer.motionY = -.1;
				Minecraft.thePlayer.jumpMovementFactor *=1.12337f;
				mc.thePlayer.speedInAir = 0.4f;
				if(mc.gameSettings.keyBindJump.pressed) {
					Minecraft.thePlayer.setPositionAndUpdate(Minecraft.thePlayer.posX, Minecraft.thePlayer.posY+1, Minecraft.thePlayer.posZ);
				}
				if(mc.gameSettings.keyBindSneak.pressed) {
					Minecraft.thePlayer.setPositionAndUpdate(Minecraft.thePlayer.posX, Minecraft.thePlayer.posY-3, Minecraft.thePlayer.posZ);
				}
				
			}
			}
		}
	}

}

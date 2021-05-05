package MEDMEX.modules.Player;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.lwjgl.input.Keyboard;

import MEDMEX.UI.HUD;
import MEDMEX.Util.Timer;
import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.EntityClientPlayerMP;
import net.minecraft.src.EntityTNTPrimed;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet10Flying;

public class Derp extends Module {
	float yaw = 0f;
	public Timer timer = new Timer();
	
	public Derp() {
		super("Derp", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	
	public void onEnable() {
		EntityClientPlayerMP.rotationoverride = true;
		
	}
	
	public void onDisable() {
		EntityClientPlayerMP.rotationoverride = false;
	}
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				EntityClientPlayerMP.custompitch = 180f;
				yaw = yaw+45;
				EntityClientPlayerMP.customyaw=yaw;
				
			}
		}
	}

}

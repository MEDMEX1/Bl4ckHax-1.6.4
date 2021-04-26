package MEDMEX.modules.Player;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.lwjgl.input.Keyboard;

import MEDMEX.Client;
import MEDMEX.UI.HUD;
import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.EntityTNTPrimed;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet10Flying;

public class Crash extends Module {
	public static boolean crashnow = false;
	long timer = 0l;
	
	public Crash() {
		super("Crash", Keyboard.KEY_MINUS, Category.PLAYER);
	}
	
	
	public void onEnable() {
		Client.addChatMessage(mc.thePlayer.getItemInUse().getDisplayName());

	}
	
	public void onDisable() {
		
		
	}
	
	
	

}

package MEDMEX.modules.Player;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.lwjgl.input.Keyboard;

import MEDMEX.UI.HUD;
import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet10Flying;

public class AntiSS extends Module {
	
	public AntiSS() {
		super("AntiSS", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	
	public void onEnable() {
		HUD.antiss = true;
	}
	
	public void onDisable() {
		HUD.antiss = false;
	}

}

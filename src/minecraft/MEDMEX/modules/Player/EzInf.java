package MEDMEX.modules.Player;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.lwjgl.input.Keyboard;

import MEDMEX.UI.HUD;
import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.EntityTNTPrimed;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet10Flying;

public class EzInf extends Module {
	
	public EzInf() {
		super("EzInf", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	
	public void onEnable() {
		EntityTNTPrimed.ezinfmodule = true;
	}
	
	public void onDisable() {
		EntityTNTPrimed.ezinfmodule = false;
	}

}

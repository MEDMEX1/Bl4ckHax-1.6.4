package MEDMEX.modules.Player;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet10Flying;

public class Fastplace extends Module {
	
	public Fastplace() {
		super("Fastplace", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	
	public void onEnable() {
		Minecraft.customrightclickdelay = 0;

	}
	
	public void onDisable() {
		Minecraft.customrightclickdelay = 4;
	}
		


}

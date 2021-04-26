package MEDMEX.modules.Player;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet10Flying;

public class NoClip extends Module {
	
	public NoClip() {
		super("NoClip", Keyboard.KEY_G, Category.PLAYER);
	}
	
	
	public void onEnable() {
		mc.thePlayer.noClip = true;
	}
	
	public void onDisable() {
		mc.thePlayer.noClip = false;
	}


}

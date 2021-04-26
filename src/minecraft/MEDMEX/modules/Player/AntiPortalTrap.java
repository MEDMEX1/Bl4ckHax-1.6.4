package MEDMEX.modules.Player;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.EntityPlayerSP;
import net.minecraft.src.EntityPortalFX;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet10Flying;

public class AntiPortalTrap extends Module {
	
	public AntiPortalTrap() {
		super("AntiPortalTrap", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	
	public void onEnable() {
		EntityPlayerSP.antiportaltrap = true;
	}
	public void onDisable() {
		EntityPlayerSP.antiportaltrap = false;
		
	}
		


}

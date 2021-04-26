package MEDMEX.modules.Player;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.BlockPortal;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet10Flying;

public class PortalFinder extends Module {
	
	public PortalFinder() {
		super("PortalFinder", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	
	public void onEnable() {
		BlockPortal.portalfinder = true;
	}
	public void onDisable() {
		BlockPortal.portalfinder = false;
	}
		


}

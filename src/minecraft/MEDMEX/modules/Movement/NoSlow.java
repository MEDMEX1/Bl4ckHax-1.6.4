package MEDMEX.modules.Movement;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.EntityPlayerSP;
import net.minecraft.src.Minecraft;

public class NoSlow extends Module {
	
	public NoSlow() {
		super("NoSlow", Keyboard.KEY_F19, Category.MOVEMENT);
	}
		

	
	public void onDisable() {
		EntityPlayerSP.noslow = false;
		EntityPlayerSP.noslow = false;
	}
	
	public void onEnable() {
		EntityPlayerSP.noslow = true;
		EntityPlayerSP.noslow = true;
	}

}

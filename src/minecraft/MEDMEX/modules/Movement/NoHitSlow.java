package MEDMEX.modules.Movement;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EntityPlayerSP;
import net.minecraft.src.Minecraft;

public class NoHitSlow extends Module {
	
	public NoHitSlow() {
		super("NoHitSlow", Keyboard.KEY_F19, Category.MOVEMENT);
	}
		

	
	public void onDisable() {
		EntityPlayer.nohitslow = false;
	}
	
	public void onEnable() {
		EntityPlayer.nohitslow = true;
	}

}

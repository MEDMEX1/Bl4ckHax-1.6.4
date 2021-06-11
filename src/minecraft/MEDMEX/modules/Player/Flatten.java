package MEDMEX.modules.Player;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.EntityClientPlayerMP;
import net.minecraft.src.Minecraft;
import net.minecraft.src.NetServerHandler;
import net.minecraft.src.Packet10Flying;
import net.minecraft.src.PlayerControllerMP;
import net.minecraft.src.RenderGlobal;

public class Flatten extends Module {
	
	public Flatten() {
		super("Flatten", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	
	public void onEnable() {
		EntityClientPlayerMP.flatten = true;
		
	}
	public void onDisable() {
		EntityClientPlayerMP.flatten = false;
		NetServerHandler.freecamenabled = false;
		EntityClientPlayerMP.freecamenabled = false;
		RenderGlobal.flatten = false;
		
		
	}


}

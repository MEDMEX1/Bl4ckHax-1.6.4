package MEDMEX.modules.Player;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.EntityClientPlayerMP;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet10Flying;

public class XCarry extends Module {
	
	public XCarry() {
		super("XCarry", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	
	public void onEnable() {
		EntityClientPlayerMP.xcarry = true;
		
	}
	public void onDisable() {
		EntityClientPlayerMP.xcarry = false;
		
	}
}
				
			
		



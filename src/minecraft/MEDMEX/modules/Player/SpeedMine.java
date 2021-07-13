package MEDMEX.modules.Player;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet10Flying;
import net.minecraft.src.PlayerControllerMP;

public class SpeedMine extends Module {
	public static String mode = "Normal";
	public SpeedMine() {
		super("SpeedMine", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	
	public void onEnable() {
		
	}
	public void onDisable() {
		PlayerControllerMP.speedmine = false;
		Minecraft.packetmine = false;
		
	}
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				if(mode.equals("Normal")) {
					PlayerControllerMP.speedmine = true;
					Minecraft.packetmine = false;
					this.attribute = " §7[§f"+"Normal"+"§7]";
					
				}
				if(mode.equals("Packet")) {
					PlayerControllerMP.speedmine = false;
					Minecraft.packetmine = true;
					this.attribute = " §7[§f"+"Packet"+"§7]";
				}
				
			}
				
			}
				
				
			}


}

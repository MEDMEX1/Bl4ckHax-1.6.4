package MEDMEX.modules.Player;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet10Flying;
import net.minecraft.src.PlayerControllerMP;

public class SpeedMine extends Module {
	
	public SpeedMine() {
		super("SpeedMine", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	
	public void onEnable() {
		PlayerControllerMP.speedmine = true;
	}
	public void onDisable() {
		PlayerControllerMP.speedmine = false;
		
	}


}

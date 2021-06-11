package MEDMEX.modules.Movement;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.Entity;

public class Safewalk extends Module {
	public static boolean safewalk = false;
	
	public Safewalk() {
		super("Safewalk", Keyboard.KEY_J, Category.MOVEMENT);
		
	}
	@Override
	public void onEnable() {
		Entity.safewalkenabled = true;
		safewalk = true;
	}
	
	public void onDisable() {
		Entity.safewalkenabled = false;
		safewalk = false;
	}
	


}

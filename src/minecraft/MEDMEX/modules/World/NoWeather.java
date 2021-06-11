package MEDMEX.modules.World;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;

public class NoWeather extends Module {
	public static Float weather = 1f;
	
	
	
	public NoWeather() {
		super("NoWeather", Keyboard.KEY_P, Category.WORLD);
		
	}
	
	public void onEnable() {
		weather = 0f;
	}

	
	public void onDisable() {
		weather = 1f;
	}
	

}

package MEDMEX.modules.Render;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.Entity;

public class NoRender extends Module {
	public static Float weather = 1f;
	
	
	
	public NoRender() {
		super("NoRender", Keyboard.KEY_N, Category.RENDER);
		
	}
	
	public void onEnable() {
		Entity.norenderenabled = 0;
	}

	
	public void onDisable() {
		Entity.norenderenabled = 64.0;
	}
	

}

package MEDMEX.modules.Render;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.EntityRenderer;

public class StaticFOV extends Module {
	
	
	
	public StaticFOV() {
		super("StaticFOV", Keyboard.KEY_F19, Category.RENDER);
		
	}
	
	public void onEnable() {
		EntityRenderer.staticfov = true;
		
	}
	public void onDisable() {
		EntityRenderer.staticfov = false;
		
	}

}

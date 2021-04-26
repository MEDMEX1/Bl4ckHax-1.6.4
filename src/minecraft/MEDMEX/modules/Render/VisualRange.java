package MEDMEX.modules.Render;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.World;

public class VisualRange extends Module {
	
	
	
	public VisualRange() {
		super("VisualRange", Keyboard.KEY_F19, Category.RENDER);
		
	}
	
	public void onEnable() {
		World.visualrange = true;
	}
	
	public void onDisable() {
		World.visualrange = false;
		
	}
	

}

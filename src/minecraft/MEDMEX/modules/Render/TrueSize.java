package MEDMEX.modules.Render;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.RenderItem;

public class TrueSize extends Module {
	
	
	
	public TrueSize() {
		super("TrueSize", Keyboard.KEY_F19, Category.RENDER);
		
	}
	
	public void onEnable() {
		RenderItem.TrueSize = true;
	}
	
	public void onDisable() {
		RenderItem.TrueSize = false;
	}
	

}

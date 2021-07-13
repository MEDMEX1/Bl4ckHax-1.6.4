package MEDMEX.modules.Render;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.ItemRenderer;

public class RetardFOV extends Module {
	
	
	
	public RetardFOV() {
		super("RetardFOV", Keyboard.KEY_F19, Category.RENDER);
		
	}
	
	public void onEnable() {
		ItemRenderer.fov1 = -2.0f;
		ItemRenderer.fov2 = 0.4f;
		ItemRenderer.retardfov = true;
	}
	
	public void onDisable() {
		ItemRenderer.fov1 = 0.0f;
		ItemRenderer.fov2 = 0.3f;
		ItemRenderer.retardfov = false;
	}
	

}

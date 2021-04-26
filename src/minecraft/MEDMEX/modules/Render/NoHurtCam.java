package MEDMEX.modules.Render;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.EntityRenderer;

public class NoHurtCam extends Module {
	
	
	
	public NoHurtCam() {
		super("NoHurtCam", Keyboard.KEY_F19, Category.RENDER);
		
	}
	
	public void onEnable() {
		EntityRenderer.nohurtcam = true;
	}
	public void onDisable() {
		EntityRenderer.nohurtcam = false;
		
	}

}

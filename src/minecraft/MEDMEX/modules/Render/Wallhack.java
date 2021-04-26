package MEDMEX.modules.Render;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.RendererLivingEntity;

public class Wallhack extends Module {
	
	
	
	public Wallhack() {
		super("Wallhack", Keyboard.KEY_F19, Category.RENDER);
		
	}
	
	public void onEnable() {
		RendererLivingEntity.wallhackenabled = true;
	}
	
	public void onDisable() {
		RendererLivingEntity.wallhackenabled = false;
		
	}
	

}

package MEDMEX.modules.Render;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.RendererLivingEntity;

public class Nametags extends Module {
	
	
	
	public Nametags() {
		super("Nametags", Keyboard.KEY_F19, Category.RENDER);
		
	}
	
	public void onEnable() {
		RendererLivingEntity.nametags = true;
	}
	
	public void onDisable() {
		RendererLivingEntity.nametags = false;
		
	}
	

}

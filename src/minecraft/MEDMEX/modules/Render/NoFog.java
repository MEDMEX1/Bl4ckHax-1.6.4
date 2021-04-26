package MEDMEX.modules.Render;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.Entity;
import net.minecraft.src.WorldProviderEnd;
import net.minecraft.src.WorldProviderHell;

public class NoFog extends Module {
	
	
	
	public NoFog() {
		super("NoFog", Keyboard.KEY_F19, Category.RENDER);
		
	}
	
	public void onEnable() {
		WorldProviderEnd.nofog = true;
		WorldProviderHell.nofog = true;
	}

	
	public void onDisable() {
		WorldProviderEnd.nofog = false;
		WorldProviderHell.nofog = false;
	}
	

}

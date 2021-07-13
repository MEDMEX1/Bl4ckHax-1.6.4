package MEDMEX.modules.Render;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.NetClientHandler;
import net.minecraft.src.RenderGlobal;

public class NewChunks extends Module {
	
	
	
	public NewChunks() {
		super("NewChunks", Keyboard.KEY_F19, Category.RENDER);
		
	}
	
	public void onEnable() {
		RenderGlobal.newchunks = true;
		NetClientHandler.newchunks = true;
	}
	
	public void onDisable() {
		RenderGlobal.newchunks = false;
		NetClientHandler.newchunks = false;
		
	}
	

}

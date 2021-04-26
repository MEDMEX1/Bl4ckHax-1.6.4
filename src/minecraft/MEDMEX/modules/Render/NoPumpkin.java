package MEDMEX.modules.Render;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.Entity;
import net.minecraft.src.GuiIngame;
import net.minecraft.src.WorldProviderEnd;
import net.minecraft.src.WorldProviderHell;

public class NoPumpkin extends Module {
	
	
	
	public NoPumpkin() {
		super("NoPumpkin", Keyboard.KEY_F19, Category.RENDER);
		
	}
	
	public void onEnable() {
		GuiIngame.nopumpkin = true;
	}

	
	public void onDisable() {
		GuiIngame.nopumpkin = false;
	}
	

}

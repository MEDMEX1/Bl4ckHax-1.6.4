package MEDMEX.modules.Render;

import org.lwjgl.input.Keyboard;

import MEDMEX.Client;
import MEDMEX.UI.HUD;
import MEDMEX.Util.ColorUtil;
import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.Entity;
import net.minecraft.src.Minecraft;

public class Info extends Module {
	
	
	
	public Info() {
		super("Info", Keyboard.KEY_F19, Category.RENDER);
	}
	
	public void onEnable() {
		HUD.infoenabled = true;
	}
	
	public void onDisable() {
		HUD.infoenabled = false;
		
	}
	

	

}

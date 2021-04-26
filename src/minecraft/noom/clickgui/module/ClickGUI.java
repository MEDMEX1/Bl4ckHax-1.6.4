package noom.clickgui.module;

import org.lwjgl.input.Keyboard;

import MEDMEX.Client;
import MEDMEX.modules.Module;

public class ClickGUI extends Module {
	

	public ClickGUI() {
		super("ClickGUI", Keyboard.KEY_RSHIFT, Category.RENDER);
		
	}
	
	public void onEnable() {
		//public static ClickGui clickgui = new ClickGui();
		//in main class
		//also dont forget to add module to arraylist
		mc.displayGuiScreen(Client.clickgui);
		toggle();
	}

}

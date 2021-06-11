package MEDMEX.UI;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import MEDMEX.modules.Module.Category;

public class ClickGui extends Module{

	public ClickGui() {
		super("ClickGui", Keyboard.KEY_RSHIFT, Category.MISC);
		
	}
	
	public void onEnable() {
		HUD.clickgui = true;
		mc.displayGuiScreen(ClickGUIScreen.INSTANCE);
	}
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				if(Keyboard.isKeyDown(1)) {
					this.toggle();
				}
			}
				
			}
				
			}
	public void onDisable() {
		HUD.clickgui = false;
	}

}

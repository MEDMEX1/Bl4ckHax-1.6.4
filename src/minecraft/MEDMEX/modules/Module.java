package MEDMEX.modules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import MEDMEX.Wrapper;
import MEDMEX.events.Event;
import net.minecraft.src.Minecraft;
import MEDMEX.settings.KeybindSetting;
import MEDMEX.settings.Setting;

public class Module {
	
	public String name;
	public boolean toggled;
	public KeybindSetting keyCode = new KeybindSetting(0);
	public Category category;
	public boolean getKey;
	public boolean setKey;
	public Minecraft mc = Minecraft.getMinecraft();
	
	public List<Setting> settings = new ArrayList<Setting>();
	
	public Module(String name, int key, Category c){
		this.name = name;
		this.keyCode.code = key;
		this.category = c;
		this.addSettings(keyCode);
	}
	
	public void addSettings(Setting...settings) {
		this.settings.addAll(Arrays.asList(settings));
	}
	
	protected final Wrapper getWrapper() {
		return Wrapper.getInstance();
	}
	
	
	public boolean isEnabled() {
		return toggled;
	}
	
	
	
	public int getKey() {
		return keyCode.code;
	}
	
	public void onEvent(Event e) {
		
	}
	
	public void toggle() {
		toggled = !toggled;
		if(toggled) {
			onEnable();
		}else {
			onDisable();
		}
	}
	
	public void onEnable() {
		
	}
	
	public void onDisable() {
		
	}
	
	public enum Category {
		COMBAT("Combat"),
		MOVEMENT("Movement"),
		PLAYER("Player"),
		RENDER("Render");
		
		public String name;
		
		Category(String name){
			this.name = name;
		}
	}


	
	
}

package noom.clickgui.component.components.settings;

import MEDMEX.settings.BooleanSetting;
import noom.clickgui.component.Component;

public class ComponentBoolean extends Component{
	public BooleanSetting setting;
	public int y;
	
	public ComponentBoolean(BooleanSetting setting,int y){
		this.setting = setting;
		this.y = y;
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float notNeeded) {
		
	}
	
	@Override
	public void keyTyped(char keyCode, int typedKey) {
		
	}
	
	@Override
	public void mouseClicked(int mouseX, int mouseY, int mouseButton) {
		
	}
	
}

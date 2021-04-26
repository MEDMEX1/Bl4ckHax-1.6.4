package noom.clickgui.component.components.settings;

import MEDMEX.settings.NumberSetting;
import noom.clickgui.component.Component;

public class ComponentMode extends Component{
	public NumberSetting setting;
	public int y;
	
//soon
	
	public ComponentMode(NumberSetting setting,int y){
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

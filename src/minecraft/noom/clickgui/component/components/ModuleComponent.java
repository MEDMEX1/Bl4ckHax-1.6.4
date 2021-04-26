package noom.clickgui.component.components;

import java.awt.Color;
import java.util.ArrayList;

import MEDMEX.modules.Module;
import noom.clickgui.component.Component;
import noom.clickgui.component.components.settings.ComponentBoolean;
import noom.clickgui.component.components.settings.ComponentMode;
import noom.clickgui.component.components.settings.ComponentNumber;
import noom.utils.GuiUtils;

public class ModuleComponent extends Component{
	
	public Module m;
	public int y;
	
	ArrayList<ComponentBoolean> cb = new ArrayList<>();
	ArrayList<ComponentMode> cm = new ArrayList<>();
	ArrayList<ComponentNumber> cn = new ArrayList<>();
	
	public ModuleComponent(Module m, int y){
		this.m = m;
		this.y = y;
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float notNeeded) {
			int mcolor = m.isEnabled() ? Color.green.hashCode() : Color.red.hashCode();
			GuiUtils.getFR().drawString(m.name, 220, 150 + (y / 8), mcolor);
	}
	
	@Override
	public void keyTyped(char keyCode, int typedKey) {
		
	}
	
	@Override
	public void mouseClicked(int mouseX, int mouseY, int mouseButton) {
		if(GuiUtils.isHovered(mouseX, mouseY, 220, 150 + (y / 8), GuiUtils.getFR().getStringWidth(m.name), 10)){
			if(mouseButton == 0){
			m.toggle();
			}
		}
	}

}

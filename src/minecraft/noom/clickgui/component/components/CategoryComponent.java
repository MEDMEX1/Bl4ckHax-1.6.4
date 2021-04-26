package noom.clickgui.component.components;

import java.awt.Color;
import java.util.ArrayList;

import MEDMEX.Client;
import MEDMEX.modules.Module;
import MEDMEX.modules.Module.Category;
import net.minecraft.src.Minecraft;
import noom.clickgui.ModuleScreen;
import noom.clickgui.component.Component;
import noom.utils.GuiUtils;

public class CategoryComponent extends Component{
	public Category c;
	public int y;
	
	ArrayList<ModuleComponent> mc = new ArrayList<>();
	
	public CategoryComponent(Category cat,int y){
		this.c = cat;
		this.y = y;
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float notNeeded) {
		GuiUtils.getFR().drawString(c.name, 220 + (y), 105, Color.black.hashCode());
		for(ModuleComponent mcc : mc){
			mcc.drawScreen(mouseX, mouseY, notNeeded);
		}
	}
	
	@Override
	public void keyTyped(char keyCode, int typedKey) {
		
	}
	
	@Override
	public void mouseClicked(int mouseX, int mouseY, int mouseButton) {
		if(GuiUtils.isHovered(mouseX, mouseY, 220 + (y), 105, GuiUtils.getFR().getStringWidth(c.name), 10)){
			if(mouseButton == 0){
				for(Module m : Client.modules){
					if(m.category == c){
						Minecraft.getMinecraft().displayGuiScreen(new ModuleScreen(c));
				}
			}
			}
		}
	}

}

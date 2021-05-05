package noom.clickgui;

import java.awt.Color;
import java.util.ArrayList;

import org.lwjgl.input.Keyboard;

import MEDMEX.modules.Module.Category;
import net.minecraft.src.Gui;
import net.minecraft.src.GuiScreen;
import noom.clickgui.component.components.CategoryComponent;

public class ClickGui extends GuiScreen {
	
	ArrayList<CategoryComponent> cc = new ArrayList<>();
	int caty;

	@Override
	public void drawScreen(int par1, int par2, float par3) {
		
		Gui.drawRect(210, 100, 650, 400, Color.gray.brighter().hashCode());
		int y = 0;
		if(cc.isEmpty()){
		for(Category c : Category.values()){
			cc.add(new CategoryComponent(c, y));
			y+=130;
		}
		}
		for(CategoryComponent c : cc){
			c.drawScreen(par1, par2, par3);
		}
	}
	
	@Override
	protected void keyTyped(char par1, int par2) {
		if(par2 == Keyboard.KEY_ESCAPE){
			mc.displayGuiScreen((GuiScreen) null);
		}
	}
	
	@Override
	protected void mouseClicked(int par1, int par2, int par3) {
		for(CategoryComponent c : cc){
			c.mouseClicked(par1, par2, par3);
		}
	}
	
}

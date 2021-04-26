package noom.clickgui;

import java.awt.Color;
import java.util.ArrayList;

import org.lwjgl.input.Keyboard;

import MEDMEX.Client;
import MEDMEX.modules.Module;
import MEDMEX.modules.Module.Category;
import net.minecraft.src.Gui;
import net.minecraft.src.GuiScreen;
import noom.clickgui.component.components.CategoryComponent;
import noom.clickgui.component.components.ModuleComponent;

public class ModuleScreen extends ClickGui {
	
	Category c;
	public ArrayList<ModuleComponent> MC = new ArrayList<>();
	
	public ModuleScreen(Category c){
		this.c = c;
	}

	@Override
	public void drawScreen(int par1, int par2, float par3) {
		Gui.drawRect(210, 100, 650, 400, Color.gray.brighter().hashCode());
		if(cc.isEmpty()){
			int y =0;
			for(Category c : Category.values()){
				cc.add(new CategoryComponent(c, y));
				y+=130;
			}
			}
		if(MC.isEmpty()){
			int y = 0;
			for(Module m : Client.modules){
				if(m.category == c){
					MC.add(new ModuleComponent(m, y));
					y+=120;
				}
			}
		}
			for(CategoryComponent c : cc){
				c.drawScreen(par1, par2, par3);
			}
			for(ModuleComponent mc : MC){
				mc.drawScreen(par1, par2, par3);
			}
	}
	
	@Override
	public void mouseClicked(int par1, int par2, int par3) {
		for(CategoryComponent c : cc){
			c.mouseClicked(par1, par2, par3);
		}
		for(ModuleComponent mc : MC){
			mc.mouseClicked(par1, par2, par3);
		}
	}
	
	@Override
	public void keyTyped(char par1, int par2) {
		if(par2 == Keyboard.KEY_ESCAPE){
			mc.displayGuiScreen((GuiScreen) null);
		}
	}
}

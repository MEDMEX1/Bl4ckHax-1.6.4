package MEDMEX.UI;

import java.io.IOException;
import java.util.ArrayList;

import org.lwjgl.input.Keyboard;

import MEDMEX.modules.Module.Category;
import net.minecraft.src.GuiScreen;

public class ClickGUIScreen extends GuiScreen {
	
	public static ClickGUIScreen INSTANCE = new ClickGUIScreen();
	
	ArrayList<GuiFrame> frames;
	
	public ClickGUIScreen() {
		frames = new ArrayList<>();
		int offset = 0;
		for(Category category : Category.values()) {
			frames.add(new GuiFrame(category, 10+offset, 20));
			offset += 110;
		}
	}
	
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		super.drawScreen(mouseX, mouseY, partialTicks);
		for(GuiFrame frame : frames) {
			frame.render(mouseX, mouseY);
		}
	}
	
	@Override
	public void mouseClicked(int mouseX, int mouseY, int mouseButton){
		super.mouseClicked(mouseX, mouseY, mouseButton);
		for(GuiFrame frame : frames) {
			frame.onClick(mouseX, mouseY, mouseButton);
		}
	}

}

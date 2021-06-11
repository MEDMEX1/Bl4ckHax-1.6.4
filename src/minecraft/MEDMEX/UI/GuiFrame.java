package MEDMEX.UI;

import java.awt.Color;
import java.util.ArrayList;

import MEDMEX.Client;
import MEDMEX.Util.ColorUtil;
import MEDMEX.modules.Module;
import MEDMEX.modules.Module.Category;
import net.minecraft.src.Gui;
import net.minecraft.src.Minecraft;

public class GuiFrame {
	
	int x, y, width, height;
	
	Category category;
	Minecraft mc = Minecraft.getMinecraft();
	
	ArrayList<ModuleButton> moduleButtons;
	
	public GuiFrame(Category category, int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 100;
		this.height = 240;
		this.category = category;
		
		moduleButtons = new ArrayList<>();
		int offsetY = 14;
		for(Module module : Client.getModuleByCategory(category)) {
			moduleButtons.add(new ModuleButton(module, x, y+offsetY, this));
			offsetY += 14;
		}
		
		this.height = offsetY;
		
	}
	
	public void render(int MouseX, int mouseY) {
		Gui.drawRect(x, y, x+ width, y+height, new Color(0, 0, 0, 100).getRGB());
		mc.fontRenderer.drawString(category.toString(), x + 2, y + 2, ColorUtil.getRainbow(4, 1.0f, 1, 0));
		for(ModuleButton moduleButton : moduleButtons) {
			moduleButton.draw(MouseX, mouseY);
		}
	}
	
	public void onClick(int x, int y, int button) {
		for(ModuleButton moduleButton : moduleButtons) {
			moduleButton.onClick(x, y, button);
		}
	}
	
}

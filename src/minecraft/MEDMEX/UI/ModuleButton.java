package MEDMEX.UI;

import java.awt.Color;

import MEDMEX.Util.ColorUtil;
import MEDMEX.modules.Module;

import net.minecraft.src.Minecraft;

public class ModuleButton {

	int x, y, width, height;
	
	Module module;
	
	GuiFrame parent;
	
	Minecraft mc = Minecraft.getMinecraft();
	
	public ModuleButton(Module module, int x, int y, GuiFrame parent ) {
		this.module = module;
		this.x= x;
		this.y= y;
		this.parent = parent;
		this.width = parent.width;
		this.height = 14;
		
	}
	
	
	public void draw(int mouseX, int mouseY) {
		if(module.toggled) {
		mc.fontRenderer.drawString(module.name, x+2, y+2, ColorUtil.getRainbow(4, 1.0f, 1, 0));
		}else {
			mc.fontRenderer.drawString(module.name, x+2, y+2, new Color(255, 255, 255).getRGB());
		}
	}
	
	public void onClick(int x, int y, int button) {
		if(x >= this.x && x<= this.x + this.width && y >= this.y && y <= this.y + this.height) {
			this.module.toggle();
		}
		
	}
	
	
}

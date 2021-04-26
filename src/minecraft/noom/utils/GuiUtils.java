package noom.utils;

import net.minecraft.src.FontRenderer;
import net.minecraft.src.Minecraft;
import net.minecraft.src.ScaledResolution;

public class GuiUtils {
	
	static Minecraft mc = Minecraft.getMinecraft();
	
	public static ScaledResolution getSR(){
		return new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
	}
	
	public static FontRenderer getFR(){
		return mc.fontRenderer;
	}
	
	public static boolean isHovered(int mouseX, int mouseY, int x, int y, int width, int height){
		if(mouseX >= x && mouseX <= (x + width)){
			if(mouseY >= y && mouseY <= (y + height)){
				return true;
			}
		}
		return false;
	}

}

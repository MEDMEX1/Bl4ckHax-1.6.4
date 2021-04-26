package MEDMEX.Util;

import java.awt.Color;

public class ColorUtil {
	
	public static int getRainbow(float seconds,float saturation, float brightness, long index) {
		float hue = ((System.currentTimeMillis() + index) % (int)(4000) *1000) / (float)(4000 * 1000);
		int color = Color.HSBtoRGB(hue, saturation, brightness);
		return color;
		
	}

}

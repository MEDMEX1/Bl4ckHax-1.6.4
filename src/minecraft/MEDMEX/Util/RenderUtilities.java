package MEDMEX.Util;

import java.awt.Color;


public class RenderUtilities {
	private static final RenderUtilities instance = new RenderUtilities();

	public static final RenderUtilities getInstance() {
		return instance;
	}

	/**
	 * Return a float array of RGB converted from a hex integer.
	 * 
	 * @param par1Hex
	 *            Hex color code
	 * @return RGB float array
	 */
	public float[] getARGB(final int par1Hex) {
		final float a = (par1Hex >> 24 & 255) / 255f;
		final float r = (par1Hex >> 16 & 255) / 255f;
		final float g = (par1Hex >> 8 & 255) / 255f;
		final float b = (par1Hex & 255) / 255f;

		return new float[] { a, r, g, b };
	}

}

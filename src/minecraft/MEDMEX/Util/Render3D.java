package MEDMEX.Util;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Tessellator;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.glu.Sphere;

/**
 * 3D rendering methods and utilities.
 * 
 * @author Ramisme
 * @since Apr 17, 2013
 * 
 */
public class Render3D {
	private static final Render3D INSTANCE = new Render3D();

	public static final Render3D getInstance() {
		return INSTANCE;
	}

	public void drawOutlinedBoundingBox(final AxisAlignedBB axisalignedbb) {
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
		GL11.glDepthMask(false);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glEnable(GL11.GL_LINE_SMOOTH);
		GL11.glEnable(GL11.GL_BLEND);

		// right side
		GL11.glBegin(GL11.GL_LINE_LOOP);
		GL11.glVertex3d(axisalignedbb.minX, axisalignedbb.minY,
				axisalignedbb.minZ);
		GL11.glVertex3d(axisalignedbb.minX, axisalignedbb.maxY,
				axisalignedbb.minZ);
		GL11.glVertex3d(axisalignedbb.minX, axisalignedbb.maxY,
				axisalignedbb.maxZ);
		GL11.glVertex3d(axisalignedbb.minX, axisalignedbb.minY,
				axisalignedbb.maxZ);
		GL11.glEnd();

		// left side
		GL11.glBegin(GL11.GL_LINE_LOOP);
		GL11.glVertex3d(axisalignedbb.maxX, axisalignedbb.minY,
				axisalignedbb.minZ);
		GL11.glVertex3d(axisalignedbb.maxX, axisalignedbb.maxY,
				axisalignedbb.minZ);
		GL11.glVertex3d(axisalignedbb.maxX, axisalignedbb.maxY,
				axisalignedbb.maxZ);
		GL11.glVertex3d(axisalignedbb.maxX, axisalignedbb.minY,
				axisalignedbb.maxZ);
		GL11.glEnd();

		// top
		GL11.glBegin(GL11.GL_LINE_LOOP);
		GL11.glVertex3d(axisalignedbb.minX, axisalignedbb.maxY,
				axisalignedbb.minZ);
		GL11.glVertex3d(axisalignedbb.maxX, axisalignedbb.maxY,
				axisalignedbb.minZ);
		GL11.glVertex3d(axisalignedbb.maxX, axisalignedbb.maxY,
				axisalignedbb.maxZ);
		GL11.glVertex3d(axisalignedbb.minX, axisalignedbb.maxY,
				axisalignedbb.maxZ);
		GL11.glEnd();

		// bottom
		GL11.glBegin(GL11.GL_LINE_LOOP);
		GL11.glVertex3d(axisalignedbb.minX, axisalignedbb.minY,
				axisalignedbb.minZ);
		GL11.glVertex3d(axisalignedbb.maxX, axisalignedbb.minY,
				axisalignedbb.minZ);
		GL11.glVertex3d(axisalignedbb.maxX, axisalignedbb.minY,
				axisalignedbb.maxZ);
		GL11.glVertex3d(axisalignedbb.minX, axisalignedbb.minY,
				axisalignedbb.maxZ);
		GL11.glEnd();

		GL11.glDisable(GL11.GL_LINE_SMOOTH);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glDepthMask(true);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
	}

	public void drawBoundingBox(final AxisAlignedBB axisalignedbb) {
		final Tessellator tessellator = Tessellator.instance;
		tessellator.startDrawingQuads();
		tessellator.addVertex(axisalignedbb.minX, axisalignedbb.minY,
				axisalignedbb.minZ);
		tessellator.addVertex(axisalignedbb.minX, axisalignedbb.maxY,
				axisalignedbb.minZ);
		tessellator.addVertex(axisalignedbb.maxX, axisalignedbb.minY,
				axisalignedbb.minZ);
		tessellator.addVertex(axisalignedbb.maxX, axisalignedbb.maxY,
				axisalignedbb.minZ);
		tessellator.addVertex(axisalignedbb.maxX, axisalignedbb.minY,
				axisalignedbb.maxZ);
		tessellator.addVertex(axisalignedbb.maxX, axisalignedbb.maxY,
				axisalignedbb.maxZ);
		tessellator.addVertex(axisalignedbb.minX, axisalignedbb.minY,
				axisalignedbb.maxZ);
		tessellator.addVertex(axisalignedbb.minX, axisalignedbb.maxY,
				axisalignedbb.maxZ);
		tessellator.draw();
		tessellator.startDrawingQuads();
		tessellator.addVertex(axisalignedbb.maxX, axisalignedbb.maxY,
				axisalignedbb.minZ);
		tessellator.addVertex(axisalignedbb.maxX, axisalignedbb.minY,
				axisalignedbb.minZ);
		tessellator.addVertex(axisalignedbb.minX, axisalignedbb.maxY,
				axisalignedbb.minZ);
		tessellator.addVertex(axisalignedbb.minX, axisalignedbb.minY,
				axisalignedbb.minZ);
		tessellator.addVertex(axisalignedbb.minX, axisalignedbb.maxY,
				axisalignedbb.maxZ);
		tessellator.addVertex(axisalignedbb.minX, axisalignedbb.minY,
				axisalignedbb.maxZ);
		tessellator.addVertex(axisalignedbb.maxX, axisalignedbb.maxY,
				axisalignedbb.maxZ);
		tessellator.addVertex(axisalignedbb.maxX, axisalignedbb.minY,
				axisalignedbb.maxZ);
		tessellator.draw();
		tessellator.startDrawingQuads();
		tessellator.addVertex(axisalignedbb.minX, axisalignedbb.maxY,
				axisalignedbb.minZ);
		tessellator.addVertex(axisalignedbb.maxX, axisalignedbb.maxY,
				axisalignedbb.minZ);
		tessellator.addVertex(axisalignedbb.maxX, axisalignedbb.maxY,
				axisalignedbb.maxZ);
		tessellator.addVertex(axisalignedbb.minX, axisalignedbb.maxY,
				axisalignedbb.maxZ);
		tessellator.addVertex(axisalignedbb.minX, axisalignedbb.maxY,
				axisalignedbb.minZ);
		tessellator.addVertex(axisalignedbb.minX, axisalignedbb.maxY,
				axisalignedbb.maxZ);
		tessellator.addVertex(axisalignedbb.maxX, axisalignedbb.maxY,
				axisalignedbb.maxZ);
		tessellator.addVertex(axisalignedbb.maxX, axisalignedbb.maxY,
				axisalignedbb.minZ);
		tessellator.draw();
		tessellator.startDrawingQuads();
		tessellator.addVertex(axisalignedbb.minX, axisalignedbb.minY,
				axisalignedbb.minZ);
		tessellator.addVertex(axisalignedbb.maxX, axisalignedbb.minY,
				axisalignedbb.minZ);
		tessellator.addVertex(axisalignedbb.maxX, axisalignedbb.minY,
				axisalignedbb.maxZ);
		tessellator.addVertex(axisalignedbb.minX, axisalignedbb.minY,
				axisalignedbb.maxZ);
		tessellator.addVertex(axisalignedbb.minX, axisalignedbb.minY,
				axisalignedbb.minZ);
		tessellator.addVertex(axisalignedbb.minX, axisalignedbb.minY,
				axisalignedbb.maxZ);
		tessellator.addVertex(axisalignedbb.maxX, axisalignedbb.minY,
				axisalignedbb.maxZ);
		tessellator.addVertex(axisalignedbb.maxX, axisalignedbb.minY,
				axisalignedbb.minZ);
		tessellator.draw();
		tessellator.startDrawingQuads();
		tessellator.addVertex(axisalignedbb.minX, axisalignedbb.minY,
				axisalignedbb.minZ);
		tessellator.addVertex(axisalignedbb.minX, axisalignedbb.maxY,
				axisalignedbb.minZ);
		tessellator.addVertex(axisalignedbb.minX, axisalignedbb.minY,
				axisalignedbb.maxZ);
		tessellator.addVertex(axisalignedbb.minX, axisalignedbb.maxY,
				axisalignedbb.maxZ);
		tessellator.addVertex(axisalignedbb.maxX, axisalignedbb.minY,
				axisalignedbb.maxZ);
		tessellator.addVertex(axisalignedbb.maxX, axisalignedbb.maxY,
				axisalignedbb.maxZ);
		tessellator.addVertex(axisalignedbb.maxX, axisalignedbb.minY,
				axisalignedbb.minZ);
		tessellator.addVertex(axisalignedbb.maxX, axisalignedbb.maxY,
				axisalignedbb.minZ);
		tessellator.draw();
		tessellator.startDrawingQuads();
		tessellator.addVertex(axisalignedbb.minX, axisalignedbb.maxY,
				axisalignedbb.maxZ);
		tessellator.addVertex(axisalignedbb.minX, axisalignedbb.minY,
				axisalignedbb.maxZ);
		tessellator.addVertex(axisalignedbb.minX, axisalignedbb.maxY,
				axisalignedbb.minZ);
		tessellator.addVertex(axisalignedbb.minX, axisalignedbb.minY,
				axisalignedbb.minZ);
		tessellator.addVertex(axisalignedbb.maxX, axisalignedbb.maxY,
				axisalignedbb.minZ);
		tessellator.addVertex(axisalignedbb.maxX, axisalignedbb.minY,
				axisalignedbb.minZ);
		tessellator.addVertex(axisalignedbb.maxX, axisalignedbb.maxY,
				axisalignedbb.maxZ);
		tessellator.addVertex(axisalignedbb.maxX, axisalignedbb.minY,
				axisalignedbb.maxZ);
		tessellator.draw();
	}

	public void drawLine(final double x, final double y, final double z,
			final double a, final double b, final double c) {
		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
		GL11.glDepthMask(false);
		GL11.glHint(GL11.GL_LINE_SMOOTH_HINT, GL11.GL_NICEST);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glEnable(GL11.GL_LINE_SMOOTH);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glEnable(GL13.GL_MULTISAMPLE);
		GL11.glEnable(GL11.GL_POINT_SMOOTH);

		GL11.glBegin(GL11.GL_LINE_LOOP);
		GL11.glVertex3d(x, y, z);
		GL11.glVertex3d(a, b, c);
		GL11.glEnd();

		GL11.glDisable(GL11.GL_LINE_SMOOTH);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glDepthMask(true);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		GL11.glPopMatrix();
	}

	public void drawEspLines(final AxisAlignedBB axis) {
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
		GL11.glDepthMask(false);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glEnable(GL11.GL_LINE_SMOOTH);
		GL11.glEnable(GL11.GL_BLEND);

		GL11.glBegin(GL11.GL_LINE_LOOP);
		// top
		GL11.glVertex3d(axis.maxX, axis.maxY, axis.maxZ);
		GL11.glVertex3d(axis.minX, axis.maxY, axis.minZ);
		GL11.glEnd();

		// left + front
		GL11.glBegin(GL11.GL_LINES);
		GL11.glVertex3d(axis.maxX, axis.minY, axis.minZ); // left
		GL11.glVertex3d(axis.maxX, axis.maxY, axis.maxZ); // ----
		GL11.glVertex3d(axis.minX, axis.minY, axis.maxZ); // front
		GL11.glVertex3d(axis.maxX, axis.maxY, axis.maxZ); // ----
		GL11.glEnd();

		// right + back
		GL11.glBegin(GL11.GL_LINES);
		GL11.glVertex3d(axis.minX, axis.maxY, axis.maxZ); // right
		GL11.glVertex3d(axis.minX, axis.minY, axis.minZ); // -----
		GL11.glVertex3d(axis.minX, axis.minY, axis.minZ); // back
		GL11.glVertex3d(axis.maxX, axis.maxY, axis.minZ); // ----
		GL11.glEnd();

		// bottom
		GL11.glBegin(GL11.GL_LINE_LOOP);
		GL11.glVertex3d(axis.minX, axis.minY, axis.minZ);
		GL11.glVertex3d(axis.maxX, axis.minY, axis.maxZ);
		GL11.glEnd();

		GL11.glDisable(GL11.GL_LINE_SMOOTH);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glDepthMask(true);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
	}

	/**
	 * Renders a sphere will all faces filled.
	 * 
	 * @param sphere
	 * @param size
	 * @param radius
	 * @param faces
	 */
	public void renderFillSphere(Sphere sphere, float size, int radius,
			int faces) {
		sphere.setDrawStyle(GLU.GLU_FILL);
		sphere.draw(size, radius, faces);
	}

	/**
	 * Renders a sphere covered in lines, rather than fully filled in.
	 * 
	 * @param sphere
	 * @param size
	 * @param radius
	 * @param faces
	 */
	public void renderLinedSphere(Sphere sphere, float size, int radius,
			int faces) {
		sphere.setDrawStyle(GLU.GLU_LINE);
		sphere.draw(size, radius, faces);
	}

	public void renderBoxLines(AxisAlignedBB axisAlignedBB) {
		GL11.glPushMatrix();
		GL11.glBegin(GL11.GL_LINE_LOOP);
		GL11.glVertex3d(axisAlignedBB.maxX, axisAlignedBB.maxY,
				axisAlignedBB.maxZ);
		GL11.glVertex3d(axisAlignedBB.minX, axisAlignedBB.maxY,
				axisAlignedBB.minZ);
		GL11.glEnd();
		GL11.glBegin(GL11.GL_LINES);
		GL11.glVertex3d(axisAlignedBB.maxX, axisAlignedBB.minY,
				axisAlignedBB.minZ);
		GL11.glVertex3d(axisAlignedBB.maxX, axisAlignedBB.maxY,
				axisAlignedBB.maxZ);
		GL11.glVertex3d(axisAlignedBB.minX, axisAlignedBB.minY,
				axisAlignedBB.maxZ);
		GL11.glVertex3d(axisAlignedBB.maxX, axisAlignedBB.maxY,
				axisAlignedBB.maxZ);
		GL11.glEnd();
		GL11.glBegin(GL11.GL_LINES);
		GL11.glVertex3d(axisAlignedBB.minX, axisAlignedBB.maxY,
				axisAlignedBB.maxZ);
		GL11.glVertex3d(axisAlignedBB.minX, axisAlignedBB.minY,
				axisAlignedBB.minZ);
		GL11.glVertex3d(axisAlignedBB.minX, axisAlignedBB.minY,
				axisAlignedBB.minZ);
		GL11.glVertex3d(axisAlignedBB.maxX, axisAlignedBB.maxY,
				axisAlignedBB.minZ);
		GL11.glEnd();
		GL11.glBegin(GL11.GL_LINE_LOOP);
		GL11.glVertex3d(axisAlignedBB.minX, axisAlignedBB.minY,
				axisAlignedBB.minZ);
		GL11.glVertex3d(axisAlignedBB.maxX, axisAlignedBB.minY,
				axisAlignedBB.maxZ);
		GL11.glEnd();
		GL11.glPopMatrix();
	}

	public void renderBox(AxisAlignedBB axisAlignedBB) {
		GL11.glPushMatrix();
		GL11.glBegin(GL11.GL_LINE_LOOP);
		GL11.glVertex3d(axisAlignedBB.minX, axisAlignedBB.minY,
				axisAlignedBB.minZ);
		GL11.glVertex3d(axisAlignedBB.minX, axisAlignedBB.maxY,
				axisAlignedBB.minZ);
		GL11.glVertex3d(axisAlignedBB.minX, axisAlignedBB.maxY,
				axisAlignedBB.maxZ);
		GL11.glVertex3d(axisAlignedBB.minX, axisAlignedBB.minY,
				axisAlignedBB.maxZ);
		GL11.glEnd();
		GL11.glBegin(GL11.GL_LINE_LOOP);
		GL11.glVertex3d(axisAlignedBB.maxX, axisAlignedBB.minY,
				axisAlignedBB.minZ);
		GL11.glVertex3d(axisAlignedBB.maxX, axisAlignedBB.maxY,
				axisAlignedBB.minZ);
		GL11.glVertex3d(axisAlignedBB.maxX, axisAlignedBB.maxY,
				axisAlignedBB.maxZ);
		GL11.glVertex3d(axisAlignedBB.maxX, axisAlignedBB.minY,
				axisAlignedBB.maxZ);
		GL11.glEnd();
		GL11.glBegin(GL11.GL_LINE_LOOP);
		GL11.glVertex3d(axisAlignedBB.minX, axisAlignedBB.maxY,
				axisAlignedBB.minZ);
		GL11.glVertex3d(axisAlignedBB.maxX, axisAlignedBB.maxY,
				axisAlignedBB.minZ);
		GL11.glVertex3d(axisAlignedBB.maxX, axisAlignedBB.maxY,
				axisAlignedBB.maxZ);
		GL11.glVertex3d(axisAlignedBB.minX, axisAlignedBB.maxY,
				axisAlignedBB.maxZ);
		GL11.glEnd();
		GL11.glBegin(GL11.GL_LINE_LOOP);
		GL11.glVertex3d(axisAlignedBB.minX, axisAlignedBB.minY,
				axisAlignedBB.minZ);
		GL11.glVertex3d(axisAlignedBB.maxX, axisAlignedBB.minY,
				axisAlignedBB.minZ);
		GL11.glVertex3d(axisAlignedBB.maxX, axisAlignedBB.minY,
				axisAlignedBB.maxZ);
		GL11.glVertex3d(axisAlignedBB.minX, axisAlignedBB.minY,
				axisAlignedBB.maxZ);
		GL11.glEnd();
		GL11.glPopMatrix();
	}

	public void disableOpenGL(final float lineWidth) {
		GL11.glHint(GL11.GL_LINE_SMOOTH_HINT, GL11.GL_NICEST);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glEnable(GL11.GL_LINE_SMOOTH);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glEnable(GL13.GL_MULTISAMPLE);
		GL11.glEnable(GL11.GL_POINT_SMOOTH);
		GL11.glLineWidth(lineWidth);
	}

	public void enableOpenGL() {
		GL11.glDisable(GL11.GL_LINE_SMOOTH);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glDepthMask(true);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
	}

}

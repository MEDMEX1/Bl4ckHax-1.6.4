package MEDMEX.Util;



import org.lwjgl.opengl.GL11;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Tessellator;

public class RenderUtils {
	
	public static void drawOutlinedBoundingBox(AxisAlignedBB aa) {
		Tessellator tessellator = Tessellator.instance;
		tessellator.startDrawing(3);
		tessellator.addVertex(aa.minX, aa.minY, aa.minZ);
		tessellator.addVertex(aa.maxX, aa.minY, aa.minZ);
		tessellator.addVertex(aa.maxX, aa.minY, aa.maxZ);
		tessellator.addVertex(aa.minX, aa.minY, aa.maxZ);
		tessellator.addVertex(aa.minX, aa.minY, aa.minZ);
		tessellator.draw();
		tessellator.startDrawing(3);
		tessellator.addVertex(aa.minX, aa.maxY, aa.minZ);
		tessellator.addVertex(aa.maxX, aa.maxY, aa.minZ);
		tessellator.addVertex(aa.maxX, aa.maxY, aa.maxZ);
		tessellator.addVertex(aa.minX, aa.maxY, aa.maxZ);
		tessellator.addVertex(aa.minX, aa.maxY, aa.minZ);
		tessellator.draw();
		tessellator.startDrawing(1);
		tessellator.addVertex(aa.minX, aa.minY, aa.minZ);
		tessellator.addVertex(aa.minX, aa.maxY, aa.minZ);
		tessellator.addVertex(aa.maxX, aa.minY, aa.minZ);
		tessellator.addVertex(aa.maxX, aa.maxY, aa.minZ);
		tessellator.addVertex(aa.maxX, aa.minY, aa.maxZ);
		tessellator.addVertex(aa.maxX, aa.maxY, aa.maxZ);
		tessellator.addVertex(aa.minX, aa.minY, aa.maxZ);
		tessellator.addVertex(aa.minX, aa.maxY, aa.maxZ);
		tessellator.draw();
	}
	
	public static void drawBoundingBox(AxisAlignedBB aa)  {
		Tessellator tessellator = Tessellator.instance;
		tessellator.startDrawingQuads();
		tessellator.addVertex(aa.minX, aa.minY, aa.minZ);
		tessellator.addVertex(aa.minX, aa.maxY, aa.minZ);
		tessellator.addVertex(aa.maxX, aa.minY, aa.minZ);
		tessellator.addVertex(aa.maxX, aa.maxY, aa.minZ);
		tessellator.addVertex(aa.maxX, aa.minY, aa.maxZ);
		tessellator.addVertex(aa.maxX, aa.maxY, aa.maxZ);
		tessellator.addVertex(aa.minX, aa.minY, aa.maxZ);
		tessellator.addVertex(aa.minX, aa.maxY, aa.maxZ);
		tessellator.draw();
		tessellator.startDrawingQuads();
		tessellator.addVertex(aa.maxX, aa.maxY, aa.minZ);
		tessellator.addVertex(aa.maxX, aa.minY, aa.minZ);
		tessellator.addVertex(aa.minX, aa.maxY, aa.minZ);
		tessellator.addVertex(aa.minX, aa.minY, aa.minZ);
		tessellator.addVertex(aa.minX, aa.maxY, aa.maxZ);
		tessellator.addVertex(aa.minX, aa.minY, aa.maxZ);
		tessellator.addVertex(aa.maxX, aa.maxY, aa.maxZ);
		tessellator.addVertex(aa.maxX, aa.minY, aa.maxZ);
		tessellator.draw();
		tessellator.startDrawingQuads();
		tessellator.addVertex(aa.minX, aa.maxY, aa.minZ);
		tessellator.addVertex(aa.maxX, aa.maxY, aa.minZ);
		tessellator.addVertex(aa.maxX, aa.maxY, aa.maxZ);
		tessellator.addVertex(aa.minX, aa.maxY, aa.maxZ);
		tessellator.addVertex(aa.minX, aa.maxY, aa.minZ);
		tessellator.addVertex(aa.minX, aa.maxY, aa.maxZ);
		tessellator.addVertex(aa.maxX, aa.maxY, aa.maxZ);
		tessellator.addVertex(aa.maxX, aa.maxY, aa.minZ);
		tessellator.draw();
		tessellator.startDrawingQuads();
		tessellator.addVertex(aa.minX, aa.minY, aa.minZ);
		tessellator.addVertex(aa.maxX, aa.minY, aa.minZ);
		tessellator.addVertex(aa.maxX, aa.minY, aa.maxZ);
		tessellator.addVertex(aa.minX, aa.minY, aa.maxZ);
		tessellator.addVertex(aa.minX, aa.minY, aa.minZ);
		tessellator.addVertex(aa.minX, aa.minY, aa.maxZ);
		tessellator.addVertex(aa.maxX, aa.minY, aa.maxZ);
		tessellator.addVertex(aa.maxX, aa.minY, aa.minZ);
		tessellator.draw();
		tessellator.startDrawingQuads();
		tessellator.addVertex(aa.minX, aa.minY, aa.minZ);
		tessellator.addVertex(aa.minX, aa.maxY, aa.minZ);
		tessellator.addVertex(aa.minX, aa.minY, aa.maxZ);
		tessellator.addVertex(aa.minX, aa.maxY, aa.maxZ);
		tessellator.addVertex(aa.maxX, aa.minY, aa.maxZ);
		tessellator.addVertex(aa.maxX, aa.maxY, aa.maxZ);
		tessellator.addVertex(aa.maxX, aa.minY, aa.minZ);
		tessellator.addVertex(aa.maxX, aa.maxY, aa.minZ);
		tessellator.draw();
		tessellator.startDrawingQuads();
		tessellator.addVertex(aa.minX, aa.maxY, aa.maxZ);
		tessellator.addVertex(aa.minX, aa.minY, aa.maxZ);
		tessellator.addVertex(aa.minX, aa.maxY, aa.minZ);
		tessellator.addVertex(aa.minX, aa.minY, aa.minZ);
		tessellator.addVertex(aa.maxX, aa.maxY, aa.minZ);
		tessellator.addVertex(aa.maxX, aa.minY, aa.minZ);
		tessellator.addVertex(aa.maxX, aa.maxY, aa.maxZ);
		tessellator.addVertex(aa.maxX, aa.minY, aa.maxZ);
		tessellator.draw();
	}

	public static void drawOutlinedBlockESP(double x, double y, double z, float red, float green, float blue, float alpha, float lineWidth) {
		GL11.glPushMatrix();
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(770, 771);
		 GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glEnable(GL11.GL_LINE_SMOOTH);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
		GL11.glDepthMask(false);
		GL11.glLineWidth(lineWidth);
		GL11.glColor4f(red, green, blue, alpha);
		drawOutlinedBoundingBox(new AxisAlignedBB(x, y, z, x + 1D, y + 1D, z + 1D));
		GL11.glDisable(GL11.GL_LINE_SMOOTH);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		 GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		GL11.glDepthMask(true);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
	}
	
	public static void drawBlockESP(double x, double y, double z, float red, float green, float blue, float alpha, float lineRed, float lineGreen, float lineBlue, float lineAlpha, float lineWidth) {
		GL11.glPushMatrix();
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(770, 771);
		// GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glEnable(GL11.GL_LINE_SMOOTH);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
		GL11.glDepthMask(false);
		GL11.glColor4f(red, green, blue, alpha);
		drawBoundingBox(new AxisAlignedBB(x, y, z, x + 1D, y + 1D, z + 1D));
		GL11.glLineWidth(lineWidth);
		GL11.glColor4f(lineRed, lineGreen, lineBlue, lineAlpha);
		drawOutlinedBoundingBox(new AxisAlignedBB(x, y, z, x + 1D, y + 1D, z + 1D));
		GL11.glDisable(GL11.GL_LINE_SMOOTH);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		// GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		GL11.glDepthMask(true);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
	
	}
	
	public static void drawSolidBlockESP(double x, double y, double z, float red, float green, float blue, float alpha) {
		GL11.glPushMatrix();
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(770, 771);
		// GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glEnable(GL11.GL_LINE_SMOOTH);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
		GL11.glDepthMask(false);
		GL11.glColor4f(red, green, blue, alpha);
		drawBoundingBox(new AxisAlignedBB(x, y, z, x + 1D, y + 1D, z + 1D));
		GL11.glDisable(GL11.GL_LINE_SMOOTH);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		// GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		GL11.glDepthMask(true);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
	}
	
	public static void drawOutlinedEntityESP(double x, double y, double z, double width, double height, float red, float green, float blue, float alpha) {
		GL11.glPushMatrix();
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(770, 771);
		// GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glEnable(GL11.GL_LINE_SMOOTH);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
		GL11.glDepthMask(false);
		GL11.glColor4f(red, green, blue, alpha);
		drawOutlinedBoundingBox(new AxisAlignedBB(x - width, y, z - width, x + width , y + height, z + width));
		GL11.glDisable(GL11.GL_LINE_SMOOTH);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		// GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		GL11.glDepthMask(true);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
	}
	
	public static void drawSolidEntityESP(double x, double y, double z, double width, double height, float red, float green, float blue, float alpha) {
		GL11.glPushMatrix();
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(770, 771);
		// GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glEnable(GL11.GL_LINE_SMOOTH);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
		GL11.glDepthMask(false);
		GL11.glColor4f(red, green, blue, alpha);
		drawBoundingBox(new AxisAlignedBB(x - width, y, z - width, x + width , y + height, z + width));
		GL11.glDisable(GL11.GL_LINE_SMOOTH);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		// GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		GL11.glDepthMask(true);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
	}

	public static void drawEntityESP(double x, double y, double z, double width, double height, float red, float green, float blue, float alpha, float lineRed, float lineGreen, float lineBlue, float lineAlpha, float lineWdith) {
		GL11.glPushMatrix();
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(770, 771);
		// GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glEnable(GL11.GL_LINE_SMOOTH);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
		GL11.glDepthMask(false);
		GL11.glColor4f(red, green, blue, alpha);
		drawBoundingBox(new AxisAlignedBB(x - width, y, z - width, x + width , y + height, z + width));
		GL11.glLineWidth(lineWdith);
		GL11.glColor4f(lineRed, lineGreen, lineBlue, lineAlpha);
		drawOutlinedBoundingBox(new AxisAlignedBB(x - width, y, z - width, x + width , y + height, z + width));
		GL11.glDisable(GL11.GL_LINE_SMOOTH);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		// GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		GL11.glDepthMask(true);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
	}
	
	public static void drawTracerLine(double x, double y, double z, float red, float green, float blue, float alpha, float lineWdith) {
		GL11.glPushMatrix();
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glEnable(GL11.GL_LINE_SMOOTH);
        GL11.glDisable(GL11.GL_DEPTH_TEST);
        // GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glLineWidth(lineWdith);
        GL11.glColor4f(red, green, blue, alpha);
        GL11.glBegin(2);
        GL11.glVertex3d(0.0D, 0.0D , 0.0D);
        GL11.glVertex3d(x, y, z);
        GL11.glEnd();
        GL11.glDisable(GL11.GL_BLEND);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glEnable(GL11.GL_DEPTH_TEST);
        GL11.glDisable(GL11.GL_LINE_SMOOTH);
        GL11.glDisable(GL11.GL_BLEND);
        // GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
	}
	
}

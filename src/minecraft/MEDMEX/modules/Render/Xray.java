package MEDMEX.modules.Render;

import java.util.List;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import MEDMEX.Util.Render3D;
import MEDMEX.events.Event;
import MEDMEX.events.RenderWorldEvent;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityLivingBase;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Minecraft;
import net.minecraft.src.RenderGlobal;
import net.minecraft.src.RenderManager;
import net.minecraft.src.TileEntityChestRenderer;

public class Xray extends Module {
	
	
	
	public Xray() {
		super("Xray", Keyboard.KEY_X, Category.RENDER);
		
	}
	
	public void onEnable() {
		Minecraft.renderGlobal.loadRenderers();
		Block.xray = true;
	}
	
	public void onDisable() {
		Block.xray = false;
		Minecraft.renderGlobal.loadRenderers();
	}
	
	

}

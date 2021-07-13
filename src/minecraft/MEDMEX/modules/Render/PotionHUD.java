package MEDMEX.modules.Render;

import java.util.List;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import MEDMEX.UI.HUD;
import MEDMEX.Util.ColorUtil;
import MEDMEX.Util.Render3D;
import MEDMEX.events.Event;
import MEDMEX.events.RenderWorldEvent;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityLivingBase;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.FontRenderer;
import net.minecraft.src.Minecraft;
import net.minecraft.src.RenderGlobal;
import net.minecraft.src.RenderManager;
import net.minecraft.src.ScaledResolution;
import net.minecraft.src.TileEntityChestRenderer;

public class PotionHUD extends Module {
	
	ScaledResolution sr = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
	FontRenderer fr = mc.fontRenderer;
	
	
	public PotionHUD() {
		super("PotionHUD", Keyboard.KEY_F19, Category.RENDER);
		
	}
	
	public void onEnable() {
		HUD.potionHUD = true;
	}
	
	public void onDisable() {
		HUD.potionHUD = false;
	}
	
	
	

}

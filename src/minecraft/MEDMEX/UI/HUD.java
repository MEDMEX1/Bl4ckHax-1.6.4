package MEDMEX.UI;

import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import org.lwjgl.input.Keyboard;

import MEDMEX.Client;
import MEDMEX.Util.ColorUtil;
import MEDMEX.modules.Module;
import MEDMEX.modules.Render.Info;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.FontRenderer;
import net.minecraft.src.GameSettings;
import net.minecraft.src.Gui;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MathHelper;
import net.minecraft.src.Minecraft;
import net.minecraft.src.ScaledResolution;
import net.minecraft.src.Session;

public class HUD {
	public static boolean potionHUD = false;
	public static boolean clickgui;
	long timer = 0;
	public static boolean infoenabled = false;
	public static int itemcount = 0;
	public static String var;
	public static String coords;
	public static boolean antiss = false;

	
	public Minecraft mc = Minecraft.getMinecraft();
	
	public static class ModuleComparator implements Comparator<Module> {

		@Override
		public int compare(Module o1, Module o2) {
			if(Minecraft.getMinecraft().fontRenderer.getStringWidth(o1.name + o1.attribute) > Minecraft.getMinecraft().fontRenderer.getStringWidth(o2.name + o2.attribute))
				return -1;
			if(Minecraft.getMinecraft().fontRenderer.getStringWidth(o1.name + o1.attribute) < Minecraft.getMinecraft().fontRenderer.getStringWidth(o2.name + o2.attribute))
				return 1;
			
			
			return 0;
		}
		
	}
	
	public void draw() {
		if(infoenabled == true) {
			
			double dx = mc.thePlayer.posX - mc.thePlayer.lastTickPosX;
			double dz = mc.thePlayer.posZ - mc.thePlayer.lastTickPosZ;
			
			double distance = dx * dx + dz * dz;
			
			
			double speed = (distance /1000f) / (0.05f/3600f);
			double speed2 = speed * mc.timer.timerSpeed;
			BigDecimal speed3 = new BigDecimal(speed2).setScale(1, RoundingMode.HALF_UP);
			
			if(!clickgui) {
			if(GameSettings.showDebugInfo == false) {
			int xCoord = (int) Minecraft.thePlayer.posX;
			int yCoord = (int) Minecraft.thePlayer.posY;
			int zCoord = (int) Minecraft.thePlayer.posZ;
			if(!(mc.thePlayer.getHeldItem() == null)) {
				int stacksize = Minecraft.thePlayer.inventory.getStackInSlot(Minecraft.thePlayer.inventory.currentItem).stackSize;
				String item = Minecraft.thePlayer.inventory.getStackInSlot(Minecraft.thePlayer.inventory.currentItem).getDisplayName();
				var = stacksize+" "+item;
			}else {
				var = "None";
			}
			
			if(antiss) {
			if(Keyboard.isKeyDown(60)) {
				
				coords = "[REDACTED]";
			}else {
				coords = "["+xCoord+", "+yCoord+", "+zCoord+"]";
			}
			}else {
				coords = "["+xCoord+", "+yCoord+", "+zCoord+"]";
			}
			
			mc.fontRenderer.drawStringWithShadow(coords, 4, 14, ColorUtil.getRainbow(4, 0.6f, 1, -100));
			mc.fontRenderer.drawStringWithShadow("Current Item: "+var, 4, 24, ColorUtil.getRainbow(4, 0.6f, 1, -200));
			mc.fontRenderer.drawStringWithShadow("Name: "+ Session.username, 4, 34, ColorUtil.getRainbow(4, 0.6f, 1, -300));
			mc.fontRenderer.drawStringWithShadow("Speed: "+speed3, 4, 44, ColorUtil.getRainbow(4, 0.6f, 1, -400));
		
			}
			}
		}
		
		if(potionHUD) {
			ScaledResolution sr = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
			FontRenderer fr = mc.fontRenderer;
			if(mc.thePlayer.getActivePotionEffects() != null) {
				 int effects = mc.thePlayer.getActivePotionEffects().size();
				 int count = 0;
				 for(int i = 0; i < effects; i++) {
					 String effect = mc.thePlayer.getActivePotionEffects().toArray()[i].toString();
					 String effectType = effect.split(",")[0];
					 String effectType2 = effectType.replace("potion.", "");
					 String effectTime = effect.split(",")[1];
					 String effectTime2 = effectTime.replace(" Duration: ", "");
					 int eTime = Integer.valueOf(effectTime2);
					 int truetime = eTime /20;
					 int seconds = truetime; 
				     int p1 = seconds % 60;
				     int p2 = seconds / 60;
				     int p3 = p2 % 60;
				     p2 = p2 / 60;
				     mc.fontRenderer.drawStringWithShadow(effectType2+", "+p3 + ":" + p1, sr.getScaledWidth() - fr.getStringWidth(effectType2+", "+p3 + ":" + p1) - 4, sr.getScaledHeight() - 12 + count * (fr.FONT_HEIGHT), ColorUtil.getRainbow(4, 0.6f, 1f, count * -100));			
				     count--;
				 }
			}
		}
		
		

		
		
		
		ScaledResolution sr = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
		FontRenderer fr = mc.fontRenderer;
		
		Collections.sort(Client.modules, new ModuleComparator());
		if(!clickgui) {
		if(GameSettings.showDebugInfo == false) {
		mc.fontRenderer.drawStringWithShadow(Client.name + " "+ Client.version, 4, 4, ColorUtil.getRainbow(4, 0.6f, 1, 1));
		}
		
		int count = 0;
		
		for(Module m : Client.modules) {
			
			if(!m.toggled)
				continue;	
			if(!clickgui) {
			if(GameSettings.showDebugInfo == false) {
			mc.fontRenderer.drawStringWithShadow(m.name + m.attribute, sr.getScaledWidth() - fr.getStringWidth(m.name + m.attribute) - 4, 4 + count * (fr.FONT_HEIGHT + 2), ColorUtil.getRainbow(4, 0.6f, 1, count * -100));
			}
			}
			count++;
			
		}
		}
		
		
	
}
}
	

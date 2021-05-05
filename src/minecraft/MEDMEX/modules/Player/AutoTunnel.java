package MEDMEX.modules.Player;

import org.lwjgl.input.Keyboard;

import MEDMEX.Client;
import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityClientPlayerMP;
import net.minecraft.src.MathHelper;
import net.minecraft.src.Minecraft;
import net.minecraft.src.NetServerHandler;
import net.minecraft.src.Packet10Flying;
import net.minecraft.src.Packet13PlayerLookMove;
import net.minecraft.src.Packet14BlockDig;
import net.minecraft.src.PlayerControllerMP;

public class AutoTunnel extends Module {
	int X, Y, Z , oX, oZ;
	
	public AutoTunnel() {
		super("AutoTunnel", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	
	public void onEnable() {
		
	}
	public void onDisable() {
		mc.gameSettings.keyBindAttack.pressed = false;
		EntityClientPlayerMP.rotationoverride = false;
	}
	
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate && e.isPre()) {
			int direction = MathHelper.floor_double((double)(this.mc.thePlayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
			X = (int)mc.thePlayer.posX;
			Y = (int)mc.thePlayer.posY;
			Z = (int)mc.thePlayer.posZ;
			float yaw = 0;
			//South
			if(direction == 0) {
				yaw = 0f;
				oZ = 1;
				oX = 0;
			}
			//West
			if(direction == 1) {
				yaw = 90f;
				oX = -1;
				oZ = 0;
			}
			//North
			if(direction == 2) {
				yaw = 180f;
				oZ = -1;
				oX = 0;
			}
			//East
			if(direction == 3) {
				yaw = 270f;
				oX = 1;
				oZ = 0;
			}
			
			int offsetX = 0, offsetZ = 0;
			
			if(mc.thePlayer.posX < 0 && mc.thePlayer.posZ < 0) {
				offsetX = -1;
				offsetZ = -1;
				
			}
			if(mc.thePlayer.posX > 0 && mc.thePlayer.posZ > 0) {
				offsetX = 0;
				offsetZ = 0;
			}
			if(mc.thePlayer.posX > 0 && mc.thePlayer.posZ < 0) {
				offsetX = 0;
				offsetZ = -1;
			}
			if(mc.thePlayer.posX < 0 && mc.thePlayer.posZ > 0) {
				offsetX = -1;
				offsetZ =  0;
			}
			
			mc.thePlayer.rotationYaw = yaw;
			if(!(mc.theWorld.isAirBlock(X+oX+offsetX, Y, Z+oZ+offsetZ)) && !(mc.theWorld.isAirBlock(X+oX+offsetX, Y-1, Z+oZ+offsetZ))) {
				float pitch = (float)  -(Math.asin(((Y) - mc.thePlayer.posY) / mc.thePlayer.getDistance(X+oX, Y, Z+oZ))*(180.0/Math.PI));
				mc.thePlayer.rotationPitch = pitch;
				mc.gameSettings.keyBindAttack.pressed = true;
			}
			if(mc.theWorld.isAirBlock(X+oX+offsetX, Y, Z+oZ+offsetZ)) {
				float pitch = (float)  -(Math.asin(((Y-1) - mc.thePlayer.posY) / mc.thePlayer.getDistance(X+oX, Y-1, Z+oZ))*(180.0/Math.PI));
				mc.thePlayer.rotationPitch = pitch;
				mc.gameSettings.keyBindAttack.pressed = true;
			}
			if(mc.theWorld.isAirBlock(X+oX+offsetX, Y-1, Z+oZ+offsetZ)) {
				float pitch = (float)  -(Math.asin(((Y) - mc.thePlayer.posY) / mc.thePlayer.getDistance(X+oX, Y, Z+oZ))*(180.0/Math.PI));
				mc.thePlayer.rotationPitch = pitch;
				mc.gameSettings.keyBindAttack.pressed = true;
			}
			if(mc.theWorld.isAirBlock(X+oX+offsetX, Y, Z+oZ+offsetZ) && mc.theWorld.isAirBlock(X+oX+offsetX, Y-1, Z+oZ+offsetZ)) {
				mc.thePlayer.rotationPitch = 0f;
				
			}
			
			
			
			
			
			
			
			
			
			}
			
			
		}


}

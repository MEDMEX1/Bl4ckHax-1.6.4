package MEDMEX.modules.Player;

import org.lwjgl.input.Keyboard;

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
		
	}
	
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate && e.isPre()) {
			int direction = MathHelper.floor_double((double)(this.mc.thePlayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
			X = (int)mc.thePlayer.posX;
			Y = (int)mc.thePlayer.posY;
			Z = (int)mc.thePlayer.posZ;
			//South
			if(direction == 0) {
				oZ = 1;
				oX = 0;
			}
			//West
			if(direction == 1) {
				oX = -1;
				oZ = 0;
			}
			//North
			if(direction == 2) {
				oZ = -1;
				oX = 0;
			}
			//East
			if(direction == 3) {
				oX = 1;
				oZ = 0;
			}
			mc.thePlayer.swingItem();
			
			
			mc.thePlayer.sendQueue.addToSendQueue(new Packet13PlayerLookMove(mc.thePlayer.posX, mc.thePlayer.boundingBox.minY, mc.thePlayer.posY, mc.thePlayer.posZ, mc.thePlayer.cameraYaw, 30, mc.thePlayer.onGround));
			mc.thePlayer.sendQueue.addToSendQueue(new Packet14BlockDig(0, X+oX, Y, Z+oZ, 1));
			mc.thePlayer.sendQueue.addToSendQueue(new Packet14BlockDig(2, X+oX, Y, Z+oZ, 1));
			mc.thePlayer.sendQueue.addToSendQueue(new Packet14BlockDig(0, X+oX, Y-1, Z+oZ, 1));
			mc.thePlayer.sendQueue.addToSendQueue(new Packet14BlockDig(2, X+oX, Y-1, Z+oZ, 1));
			
			
			
			
			}
			
			
		}


}

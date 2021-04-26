package MEDMEX.modules.Movement;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.EntityClientPlayerMP;
import net.minecraft.src.Minecraft;
import net.minecraft.src.NetServerHandler;
import net.minecraft.src.Packet12PlayerLook;
import net.minecraft.src.Packet13PlayerLookMove;
import net.minecraft.src.Packet15Place;

public class Tower extends Module {
	public static long timer = 0l;
	public static long count = 0l;
	public static int X;
	public static int Z;
	public static int offsetX;
	public static int offsetZ;
	public static long wait = 3l;
	
	public Tower() {
		super("Tower", Keyboard.KEY_I, Category.MOVEMENT);
	}
		
	
	public void onEnable() {
		NetServerHandler.freecamenabled = true;
		EntityClientPlayerMP.freecamenabled = true;
	}
	
	public void onDisable() {
		NetServerHandler.freecamenabled = false;
		EntityClientPlayerMP.freecamenabled = false;
	}
	
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				X = (int)mc.thePlayer.posX;
				Z = (int)mc.thePlayer.posZ;
				
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
				
				
				timer++;
				mc.thePlayer.onGround = true;
				mc.thePlayer.sendQueue.addToSendQueue(new Packet15Place(X+offsetX, (int)mc.thePlayer.posY-3, Z+offsetZ, 1, Minecraft.thePlayer.inventory.getStackInSlot(Minecraft.thePlayer.inventory.currentItem), 0, 0 ,0));
				mc.thePlayer.sendQueue.addToSendQueue(new Packet13PlayerLookMove(mc.thePlayer.posX, mc.thePlayer.boundingBox.minY, mc.thePlayer.posY, mc.thePlayer.posZ, 0f, 90f, mc.thePlayer.onGround));
				//mc.thePlayer.sendQueue.addToSendQueue(new Packet12PlayerLook(0f, 90f, false));
				mc.thePlayer.swingItem();
				if(timer >= wait) {
					if(count < 8) {
					mc.thePlayer.jump();
					count++;
					timer = 0l;
					wait = 3l;
					}else {
						wait = 13l;
						count = 0l;
					}
				
				}
				
			}
		}
	}
}

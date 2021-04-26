package MEDMEX.modules.Combat;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventMotion;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.EntityClientPlayerMP;
import net.minecraft.src.EntityLivingBase;
import net.minecraft.src.Minecraft;
import net.minecraft.src.NetServerHandler;
import net.minecraft.src.Packet12PlayerLook;
import net.minecraft.src.Packet15Place;
import net.minecraft.src.Packet255KickDisconnect;
import net.minecraft.src.Packet28EntityVelocity;
import net.minecraft.src.TcpConnection;

public class Box extends Module {
	public static long timer = 1l;
	public static int X;
	public static int Z;
	public static int offsetX;
	public static int offsetZ;
	
	public Box() {
		super("Box", Keyboard.KEY_Z, Category.COMBAT);
		
	}
	

	public void onEnable() {
	}
	
	public void onDisable() {
		timer = 0;
		
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
				if(timer >= 1) {
				mc.thePlayer.sendQueue.addToSendQueue(new Packet12PlayerLook(-90f, 60f, true));
				
				}
				if(timer >= 2) {
				mc.thePlayer.sendQueue.addToSendQueue(new Packet15Place(X+1+offsetX, (int)mc.thePlayer.posY-2, Z+offsetZ, 1, Minecraft.thePlayer.inventory.getStackInSlot(Minecraft.thePlayer.inventory.currentItem), 0, 0 ,0));
				mc.thePlayer.swingItem();
				}
				if(timer >= 3) {
					mc.thePlayer.sendQueue.addToSendQueue(new Packet12PlayerLook(0f, 60f, true));
				mc.thePlayer.sendQueue.addToSendQueue(new Packet15Place(X+offsetX, (int)mc.thePlayer.posY-2, Z+1+offsetZ, 1, Minecraft.thePlayer.inventory.getStackInSlot(Minecraft.thePlayer.inventory.currentItem), 0, 0 ,0));
				}
				if(timer >= 4) {
					mc.thePlayer.sendQueue.addToSendQueue(new Packet12PlayerLook(90f, 60f, true));
				mc.thePlayer.sendQueue.addToSendQueue(new Packet15Place(X-1+offsetX, (int)mc.thePlayer.posY-2,Z+offsetZ, 1, Minecraft.thePlayer.inventory.getStackInSlot(Minecraft.thePlayer.inventory.currentItem), 0, 0 ,0));
				}
				if(timer >= 5) {
					mc.thePlayer.sendQueue.addToSendQueue(new Packet12PlayerLook(180, 60f, true));
				mc.thePlayer.sendQueue.addToSendQueue(new Packet15Place(X+offsetX, (int)mc.thePlayer.posY-2, Z-1+offsetZ, 1, Minecraft.thePlayer.inventory.getStackInSlot(Minecraft.thePlayer.inventory.currentItem), 0, 0 ,0));
				}
				if(timer >= 6) {
				timer = 0;
				toggled = false;
				}
				
			}
		}
	}
}
	




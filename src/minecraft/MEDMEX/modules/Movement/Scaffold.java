package MEDMEX.modules.Movement;

import org.lwjgl.input.Keyboard;

import MEDMEX.Client;
import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.BlockFluid;
import net.minecraft.src.EntityClientPlayerMP;
import net.minecraft.src.EnumFacing;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MathHelper;
import net.minecraft.src.Minecraft;
import net.minecraft.src.NetServerHandler;
import net.minecraft.src.Packet11PlayerPosition;
import net.minecraft.src.Packet12PlayerLook;
import net.minecraft.src.Packet13PlayerLookMove;
import net.minecraft.src.Packet15Place;


public class Scaffold extends Module {
	public static int X;
	public static int Y;
	public static int Z;
	public static int offsetX;
	public static int offsetZ;
	public static long timer = 0l;
	public static int side = 2;
	public static float yaw = 0f;
	boolean jump = false;
	public static long jumptimer = 0l;
	public static long lefttimer = 0l;
	public static long righttimer = 0l;
	public static long uptimer = 0l;
	public static long backtimer = 0l;
	
	public EnumFacing f;
	public Scaffold() {
		super("Scaffold" , Keyboard.KEY_C, Category.MOVEMENT);
	}
	
	
	
		
	public void onEnable() {

		

	}
	public void onDisable() {
		EntityClientPlayerMP.rotationoverride = false;
		
		

	}

	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				EntityClientPlayerMP.rotationoverride = true;
				
				
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
				
				
				
				int direction = MathHelper.floor_double((double)(this.mc.thePlayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
				
				X = (int)mc.thePlayer.posX;
				Y = (int)mc.thePlayer.posY;
				Z = (int)mc.thePlayer.posZ;
				
				int left = 0, right = 0, forward = 0, back = 0;
				
				//South
				if(direction == 0) {
					left = 5;
					right = 4;
					forward = 3;
					back = 2;
				}
				//West
				if(direction == 1) {
					left = 3;
					right = 2;
					forward = 4;
					back = 5;
				}
				//North
				if(direction == 2) {
					left = 4;
					right = 5;
					forward = 2;
					back = 3;
				}
				//East
				if(direction == 3) {
					left = 2;
					right = 3;
					forward = 5;
					back = 4;
				}
				
				if(mc.gameSettings.keyBindLeft.pressed) {
					lefttimer++;
					EntityClientPlayerMP.customyaw = mc.thePlayer.cameraYaw-90;
					EntityClientPlayerMP.custompitch = 90f;
					if(lefttimer >= 1) {
					mc.thePlayer.sendQueue.addToSendQueue(new Packet15Place(X+offsetX, Y-2, Z+offsetZ, left, Minecraft.thePlayer.inventory.getStackInSlot(Minecraft.thePlayer.inventory.currentItem), 0, 0 ,0));
					mc.thePlayer.swingItem();
					lefttimer = 0l;
					}
				}
				if(mc.gameSettings.keyBindRight.pressed) {
					righttimer++;
					EntityClientPlayerMP.customyaw = mc.thePlayer.cameraYaw+90;
					EntityClientPlayerMP.custompitch = 90f;
					if(righttimer >= 1) {
					mc.thePlayer.sendQueue.addToSendQueue(new Packet15Place(X+offsetX, Y-2, Z+offsetZ, right, Minecraft.thePlayer.inventory.getStackInSlot(Minecraft.thePlayer.inventory.currentItem), 0, 0 ,0));
					mc.thePlayer.swingItem();
					
					righttimer = 0l;
					}
				}
				if(mc.gameSettings.keyBindForward.pressed) {
					uptimer++;
					EntityClientPlayerMP.customyaw = mc.thePlayer.cameraYaw;
					EntityClientPlayerMP.custompitch = 90f;
					if(uptimer >= 1) {
					mc.thePlayer.sendQueue.addToSendQueue(new Packet15Place(X+offsetX, Y-2, Z+offsetZ, forward, Minecraft.thePlayer.inventory.getStackInSlot(Minecraft.thePlayer.inventory.currentItem), 0, 0 ,0));
					mc.thePlayer.swingItem();
					uptimer = 0l;
					}
				}
				if(mc.gameSettings.keyBindBack.pressed) {
					backtimer++;
					EntityClientPlayerMP.customyaw = mc.thePlayer.cameraYaw-180;
					EntityClientPlayerMP.custompitch = 90f;
					if(backtimer >= 1) {
					mc.thePlayer.sendQueue.addToSendQueue(new Packet15Place(X+offsetX, Y-2, Z+offsetZ, back, Minecraft.thePlayer.inventory.getStackInSlot(Minecraft.thePlayer.inventory.currentItem), 0, 0 ,0));
					mc.thePlayer.swingItem();
					backtimer = 0l;
					}
				}
				if(mc.theWorld.isAirBlock(X, Y-2, Z)) {
					jump = true;
				}
				if(jump) {
					EntityClientPlayerMP.customyaw = mc.thePlayer.rotationYaw;
					EntityClientPlayerMP.custompitch = 90f;
					mc.thePlayer.sendQueue.addToSendQueue(new Packet15Place(X+offsetX, Y-3, Z+offsetZ, 1, Minecraft.thePlayer.inventory.getStackInSlot(Minecraft.thePlayer.inventory.currentItem), 0, 0 ,0));
					mc.thePlayer.swingItem();
					jumptimer++;
					if(jumptimer >= 3) {
						jumptimer = 0l;
						jump = false;
					}
				}
				
				
				
				
				
				
				
				}
			}
		}
	}




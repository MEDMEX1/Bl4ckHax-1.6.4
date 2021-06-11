package MEDMEX.modules.Movement;

import org.lwjgl.input.Keyboard;

import MEDMEX.Client;
import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.BlockFluid;
import net.minecraft.src.Entity;
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
import net.minecraft.src.RenderGlobal;


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
	
	public Scaffold() {
		super("Scaffold" , Keyboard.KEY_C, Category.MOVEMENT);
	}
	
	
	
		
	public void onEnable() {

		

	}
	public void onDisable() {
		if(!Safewalk.safewalk) {
			Entity.safewalkenabled = false;
		}
		EntityClientPlayerMP.rotationoverride = false;
		RenderGlobal.scaffold = false;
		

	}

	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				Entity.safewalkenabled = true;
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
				
				X = (int)mc.thePlayer.posX;
				Y = (int)mc.thePlayer.posY;
				Z = (int)mc.thePlayer.posZ;
				
				boolean movingX = false;
				boolean movingZ = false;;
				double posX = mc.thePlayer.posX;
				double posZ = mc.thePlayer.posZ;
				double decX = posX - X;
				double decZ = posZ - Z;		
				
				if(decX < 0.3 || decX > 0.7 || decX < -0.7 || decX > -0.3){
					//+X
					if(mc.thePlayer.motionX > 0.02) {
						if(mc.theWorld.isAirBlock(X+offsetX+1, Y-2, Z+offsetZ)) {
							RenderGlobal.scaffold = true;
							RenderGlobal.scaffoldx = X+offsetX+2;
							RenderGlobal.scaffoldy = Y-2;
							RenderGlobal.scaffoldz = Z+offsetZ;
							mc.thePlayer.swingItem();
							EntityClientPlayerMP.custompitch = 90f;
							EntityClientPlayerMP.customyaw = -90f;
							mc.thePlayer.sendQueue.addToSendQueue(new Packet15Place(X+offsetX, Y-2, Z+offsetZ, 5, Minecraft.thePlayer.inventory.getStackInSlot(Minecraft.thePlayer.inventory.currentItem), 0, 0 ,0));
						}
					}
					//-X
					if(mc.thePlayer.motionX < -0.02) {
						if(mc.theWorld.isAirBlock(X+offsetX-1, Y-2, Z+offsetZ)) {
							RenderGlobal.scaffold = true;
							RenderGlobal.scaffoldx = X+offsetX-2;
							RenderGlobal.scaffoldy = Y-2;
							RenderGlobal.scaffoldz = Z+offsetZ;
							mc.thePlayer.swingItem();
							EntityClientPlayerMP.custompitch = 90f;
							EntityClientPlayerMP.customyaw = 90f;
							mc.thePlayer.sendQueue.addToSendQueue(new Packet15Place(X+offsetX, Y-2, Z+offsetZ, 4, Minecraft.thePlayer.inventory.getStackInSlot(Minecraft.thePlayer.inventory.currentItem), 0, 0 ,0));
						}
					}
				}
				if(decZ < 0.3 || decZ > 0.7 || decZ < -0.7 || decZ > -0.3) {
					//+Z
					if(mc.thePlayer.motionZ > 0.02) {
						if(mc.theWorld.isAirBlock(X+offsetX, Y-2, Z+offsetZ+1)) {
							RenderGlobal.scaffold = true;
							RenderGlobal.scaffoldx = X+offsetX;
							RenderGlobal.scaffoldy = Y-2;
							RenderGlobal.scaffoldz = Z+offsetZ+2;
							mc.thePlayer.swingItem();
							EntityClientPlayerMP.custompitch = 90f;
							EntityClientPlayerMP.customyaw = 0f;
							mc.thePlayer.sendQueue.addToSendQueue(new Packet15Place(X+offsetX, Y-2, Z+offsetZ, 3, Minecraft.thePlayer.inventory.getStackInSlot(Minecraft.thePlayer.inventory.currentItem), 0, 0 ,0));
						}
					}
					//-Z
					if(mc.thePlayer.motionZ < -0.02) {
						if(mc.theWorld.isAirBlock(X+offsetX, Y-2, Z+offsetZ-1)) {
							mc.thePlayer.swingItem();
							RenderGlobal.scaffold = true;
							RenderGlobal.scaffoldx = X+offsetX;
							RenderGlobal.scaffoldy = Y-2;
							RenderGlobal.scaffoldz = Z+offsetZ-2;
							EntityClientPlayerMP.custompitch = 90f;
							EntityClientPlayerMP.customyaw = 180f;
							mc.thePlayer.sendQueue.addToSendQueue(new Packet15Place(X+offsetX, Y-2, Z+offsetZ, 2, Minecraft.thePlayer.inventory.getStackInSlot(Minecraft.thePlayer.inventory.currentItem), 0, 0 ,0));
						}
					}
					//jump
					if(mc.theWorld.isAirBlock(X+offsetX, Y-2, Z+offsetZ)) {
						EntityClientPlayerMP.customyaw = mc.thePlayer.rotationYaw;
						EntityClientPlayerMP.custompitch = 90f;
						RenderGlobal.scaffold = true;
						RenderGlobal.scaffoldx = X+offsetX;
						RenderGlobal.scaffoldy = Y-2;
						RenderGlobal.scaffoldz = Z+offsetZ;
						mc.thePlayer.sendQueue.addToSendQueue(new Packet15Place(X+offsetX, Y-3, Z+offsetZ, 1, Minecraft.thePlayer.inventory.getStackInSlot(Minecraft.thePlayer.inventory.currentItem), 0, 0 ,0));
						mc.thePlayer.swingItem();
					}
					
					
					
				}
				
				
				
				
				
				
			}
			
			}
		}
	}
	




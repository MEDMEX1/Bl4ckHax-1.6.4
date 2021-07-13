package MEDMEX.modules.Movement;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import MEDMEX.modules.Player.AutoEat;
import net.minecraft.src.EntityClientPlayerMP;
import net.minecraft.src.MathHelper;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet10Flying;
import net.minecraft.src.Packet11PlayerPosition;
import net.minecraft.src.Packet12PlayerLook;
import net.minecraft.src.Vec3;

public class PacketFly extends Module {
	private double posX, posY, posZ;
	private int timer = 0;
	
	public PacketFly() {
		super("PacketFly", Keyboard.KEY_F19, Category.MOVEMENT);
	}
	
	public void onEnable() {
	}

	
	public void onDisable() {
		mc.thePlayer.noClip = false;
	}
	
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				timer++;
				mc.thePlayer.setVelocity(0, 0, 0);
				mc.thePlayer.motionX=0;
				mc.thePlayer.motionY=0;
				mc.thePlayer.motionZ=0;
				if(mc.thePlayer != null) {
				mc.thePlayer.noClip = true;
				mc.thePlayer.onGround = true;
				double hspeed = 1;
				double vspeed = 1;
				
				if (mc.thePlayer.isDead) return;
				
				double mX = 0; double mY = 0; double mZ = 0;
				if (mc.thePlayer.rotationYawHead != mc.thePlayer.rotationYaw) {
					return;
				}
				
				if (mc.gameSettings.keyBindJump.pressed) mY = 0.062;
				if (mc.gameSettings.keyBindSneak.pressed) mY = -0.062;
				
				if (mc.gameSettings.keyBindForward.pressed) {
					int direction = MathHelper.floor_double((double)(this.mc.thePlayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
					if (direction == 0) mZ = -0.275;
					if (direction == 1) mX = 0.275;
					if (direction == 2) mZ = 0.275;
					if (direction == 3) mX = -0.275;
				}
				
				if (timer > 2) {
					mX = 0;
					mZ = 0;
					mY = -0.062;
					timer = 0;
				}
				mc.thePlayer.sendQueue.addToSendQueue(new Packet11PlayerPosition(mc.thePlayer.posX + mX, mc.thePlayer.boundingBox.minY, mc.thePlayer.posY + mY,  mc.thePlayer.posZ + mZ, false));
				mc.thePlayer.sendQueue.addToSendQueue(new Packet11PlayerPosition(mc.thePlayer.posX + mX, mc.thePlayer.boundingBox.minY, mc.thePlayer.posY - 10,  mc.thePlayer.posZ + mZ, true));
			}
			}
					
				} 
			
			
		}
	}


package MEDMEX.modules.Movement;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import MEDMEX.modules.Player.AutoEat;
import net.minecraft.src.MathHelper;
import net.minecraft.src.Minecraft;

public class Strafe extends Module {
	
	public Strafe() {
		super("Strafe", Keyboard.KEY_F19, Category.MOVEMENT);
	}
		

	
	public void onDisable() {
	}
	
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				 boolean moving = Math.abs(mc.thePlayer.movementInput.moveForward) > 0.1 || Math.abs(mc.thePlayer.movementInput.moveStrafe) > 0.1;
	                if (moving) {
	                	if(mc.thePlayer.onGround) {
	                		mc.thePlayer.jump();
	                	}
	                    double moveSpeed = MathHelper.sqrt_double(mc.thePlayer.motionX * mc.thePlayer.motionX + mc.thePlayer.motionZ * mc.thePlayer.motionZ);

	                    float forward = mc.thePlayer.movementInput.moveForward;
	                    float strafe = mc.thePlayer.movementInput.moveStrafe;
	                    float yaw = mc.thePlayer.rotationYaw;
	                    if (forward == 0 && strafe == 0) {
	                        mc.thePlayer.motionX = 0;
	                        mc.thePlayer.motionZ = 0;
	                    } else if (forward != 0) {
	                        if (strafe >= 1.0f) {
	                            yaw += ((forward > 0.0f) ? -45 : 45);
	                            strafe = 0.0f;
	                        } else if (strafe <= -1.0f) {
	                            yaw += ((forward > 0.0f) ? 45 : -45);
	                            strafe = 0.0f;
	                        }
	                    }

	                    if (forward > 0) {
	                        forward = 1;
	                    } else if (forward < 0) {
	                        forward = -1;
	                    }

	                    final double mx = Math.cos(Math.toRadians(yaw + 90));
	                    final double mz = Math.sin(Math.toRadians(yaw + 90));

	                    mc.thePlayer.motionX = (forward * moveSpeed * mx + strafe * moveSpeed * mz);
	                    mc.thePlayer.motionZ = (forward * moveSpeed * mz - strafe * moveSpeed * mx);

	                } else {
	                    mc.thePlayer.motionX = 0;
	                    mc.thePlayer.motionZ = 0;
	                }
			
			
		}
	}
			
			
			
	
	
	
	 
		
	
		
	
}
}
	
	
	


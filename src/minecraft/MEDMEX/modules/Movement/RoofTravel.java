package MEDMEX.modules.Movement;

import org.lwjgl.input.Keyboard;

import MEDMEX.Client;
import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import MEDMEX.modules.Player.AutoEat;
import MEDMEX.modules.Render.Waypoint;
import net.minecraft.src.Minecraft;
import net.minecraft.src.RenderGlobal;

public class RoofTravel extends Module {
	
	public RoofTravel() {
		super("RoofTravel", Keyboard.KEY_F19, Category.MOVEMENT);
	}
		

	
	public void onDisable() {
		
	}
	
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				if((int)mc.thePlayer.posY == 129) {
					if(RenderGlobal.waypointX != 0) {
						int X = (int) RenderGlobal.waypointX;
						int Z = (int) RenderGlobal.waypointZ;
						
						float yaw = (float) -(Math.atan2((X-mc.thePlayer.posX),(Z-mc.thePlayer.posZ))*(180.0/Math.PI));
						mc.thePlayer.rotationYaw = yaw;
						
						boolean atTarget = false;
						
						if(((int)mc.thePlayer.posX == (int)RenderGlobal.waypointX) && ((int)mc.thePlayer.posZ == (int)RenderGlobal.waypointZ)) {
							atTarget = true;
						}
						
						if(!atTarget) {
							if(!AutoEat.started) {
								mc.gameSettings.keyBindForward.pressed = true;
								}else {
									mc.gameSettings.keyBindForward.pressed = Keyboard.isKeyDown(mc.gameSettings.keyBindForward.keyCode);
								}
						}else {
							mc.gameSettings.keyBindForward.pressed = Keyboard.isKeyDown(mc.gameSettings.keyBindForward.keyCode);
							Client.addChatMessage("Arrived at destination");
							this.toggle();
						}
						
					}else {
						Client.addChatMessage("Set a waypoint first");
						this.toggle();
					}
				}
				else {
					Client.addChatMessage("Get on the roof first");
					this.toggle();
				}
			}
		}
	}
}

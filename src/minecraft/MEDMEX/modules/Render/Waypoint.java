package MEDMEX.modules.Render;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import MEDMEX.Client;
import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.Direction;
import net.minecraft.src.Entity;
import net.minecraft.src.EnumFacing;
import net.minecraft.src.Facing;
import net.minecraft.src.RenderGlobal;

public class Waypoint extends Module {
	public static int X;
	public static int Y;
	public static int Z;
	
	
	public Waypoint() {
		super("Waypoint", Keyboard.KEY_F19, Category.RENDER);
		
	}
	
	public void onEnable() {
		RenderGlobal.waypoint = true;
	}
	
	public void onDisable() {
		RenderGlobal.waypoint = false;
		RenderGlobal.waypointoutline = false;
		
	}
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				
			}
				
			}
				
				
	}
}


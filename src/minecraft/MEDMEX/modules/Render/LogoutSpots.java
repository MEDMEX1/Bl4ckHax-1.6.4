package MEDMEX.modules.Render;

import java.util.List;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.GuiPlayerInfo;
import net.minecraft.src.MapData;
import net.minecraft.src.Minecraft;
import net.minecraft.src.NetClientHandler;
import net.minecraft.src.RenderGlobal;
import net.minecraft.src.ScorePlayerTeam;
import net.minecraft.src.World;

public class LogoutSpots extends Module {
	
	
	
	public LogoutSpots() {
		super("LogoutSpots", Keyboard.KEY_F19, Category.RENDER);
		
	}
	
	public void onEnable() {
		World.logoutspots = true;
	}
	
	public void onDisable() {
		World.logoutspots = false;
		try {
		for(int i = 0; i < 99; i++) {
		Minecraft.theWorld.removeEntityFromWorld(i);
		}
		
	}catch(Exception e) {
		
	}
	}
	

}

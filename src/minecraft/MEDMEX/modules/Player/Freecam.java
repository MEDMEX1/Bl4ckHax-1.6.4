package MEDMEX.modules.Player;

import org.lwjgl.input.Keyboard;

import MEDMEX.Client;
import MEDMEX.Util.FreecamHandler;
import MEDMEX.events.Event;
import MEDMEX.events.MotionUpdateEvent;
import MEDMEX.events.listeners.EventMotion;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.EntityClientPlayerMP;
import net.minecraft.src.EntityOtherPlayerMP;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Minecraft;
import net.minecraft.src.NetServerHandler;
import net.minecraft.src.Packet10Flying;
import net.minecraft.src.Packet11PlayerPosition;
import net.minecraft.src.Packet12PlayerLook;
import net.minecraft.src.TcpConnection;

public class Freecam extends Module {
	

	
	private final FreecamHandler handler = new FreecamHandler();
	
	public Freecam() {
		super("Freecam", Keyboard.KEY_U, Category.PLAYER);
		
	}
	
	

	 
	public void onEnable() {
		EntityPlayer entity = new EntityOtherPlayerMP(Minecraft.theWorld, Minecraft.thePlayer.username);
		entity.copyDataFrom(Minecraft.thePlayer, true);
		entity.posY -= Minecraft.thePlayer.yOffset;
		Minecraft.theWorld.addEntityToWorld(-1, entity);
		NetServerHandler.freecamenabled = true;
		EntityClientPlayerMP.freecamenabled = true;
		mc.thePlayer.capabilities.isFlying = true;
		handler.saveLocation(mc.thePlayer);
	}

	public void onDisable() {
		Minecraft.theWorld.removeEntityFromWorld(-1);
		NetServerHandler.freecamenabled = false;
		EntityClientPlayerMP.freecamenabled = false;
		handler.resetLocation();
	}
	

	}
	


	 

	
	
	
		


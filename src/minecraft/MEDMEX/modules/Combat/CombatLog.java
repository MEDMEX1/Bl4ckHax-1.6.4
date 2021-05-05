package MEDMEX.modules.Combat;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventMotion;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.EntityLivingBase;
import net.minecraft.src.NetServerHandler;
import net.minecraft.src.Packet255KickDisconnect;
import net.minecraft.src.Packet28EntityVelocity;
import net.minecraft.src.TcpConnection;

public class CombatLog extends Module {
	
	public CombatLog() {
		super("CombatLog", Keyboard.KEY_F19, Category.COMBAT);
		
	}
	public static float customhealth = 6.0f;
	

	public void onEnable() {

	}
	
	public void onDisable() {
		
	}
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				this.attribute = " ["+customhealth+"]";
				if(mc.thePlayer.getHealth() < customhealth) {
					mc.theWorld.sendQuittingDisconnectingPacket();
					toggled = false;	
					
				}
			}
		}
	}
	

}



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
import net.minecraft.src.NetServerHandler;
import net.minecraft.src.Packet255KickDisconnect;
import net.minecraft.src.Packet28EntityVelocity;
import net.minecraft.src.TcpConnection;

public class Aura extends Module {
	
	public Aura() {
		super("Aura", Keyboard.KEY_H, Category.COMBAT);
		
	}
	

	public void onEnable() {
		EntityClientPlayerMP.aura = true;

	}
	
	public void onDisable() {
		EntityClientPlayerMP.aura = false;
		EntityClientPlayerMP.rotationoverride = false;
		
	}
}
	




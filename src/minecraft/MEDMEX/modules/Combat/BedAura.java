package MEDMEX.modules.Combat;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventMotion;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.BlockBed;
import net.minecraft.src.EntityClientPlayerMP;
import net.minecraft.src.EntityLivingBase;
import net.minecraft.src.NetServerHandler;
import net.minecraft.src.Packet255KickDisconnect;
import net.minecraft.src.Packet28EntityVelocity;
import net.minecraft.src.TcpConnection;

public class BedAura extends Module {
	
	public BedAura() {
		super("BedAura", Keyboard.KEY_F19, Category.COMBAT);
		
	}
	

	public void onEnable() {
		BlockBed.bedaura = true;

	}
	
	public void onDisable() {
		BlockBed.bedaura = false;
		
	}
}
	




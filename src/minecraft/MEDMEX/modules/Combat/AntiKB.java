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
import net.minecraft.src.NetClientHandler;
import net.minecraft.src.Packet28EntityVelocity;

public class AntiKB extends Module {
	
	public AntiKB() {
		super("AntiKB", Keyboard.KEY_F19, Category.COMBAT);
		
	}
	

	public void onEnable() {
		NetClientHandler.antikb = true;
	}
	
	public void onDisable() {
		NetClientHandler.antikb = false;
	}
	
	
}
	





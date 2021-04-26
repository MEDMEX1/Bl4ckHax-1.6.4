package MEDMEX.modules.Player;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.lwjgl.input.Keyboard;

import MEDMEX.UI.HUD;
import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.EntityPlayerMP;
import net.minecraft.src.Minecraft;
import net.minecraft.src.NetClientHandler;
import net.minecraft.src.Packet10Flying;

public class BedGodMode extends Module {
	
	public BedGodMode() {
		super("BedGodMode", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	
	public void onEnable() {
		NetClientHandler.bedgodmode = true;
		EntityPlayerMP.bedgodmode = true;
				
	}
	
	public void onDisable() {
		NetClientHandler.bedgodmode = false;
		EntityPlayerMP.bedgodmode = false;
	}

}

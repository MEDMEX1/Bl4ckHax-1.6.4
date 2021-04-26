package MEDMEX.modules.Player;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.BlockPortal;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet10Flying;
import net.minecraft.src.World;

public class DonkeyFinder extends Module {
	
	public DonkeyFinder() {
		super("DonkeyFinder", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	
	public void onEnable() {
		World.donkeyfinder = true;
	}
	public void onDisable() {
		World.donkeyfinder = false;
	}
		


}

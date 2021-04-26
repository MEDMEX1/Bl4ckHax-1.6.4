package MEDMEX.modules.Player;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.EntityLightningBolt;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet10Flying;
import net.minecraft.src.RenderGlobal;

public class SoundLocator extends Module {
	
	public SoundLocator() {
		super("SoundLocator", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	public void onEnable() {
		EntityLightningBolt.soundlocator = true;
		RenderGlobal.soundlocator = true;
		
	}
	public void onDisable() {
		RenderGlobal.soundlocator = false;
		EntityLightningBolt.soundlocator = false;
		
	}
	
	
		


}

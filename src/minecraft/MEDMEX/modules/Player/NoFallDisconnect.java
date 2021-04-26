package MEDMEX.modules.Player;

import org.lwjgl.input.Keyboard;

import MEDMEX.Client;
import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.ItemBucket;
import net.minecraft.src.ItemFood;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet10Flying;
import net.minecraft.src.Packet12PlayerLook;
import net.minecraft.src.Packet15Place;

public class NoFallDisconnect extends Module {
	int x, y, z;
	
	public NoFallDisconnect() {
		super("NoFallDisconnect", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate && e.isPre()) {
			x = (int)mc.thePlayer.posX;
			y = (int)mc.thePlayer.posY;
			z = (int)mc.thePlayer.posZ;
			if(!mc.theWorld.isAirBlock(x, y-5, z) && !mc.thePlayer.onGround && mc.thePlayer.motionY < 0 && mc.thePlayer.fallDistance > 4) {
				mc.theWorld.sendQuittingDisconnectingPacket();
		


}
}
	}
}

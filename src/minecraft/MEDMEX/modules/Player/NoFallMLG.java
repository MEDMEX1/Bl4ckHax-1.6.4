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

public class NoFallMLG extends Module {
	int x, y, z;
	boolean placeable = false;
	boolean place = false;
	
	public NoFallMLG() {
		super("NoFallMLG", Keyboard.KEY_F19, Category.PLAYER);
	}
	
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate && e.isPre()) {
			x = (int)mc.thePlayer.posX;
			y = (int)mc.thePlayer.posY;
			z = (int)mc.thePlayer.posZ;
			if(!mc.theWorld.isAirBlock(x, y-5, z) && !mc.thePlayer.onGround && mc.thePlayer.motionY < 0 && mc.thePlayer.fallDistance > 3) {
				int bestSlot = -1;
				mc.thePlayer.rotationPitch = 90f;
				//mc.thePlayer.sendQueue.addToSendQueue(new Packet12PlayerLook(mc.thePlayer.rotationYaw, 90f, true));
				for(int i = 0; i < 9; i++) {
					ItemStack stack =
							mc.thePlayer.inventory.getStackInSlot(i);
						if(stack == null || !(stack.getItem() instanceof ItemBucket))
							continue;
						bestSlot = i;
						mc.thePlayer.inventory.currentItem = bestSlot;
						placeable = true;
				}
		}	
			if(placeable) {
				mc.gameSettings.keyBindUseItem.pressed = true;
				placeable = false;
				place = true;
	}else {
		if(place) {
			mc.gameSettings.keyBindUseItem.pressed = false;
			place = false;
		}
	}
		


}
}
}

package MEDMEX.modules.Misc;

import org.lwjgl.input.Keyboard;

import MEDMEX.Client;
import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityClientPlayerMP;
import net.minecraft.src.EntityMinecartChest;
import net.minecraft.src.MathHelper;
import net.minecraft.src.Minecraft;
import net.minecraft.src.NetServerHandler;
import net.minecraft.src.Packet10Flying;
import net.minecraft.src.Packet13PlayerLookMove;
import net.minecraft.src.Packet14BlockDig;
import net.minecraft.src.PlayerControllerMP;

public class CartAura extends Module {
	
	public CartAura() {
		super("CartAura", Keyboard.KEY_F19, Category.MISC);
	}
	
	
	public void onEnable() {
		EntityClientPlayerMP.cartaura = true;
	}
	public void onDisable() {
		EntityClientPlayerMP.cartaura = false;
		mc.gameSettings.keyBindUseItem.pressed = false;
	}
	
}



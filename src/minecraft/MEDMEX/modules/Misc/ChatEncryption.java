package MEDMEX.modules.Misc;

import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import org.lwjgl.input.Keyboard;

import MEDMEX.Client;
import MEDMEX.UI.HUD;
import MEDMEX.command.CommandManager;
import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.ChatMessageComponent;
import net.minecraft.src.EntityClientPlayerMP;
import net.minecraft.src.Minecraft;
import net.minecraft.src.NetClientHandler;
import net.minecraft.src.Packet10Flying;



public class ChatEncryption extends Module {
	public static String encryptedtext = "";
	public static String decryptedtext = "";
	
	
	public ChatEncryption() {
		super("ChatEncryption", Keyboard.KEY_F19, Category.MISC);
	}
	
	
	
	
	
	public void onEnable() {
		CommandManager.chatencryption = true;
		ChatMessageComponent.chatencryption = true;
		
	}
	
	public void onDisable() {
		CommandManager.chatencryption = false;
		ChatMessageComponent.chatencryption = false;
	}
	

	
	
	

}

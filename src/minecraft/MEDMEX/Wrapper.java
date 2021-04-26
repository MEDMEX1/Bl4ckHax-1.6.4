package MEDMEX;

import net.minecraft.src.EntityClientPlayerMP;
import net.minecraft.src.GameSettings;
import net.minecraft.src.Minecraft;
import net.minecraft.src.Packet;
import net.minecraft.src.PlayerControllerMP;
import net.minecraft.src.ScaledResolution;
import net.minecraft.src.WorldClient;

public final class Wrapper {
	private static final Minecraft MINECRAFT = Minecraft.getMinecraft();
	private static final Wrapper INSTANCE = new Wrapper();

	public static final Wrapper getInstance() {
		return INSTANCE;
	}

	public GameSettings getGameSettings() {
		return getMinecraft().gameSettings;
	}

	public Minecraft getMinecraft() {
		return MINECRAFT;
	}

	public EntityClientPlayerMP getPlayer() {
		return getMinecraft().thePlayer;
	}

	public PlayerControllerMP getPlayerController() {
		return getMinecraft().playerController;
	}

	public ScaledResolution getScaledResolution() {
		return new ScaledResolution(getGameSettings(),
				getMinecraft().displayWidth, getMinecraft().displayHeight);
	}

	public WorldClient getWorld() {
		return getMinecraft().theWorld;
	}

	public synchronized void sendPacket(final Packet packet) {
		getPlayer().sendQueue.addToSendQueue(packet);
	}

}

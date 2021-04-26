package MEDMEX.Util;

import net.minecraft.src.EntityClientPlayerMP;
import net.minecraft.src.EntityLiving;

import MEDMEX.Wrapper;

/**
 * Manage freecam locations and rotations.
 * 
 * @author Ramisme
 * @since Apr 4, 2013
 * 
 */
public final class FreecamHandler {
	private float yaw, pitch;
	private double xPos, yPos, zPos;

	public void saveLocation(final EntityClientPlayerMP entityClientPlayerMP) {
		setRotations(entityClientPlayerMP.rotationYaw, entityClientPlayerMP.rotationPitch);
		setLocation(entityClientPlayerMP.posX, entityClientPlayerMP.posY - entityClientPlayerMP.yOffset, entityClientPlayerMP.posZ);
	}

	public void resetLocation() {
		getWrapper().getPlayer().setLocationAndAngles(xPos, yPos, zPos, yaw,
				pitch);
	}

	public void setRotations(float yaw, float pitch) {
		setYaw(yaw);
		setPitch(pitch);
	}

	public void setLocation(double xPos, double yPos, double zPos) {
		setPosX(xPos);
		setPosY(yPos);
		setPosZ(zPos);
	}

	public float getYaw() {
		return yaw;
	}

	public void setYaw(float yaw) {
		this.yaw = yaw;
	}

	public float getPitch() {
		return pitch;
	}

	public void setPitch(float pitch) {
		this.pitch = pitch;
	}

	public double getPosX() {
		return xPos;
	}

	public void setPosX(double xPos) {
		this.xPos = xPos;
	}

	public double getPosY() {
		return yPos;
	}

	public void setPosY(double yPos) {
		this.yPos = yPos;
	}

	public double getPosZ() {
		return zPos;
	}

	public void setPosZ(double zPos) {
		this.zPos = zPos;
	}

	private MEDMEX.Wrapper getWrapper() {
		return MEDMEX.Wrapper.getInstance();
	}

}

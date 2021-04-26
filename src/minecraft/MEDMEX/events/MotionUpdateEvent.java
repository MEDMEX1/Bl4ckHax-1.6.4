package MEDMEX.events;

import MEDMEX.events.Event;

public class MotionUpdateEvent extends Event {
	private float rotationYaw, rotationYawHead, rotationPitch;

	public MotionUpdateEvent(float tempRotationYaw, float tempRotationYawHead,
			float tempRotationPitch) {
		this.rotationYaw = tempRotationYaw;
		this.rotationYawHead = tempRotationYawHead;
		this.rotationPitch = tempRotationPitch;
	}

	public float getRotationYaw() {
		return rotationYaw;
	}

	public void setRotationYaw(float rotationYaw) {
		this.rotationYaw = rotationYaw;
	}

	public float getRotationYawHead() {
		return rotationYawHead;
	}

	public void setRotationYawHead(float rotationYawHead) {
		this.rotationYawHead = rotationYawHead;
	}

	public float getRotationPitch() {
		return rotationPitch;
	}

	public void setRotationPitch(float rotationPitch) {
		this.rotationPitch = rotationPitch;
	}

}

package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.GuiScreenBook;

public class Modules extends Command {
	
	public Modules() {
		super("Modules", "Shows modules", "modules", "modules");
		
	}

	@Override
	public void onCommand(String[] args, String command) {
			Client.addChatMessage("--Modules--");
			Client.addChatMessage("");
			Client.addChatMessage("--Combat--");
			Client.addChatMessage("AntiKB");
			Client.addChatMessage("Aura");
			Client.addChatMessage("BedAura");
			Client.addChatMessage("Box");
			Client.addChatMessage("CombatLog");
			Client.addChatMessage("FastBow");
			Client.addChatMessage("--Movement--");
			Client.addChatMessage("AutoWalk");
			Client.addChatMessage("Bhop");
			Client.addChatMessage("Bhop2");
			Client.addChatMessage("Fly");
			Client.addChatMessage("Glide");
			Client.addChatMessage("GodFly");
			Client.addChatMessage("Jesus");
			Client.addChatMessage("NoHitSlow");
			Client.addChatMessage("NoSlow");
			Client.addChatMessage("Phase");
			Client.addChatMessage("Safewalk");
			Client.addChatMessage("Scaffold");
			Client.addChatMessage("Speed");
			Client.addChatMessage("Sprint");
			Client.addChatMessage("Taxifly");
			Client.addChatMessage("Timer");
			Client.addChatMessage("Tower");
			Client.addChatMessage("--Player--");
			Client.addChatMessage("AntiFall");
			Client.addChatMessage("AntiPortalTrap");
			Client.addChatMessage("AntiSS");
			Client.addChatMessage("AutoEat");
			Client.addChatMessage("AutoTunnel");
			Client.addChatMessage("BedGodMode");
			Client.addChatMessage("ChatEncryption");
			Client.addChatMessage("Derp");
			Client.addChatMessage("DonkeyFinder");
			Client.addChatMessage("Fastplace");
			Client.addChatMessage("FastUse");
			Client.addChatMessage("Flatten");
			Client.addChatMessage("Freecam");
			Client.addChatMessage("NoClip");
			Client.addChatMessage("NoFallDisconnect");
			Client.addChatMessage("NoFallMLG");
			Client.addChatMessage("PortalFinder");
			Client.addChatMessage("Spam");
			Client.addChatMessage("SpeedMine");
			Client.addChatMessage("XCarry");
			Client.addChatMessage("Yaw");
			Client.addChatMessage("--Render--");
			Client.addChatMessage("ChestESP");
			Client.addChatMessage("Fullbright");
			Client.addChatMessage("Info");
			Client.addChatMessage("LogoutSpots");
			Client.addChatMessage("NameProtect");
			Client.addChatMessage("Nametags");
			Client.addChatMessage("NoFog");
			Client.addChatMessage("NoHurtCam");
			Client.addChatMessage("NoPumpkin");
			Client.addChatMessage("NoRender");
			Client.addChatMessage("NoWeather");
			Client.addChatMessage("OwnerTags");
			Client.addChatMessage("RetardFOV");
			Client.addChatMessage("Tracers");
			Client.addChatMessage("VisualRange");
			Client.addChatMessage("Wallhack");
			Client.addChatMessage("Waypoint");
			Client.addChatMessage("Xray");
		
		
		}
	}
		

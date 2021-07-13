package MEDMEX;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

import org.lwjgl.opengl.Display;

import MEDMEX.UI.ClickGui;
import MEDMEX.UI.HUD;
import MEDMEX.command.CommandManager;
import MEDMEX.config.Friend;
import MEDMEX.config.Silent;
import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventChat;
import MEDMEX.modules.Module;
import MEDMEX.modules.Module.Category;
import MEDMEX.modules.Movement.*;
import MEDMEX.modules.Render.*;
import MEDMEX.modules.World.*;
import net.minecraft.src.Minecraft;
import noom.config.Config;
import MEDMEX.modules.Player.*;
import MEDMEX.modules.Combat.*;
import MEDMEX.modules.Misc.*;



public class Client {
	
	public static String friendslist = "";
	public static String name = "Bl4ckHax", version = "XII";
	public static CopyOnWriteArrayList<Module> modules = new CopyOnWriteArrayList<Module>();
	public static HUD hud = new HUD();
	public static CommandManager commandManager = new CommandManager();
	
		
	public static void startup(){
		System.out.println("Loading "+ name +" "+ version);
		Display.setTitle(name + " version: "+ version);
		Friend.loadfriends();
		Silent.load();
		
		
		modules.add(new Fly());
		modules.add(new Sprint());
		modules.add(new Fullbright());
		modules.add(new NoFall());
		modules.add(new NoWeather());
		modules.add(new Info());
		modules.add(new AntiKB());
		modules.add(new Safewalk());
		modules.add(new Fastplace());
		modules.add(new Freecam());
		modules.add(new NoRender());
		modules.add(new Tracers());
		modules.add(new Timer());
		modules.add(new Glide());
		modules.add(new CombatLog());
		modules.add(new AntiFall());
		modules.add(new NoClip());
		modules.add(new Speed());
		modules.add(new AutoWalk());
		modules.add(new Jesus());
		modules.add(new Bhop());
		modules.add(new NoSlow());
		modules.add(new Wallhack());
		modules.add(new ChestESP());
		modules.add(new Xray());
		modules.add(new Aura());
		modules.add(new AntiPortalTrap());
		modules.add(new SpeedMine());
		modules.add(new Nametags());
		modules.add(new Spam());
		modules.add(new Yaw());
		modules.add(new NoHurtCam());
		modules.add(new RetardFOV());
		modules.add(new StaticFOV());
		modules.add(new Bhop2());
		modules.add(new NoHitSlow());
		modules.add(new PortalFinder());
		modules.add(new BedAura());
		modules.add(new Box());
		modules.add(new NoFog());
		modules.add(new NoPumpkin());
		modules.add(new Tower());
		modules.add(new Waypoint());
		modules.add(new Scaffold());
		modules.add(new AutoEat());
		modules.add(new XCarry());
		modules.add(new VisualRange());
		modules.add(new NoFallMLG());
		modules.add(new NoFallDisconnect());
		modules.add(new DonkeyFinder());
		modules.add(new SoundLocator());
		modules.add(new Flatten());
		modules.add(new AntiSS());
		modules.add(new GodFly());
		modules.add(new AutoTunnel());
		modules.add(new BedGodMode());
		modules.add(new ChatEncryption());
		modules.add(new EzInf());
		modules.add(new FastUse());
		modules.add(new FastBow());
		modules.add(new OwnerTags());
		modules.add(new TaxiFly());
		modules.add(new NameProtect());
		modules.add(new Phase());
		modules.add(new Search());
		modules.add(new Derp());
		modules.add(new LogoutSpots());
		modules.add(new AntiHunger());
		modules.add(new Step());
		modules.add(new Jesus2());
		modules.add(new Strafe());
		modules.add(new ClickGui());
		modules.add(new RoofTravel());
		modules.add(new TrueSize());
		modules.add(new GMBypass());
		modules.add(new PotionHUD());
		modules.add(new NewChunks());
		modules.add(new ChestSteal());
		modules.add(new PacketFly());
		modules.add(new CartAura());
		
		Config.load();
		
		
		try {
		      File myObj = new File("config.txt");
		      if (myObj.createNewFile()) {
		    	  System.out.println("First time loading");
		      }else {
		    	  System.out.println("Loading");
		      }
		}catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
	}

		
	
	
			
	
	public static void onEvent(Event e) {
		
		if(e instanceof EventChat) {
			commandManager.handleChat((EventChat)e);
			
		}
		
		for(Module m: modules) {
			if(!m.toggled)
				continue;
			
			m.onEvent(e);
		}
	}

	public static void keyPress(int key) {
		for(Module m : modules) {
			if(key == m.getKey()) {
				m.toggle();
			}
		}
		
	}
	
	public static List<Module> getModuleByCategory(Category c){
		List<Module> modules = new ArrayList<Module>();
		for(Module m : Client.modules) {
			if(m.category == c)
				modules.add(m);
		}
		return modules;
		
	}
	
	public static void addChatMessage(String message) {
		message = "\2474[" + name +"]: " + "\2477"  + message;
		
		Minecraft.getMinecraft().thePlayer.addChatMessage(new String(message));
	}
	
	
}

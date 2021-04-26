package noom.utils;

import java.util.ArrayList;

import MEDMEX.Client;
import MEDMEX.modules.Module;
import MEDMEX.modules.Module.Category;

public class ModuleUtils {
	
	public static Module getModuleByName(String name){
		for(Module m : Client.modules){
			if(m.name.equalsIgnoreCase(name)){
				return m;
			}
		}
		return null;
	}
	
	public static ArrayList<Module> getModulesByCategory(Category c){
		ArrayList<Module> mods = new ArrayList<>();
		for(Module m : Client.modules){
			if(m.category == c){
				mods.add(m);
			}
		}
		return mods;
	}

}

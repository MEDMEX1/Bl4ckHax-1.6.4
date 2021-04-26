package noom.config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import MEDMEX.Client;
import MEDMEX.modules.Module;
import noom.utils.ModuleUtils;

public class Config {
	
	static String filedir = Client.name + "\\";
	static String configfiledir = Client.name + "\\config";
	
	public static void load(){
		createFiles();
		//Dont forget to put it in Client.startup
		
		try {
			String module = "";
			BufferedReader reader = new BufferedReader(new FileReader(new File(configfiledir)));
			while((module = reader.readLine()) != null){
				String name = module.split(":")[0];
				String keyCode = module.split(":")[1];
				String state = module.split(":")[2].toLowerCase();
				ModuleUtils.getModuleByName(name).keyCode.code = Integer.parseInt(keyCode);
				if(Boolean.parseBoolean(state)){
					if(!ModuleUtils.getModuleByName(name).isEnabled()){
						ModuleUtils.getModuleByName(name).toggle();
					}
				}else{
					if(ModuleUtils.getModuleByName(name).isEnabled()){
						ModuleUtils.getModuleByName(name).toggle();
					}
				}
			}
			reader.close();
		}	catch(IOException e) {
					e.printStackTrace();
				}
	}
	
	public static void save(){
		createFiles();
		//Dont forget to put it in Minecraft.shutdown
		
		try(FileWriter writer = new FileWriter(new File(configfiledir), false))
        {
			for(Module m : Client.modules){
				writer.write(m.name + ":" + m.keyCode.code + ":" + m.isEnabled() + "\n");
			}
			
            writer.flush();
            writer.close();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
	}
	
	public static void createFiles(){
		if(!new File(filedir).exists()){
			new File(filedir).mkdir();
		}
		
		if(!new File(configfiledir).exists()){
			try {
			new File(configfiledir).createNewFile();
			} catch (IOException e){
				e.printStackTrace();
			}
		}
	}
	

}

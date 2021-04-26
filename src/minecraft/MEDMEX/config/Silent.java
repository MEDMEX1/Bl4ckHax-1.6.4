package MEDMEX.config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Collectors;

import MEDMEX.Client;
import MEDMEX.modules.Module;

public class Silent {
	public static String bool = "";
	static String filedir = Client.name + "\\";
	static String configfiledir = Client.name + "\\silent";
	
	public static void load() {
		createFiles();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File(configfiledir)));
			String line = reader.lines().collect(Collectors.joining());
			Silent.bool = line;
			reader.close();
		}	catch(IOException e) {
			e.printStackTrace();
		}
	}
		
	public static void save(){
		createFiles();
		try(FileWriter writer = new FileWriter(new File(configfiledir), false))
        {
			BufferedReader reader = new BufferedReader(new FileReader(new File(configfiledir)));
			writer.write(bool);
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

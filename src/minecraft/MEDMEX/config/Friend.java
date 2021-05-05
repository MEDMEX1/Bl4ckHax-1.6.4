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

public class Friend {
	public static String newfriend = "";
	static String filedir = Client.name + "\\";
	static String configfiledir = Client.name + "\\friends";
	public static String friends;
	
	public static void loadfriends() {
		createFiles();
		String thisLine = null;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File(configfiledir)));
			while((thisLine = reader.readLine()) !=null) {
				System.out.println(thisLine);
				Client.friendslist += thisLine;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
		
	public static void save(){
		createFiles();
		try(FileWriter writer = new FileWriter(new File(configfiledir), true))
        {
			BufferedReader reader = new BufferedReader(new FileReader(new File(configfiledir)));
			writer.append(newfriend+"\n");
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

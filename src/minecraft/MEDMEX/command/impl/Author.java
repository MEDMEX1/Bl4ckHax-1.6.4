package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.GuiScreenBook;

public class Author extends Command {
	
	public Author() {
		super("Author", "Sets custom book author", "Author <name>", "author");
		
	}

	@Override
	public void onCommand(String[] args, String command) {
		try {
		GuiScreenBook.newauthor = args[0].replace("&", "§");
		Client.addChatMessage("Changed author to: "+GuiScreenBook.newauthor.replace("&", "§"));
		} catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
			Client.addChatMessage("Usage: Author <name>");
		}
		}
	}
		

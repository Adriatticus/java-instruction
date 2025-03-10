package ui;

import java.util.Scanner;

import Util.MyConsole;
import model.Movie;

public class BmdbConsoleApp {
	public static void main(String[] args) {
			MyConsole.printL("This my movies!\n");
			
			MyConsole.printL("Welcome to the BMDB App\n");
			Scanner sc = new Scanner(System.in);
			
			String choice = "y";
			while (choice.equalsIgnoreCase("y")) {
				
				int id = MyConsole.promptInt("Enter Movie Id: ");
				String title = MyConsole.promptString("Enter Movie Title: ");
				int year = MyConsole.promptInt("Enter Movie Year: ");
				String rating = MyConsole.promptString("Enter Movie Rating: ");
				String director = MyConsole.promptString("Enter Movie Director ");
				Movie m = new Movie(id, title, year, rating, director);
				MyConsole.printL(m.toString());
				
				//choice = MyConsole.continueYn("Cont? y/n? : ", "y", "n");
				MyConsole.printL("");
				choice = MyConsole.continueYn();
				MyConsole.printL("");
			}
			
					
			
			
			
	}

}

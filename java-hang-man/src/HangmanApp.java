import java.util.ArrayList;
import java.util.Scanner;

import Util.MyConsole;

public class HangmanApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		MyConsole.print("get the write answer or you'll kill an innocient men!\n");
		MyConsole.print("Welcome to the Hangman App\n");
		
		String theWord = "taco"; 
		ArrayList<Character> someWords = new ArrayList<>();
		int buzzWrong = 0;
		
		for (int i =0; i < theWord.length(); i++) {
			someWords.add('_');
		}

		sc.close();
	}
	static String getTheHangedMan(int buzzWrong) {
		
		return switch(buzzWrong) {
		case 0 -> """
		  ____
		  |  |
		  |
		  |  
		  |
		  =====
		  """;
		case 1 -> """
		  ____
		  |  |
		  |  0
		  |
		  |
		  =====
		  """;
		case 2 -> """
		  ____
		  |  |
		  |  0
		  |  |
		  |
		  =====
		  """;
		case 3 -> """
		  ____
		  |  |
		  |  0
		  | /|
		  |
		  =====
		  """;
		case 4 -> """
		  ____
		  |  |
		  |  0
		  | /|\\
		  | 
		  =====
		  """;
		case 5 -> """
		  ____
		  |  |
		  |  0
		  | /|\\
		  | / 
		  =====
		  """;
		case 6 -> """
		  ____
		  |  |
		  |  0
		  | /|\\
		  | / \\
		  =====
		  """;
		default  -> """
		  ____
		  |  |
		  |
		  |  
		  |
		  =====
		  """;
		};
	}

}

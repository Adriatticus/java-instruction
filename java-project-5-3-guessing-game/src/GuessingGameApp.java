import java.util.Scanner;
import Util.MyConsole;

public class GuessingGameApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Guess what!?\n");

		System.out.println("Welcome to the Guessing Game App");
		System.out.println("--------------------------------\n");
		
		String choice = "y";
		while (choice == "y") {
			System.out.println("I'm thinking of a number from 1 to 100.\nTry to guess it.");
			int randomInt = (int) (Math.random()* 100)+1;
			MyConsole.promtIntInRange("Enter a number: " , 1, 100);

		System.out.println("Welcome to the Guessing Game App");
		}
	}
}
		
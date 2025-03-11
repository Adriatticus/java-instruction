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
			int min = 1;
			int max = 100;
			int range = ((max-min) +1);
			int randoNum = (int) (Math.random()*range) +1;
			MyConsole.printL(Integer.toString(randoNum));
			System.out.println("I'm thinking of a number from 1 to 100.\nTry to guess it.");
			//int randomInt = (int) (Math.random()* 100)+1;
			//MyConsole.printL(Integer.toString(randomInt));
			int guess = 0;
			int count = 0;
			int dif = (guess - randoNum);
				while (guess != randoNum) {
					guess = MyConsole.promtIntInRange("Enter a number: " , 1, 100);
					count++;
					MyConsole.printL(Integer.toString(count));
					if (dif == 0) {
						MyConsole.printL("Make a winner method");
						continue;
					}
					if (dif > -10) {
						MyConsole.printL("Not nearly enough! That's way too low pal!");
						continue;
					}
					if (dif > 10) {
						MyConsole.printL("Whoa relax! That's way too high buddy!");
						continue;
					}
					if (dif < -10) {
						MyConsole.printL("Close! But too low yet!");
						continue;
					}
					if (dif < 10) {
						MyConsole.printL("Almost, however, your guess is too high. Try again.");
						continue;
					}
				}

		System.out.println("Welcome to the Guessing Game App");
		}
	}
}
		
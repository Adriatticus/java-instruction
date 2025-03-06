import java.util.Scanner;

public class GuessingGameApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Guess what!?\n");

		System.out.println("Welcome to the Guessing Game App");
		System.out.println("--------------------------------\n");
		
		String choice = "y";
		while (choice == "y") {
			System.out.println("I'm thinking of a number from 1 to 100.\nTry to guess it.");
			
		}
		System.out.println("\nGuess again!");
	}
	private static int promptIntInRange(String prompt, int min, int max) {
		boolean isValid = false;
		int result = 0;
		
		return result;
	}
	// use exception handling
	private static int promptInt(String prompt) {
		boolean isValid = false;
		int result = 0;
		while (!isValid) {
			try {
				System.out.print(prompt);
				result = Integer.parseInt(sc.nextLine());
				isValid = true;
			} catch (Exception e) {
				System.err.println("Error - invalid entry. Try again.");
			}
		}
		return result;
	}
	// use data validation
	private static double promptDouble(String prompt) {
		boolean isValid = false;
		double result = 0.0;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				result = Double.parseDouble(sc.nextLine());
				isValid = true;
			}
			else {
				System.err.println("Error - invalid entry. Try again.");
				sc.nextLine(); // discard input
			}
		}
		return result;
	}
}

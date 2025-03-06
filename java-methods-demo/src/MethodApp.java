import java.util.Scanner;

public class MethodApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Hey\n");

		System.out.println("Welcome to the Methods app\n");

		// add 2 numbers

		int x = promptInt("Enter number x: ");
		int y = promptInt("Enter number y: ");

		int sum = x + y;
		System.out.println("sum = " + sum);
		System.out.println();

		// divide two doubles
		// get two doubles, divide them, and print the result
		// create a method called prompt double

		double a = promptDouble("Enter number a: ");
		double b = promptDouble("Enter number b: ");

		double result = a / b;
		System.out.println("Result: " + result);
		System.out.println();

		sc.close();
		System.out.println("\nSee ya");
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

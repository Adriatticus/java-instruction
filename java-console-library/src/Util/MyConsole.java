package Util;

import java.util.Scanner;

public class MyConsole {
	
	static Scanner sc = new Scanner(System.in);

	public static void print(String string) {
		System.out.print(string);
	}
	
	public static void printL(String string) {
		System.out.println(string);
	}
	
	public static String promptString (String prompt) {
		System.out.print(prompt);
		return sc.nextLine();
	}
	
	public static double promptDouble(String prompt) {
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
		
		public static int promptInt(String prompt) {
			boolean isValid = false;
			int result = 0;
			while (!isValid) {
				System.out.print(prompt);
				if (sc.hasNextInt()) {
					result = Integer.parseInt(sc.nextLine());
					isValid = true;
				}
				else {
					System.err.println("Error - invalid entry. Try again.");
					sc.nextLine(); // discard input
				}
			}
			return result;

	}
		public static int promtIntInRange(String prompt, int min, int max) {
			int result = 0;
			boolean success = false;
			while (!success) {
				System.out.println(prompt);
				if (!sc.hasNextInt()) {
					System.out.println("Error - input must be a whole number. Try again.");
				}
				else {
					result = Integer.parseInt(sc.nextLine());
					if (result < min || result > max) {
						System.out.println("Error - input must be between "+min+", "+max+". Try again.");
					}
				}			
		}
		return result;
	}
}
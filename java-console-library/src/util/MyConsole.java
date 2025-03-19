package util;

import java.util.List;
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
				
				System.out.print(prompt);
				if (sc.hasNextInt()) {
					result = Integer.parseInt(sc.nextLine());
				}
				else {
					System.out.println("Error - input must be a whole number. Try again.");
					sc.nextLine(); // discard input
					continue;
				}
				if (result < min || result > max) {
						System.out.println("Error - input must be between "+min+", "+max+". Try again.");
					}
				else {
					success = true;
				}

			}
			return result;
		}
		
		public static void printHeader(String header, String sep) {
			printL(header);
			String seperatorLine = sep.repeat(header.length());
			printL(seperatorLine);
		}
		
		public static void printHeader(String header) {
			printHeader(header, "=");
		}
		
		public static String continueYn(String promptContinue, String yes, String no) {
			String answer = "";
			boolean success = false;
			while (!success) {
				print(promptContinue);
				answer = sc.nextLine();
				if (answer.equalsIgnoreCase("")) {
					printL("Error - entry is required.");
				}
				else if (answer.equalsIgnoreCase(yes) && answer.equalsIgnoreCase(no)) {
					printL("Error - please enter "+yes+" or "+no+".");
				}
				else {
					success = true;
				}
			}
			return answer;
		}
			
		public static String continueYn() {
			String choice = continueYn("Continue? (y/n): ", "y", "n");
			return choice;
		}
		
		public static String promptString(String prompt, List<String> validValues) {
			String str = "";
			boolean success = false;
			while (!success) {
				str = promptString(prompt);
//				for (String s: validValues) {
//					if (s.equalsIgnoreCase(str)) {
//						success = true;
//						break;
//					}
//				}
				if (validValues.contains(str)) {
					success = true;
				}
				else {
					printL("Invalid value. Try again.");
					//sc.nextLine();
				}
			}
			return str;
		}
}
		





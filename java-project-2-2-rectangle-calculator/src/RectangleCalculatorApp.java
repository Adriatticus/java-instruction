import java.util.Scanner;

public class RectangleCalculatorApp {
	public static void main(String[] args) {
		System.out.println("Wrecktable\n");
		
		System.out.println("Welcome to the Rectangle Calculator App\n");
		// scanner
		Scanner sc = new Scanner(System.in);
		Scanner line = new Scanner(System.in);
		// while loop
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// input
			System.out.print("Enter length:\t");
			double length = sc.nextDouble();
			System.out.print("Enter width:\t");
			double width = sc.nextDouble();
			double area = width * length;
			double perimiter = 2 * width + 2 * length;
			System.out.println("Area:\t\t"+area);
			System.out.println("Perimiter:\t"+perimiter);
			
			System.out.print("\nContinue? (y/n): ");
			choice = line.nextLine();
			System.out.println();
		}
		
		
		System.out.println("\nWrecktangled.");
	}
}

import java.util.Scanner;

public class CommonDivisorApp {

	public static void main(String[] args) {
		System.out.println("The common divisor of a pizza pie is me.\n");
		
		System.out.println("Welcome to the Common Divisor App\n");
		
		// scanner
		Scanner sc = new Scanner(System.in);
		// while loop
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			
			// prompt 2 numbers
			// x = 12, y = 8
			System.out.print("Enter x: ");
			int x = Integer.parseInt(sc.nextLine());
			System.out.print("Enter y: ");
			int y = Integer.parseInt(sc.nextLine());
			// compute math stuffs - greatest common divisor Euclidian cool
			// while x != 0
			while (x != 0) {
				while (y >= x) {
					y -= x;
				}
				int hold = y;
				y = x;
				x = hold;
			}
			System.out.print("Greatest Common Divisor: "+y);
		
				// while y >= x
					// x stays the same, y = y -x
				// swap x and y (x = 8, y = 12)
			
			
			
			System.out.print("\n\nContinue? (y/n): ");
			choice = sc.nextLine();
			System.out.println(" ");
		}
		
		
		
		sc.close();
		System.out.println("\nI eat pizza");
	}

}

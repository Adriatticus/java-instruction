import java.util.Scanner;

public class FizzBuzzApp {

	public static void main(String[] args) {
		System.out.println("Laugh it up FizzBall!");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter number: ");
			int n = Integer.parseInt(sc.nextLine());
			for (int i = 1; i <= n; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println("FizzBuzz");
				}
				else if (i % 3 == 0) {
					System.out.println("Fizz");
				}
				else if (i % 5 == 0) {
					System.out.println("Buzz");
				}
				else {
					System.out.println(i);
				}
				
				System.out.println("Continue? (y/n): ");
				choice = sc.nextLine();
			}
			
			
		}
	}

}

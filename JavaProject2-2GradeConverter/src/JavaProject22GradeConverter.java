import java.util.Scanner;

public class JavaProject22GradeConverter {
	public static void main(String[] args) {
		System.out.println("Welcome to the letter Grade Converter\n");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("\nEnter numerical grade: ");
			int gradeNum = sc.nextInt();
			
			if (gradeNum > 87 && gradeNum < 101) {
				System.out.println("Letter grade: A");
			}
			else if (gradeNum > 79 && gradeNum < 88) {
				System.out.println("Letter grade: B");
			}
			else if (gradeNum > 66 && gradeNum < 80) {
				System.out.println("Letter grade: C");
			}
			else if (gradeNum > 59 && gradeNum < 68) {
				System.out.println("Letter grade: D");
			}
			else {
				System.out.println("Letter grade: F");
			}
			
			Scanner cont = new Scanner(System.in);
			System.out.print("Continue?: (y/n): ");
			choice = cont.nextLine();
		
		}
		
		
		
	}

}


public class FizzBuzzApp {

	public static void main(String[] args) {
		System.out.println("Fizzy pop buz yum yum\n");
		
		System.out.println("Welcome to the FizzBuzz App\n");
		
		//list<int> i = new list<int>()
		int i = 0;
		for (i = 1; i < 16; i++) {
			if (i%3 == 0 && i%5 == 0) {
			System.out.println("FizzBuzz");
				if (i%3 == 0) {
					System.out.println("Fizz");
				}
				else if (i%5 == 0) {
					System.out.println("Buzz");
				}
				else {
					System.out.println(i);
				}
			}
		}

		
		System.out.println("\nChug chug yum yum fizzy yummy buzz buzz");
	}

}

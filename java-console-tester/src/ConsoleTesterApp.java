import Util.MyConsole;

public class ConsoleTesterApp {

	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to the Console Tester App!");
		
		MyConsole.promtIntInRange("\nPick a number from 1 to 100: ", 1, 100);
		
		System.out.println("\nSee ya later");
	}

}

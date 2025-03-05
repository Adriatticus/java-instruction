import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		System.out.println("Switch Menue Game time baby\n");
		
		System.out.println("Welcome to the Switch Statements!\n");
		
		Scanner sc = new Scanner(System.in);
		
		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			System.out.println("MENU:");
			System.out.println("===================");
			System.out.println("get");
			System.out.println("add");
			System.out.println("delete");
			System.out.println("exit");
			
			System.out.print("Command: ");
			command = sc.nextLine();
			
			switch (command) {
			case "get":
				System.out.println("get selected");
				break;
			case "add":
				System.out.println("add selected");
				break;
			case "delete":
				System.out.println("delete selected");
				break;
			case "exit":
				System.out.println("get selected");
				break;
			default:
				System.out.println("invalid command");
				break;
			
			}
		}
		
		
		System.out.println("\nSwitched up on ya");
	}
}

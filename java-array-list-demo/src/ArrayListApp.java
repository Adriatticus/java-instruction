import java.util.ArrayList;
import java.util.List;

import Util.MyConsole;

public class ArrayListApp {

	public static void main(String[] args) {
		MyConsole.printHeader("Array? Array list? List? Huh?");
		MyConsole.printL("");
		
		List<String> names = new ArrayList<>();
		names.add("Celina");
		names.add("Jim");
		names.add("Andy");
		names.add("Adrian");
		names.add("Heath");
		names.add("Joe");
		names.add("Christian");
		names.add("Nick");
		
		names.add("Test");
		
		names.forEach(n -> MyConsole.print(n+" "));
		MyConsole.printL("");
		
		MyConsole.printL(names.get(4));
		names.add(4, "Temp"); // names.set replaces 4
		names.forEach(n -> MyConsole.print(n+" "));
		MyConsole.printL("");
		
		names.remove("Test");
		names.remove(4);
		names.forEach(n -> MyConsole.print(n+" "));
		MyConsole.printL("");
		
		
		MyConsole.printHeader("\nArray list ya later!");
	}

}

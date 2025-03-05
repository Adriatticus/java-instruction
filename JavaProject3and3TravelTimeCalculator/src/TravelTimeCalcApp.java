import java.util.Scanner;

public class TravelTimeCalcApp {

	public static void main(String[] args) {
		System.out.println("Gotta go fast! Gotta get there.\n");
		
		
		// the ol y/n while loop
		System.out.println("Welcome to the Travel Time Calculator\n");
		// input is distance in miles and speed in mph
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter miles:\t\t");
		double miles = input1.nextDouble();
		System.out.print("Enter miles per hour:\t");
		double mph = input1.nextDouble();
		System.out.println("\nEstimated travel time");
		System.out.println("======================");
		// output
		double ett = (miles/mph);
		//System.out.println("Estimated travel time:"+ett);
		int hours = (int) ett;
		//System.out.println("3? "+hours);
		double deci = (ett - hours);
		//System.out.println(".07blahblah? "+deci);
		double mindec = (deci * 60);
		int mins = (int) mindec;
		// Hours:
		System.out.println("Hours: "+hours);
		// Minutes:
		System.out.println("Minutes: "+mins);
			
		System.out.println("\nScreach halt smoke clears got there.");
	}
}

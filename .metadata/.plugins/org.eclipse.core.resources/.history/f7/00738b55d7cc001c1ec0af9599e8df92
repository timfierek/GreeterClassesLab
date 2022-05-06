import java.util.Scanner;

/**
 * Basic console functionality of the Greeter classes, handling console io and method calls
 * 
 * @author Tim Fierek
 *
 */
public class GreeterApp {

	private static Scanner scnr;
	
	public static void main(String[] args) {
		scnr = new Scanner(System.in);
		String greeting = "";
		String name = "";
		
		// Collect user's greeting
		while(greeting.equals("")) {
			System.out.print("Choose a greeting: ");
			
			try {
				greeting = scnr.nextLine();
			} catch(Exception e) {
				System.out.println("Invalid input encountered...");
			}
		}
		
		// Collect user's name
		while(name.equals("")) {
			System.out.print("Enter your name: ");
			
			try {
				name = scnr.nextLine();
			} catch(Exception e) {
				System.out.println("Invalid input encountered...");
			}
		}
		
		// Create greeter object and call greet method
		Greeter greeting1 = new Greeter(greeting);
		System.out.println(greeting1.greet(name));

	}

}

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
		int volume = -1;
		
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
		
		// Collect volume
		while (volume == -1) {
			System.out.print("How much volume to add? (0 to 10): ");

			try {
				volume = scnr.nextInt();
			} catch (Exception e) {
				System.out.println("Invalid input encountered...");
			}
		}
		
		// Create greeter object and call greet method
		Greeter greeting1 = new Greeter(greeting);
		SimonGreeter greeting2 = new SimonGreeter(greeting);
		LoudGreeter greeting3 = new LoudGreeter(greeting);
		HtmlGreeter greeting4 = new HtmlGreeter(greeting);
		
		// Add loudness to LoudGreeting based on user input
		for(int i = 0; i < volume; i++) {
			greeting3.addVolume();
		}
		
		System.out.println(greeting1.greet(name));
		System.out.println(greeting2.greet(name));
		System.out.println(greeting3.greet(name));
		System.out.println(greeting4.greet(name));

	}

}

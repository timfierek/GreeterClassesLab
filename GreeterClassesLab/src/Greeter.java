/**
 * Greeter superclass for classes with basic string functionality and inheritance
 * 
 * @author Tim Fierek
 *
 */
public class Greeter {
	private String greeting;
	
	public Greeter(String greeting) {
		this.greeting = greeting;
	}
	
	public String greet(String name) {
		return (greeting + ", " + name + "!");
	}
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	public String getGreeting() {
		return greeting;
	}
}

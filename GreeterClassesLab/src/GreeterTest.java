import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterTest {

	@Test
	void testGreeterConstructer1() {
		Greeter greet1 = new Greeter("Hello");
		assertEquals("Hello", greet1.getGreeting());
	}
	
	@Test
	void testGreeterConstructer2() {
		Greeter greet2 = new Greeter("How's it going");
		assertEquals("How's it going", greet2.getGreeting());
	}
	
	@Test
	void testGreeterGreetMethod1() {
		Greeter greet3 = new Greeter("Hola");
		assertEquals("Hola, Tim!", greet3.greet("Tim"));
	}
	
	@Test
	void testGreeterGreetMethod2() {
		Greeter greet4 = new Greeter("What's up");
		assertEquals("What's up, Adam!", greet4.greet("Adam"));
	}

}

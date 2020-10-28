import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * Sample a simple test class
 */
public class Sample {

	// public static void main(String[] args) {
	// 	System.out.println("Hello this is a Sample");

	// 	Sample t = new Sample();
	// 	System.out.println("Testing add");
	// 	System.out.println(t.add(3, 4));
	// }

	/**
	 * @param a
	 * @param b
	 * @return the addition of a and b
	 */
	public int add(int a, int b) {
		return a + b;
	}

	//Tests
	@Test
	public void testAdd() {
		assertEquals(25, add(20, 5));
	}
}

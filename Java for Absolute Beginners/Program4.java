package practicePrograms;

/**
 * @author Yadagiri Reddy
 * This class is used for demonstrating methods in Java.
 */
public class Program4 {
	public static void main(String[] args) {
		sayHello();
		
		greet("Jhon");
		
		int result = add(2, 30);
		System.out.println(result);
	}
	
	// Example 1 - basic method
	public static void sayHello() {
		System.out.println("Hello");
	}
	
	//Example 2 -with params
	public static void greet(String name) {
		System.out.println("Hello " +name);
	}
	
	//Example 3 - with params and return value
	public static int add(int i, int j) {
		int k = i + j;
		return k;
	}	
}
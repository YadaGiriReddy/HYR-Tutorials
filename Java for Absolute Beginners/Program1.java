package practicePrograms;

/**
 * @author Yadagiri Reddy
 * This class is used for demonstrating while and do-while looping statements in Java.
 */
public class Program1 {

	public static void main(String[] args) {
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		
		do {
			System.out.println(i);
			i++;
		}while(i < 10);

	}
}
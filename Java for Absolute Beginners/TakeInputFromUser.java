package practicePrograms;

import java.util.Scanner;

/**
 * @author Yadagiri Reddy
 * This class is used for demonstrating Scanner class in Java.
 */
public class TakeInputFromUser {

	public static void main(String[] args) {
//		int i = 10;
//		System.out.println(i);
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("Hello "+name);
		System.out.println("What is your age?");
		int age = sc.nextInt();
		System.out.println("Your age is "+age);
		sc.close();
	}
}
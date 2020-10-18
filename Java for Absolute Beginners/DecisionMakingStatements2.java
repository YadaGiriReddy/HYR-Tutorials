package practicePrograms;

/**
 * @author Yadagiri Reddy
 * This class is used for demonstrating switch statement in Java.
 */
public class DecisionMakingStatements2 {
	public static void main(String[] args) {
		int dayNumber = 2;
		switch (dayNumber) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tueday");
			break;
		case 3:
			System.out.println("Wedday");
			break;
		case 4:
			System.out.println("Thuday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Satday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.err.println("Day number is invalid");
			break;
		}

	}
}
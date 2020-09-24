package practicePrograms;

/**
 * @author Yadagiri Reddy
 * This class is used for demonstrating DataTypes in Java.
 */
public class DataTypes {
	static int vn;
	public static void main(String[] args) {
		System.out.println("Default value " +vn);

		vn = -128;

		System.out.println("Actual Value " +vn);
		System.out.println("Size " +(Integer.SIZE/8) + " bytes");
		System.out.println("Min Value " +Integer.MIN_VALUE);
		System.out.println("Max Value " +Integer.MAX_VALUE);
	}
}
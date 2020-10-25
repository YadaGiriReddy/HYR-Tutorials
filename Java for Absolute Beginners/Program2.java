package practicePrograms;

/**
 * @author Yadagiri Reddy
 * This class is used for demonstrating arrays in Java.
 */
public class Program2 {

	public static void main(String[] args) {
		//1. Single Dimension Array (Assigning the values individually)
		int[] arr = new int[5];
		arr[0] = 5;
		arr[1] = 10;
		arr[2] = 15;
		arr[3] = 25;
		arr[4] = 60;

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		//1. Single Dimension Array (Assigning the values at the time of creation)
		int[] arr1 = {5,10,15,25,60};

		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);

		//2. Two Dimension Array (Assigning the values individually)
		int[][] twoDimArr = new int[2][3];
		twoDimArr[0][0] = 1;
		twoDimArr[0][1] = 2;
		twoDimArr[0][2] = 3;
		twoDimArr[1][0] = 4;
		twoDimArr[1][1] = 5;
		twoDimArr[1][2] = 6;

		System.out.println(twoDimArr[0][0]);
		System.out.println(twoDimArr[0][1]);
		System.out.println(twoDimArr[0][2]);
		System.out.println(twoDimArr[1][0]);
		System.out.println(twoDimArr[1][1]);
		System.out.println(twoDimArr[1][2]);

		//2. Two Dimension Array (Assigning the values at the time of creation)
		int[][] twoDimArr1 = {
				{1,2,3},
				{4,5,6}
		};

		System.out.println(twoDimArr1[0][0]);
		System.out.println(twoDimArr1[0][1]);
		System.out.println(twoDimArr1[0][2]);
		System.out.println(twoDimArr1[1][0]);
		System.out.println(twoDimArr1[1][1]);
		System.out.println(twoDimArr1[1][2]);

		//3. Jagged Array (Assigning the values individually)
		int[][] jaggedArr = new int[2][];
		jaggedArr[0] = new int[2];
		jaggedArr[1] = new int[4];

		jaggedArr[0][0] = 1;
		jaggedArr[0][1] = 2;
		jaggedArr[1][0] = 3;
		jaggedArr[1][1] = 4;
		jaggedArr[1][2] = 5;
		jaggedArr[1][3] = 6;

		System.out.println(jaggedArr[0][0]);
		System.out.println(jaggedArr[0][1]);
		System.out.println(jaggedArr[1][0]);
		System.out.println(jaggedArr[1][1]);
		System.out.println(jaggedArr[1][2]);
		System.out.println(jaggedArr[1][3]);

		//3. Jagged Array (Assigning the values at the time of creation)
		int[][] jaggedArr1 = {
				{1,2},
				{3,4,5,6}
		};

		System.out.println(jaggedArr1[0][0]);
		System.out.println(jaggedArr1[0][1]);
		System.out.println(jaggedArr1[1][0]);
		System.out.println(jaggedArr1[1][1]);
		System.out.println(jaggedArr1[1][2]);
		System.out.println(jaggedArr1[1][3]);
	}

}
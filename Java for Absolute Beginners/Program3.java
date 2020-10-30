package practicePrograms;

/**
 * @author Yadagiri Reddy
 * This class is used for demonstrating for and foreach looping statements in Java.
 */
public class Program3 {
	public static void main(String[] args) {	
		//for loop - Example 1 (Print the values from 1 to 10) 
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
		}
		
		//for loop - Example 2 (Print the values from an array in the forward direction) 
		int[] arr = {5,10,15,25,60};
		for(int index=0; index<arr.length; index++) {
			System.out.println(arr[index]);
		}
		
		//for loop - Example 3 (Print the values from an array in the backward direction)
		int[] arr1 = {5,10,15,25,60};
		for(int index=arr1.length-1; index>=0; index--) {
			System.out.println(arr1[index]);
		}
		
		//foreach loop - Example (Print the values from an array)
		int[] arr2 = {5,10,15,25,60};
		for(int element:arr2) {
			System.out.println(element);
		}		
	}
}
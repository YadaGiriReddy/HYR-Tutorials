package practicePrograms;

/**
 * @author Yadagiri Reddy
 * This class is used for demonstrating if and if-else statements in Java.
 */
public class DecisionMakingStatements {
	/*
	Write a program to verify the eligibility of a student
	to get the admission into a college based on his/her
	entrance examination score.
	*/
	public static void main(String[] args) {
		int securedMarks = 35;
		int cutOffScore = 35;
		
		if(cutOffScore < securedMarks) {
			System.out.println("Eligible");
		}
		else if(cutOffScore == securedMarks) {
			System.out.println("Waiting list");
		}
		else
		{
			System.out.println("In-eligible");
		}		
		
	}
}
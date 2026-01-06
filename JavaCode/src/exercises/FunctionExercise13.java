package exercises;
import java.util.*;

public class FunctionExercise13 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower limit number: ");
		int lowerLimitNum = sc.nextInt();
		
		System.out.println("Enter upper limit number: ");
		int upperLimitNum = sc.nextInt();
		
		displayNumbers(lowerLimitNum, upperLimitNum);
	}
	
	public static void displayNumbers(int lowerLimit, int upperLimit)
	{
		int lowerLimitNum = lowerLimit;
		int upperLimitNum = upperLimit;
		int count = 0;
		
		System.out.print("Numbers that are divisible by 2 and 3 are ");
		while(lowerLimitNum <= upperLimitNum) {
			if(lowerLimitNum % 2 == 0 && lowerLimitNum % 3 == 0) {
				System.out.print(lowerLimitNum + " ");
				if(count % 10 == 0) {
					System.out.println("\n");
				}
				count++;
			}
			lowerLimitNum++;
		}
	}
}

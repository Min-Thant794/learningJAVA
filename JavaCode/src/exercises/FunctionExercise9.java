package exercises;
import java.util.*;

public class FunctionExercise9 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num;
		int positiveCount = 0;
		int negativeCount = 0;
		int total = 0;
		int count = 0;
		do {
			System.out.println("Enter a number (accept either postive and negative) and (0 to stop)");
			num = sc.nextInt();
			
			if(num > 0) {
				positiveCount++;
				total += num;
				count++;
			} else if(num < 0) {
				negativeCount++;
				total += num;
				count ++;
			}
		} while (num != 0);
		
		if(count == 0) {
			System.out.println("No numbers are entered!");
		} else {
			double average = (double) total / count;
			
			System.out.println("The number of positive is: " + positiveCount);
			System.out.println("The number of negative is: " + negativeCount);
			System.out.println("Total: " + total);
			System.out.println("Average: " + average);
		}
	}
}

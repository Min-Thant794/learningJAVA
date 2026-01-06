package exercises;
import java.util.*;

public class FunctionExercise10 {
	public static void main(String args[])
	{
		int num;
		int largestNum = Integer.MIN_VALUE;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter number: ");
			num = sc.nextInt();
			
			if(num == 0) {
				break;
			}
			
			if(num > largestNum) {
				largestNum = num;
				count = 1;
			} else if (num == largestNum) {
				count++;
			} else {
				
			}
		} while (num != 0);
		
		System.out.println("Largest number: " + largestNum);
		System.out.println("The occurance count of the largest number: " + count);
	}
}

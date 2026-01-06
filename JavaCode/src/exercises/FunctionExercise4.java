package exercises;
import java.util.*;

public class FunctionExercise4 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a nunber: ");
		int num = sc.nextInt();
		
		if(isArmStrong(num)) {
			System.out.println("The number " + num + " is a Armstrong number!");
		} else {
			System.out.println("The number " + num + " is not a Armstrong number!");
		}
	}
	
	public static boolean isArmStrong(int num)
	{
		int originalNum = num;
		int digitCount = 0;
		int sum = 0;
		
		int temp = num;
		while(temp != 0) {
			digitCount++;
			temp = temp / 10;
		}
		
		temp = num;
		while(temp != 0) {
			int digit = temp % 10;
			int power = 1;
			for (int i = 1; i <= digitCount; i++) {
				power *= digit;
			}
			
			sum += power;
			temp = temp / 10;
		}
		
		return sum == originalNum;
	}
}

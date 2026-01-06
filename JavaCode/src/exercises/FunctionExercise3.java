package exercises;
import java.util.*;

public class FunctionExercise3 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a nunber");
		int num = sc.nextInt();
		
		if(isPerfect(num)) {
			System.out.println("The number " + num  + " is perfect number!");
		} else {
			System.out.println("The number " + num + " is not a perfect number!");
		}
	}
	
	public static boolean isPerfect(int num)
	{
		if (num <= 1) return false;
		
		int sum = 0;
		
		for(int i = 1; i <= num/2; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		return sum == num;
	}
}
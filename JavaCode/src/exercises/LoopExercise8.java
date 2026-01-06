package exercises;
import java.util.*;
import java.io.InputStreamReader;

public class LoopExercise8 {
	public static void main(String args[])
	{
		int num, digit, sum = 0;
		
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		
		while(num != 0) {
			digit = num % 10;
			sum += digit;
			num = num / 10;
			
			System.out.println("Digit: " + digit);
			System.out.println("Sum: " + sum);
			System.out.println("Num: " + num);
		}
		
		System.out.println("The sum of the number: " + sum);
	}
}

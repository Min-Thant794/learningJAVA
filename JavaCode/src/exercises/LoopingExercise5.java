package exercises;
import java.util.*;
import java.io.InputStreamReader;

public class LoopingExercise5 {
	public static void main(String args[])
	{
		int num;
		int reverseNum = 0;
		int digit;
		
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		
		while(num != 0) {
			digit = num % 10;
			reverseNum = reverseNum * 10 + digit;
			num = num / 10;
		}
		
		System.out.println("Reversed number: " + reverseNum);
	}
}
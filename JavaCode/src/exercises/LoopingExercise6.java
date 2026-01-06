package exercises;
import java.util.*;
import java.io.InputStreamReader;

public class LoopingExercise6 {
	public static void main(String args[])
	{
		int num, digit, originalNum = 0;
		int reverseNum = 0;
		
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter a number:");
		num = sc.nextInt();
		
		originalNum = num;
		
		while(num != 0) {
			digit = num % 10;
			reverseNum = reverseNum * 10 + digit;
			num = num / 10;
		}
		
		System.out.println("Reverse num: " + reverseNum);
		
		
		if(originalNum == reverseNum) {
			System.out.println("The number is palindrome");
		} else {
			System.out.println("The number is not palindrome");
		}
	}
}

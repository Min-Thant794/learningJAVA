package exercises;
import java.util.*;
import java.io.InputStreamReader;

public class LoopingExercise7 {
	public static void main(String args[])
	{
		int num, temp, firstDigit, lastDigit, divisor = 1;
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		
		temp = num;
		lastDigit = num % 10;
		
		while(temp >= 10) {
			temp = temp / 10;
			divisor *= 10;
		}
		
		firstDigit = temp;
		System.out.println("First Digit: " + firstDigit);
		System.out.println("Last Digit: " + lastDigit);
		
		int removeFistAndLastDigit = (num % divisor) / 10;
		
		int swapDigit = (lastDigit * divisor) + (removeFistAndLastDigit * 10) + firstDigit;
		
		System.out.println("Number after swapping: " + swapDigit);
	}
}

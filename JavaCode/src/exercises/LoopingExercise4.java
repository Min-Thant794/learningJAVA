package exercises;
import java.util.*;
import java.io.InputStreamReader;

public class LoopingExercise4 {
	public static void main(String args[])
	{
		int num;
		boolean isPrimeNum = true;
		
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		num = sc.nextInt();
		
		
		if(num <= 1) {
			isPrimeNum = false;
		} else {
			for(int i = 2; i < num; i++) {
				if(num % i == 0) {
					isPrimeNum = false;
				}
			}
		}
		
		if(isPrimeNum) {
			System.out.println("The number " + num + " is a prime number.");
		} else {
			System.out.println("The number " + num + " is not a prime number.");
		}
	}
}

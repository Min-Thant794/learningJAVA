package exercises;
import java.util.*;
import java.io.InputStreamReader;

public class LoopingExercise3 {
	public static void main(String args[])
	{
		int num, num2;
		int gcd = 1;
		
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		
		System.out.println("Enter another number: ");
		num2 = sc.nextInt();
		
		int min = Math.min(num, num2);
		System.out.println("min: " + min);
		
		for(int i = 1; i <= min; i++) {
			if(num % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		
		System.out.println("Greatest common divisor for " + num + " and " +num2 + " is " + gcd);
		
		//Another method
		
		if (num > num2) {
			for(int j = 2; j <= num; j++) {
				if(num2 % j == 0 && num % j == 0) {
					gcd = j;
				}
			}
		} else {
			for(int k = 2; k <= num2; k++) {
				if(num % k == 0 && num2 % k == 0) {
					gcd = k;
				}
			}
		}
		System.out.println("(Another method) Greatest common divisor for " + num + " and " +num2 + " is " + gcd);
	}
}

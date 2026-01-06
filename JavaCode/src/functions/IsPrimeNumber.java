package functions;
import java.util.*;
import java.io.InputStreamReader;

public class IsPrimeNumber {
	public static void main(String args[])
	{
		int number;
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter a number:");
		number = sc.nextInt();
		
		boolean answer = isPrime(number);
		
		if(answer == true) {
			System.out.println("The number " + number + " is a prime number.");
		} else {
			System.out.println("The number " + number + " is not a prime number.");
		}
	}
	
	public static boolean isPrime(int num)
	{
		if(num == 1) {
			return false;
		}
		
		int div = 2;
		while(num % div != 0) {
			div++;
		}
		
		if(num == div) {
			return true;
		} else {
			return false;
		}
	}
}

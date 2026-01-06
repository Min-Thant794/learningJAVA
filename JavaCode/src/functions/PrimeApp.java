package functions;
import java.util.*;

public class PrimeApp {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		boolean result = IsPrimeNumber.isPrime(num);
		
		if(result == true) {
			System.out.println("The number " + num + " is a prime number.");
		} else {
			System.out.println("The number " + num + " is not a prime number.");
		}
	}
}

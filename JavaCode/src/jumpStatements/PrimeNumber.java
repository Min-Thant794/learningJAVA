package jumpStatements;
import java.util.*;

public class PrimeNumber {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		boolean primeNumber = isPrime(num);
		
		boolean primeNumber1 = isPrime1(num);
		
		System.out.println(primeNumber ? "The number " + num + " is a prime number" : "The number " + num + " is not a prime number");
		
		System.out.println(primeNumber1 ? "The number " + num + " is a prime number" : "The number " + num + " is not a prime number");
	}
	
	public static boolean isPrime(int n)
	{
		if(n < 2) {
			return false;
		}
		
		int div = 2;
		while(n % div != 0) {
			div++;
		}
		
		return n == div;
	}
	
	public static boolean isPrime1(int n)
	{
		if(n < 2) {
			return false;
		}
		
		int div = 2;
//		int count = 0;
		while(div <= n/2) {
			if(n % div == 0) {
				//count++;
				return false;
			}
		}
		
//		if(count >= 1) {
//			return false;
//		} else {
//			return true;
//		}
		return true;
	}
}

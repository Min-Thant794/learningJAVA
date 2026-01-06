package selectionTest;
import java.io.InputStreamReader;
import java.util.*;

public class EvenOrOdd {
	public static void main(String args[])
	{
		int num;
		System.out.print("Enter a number:");
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("The number " + num + " is even number.");
		}else {
			System.out.println("The number " + num + " is odd number.");
		}
	}
}

package selectionTest;
import java.io.InputStreamReader;
import java.util.*;

public class PositiveOrNegative {
	public static void main(String args[])
	{
		int num;
		System.out.println("Please input your number: ");
		Scanner scnr = new Scanner(new InputStreamReader(System.in));
		num = scnr.nextInt();
		if(num > 0) {
			System.out.println("The number " + num + " is a positive number.");
		}else {
			System.out.println("The number " + num + " is a negative number.");
		}
	}
}

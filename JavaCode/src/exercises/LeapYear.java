package exercises;
import java.io.InputStreamReader;
import java.util.*;

public class LeapYear {
	public static void main(String args[])
	{
		int year, isLeapYear;
		System.out.print("Enter year: ");
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		year = sc.nextInt();
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("The year " + year + " is a leap year.");
		}else {
			System.out.println("The year " + year + " is not a leap year.");
		}
	}
}

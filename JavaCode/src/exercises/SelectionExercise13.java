package exercises;
import java.util.*;
import java.io.InputStreamReader;

public class SelectionExercise13 {
	public static void main(String args[])
	{
		int day, month, year;
		System.out.println("Enter day, month and year");
		Scanner sc = new Scanner (new InputStreamReader(System.in));
		day = sc.nextInt();
		month = sc.nextInt();
		year = sc.nextInt();
		boolean valid = true;
		
		System.out.println("Date entered: " + day + "/ " + month + "/ " + year);
		
		if(month < 1 || month > 12) {
			valid = false;
			System.out.println("Please Enter Valid Date");
			return;
		} else if (month == 2) {
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				if (day < 1 || day > 29) {
					valid = false;
				} else {
					if (day < 1 || day < 28) {
						valid = false;
					}
				}
			}
		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day < 1 || day > 31) {
				valid = false;
			}
		} else {
			if (day < 1 || day > 30) {
				valid = false;
			}
		}
		
		if (valid) {
			System.out.println("The date you entered is valid date!");
		} else {
			System.out.println("The date you entered is invalid!");
		}
	}
}

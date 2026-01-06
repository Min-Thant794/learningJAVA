package exercises;
import java.io.InputStreamReader;
import java.util.*;

public class SelectionExercise4 {
	public static void main(String args[])
	{
		int day, numOfDaysElapsed, futureDay;
		System.out.println("Enter today's day and number of day elapsed: ");
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		day = sc.nextInt();
		day = day % 7;
		numOfDaysElapsed = sc.nextInt();
		futureDay = (day + numOfDaysElapsed) % 7;
		System.out.println("Day and future day: " + day + " and " + futureDay + ".");
		
		if(day == 0) {
			System.out.print("Today is Monday and ");
		} else if(day == 1) {
			System.out.print("Today is Tuesday and ");
		} else if(day == 2) {
			System.out.print("Today is Wednesday and ");
		} else if(day == 3) {
			System.out.print("Today is Thursday and ");
		} else if(day == 4) {
			System.out.print("Today is Friday and ");
		} else if(day == 5) {
			System.out.print("Today is Saturday and ");
		} else if(day == 6) {
			System.out.print("Today is Sunday and ");
		}
		
		if (futureDay == 0) {
			System.out.println("The future day is Monday.");
		} else if (futureDay == 1) {
			System.out.println("The future day is Tuesday.");
		} else if (futureDay == 2) {
			System.out.println("The future day is Wednesday.");
		} else if (futureDay == 3) {
			System.out.println("The future day is Thursday.");
		} else if (futureDay == 4) {
			System.out.println("The future day is Friday.");
		} else if (futureDay == 5) {
			System.out.println("The future day is Saturday.");
		} else if (futureDay == 6) {
			System.out.println("The future day is Sunday.");
		}
	}
}

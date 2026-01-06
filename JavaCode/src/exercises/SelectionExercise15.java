package exercises;
import java.util.*;
import java.io.InputStreamReader;

public class SelectionExercise15 {
	public static void main(String args[])
	{
		String position;
		double numberOfHours, overtimeHour, overtimeRate, totalRate = 0;
		double hourlyRate4Lec = 12000;
		double hourlyRate4SeLec = 20000;
		
		Scanner sc = new Scanner (new InputStreamReader(System.in));
		
		System.out.println("Enter your position (Lecturer || Senior Lecturer)");
		position = sc.nextLine();
		
		System.out.println("Enter the number of work hours: ");
		numberOfHours = sc.nextInt();
		
		if(numberOfHours < 1) {
			System.out.println("The number of work hour must be greater than 0!");
			return;
		}
		
		if (position.compareToIgnoreCase("Lecturer") == 0) {
		    if (numberOfHours > 160) {
		        overtimeHour = numberOfHours - 160;
		        overtimeRate = overtimeHour * (hourlyRate4Lec * 1.5);
		        totalRate = (160 * hourlyRate4Lec) + overtimeRate;
		        System.out.println("Total pay (including bonus): " + totalRate);
		    } else {
		    	totalRate = numberOfHours * hourlyRate4Lec;
		        System.out.println("Your number of hours is below 160 and you won't get any bonus!");
		        System.out.println("Your rate is " + totalRate);
		    }
		}
		else if (position.compareToIgnoreCase("Senior Lecturer") == 0) {
		    if (numberOfHours > 160) {
		        overtimeHour = numberOfHours - 160;
		        overtimeRate = overtimeHour * (hourlyRate4SeLec * 1.5);
		        totalRate = (160 * hourlyRate4SeLec) + overtimeRate;
		        System.out.println("Total pay (including bonus): " + totalRate);
		    } else {
		    	totalRate = numberOfHours * hourlyRate4SeLec;
		        System.out.println("Your number of hours is below 160 and you won't get any bonus!");
		        System.out.println("Your rate is " + totalRate);
		    }
		} else {
			System.out.println("Please Enter Correct Position.");
			return;
		}
	}
}

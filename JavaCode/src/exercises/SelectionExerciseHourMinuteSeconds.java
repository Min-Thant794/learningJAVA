package exercises;
import java.util.*;
import java.io.InputStreamReader;

public class SelectionExerciseHourMinuteSeconds {
	public static void main(String args[])
	{
		int hour, minute, second = 0;
		System.out.println("Enter Hour, Minute, and Seconds regarding to this format (HH:MM:SS)");
		
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		
		hour = sc.nextInt();
		minute = sc.nextInt();
		second = sc.nextInt();
		
		if(hour < 0 || hour > 24) {
			System.out.println("Please input between (0 to 24) hour format!");
			return;
		}
		
		if(minute < 0 || minute > 60) {
			System.out.println("Please input between (0 to 60) minute!");
			return;
		}
		
		if(second < 0 || second > 60) {
			System.out.println("Please input between (0 to 60) second!");
			return;
		}
		
		if(hour < 10 && minute < 10 && second < 10) {
			System.out.println("0" + hour + "/ " + "0" + minute + "/ " + "0" + second);
		}
	}
}

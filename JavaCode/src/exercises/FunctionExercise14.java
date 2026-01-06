package exercises;
import java.util.*;

public class FunctionExercise14 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = sc.nextInt();
		System.out.println("Enter first day");
		int firstDay = sc.nextInt();
		
		System.out.println("January " + year);
		System.out.println("Sun	Mon	Tue	Wed	Thu	Fri	Sat");
		calendar(firstDay);;
	}
	
	public static void calendar(int fday)
	{
		int firstDay = fday;
		if(firstDay == 0) {
			for(int i = 1; i <= 31; i++) {
				System.out.print(i + "\t");
				if(i % 7 == 0) {
					System.out.print("\n");
				}
			}
		} else if(firstDay == 1) {
			System.out.print("\t");
			for(int i = 1 ; i <= 31; i++) {
				System.out.print(i + "\t");
				if((i + 1) % 7 == 0) {
					System.out.print("\n");
				}
			}
		} else if(firstDay == 2) {
			for(int i =1; i <= 2; i++) {
				System.out.print("\t");
			}
			for(int j = 1; j <= 31; j++) {
				System.out.print(j + "\t");
				if((j + 2) % 7 == 0) {
					System.out.print("\n");
				}
			}
		} else if(firstDay == 3) {
			for(int i =1; i <= 3; i++) {
				System.out.print("\t");
			}
			for(int j = 1; j <= 31; j++) {
				System.out.print(j + "\t");
				if((j + 3) % 7 == 0) {
					System.out.print("\n");
				}
			}
		} else if(firstDay == 3) {
			for(int i =1; i <= 3; i++) {
				System.out.print("\t");
			}
			for(int j = 1; j <= 31; j++) {
				System.out.print(j + "\t");
				if((j + 4) % 7 == 0) {
					System.out.print("\n");
				}
			}
		} else if(firstDay == 4) {
			for(int i =1; i <= 4; i++) {
				System.out.print("\t");
			}
			for(int j = 1; j <= 31; j++) {
				System.out.print(j + "\t");
				if((j + 5) % 7 == 0) {
					System.out.print("\n");
				}
			}
		} else if(firstDay == 5) {
			for(int i =1; i <= 5; i++) {
				System.out.print("\t");
			}
			for(int j = 1; j <= 31; j++) {
				System.out.print(j + "\t");
				if((j + 6) % 7 == 0) {
					System.out.print("\n");
				}
			}
		}
		
		//with looping
		
		System.out.println("\n");
		
		for (int i = 0; i < fday; i++) {
	        System.out.print("\t");
	    }

		for (int day = 1; day <= 31; day++) {
	        System.out.print(day + "\t");

	        firstDay++;

	        
	        if (firstDay % 7 == 0) {
	            System.out.println();
	        }
	    }
	}
}
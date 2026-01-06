package exercises;
import java.util.*;
import java.io.InputStreamReader;

public class SelectionExercise14 {
	public static void main(String args[])
	{
		String name;
		float totalSales, commissions = 0;
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		System.out.println("Enter total sales for the month: ");
		totalSales = sc.nextFloat();
		
		if(totalSales >= 1 && totalSales <= 1000) {
			commissions = totalSales * (2.0f / 100);
		} else if (totalSales <= 5000) {
			commissions = totalSales * (5.0f / 100);
		} else if (totalSales > 5000) 
		{
			commissions = totalSales * (10.0f / 100);
		}
		System.out.println("Sales Associate: " + name);
		System.out.println("Monthly sales: " + totalSales);
		System.out.println("Commission Due: " + commissions);
	}
}

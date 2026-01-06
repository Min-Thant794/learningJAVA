package exercises;
import java.io.InputStreamReader;
import java.util.*;

public class SelectionExercise10 {
	public static void main(String args[])
	{
		String type = "";
		int price;
		float profit;
		System.out.println("Choose Type: (Clothe || Shoe) and price in USD");
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		type = sc.next();
		price = sc.nextInt();
		
		if(type.equals("Clothe")) {
			System.out.println("User chose: " + type + "!");
			if(price < 20) {
				profit = price * (10f/100);
			} else if(price < 50) {
				profit = price * (15f/100);
			} else {
				profit = price * (20f/100);	
			}
			System.out.println("The profit for " + price + " dollars " + type + " is " + profit + ".");
		} else if(type.equals("Shoe")) {
			System.out.println("User chose: " + type + "!");
			if(price < 5 || price > 30) {
				profit = price * (5f/100);
			} else {
				profit = price * (10f/100);
			}
			System.out.println("The profit for " + price + " dollars " + type + " is " + profit + ".");
		} else {
			System.out.println("Please choose between two types (Clothe || Shoe)");
		}
	}
}

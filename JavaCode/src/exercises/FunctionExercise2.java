package exercises;
import java.util.*;

public class FunctionExercise2 {
	public static void main(String args[])
	{		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		String allNumbers = factors(num);
		
		System.out.println("Factors for " + num + " are " + allNumbers);
	}
	
	public static String factors(int number)
	{
		String result = "";
		for(int count = 1; count <= number; count++) {
			if(number % count == 0) {
				result += count + ", ";
			}
		}
		
		return result.substring(0, result.length() -2);
	}
}

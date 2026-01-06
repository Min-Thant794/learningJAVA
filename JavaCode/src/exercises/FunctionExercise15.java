package exercises;
import java.util.*;

public class FunctionExercise15 {
	public static void main(String args[])
	{
		int amount, numberOfMonths;
		float annualInterestRate;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your amount: ");
		amount = sc.nextInt();
		
		System.out.println("Enter annual interest rate: ");
		annualInterestRate = sc.nextInt();
		
		System.out.println("Enter number of months: ");
		numberOfMonths = sc.nextInt();
		
		float monthlyInterestRate = (annualInterestRate/100) / 12;
		System.out.println("Monthly interest rate: " + monthlyInterestRate);
		
//		float value = 0;
//		for(int i = 1; i <= numberOfMonths; i++) {
//			value = (amount + value) * (1 + monthlyInterestRate);
//			System.out.println("Value after " + i + " month: " + value);
//		}
		
		valueAfterMonth(monthlyInterestRate, numberOfMonths, amount);
	}
	
	public static void valueAfterMonth(float monthlyIntRate, int noOfMonths, int amount)
	{
		float value = 0;
		for(int i = 1; i <= noOfMonths; i++) {
			value = (amount + value) * (1 + monthlyIntRate);
			System.out.println("Value after " + i + " month: " + value);
		}
	}
}

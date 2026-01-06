package exercises;
import java.util.*;

public class BaseAndPowerCalculator {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter base number: ");
		int base = sc.nextInt();
		
		System.out.println("Enter power number: ");
		int power = sc.nextInt();
		
		int result = FunctionExerciseBaseAndPower.calPower(base, power);
		System.out.println("The result for " + base + " power " + power + " is " + result);
	}
}

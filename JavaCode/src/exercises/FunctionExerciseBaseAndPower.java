package exercises;
import java.util.*;

public class FunctionExerciseBaseAndPower {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter base number: ");
		int baseNum = sc.nextInt();
		
		System.out.println("Enter power number: ");
		int powerNum = sc.nextInt();
		
		int answer = calPower(baseNum, powerNum);
		
		System.out.println("Answer for " + baseNum + " power " + powerNum + " is " + answer);
	}
	
	public static int calPower(int base, int power)
	{
		int count = 1;
		int result = 1;
		
		while(count <= power) {
			result = result * base;
			count++;
		}
		return result;
	}
}

package exercises;
import java.util.*;

public class FunctionExercise1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n value: ");
		int n = sc.nextInt();
		
		System.out.println("Enter r value: ");
		int r = sc.nextInt();
		
		int combinationResult = combination(n, r);
		
		System.out.println("Combination result: " + combinationResult);
	}
	
	public static int calFact(int num)
	{
		int answer = 1;
		for(int i = num; i >= 1; i--) {
			answer *= i;
		}
		
		return answer;
	}
	
	public static int combination(int n, int r)
	{
		return calFact(n)/(calFact(r) * calFact(n -r));
	}
}

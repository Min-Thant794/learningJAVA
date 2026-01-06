package exercises;
import java.util.*;

public class FunctionExercise6 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n terms: ");
		int n = sc.nextInt();
		
		harmonicAndSum(n);
	}
	
	public static void harmonicAndSum(int n)
	{
		float sum = 1.0f;
		float temp = 0f;
		
		System.out.print("1 + ");
		for(int i = 2; i <= n; i++) {
			temp += 1f/i;
			System.out.print("1/" + i);
			
			System.out.print(i < n ? " + " : "\n");
		}
		//System.out.println("temp: " + temp);
		sum = sum + temp;
		System.out.println("Sum of Series up to " + n + " terms: " + sum);
	}
}

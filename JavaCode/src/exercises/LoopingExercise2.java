package exercises;
import java.util.*;
import java.io.InputStreamReader;

public class LoopingExercise2 {
	public static void main(String args[])
	{
		int n;
		int factorial = 1;
		
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		
		System.out.println("Enter a number:");
		n = sc.nextInt();
		
		System.out.print(n + "! = ");
		for(int i = n; i >= 1; i--) {
			
			factorial *= i;
			System.out.print(i);
			
			if(i > 1) {
				System.out.print(" * ");
			}
		}
		
		System.out.print(" = " + factorial);
	}
}
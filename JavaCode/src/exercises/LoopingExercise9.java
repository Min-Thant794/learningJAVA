package exercises;
import java.util.*;
import java.io.InputStreamReader;

public class LoopingExercise9 {
	public static void main(String args[])
	{
		int power, base;
		int count = 1;
		int result = 1;
		
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter base number; ");
		base = sc.nextInt();
		
		System.out.println("Enter power number: ");
		power = sc.nextInt();
		
		while(count <= power) {
			result = result * base;
			count++;
		}
		
		System.out.println("Result: " + result);
	}
}
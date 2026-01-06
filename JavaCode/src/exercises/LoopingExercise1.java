package exercises;
import java.util.*;
import java.io.InputStreamReader;

public class LoopingExercise1 {
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		n = sc.nextInt();
		
		System.out.println("Multiplication table using for looping");
		for(int i = 1; i <= 12; i++) {
			System.out.println(n + " * " + i + " = " + (n*i));
		}
		
		System.out.println("Multiplication table using while looping");
		int j = 1;
		while(j <= 12) {
			System.out.println(n + " * " + j + " = " + (n*j));
			j++;
		}
		
		System.out.println("Multiplication table using Do While looping");
		int k = 1;
		do {
			System.out.println(n + " * " + k + " = " + (n*k));
			k++;
		} while(k <= 12);
	}
}

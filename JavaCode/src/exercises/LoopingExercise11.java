package exercises;
import java.util.*;
import java.io.InputStreamReader;

public class LoopingExercise11 {
	public static void main(String args[])
	{
		int num;
		int count = 1;
		int sum = 0;
		
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter a number:");
		num = sc.nextInt();
		
		while(count < num) {
			if(num % count == 0) {
				//System.out.print(count);
				sum = sum + count;
			}
			//System.out.println("Count: " + count);
			count++;
		}
		
		System.out.println("Sum: " + sum);
		
		if(num == sum) {
			System.out.println("The number " + num + " is a perfect number!");
		} else {
			System.out.println("The number " + num + " is not a perfect number!");
		}
	}
}

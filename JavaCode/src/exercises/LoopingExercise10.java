package exercises;
import java.util.*;
import java.io.InputStreamReader;

public class LoopingExercise10 {
	public static void main(String args[])
	{
		int num;
		
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		num = sc.nextInt();
		
		int count = 1;
		
		System.out.print("Factors of " + num + " are: ");
		while (count <= num) {
			if(num % count == 0) {
				System.out.print(count + "\s");
			}
			count++;
		}
	}
}

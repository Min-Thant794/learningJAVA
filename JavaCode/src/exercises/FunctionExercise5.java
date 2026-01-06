package exercises;
import java.util.*;

public class FunctionExercise5 {
	public static void main(String args[])
	{
		int fNum, sNum, gNum;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		fNum = sc.nextInt();
		
		System.out.println("Enter second number: ");
		sNum = sc.nextInt();
		
		System.out.println("Enter greatest number: ");
		gNum = sc.nextInt();
		
		fibonacci(fNum, sNum, gNum);
	}
	
	public static void fibonacci(int firstNum, int secNum, int gNum)
	{
		int nextNum;
		
		System.out.print("Fibonacci Series: ");
		System.out.print(firstNum + " " + secNum + " ");
		
		while(true) {
			nextNum = firstNum + secNum;
			if(nextNum > gNum) {
				break;
			}
			
			System.out.print(nextNum + " ");
			firstNum = secNum;
			secNum = nextNum;
		}
	}
}

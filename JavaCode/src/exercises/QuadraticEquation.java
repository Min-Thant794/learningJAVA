package exercises;
import java.io.InputStreamReader;
import java.util.*;

public class QuadraticEquation {
	public static void main(String args[])
	{
		double num1, num2, num3, temp, twoSolution, twoSolution1;
		System.out.println("Enter your num1, num2, num3");
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		num1 = sc.nextFloat();
		num2 = sc.nextFloat();
		num3 = sc.nextFloat();
		temp = (num2 * num2) - (4 * num1 * num3);
		if(temp > 0) {
			temp = Math.sqrt(temp);
			twoSolution = (-num2 + temp)/(2*num1);
			twoSolution1 = (-num2 - temp)/(2*num1);
			System.out.println("Two solutions: " + twoSolution + " and " + twoSolution1 + ".");
		}else if(temp == 0) {
			temp = -num2/ (2 * num1);
			System.out.println("One solution: " + temp);
		}else {
			System.out.println("There is no solution for this number and the temp value is " + temp);
		}
	}
}

package exercises;
import java.util.*;

public class FunctionExercise7 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n terms of series: ");
		int n = sc.nextInt();
		
		float result = sum(n);
		
		System.out.println("The result of " + n + " terms of series: " + result);
	}
	
	public static float sum(int n) {

	    float temp = 0f;
	    float temp2 = 0f;

	    System.out.print("Series: ");

	    for (int i = 1; i <= n; i++) {
	        if (i % 2 == 0) {
	            System.out.print(" - 1/" + i);
	            temp2 += 1.0f / i;
	        } else {
	            if (i == 1)
	                System.out.print("1");
	            else
	                System.out.print(" + 1/" + i);
	            temp += 1.0f / i;
	        }
	    }

	    System.out.println();
	    return temp - temp2;
	}

}

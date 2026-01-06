package functions;
import java.util.*;
import java.io.InputStreamReader;

public class BMIFunction {
	public static void main(String args[])
	{
		int weight, height;
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		
		System.out.println("Enter your weight in lbs:");
		weight = sc.nextInt();
		
		System.out.println("Enter your height in inches:");
		height = sc.nextInt();
		
		float bmi = calBMI(weight, height);
		System.out.println("BMI result: " + bmi);
	}
	
	public static float calBMI(int w, int h)
	{
		float weightInKg = w * 0.45f;
		float heightInMeter = h * 0.3f;
		float bmi = weightInKg / (heightInMeter * heightInMeter);
		return bmi;
	}
}

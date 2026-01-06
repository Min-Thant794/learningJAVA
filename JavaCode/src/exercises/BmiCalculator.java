package exercises;
import java.io.InputStreamReader;
import java.util.*;

public class BmiCalculator {
	public static void main(String args[])
	{
		float weight, height, bmiResult;
		System.out.println("Enter your weight in lbs and height in inches: ");
		Scanner scnr = new Scanner(new InputStreamReader(System.in));
		weight = scnr.nextFloat();
		height = scnr.nextFloat();
		
		weight = weight * 0.453592f;
		System.out.println("weight in kg: " + weight);
		height = height * 0.0254f;
		bmiResult = weight / (height * height);
		System.out.println("height in meter: " + height);
		
		if (bmiResult < 18.5) {
			System.out.println("You are underweight and you need to eat more. Your BMI is: " + bmiResult);
		}else if(bmiResult < 25.0) {
			System.out.println("You are normal healthy guy and your BMI is: " + bmiResult);
		}else if(bmiResult < 30.0) {
			System.out.println("You are overweight and your BMI is: " + bmiResult);
		}else {
			System.out.println("You are obese! Your BMI is: " + bmiResult);
		}
	}
}

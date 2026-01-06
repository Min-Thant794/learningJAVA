package exercises;
import java.io.InputStreamReader;
import java.util.*;

public class Exercise2 {
	public static void main (String args[])
	{
		float gallonInFeet, length, width, height, canStore;
		gallonInFeet = 7.481f;
		System.out.print("Enter length, width and height in feet: ");
		Scanner scnr = new Scanner(new InputStreamReader(System.in));
		length = scnr.nextFloat();
		width = scnr.nextFloat();
		height = scnr.nextFloat();
		canStore = length * width * height * gallonInFeet;
		System.out.println("\n Your tank can store " + canStore + "gallons.");
	}
}

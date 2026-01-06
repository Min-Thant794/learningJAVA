package exercises;
import java.io.InputStreamReader;
import java.util.*;

public class FarenheitToCelcius {
	public static void main(String args[])
	{
		float celciusTemp, farenheitTemp;
		System.out.print("Enter Temperature in Fahrenheit: ");
		Scanner temp = new Scanner(new InputStreamReader(System.in));
		farenheitTemp = temp.nextFloat();
		celciusTemp = (farenheitTemp - 32)*5.0f/9;
		System.out.println("Temperature in Fahrenheit: " + farenheitTemp + " degree Farenheit.");
		System.out.println("Temperature in Celsius: " + celciusTemp + " degree Celcius.");
	}
}

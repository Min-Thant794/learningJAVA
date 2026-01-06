package testForLecture1;

public class Test4 {
	public static void main(String args[])
	{
		byte num1 = 7, num2 = 2;
		float num3 = 7.0f;
		float num4 = 2.0f;
		System.out.println("Number 1 = " + num1);
		System.out.println("Number 2 = " + num2);
		System.out.println("Number 1 + Number 2 = " + num1 + num2);
		System.out.println("Number 1 + Number 2 = " + (num1 + num2));
		System.out.println(num1 + num2 + " is the result of Number 1 + Number 2");
		//Java '+' in system.out works from left to right when there is equal operator
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		
		//HOMEWORK +, -, *, /, %
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		System.out.println(num3 + " / " + num2 + " = " + (num3 / num2));
		System.out.println(num1 + " / " + num4 + " = " + (num1 / num4));
		System.out.println(num3 + " / " + num4 + " = " + (num3 / num4));
		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
	}
}

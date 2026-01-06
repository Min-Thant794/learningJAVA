package exercises;
import java.io.InputStreamReader;
import java.util.*;

public class PalindromeNumber {
	public static void main(String args[])
	{
		int firstNum, secondNum, thirdNum, fourthNum;
		System.out.print("Enter four digit: ");
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		firstNum = sc.nextInt();
		secondNum = sc.nextInt();
		thirdNum = sc.nextInt();
		fourthNum = sc.nextInt();
		
		if((firstNum == fourthNum) && (secondNum == thirdNum)) {
			System.out.println("This four digit number " + firstNum + secondNum + thirdNum + fourthNum + " is a palindrome number.");
		} else {
			System.out.println("This four digit number " + firstNum + secondNum +  thirdNum + fourthNum + " is not a palindrome number.");
		}
	}
}
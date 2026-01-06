package exercises;

public class Exercise1 {
	public static void main(String args[])
	{
		int n = 12345;
		int firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit, reverseNum;
		firstDigit = n / 10000;
		secondDigit = (n % 10000) / 1000;
		thirdDigit = (n % 1000) / 100;
		fourthDigit = (n % 100) / 10;
		fifthDigit = n % 10;
		reverseNum = (fifthDigit * 10000) + (fourthDigit * 1000) + (thirdDigit * 100) + (secondDigit * 10) + (firstDigit);
		System.out.println("The original nymber is " + n + ".");
		System.out.println("The reverse number for " + n + " is " + reverseNum + ".");
	}
}

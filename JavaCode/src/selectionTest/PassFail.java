package selectionTest;
import java.io.InputStreamReader;
import java.util.*;

public class PassFail {
	public static void main(String args[])
	{
		int mark;
		System.out.print("Enter your mark:");
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		mark = sc.nextInt();
		if(mark >= 40) {
			System.out.println("You pass the exam and your mark is " + mark);
		}else {
			System.out.println("You fail the exam and your mark is " + mark);
		}
	}
}
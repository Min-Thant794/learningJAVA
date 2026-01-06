package selectionTest;
import java.io.InputStreamReader;
import java.util.*;

public class ExamMarks {
	public static void main(String args[])
	{
		int myan, eng, maths, total;
		System.out.println("Enter your marks(Myanmar, English, Maths)");
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		myan = sc.nextInt();
		eng = sc.nextInt();
		maths = sc.nextInt();
		total = myan + eng + maths;
		if(myan >= 40 && eng >= 40 && maths >= 40) {
			System.out.println("You pass the exam and your total mark is: " + total);
		}else {
			System.out.println("You fail the exam and your total mark is: " + total);
		}
	}
}

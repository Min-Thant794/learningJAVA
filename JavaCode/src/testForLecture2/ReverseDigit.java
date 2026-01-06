package testForLecture2;
import java.io.InputStreamReader;
import java.util.*;

public class ReverseDigit {
	public static void main(String args[])
	{
		int num, fd, secd, td, fod, fid, rn;
		Scanner s = new Scanner(new InputStreamReader(System.in));
		System.out.print("Enter a five digit number: ");
		num = s.nextInt();
		fd = num / 10000;
		secd = num % 10000 / 1000;
		td = num % 1000 / 100;
		fod = num % 100 / 10;
		fid = num % 10;
		rn = fid * 10000 + fod * 1000 + td * 100 + secd * 10 + fd;
		System.out.println("Reverse Number: " + rn);
	}
}

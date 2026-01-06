package looping;
import java.util.*;
import java.io.InputStreamReader;

public class ForLooping6 {
	public static void main(String args[])
	{
		byte n;
		System.out.println("Please input number: ");
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		n = sc.nextByte();
		
		for(byte i = 1; i <= 12; i++) {
			System.out.println(n + " * " + i + " = " + (n*i));
		}
	}
}

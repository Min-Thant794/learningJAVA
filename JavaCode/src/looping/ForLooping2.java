package looping;
import java.util.*;
import java.io.InputStreamReader;

public class ForLooping2 {
	public static void main(String args[])
	{
		int n;
		System.out.println("Please input number: ");
		
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		n = sc.nextInt();
		
		for(int i = 0; i <= n; i += 2) {
			System.out.print(i + " ");
		}
	}
}

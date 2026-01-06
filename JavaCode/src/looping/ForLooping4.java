package looping;
import java.util.*;
import java.io.InputStreamReader;

public class ForLooping4 {
	public static void main(String args[])
	{
		int n;
		int count = 0;
		System.out.println("Enter number: ");
		
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		n = sc.nextInt();
		
		for( int i = n; i >= 1; i--) {
			System.out.print(i + "\t");
			count ++;
			if(count % 10 == 0) {
				System.out.println();
			}
		}
	}
}

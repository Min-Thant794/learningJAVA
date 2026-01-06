package looping;
import java.util.*;
import java.io.InputStreamReader;

public class ForLooping3 {
	public static void main(String args[])
	{
		int n;
		int count = 0;
		System.out.println("Please input number: ");
		
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		n = sc.nextInt();
		
		for(int i = 0; i <= n; i += 5) {
			System.out.print(i + "\t");
			count ++;
			if(count % 5 == 0) {
				System.out.println();
			}
		}
	}
}

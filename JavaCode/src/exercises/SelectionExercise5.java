package exercises;
import java.io.InputStreamReader;
import java.util.*;

public class SelectionExercise5 {
	public static void main(String args[])
	{
		int fd, sd, td;
		System.out.println("Enter three digit");
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		fd = sc.nextInt();
		sd = sc.nextInt();
		td = sc.nextInt();
		
		if((fd < sd) && (sd < td)) {
			System.out.println("Three digits in non-decreasing order: " + fd + sd + td);
		} else if ((fd < td) && (td < sd)) {
			System.out.println("Three digits in non-decreasing order: " + fd + td + sd);
		} else if ((sd < fd) && (fd < td)) {
			System.out.println("Three digits in non-decreasing order: " + sd + fd + td);
		} else if ((sd < td) && (td < fd)) {
			System.out.println("Three digits in non-decreasing order: " + sd + td + fd);
		} else if ((td < sd) && (sd < fd)) {
			System.out.println("Three digits in non-decreasing order: " + td + sd + fd);
		} else {
			System.out.println("Three digits in non-decreasing order: " + td + fd + sd);
		}
	}
}

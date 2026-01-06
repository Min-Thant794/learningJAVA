package exercises;
import java.util.*;

public class FunctionExercise11 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Students: ");
		int numberOfStu = sc.nextInt();
		int highestScore = Integer.MIN_VALUE;
		String topStudentID = "";
		
		int count = 1;
		while(count <= numberOfStu) {
			System.out.println("Enter student ID for student number (" + count + ")");
			String studentID = sc.next();
			System.out.println("Enter score for student ID: " + studentID);
			int score = sc.nextInt();
			if(score < 0 || score > 100) {
				System.out.println("Invalid score! Score must between 0 and 100.");
				continue;
			}
			
			if(score > highestScore) {
				highestScore = score;
				topStudentID = studentID;
			}
			count++;
		}
		
		System.out.println("The student ID (" + topStudentID + ") has the highest score: " + highestScore);
		sc.close();
	}
}

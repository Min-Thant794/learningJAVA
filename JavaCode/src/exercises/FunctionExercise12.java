package exercises;
import java.util.*;

public class FunctionExercise12 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int numberOfStudents = sc.nextInt();
		
		int highestScore = Integer.MIN_VALUE;
		int secondHighestScore = Integer.MIN_VALUE;
		String topStudentID = "";
		String secondTopStudentID = "";
		
		int count = 1;
		while(count <= numberOfStudents) {
			System.out.println("Enter Student ID: ");
			String studentID = sc.next();
			System.out.println("Enter score for Student ID (" + studentID + "): ");
			int score = sc.nextInt();
			
			if(score < 0 || score > 100) {
				System.out.println("Score must between 0 and 100!");
				continue;
			}
			
			if(score > highestScore) {
				secondHighestScore = highestScore;
				secondTopStudentID = topStudentID;
				
				highestScore = score;
				topStudentID = studentID;
			} else if (score < highestScore && score > secondHighestScore) {
				secondHighestScore = score;
				secondTopStudentID = studentID;
			}
			
			count++;
		}
		
		System.out.println("Student ID (" + topStudentID + ") has highest score and his/her score is: " + highestScore);
		System.out.println("Student ID (" + secondTopStudentID + ") has the second highest score and his/her score is: " + secondHighestScore);
		sc.close();
	}
}

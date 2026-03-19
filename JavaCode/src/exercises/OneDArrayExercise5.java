package exercises;
import java.util.*;

public class OneDArrayExercise5 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int stuNum = getStudentNum();
        int[] scores = new int[stuNum];

        setScores(scores);
        int best = bestScore(scores);

        String[] grades = {"A", "B", "C", "D", "F"};

        System.out.println("Number of students: " + stuNum);

        System.out.print("Scores: ");

        for (int i = 0; i < scores.length; i ++) {
            System.out.print(scores[i]);
            if(i == scores.length - 1) {
                System.out.print(". \n");
            } else {
                System.out.print(",");
            }
        }

        for(int i = 0; i < scores.length; i++) {
            if (scores[i] >= (best - 10)) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grades[0]);
            } else if (scores[i] >= (best - 20)) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grades[1]);
            } else if (scores[i] >= (best - 30)) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grades[2]);
            } else if (scores[i]     >= (best - 40)) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grades[3]);
            } else {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grades[4]);
            }
        }
    }

    public static int getStudentNum()
    {
        int numOfStu;
        System.out.print("Enter number of student: ");
        numOfStu = sc.nextInt();

        return numOfStu;
    }

    public static void setScores(int[] score)
    {
        for (int i = 0; i < score.length; i ++) {
            System.out.print("Enter score for student (" + i + "): ");
            score[i] = sc.nextInt();
        }
    }

    public static int bestScore(int[] score)
    {
        int bestScore = score[0];
        for (int i : score) {
            if(bestScore < i) {
                bestScore = i;
            }
        }

        return bestScore;
    }
}

package exercises;
import java.util.*;

public class OneDArrayExercise6 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int maxCount = 100;
        int[] scores = new int[maxCount];

        setScore(scores);

        int count = calCount(scores);
        double average = calAvg(scores, count);

        int aboveOrEqual = 0;
        int belowAvg = 0;

        for (int i = 0; i < count; i++) {
            if (scores[i] >= average) {
                aboveOrEqual++;
            } else {
                belowAvg++;
            }
        }

        System.out.println("Average: " + average);
        System.out.println("Number of scores above or equal to average: " + aboveOrEqual);
        System.out.println("Number of scores below average: " + belowAvg);
    }

    public static void setScore(int[] s)
    {
        for (int i = 0; i < s.length; i++) {
            System.out.print("Enter score: ");
            s[i] = sc.nextInt();

            if (s[i] < 0) {
                break;
            }
        }
    }

    public static int calCount(int[] sc)
    {
        int count = 0;
        for (int j : sc) {
            if (j < 0) {
                break;
            }
            count++;
        }
        return count;
    }

    public static double calAvg(int[] sc, int count)
    {
        int total = 0;

        for (int i = 0; i < count; i++) {
            total += sc[i];
        }

        return (double) total / count;
    }
}
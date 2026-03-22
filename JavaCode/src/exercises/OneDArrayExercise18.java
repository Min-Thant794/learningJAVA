package exercises;
import java.util.*;

public class OneDArrayExercise18 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] count = new int[101];
        setData(count);
        displayCount(count);
    }

    public static void setData(int[] arr)
    {
        System.out.print("Enter the integers between 1 and 100: ");

        while(true) {
            int num = sc.nextInt();

            if(num == 0) {
                break;
            }

            if(num >= 1 && num <= 100) {
                arr[num]++;
            }
        }
    }

    public static void displayCount(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println(i + " occurs " + arr[i] + " times");
            }
        }
    }
}

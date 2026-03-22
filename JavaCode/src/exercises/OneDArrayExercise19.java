package exercises;

import java.util.Scanner;

public class OneDArrayExercise19 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] freq = new int[101];
        setData(freq);
        displayRepeated(freq);
    }

    public static void setData(int[] arr)
    {
        System.out.print("Enter numbers between 1 and 100: ");

        while(true) {
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if(num >= 1 && num <= 100) {
                arr[num]++;
            }
        }
    }

    public static void displayRepeated(int[] arr)
    {
        boolean found = false;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > 1) {
                System.out.println(i + " occurs " + arr[i] + " times.");
                found = true;
            }
        }

        if (!found) {

            System.out.println("No repeated numbers found!");
        }
    }
}

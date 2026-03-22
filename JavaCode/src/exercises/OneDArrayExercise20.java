package exercises;

import java.util.Scanner;

public class OneDArrayExercise20 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] freq = new int[101];

        setData(freq);
        countNonRepeated(freq);
    }

    public static void setData(int[] arr) {
        System.out.print("Enter numbers from 1 to 100: ");

        while(true) {
            int num = sc.nextInt();
            if(num == 0) {
                break;
            }

            if(num >= 1 && num <=100) {
                arr[num]++;
            }
        }
    }

    public static void countNonRepeated(int[] arr) {
        int count = 0;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == 1) {
                count++;
            }
        }

        System.out.println("Number of non-repeated elements: " + count);
    }
}

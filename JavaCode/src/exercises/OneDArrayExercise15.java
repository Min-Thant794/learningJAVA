package exercises;

import java.util.Scanner;

public class OneDArrayExercise15 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] arr = new int[10];
        int[] distinct = new int[10];

        System.out.print("Enter ten numbers: ");

        int count = 0;

        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

            boolean isDuplicate = false;

            // check if already in distinct array
            for(int j = 0; j < count; j++) {
                if(arr[i] == distinct[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // if not duplicate → store it
            if(!isDuplicate) {
                distinct[count] = arr[i];
                count++;
            }
        }

        System.out.println("The number of distinct number is " + count);

        System.out.print("The distinct numbers are: ");
        for(int i = 0; i < count; i++) {
            System.out.print(distinct[i] + " ");
        }
    }
}
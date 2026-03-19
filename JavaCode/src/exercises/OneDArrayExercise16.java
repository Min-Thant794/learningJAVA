package exercises;

import java.util.Scanner;

public class OneDArrayExercise16 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int totalElements = noOfElements();

        int[] arr = new int[totalElements];
        inputArray(arr);

        int target = inputTarget();

        int occurrence = countOccurrence(arr, target);

        System.out.println("Occurrence of " + target + " is: " + occurrence);
    }

    public static int noOfElements()
    {
        System.out.print("Enter total number of elements: ");
        return sc.nextInt();
    }

    public static void inputArray(int[] arr)
    {
        System.out.println("Enter array elements:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static int inputTarget()
    {
        System.out.print("Enter number to find Occurrence: ");
        return sc.nextInt();
    }

    public static int countOccurrence(int[] arr, int x)
    {
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                count++;
            }
        }

        return count;
    }
}
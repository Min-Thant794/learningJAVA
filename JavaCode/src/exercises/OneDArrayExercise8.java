package exercises;

import java.util.Scanner;

public class OneDArrayExercise8 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int size = getSize();
        int[] arr = new int[size];
        setData(arr);

        System.out.print("Array: ");
        for(int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
        checkArr(arr);

    }

    public static int getSize()
    {
        System.out.print("Enter size of array: ");

        return sc.nextInt();
    }

    public static void setData(int[] a)
    {
        for(int i = 0; i < a.length; i++) {
            System.out.print("Enter value for arr[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }

    public static void checkArr(int[] a)
    {
        boolean isPositive = false;
        boolean isNegative = false;
        for(int i : a) {
            if(i > 0) {
                isPositive = true;
            } else if (i < 0) {
                isNegative = true;
            }
        }

        if (isPositive && !isNegative) {
            System.out.println("Positive array");
        } else if (!isPositive && isNegative) {
        System.out.println("Negative array");
        } else {
            System.out.printf("Mixed array");
        }
    }
}

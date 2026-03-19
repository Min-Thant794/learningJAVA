package exercises;

import java.util.Scanner;

public class OneDArratExercise10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int size = getSize();
        char[] arr = new char[size];
        setData(arr);

        System.out.print("Original array: ");
        display(arr);

        System.out.print("Reversed array: ");
        reverseArray(arr);
        display(arr);
    }

    public static int getSize()
    {
        System.out.print("Enter size of array: ");
        return sc.nextInt();
    }

    public static void setData(char[] a)
    {
        for(int i = 0; i < a.length; i++) {
            System.out.print("Enter value for a[" + i + "]: ");
            a[i] = sc.next().charAt(0);
        }
    }

    public static void display(char[] a)
    {
        for(char i : a) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }

    public static void reverseArray(char[] arr)
    {
        int fIndex = 0;
        int lIndex = arr.length - 1;

        for(int i = 0; i < arr.length/2; i++) {
            char temp = arr[fIndex];
            arr[fIndex] = arr[lIndex];
            arr[lIndex] = temp;

            fIndex++;
            lIndex--;
        }
    }
}
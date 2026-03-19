package exercises;

import java.util.Scanner;

public class OneDArrayExercise11 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] arr = {2, 4, 6, 8, 10};
        int userInput = uInput();
        searchValue(arr, userInput);
    }

    public static int uInput()
    {
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    public static void searchValue(int[] a, int n)
    {
        for(int i = 0; i < a.length; i++) {
            if(a[i] == n) {
                System.out.print("Value found! and its index: " + i);
                return;
            }
        }
        System.out.print("Not found! " + -1);
    }
}

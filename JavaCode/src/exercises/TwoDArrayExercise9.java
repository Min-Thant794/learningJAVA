package exercises;

import java.util.Scanner;

public class TwoDArrayExercise9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int userInput = uInput();

        findElement(arr, userInput);
    }

    public static int uInput() {
        System.out.print("Enter element: ");
        return sc.nextInt();
    }

    public static void findElement(int[][] a, int num) {
        boolean found = false;

        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                if(a[r][c] == num) {
                    found = true;
                }
            }
        }

        if(found) {
            System.out.println("Found!");
        } else {
            System.out.printf("Not found!");
        }
    }
}

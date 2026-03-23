package nestedLoop;

import java.util.Scanner;

public class NestedLoop2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int numbersOfLines = getLines();
        displayNumbers(numbersOfLines);
    }

    public static int getLines() {
        System.out.print("Enter numebrs of lines: ");
        return sc.nextInt();
    }

    public static void displayNumbers(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((i+1) + " ");
            }

            System.out.println();
        }
    }
}

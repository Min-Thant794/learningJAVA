package nestedLoop;

import java.util.Scanner;

public class NestedLoop4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int lines = getLines();
        display(lines);
    }

    public static int getLines() {
        System.out.print("Enter number of lines: ");
        return sc.nextInt();
    }

    public static void display(int num) {
        for(int i = 0; i < num; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print((j+1) + " ");
            }

            System.out.println();
        }
    }
}

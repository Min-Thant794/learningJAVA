package nestedLoop;

import java.util.Scanner;

public class NestedLoop1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int getLines = getLines();
        displayStars(getLines);
    }

    public static int getLines()
    {
        System.out.print("Enter numbers of lines: ");
        return sc.nextInt();
    }

    public static void displayStars(int l) {
        for(int i = 0; i < l; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

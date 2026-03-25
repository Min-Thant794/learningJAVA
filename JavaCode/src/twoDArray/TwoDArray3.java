package twoDArray;
import java.util.*;

public class TwoDArray3 {
    static Scanner sc = new Scanner(System.in);

    public static int getRows() {

        int row;
        do{
            System.out.print("Enter numbers of rows: ");
            row = sc.nextInt();
        } while ( row < 1);
        return row;
    }

    public static int getColumns() {
        int col;
        do{
            System.out.print("Enter numbers of columns: ");
            col = sc.nextInt();
        } while (col < 1);
        return col;
    }

    public static void setData(int[][] a) {
        for(int r = 0; r < a.length; r++) {
            for(int c = 0; c < a[r].length; c++) {
                System.out.print("Enter value for arr[" + r + "][" + c + "]: ");
                a[r][c] = sc.nextInt();
            }
        }
    }

    public static void display(int[][] a) {
        System.out.println("The inputted data is: ");
        for(int r = 0; r < a.length; r++) {

            for(int c = 0; c < a[r].length; c++) {
                System.out.print(a[r][c] + "\t");
            }
            System.out.println();
        }
    }

    public static int total(int[][] a) {
        int total = 0;
        for(int r = 0; r < a.length; r++) {
            for(int c = 0; c < a[r].length; c++) {
                total += a[r][c];
            }
        }

        return total;
    }

    public static int calculateCount(int[][] a) {
        int count = 0;
        for(int r = 0; r < a.length; r++) {
            count += a[r].length;
        }

        return count;
    }

    public static float calculateAverage(int[][] a) {
        return (float) total(a) / calculateCount(a);
    }
}

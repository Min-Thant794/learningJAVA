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
}

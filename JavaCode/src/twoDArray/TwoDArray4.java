package twoDArray;

public class TwoDArray4 {
    public static void main(String[] args)
    {
        int row = TwoDArray3.getRows();
        int col = TwoDArray3.getColumns();

        int[][] arr = new int[row][col];
        TwoDArray3.setData(arr);
    }
}

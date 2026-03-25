package twoDArray;

public class TwoDArray4 {
    public static void main(String[] args)
    {
        int row = TwoDArray3.getRows();
        int col = TwoDArray3.getColumns();

        int[][] arr = new int[row][col];
        TwoDArray3.setData(arr);
        TwoDArray3.display(arr);
        int total = TwoDArray3.total(arr);
        int count = TwoDArray3.calculateCount(arr);
        float avg = TwoDArray3.calculateAverage(arr);
        System.out.println("Total: " + total);
        System.out.println("Count: " + count);
        System.out.println("Average: " + avg);
    }
}

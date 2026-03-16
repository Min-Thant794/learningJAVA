package oneDArray;
import java.util.*;

public class CeateArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int size = getSize();
        int[] arr = new int[size];
        setData(arr);
        display(arr);
    }

    public static int getSize()
    {
        int size;
        System.out.print("Enter size of array: ");
        size = sc.nextInt();

        return size;
    }

    public static void setData(int[] a)
    {
        for(int i = 0; i < a.length; i++) {
            System.out.print("Enter value for arr["+ i + "]: ");
            a[i] = sc.nextInt();
        }
    }

    public static void display(int[] a)
    {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}

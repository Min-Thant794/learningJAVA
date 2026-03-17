package exercises;
import java.util.*;

public class OneDArrayExercise1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int size = getSize();
        int[] arr = new int[size];
        setData(arr);

        maximumNum(arr);
        minimumNum(arr);
    }

    public static int getSize()
    {
        int size;
        System.out.print("Enter size of array: ");
        size = sc.nextInt();

        return size;
    }

    public static void setData(int[] x)
    {
        for(int i = 0; i < x.length; i++) {
            System.out.print("Enter value of arr[" + i + "]");
            x[i] = sc.nextInt();
        }
    }

    public static void maximumNum(int[] a)
    {
        int maxNum = a[0];
        int index = 0;

        for(int i = 1; i < a.length; i ++) {
            if(maxNum < a[i]) {
                maxNum = a[i];
                index = i;
            }
        }

        System.out.println("Maximum number of array is: " + maxNum);
        System.out.println("Index of maximum number is: " + index);
    }

    public static void minimumNum(int[] a)
    {
        int minNum = a[0];
        int index = 0;

        for(int i = 1; i < a.length; i++) {
            if(minNum > a[i]) {
                minNum = a[i];
                index = i;
            }
        }

        System.out.println("Minimum number of array is: " + minNum);
        System.out.println("Index of minimum number is: " + index);
    }
}

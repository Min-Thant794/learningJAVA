package exercises;
import java.util.*;

public class OneDArrayExercise2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int size = getSize();
        int[] arr = new int[size];
        setData(arr);
        int maxIndex = maximumNumber(arr);
        int minIndex = minimumNumber(arr);

        System.out.println("Index of max number is: " + maxIndex);
        System.out.println("Index of min number is: " + minIndex);

        System.out.print("Before swap: ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        swap(arr);

        System.out.print("After swapped: ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int getSize()
    {
        int size;
        System.out.print("Enter size of an array: ");
        size = sc.nextInt();

        return size;
    }

    public static void setData(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value of arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
    }

    public static int maximumNumber(int[] a)
    {
        int maxNum = a[0];
        int index = 0;

        for (int i = 1; i < a.length; i++) {
            if(maxNum < a[i]) {
                maxNum = a[i];
                index = i;
            }
        }

        return index;
    }

    public static int minimumNumber(int[] a)
    {
        int minNum = a[0];
        int index = 0;


        for (int i = 1; i < a.length; i++) {
            if(minNum > a[i]) {
                minNum = a[i];
                index = i;
            }
        }

        return index;
    }

    public static void swap(int[] arr)
    {
        int maxIndex = maximumNumber(arr);
        int minIndex = minimumNumber(arr);
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = temp;
    }
}

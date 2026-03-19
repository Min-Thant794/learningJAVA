package exercises;
import java.util.*;

public class OneDArrayExercise12 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int inputNum = uInput();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int result = binarySearch(arr, inputNum);

        if(result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("-1 (Element not found)");
        }
    }

    public static int uInput()
    {
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    public static int binarySearch(int[] a, int x)
    {
        int beg = 0;
        int end = a.length - 1;

        while(beg <= end) {
            int mid = (beg + end) / 2;

            if(a[mid] == x) {
                return mid;
            }
            else if(a[mid] > x) {
                end = mid - 1;
            }
            else {
                beg = mid + 1;
            }
        }

        return -1; // not found
    }
}
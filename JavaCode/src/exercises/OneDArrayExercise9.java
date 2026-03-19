package exercises;
import java.util.Scanner;

public class OneDArrayExercise9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int size = getSize();
        int[] arr = new int[size];

        setData(arr);

        boolean isPalindrome = checkPalindrome(arr);

        if(isPalindrome) {
            System.out.println("This array is palindrome");
        } else {
            System.out.println("This array is not palindrome");
        }
    }

    public static int getSize()
    {
        System.out.print("Enter size of array: ");

        return sc.nextInt();
    }

    public static void setData(int[] a)
    {
        for(int i = 0; i < a.length; i++) {
            System.out.print("Enter value for arr[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }

    public static boolean checkPalindrome(int[] a)
    {
        int start = 0;
        int end = a.length -1;

        if(a.length % 2 == 1) {
            return false;
        }

        while (start < end) {
            if(a[start] != a[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

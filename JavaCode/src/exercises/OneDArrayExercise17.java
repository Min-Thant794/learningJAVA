package exercises;
import java.util.*;

public class OneDArrayExercise17 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int totalNumberOfElements = totalNumOfEle();
        int[] elements = new int[totalNumberOfElements];

        System.out.println("Enter array elements: ");
        setData(elements);

        firstRepeatedElement(elements);
    }

    public static int totalNumOfEle()
    {
        System.out.print("Enter total number of elements: ");
        return sc.nextInt();
    }

    public static void setData(int[] e)
    {
        for(int i = 0; i < e.length; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            e[i] = sc.nextInt();
        }
    }

    public static void firstRepeatedElement(int [] arr)
    {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    System.out.println("First repeated element is: " + arr[i]);
                    return;
                }
            }
        }

        System.out.println("No repeated element found!");
    }
}
